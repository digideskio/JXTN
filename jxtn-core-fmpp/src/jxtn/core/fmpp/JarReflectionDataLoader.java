/*
 * This is free and unencumbered software released into the public domain.
 *
 * Anyone is free to copy, modify, publish, use, compile, sell, or
 * distribute this software, either in source code form or as a compiled
 * binary, for any purpose, commercial or non-commercial, and by any
 * means.
 *
 * In jurisdictions that recognize copyright laws, the author or authors
 * of this software dedicate any and all copyright interest in the
 * software to the public domain. We make this dedication for the benefit
 * of the public at large and to the detriment of our heirs and
 * successors. We intend this dedication to be an overt act of
 * relinquishment in perpetuity of all present and future rights to this
 * software under copyright law.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS BE LIABLE FOR ANY CLAIM, DAMAGES OR
 * OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 *
 * For more information, please refer to <http://unlicense.org/>
 */

package jxtn.core.fmpp;

import fmpp.Engine;
import fmpp.dataloaders.XmlDataLoader;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.xml.parsers.DocumentBuilderFactory;
import jxtn.core.axi.collections.LinkLineIterator;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * 以JAR檔類別結構作為資料來源的載入器
 * <p>
 * 以產生JavaFX的建構類別為主要用途，尚不支援一般性使用
 * </p>
 *
 * @author AqD
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public class JarReflectionDataLoader extends XmlDataLoader {
    // 替換：javafx.scene.control.ListView.javafx.scene.control.ListView$EditEvent
    // 成為：javafx.scene.control.ListView.EditEvent
    private final Pattern genericFixPattern = Pattern.compile("(([a-z0-9]+\\.)+[A-Z][A-Za-z0-9]+)\\.\\1\\$");

    private final Pattern packageClassPattern = Pattern
            .compile("(?<package>([a-z0-9]+)(\\.[a-z0-9]+)*)\\.(?<class>[A-Z].*)");

    @Override
    public Object load(Engine engine, List args) throws Exception {
        try {
            // 參數
            String[] arguments = ((String) args.get(0)).split("\\|");
            List<String> jarLocations = Arrays.asList(arguments[0].split(",")).map(String::trim).toArrayList();
            List<String> rootPackages = Arrays.asList(arguments[1].split(",")).map(String::trim).toArrayList();
            String rootClassName = arguments[2];
            // JAR路徑
            List<Path> jarLocPaths = jarLocations.map(loc -> {
                if (loc.startsWith("/")
                        || loc.startsWith("./")
                        || loc.startsWith("../")
                        || (loc.length() >= 2 && loc.charAt(1) == ':')) {
                    return Paths.get(loc);
                } else {
                    return Paths.get(System.getProperty("java.home"), loc);
                }
            }).toArrayList();
            // 設定類別載入器
            ClassLoader loader = new URLClassLoader(jarLocPaths.map(p -> {
                try {
                    return p.toUri().toURL();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }).toArray(URL.class));
            // 載入最上層類別
            Matcher rootClassMatcher = this.packageClassPattern.matcher(rootClassName);
            rootClassMatcher.matches();
            Class rootClass = loader.loadClass(rootClassName);
            // 建立XML文件
            Document xmlDoc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            Element xmlRoot = xmlDoc.createElement("reflection");
            xmlRoot.setAttribute("loader", "JarReflectionDataLoader-1.0.0");
            xmlDoc.appendChild(xmlRoot);
            // 處理JAR檔
            for (Path jarPath : jarLocPaths) {
                Path jarName = jarPath.getFileName();
                if (jarName == null) {
                    continue;
                }
                Element elemJar = xmlDoc.createElement("jar");
                elemJar.setAttribute("file", jarName.toString());
                System.out.println("jarPath: " + jarPath);
                // 載入JAR內所有類別
                List<String> classNames = this.listClassNames(jarPath);
                classNames.sort((c1, c2) -> c1.compareTo(c2));
                List<Class> classList = classNames
                        .filter(name -> rootPackages.any(pkg -> name.startsWith(pkg.replace(".", "/") + "/")))
                        .map(name -> this.loadClass(loader, name))
                        .filter(c -> Modifier.isPublic(c.getModifiers())
                                && rootClass.isAssignableFrom(c)
                                && !c.isAnnotation() && !c.isArray() && !c.isEnum() && !c.isInterface()
                                && !c.isAnonymousClass() && !c.isLocalClass() && !c.isSynthetic()
                                && (!c.isMemberClass() || Modifier.isStatic(c.getModifiers()))
                                && !c.isAnnotationPresent(Deprecated.class))
                        .toArrayList();
                // 掃描靜態屬性
                HashMap<Class, HashMap<String, ArrayList<Method>>> staticPropertyMapRegistry = new HashMap<>();
                for (Class klass : classList) {
                    HashMap<String, ArrayList<Method>> tmpMap = Arrays
                            .asList(klass.getDeclaredMethods())
                            .filter(m -> m.isPublic() && m.isStatic()
                                    && !m.isAnnotationPresent(Deprecated.class)
                                    && this.isStaticGetterOrSetter(m))
                            .toArrayListSorted(m -> m.getName())
                            .toHashMapGrouped(m -> this.getPropertyName(m.getName()));
                    for (String prop : tmpMap.keySet()) {
                        ArrayList<Method> mList = tmpMap.get(prop);
                        if (mList.size() != 2) {
                            continue;
                        }
                        Class type0 = mList.get(0).getParameters()[0].getType();
                        Class type1 = mList.get(1).getParameters()[0].getType();
                        if (type0.equals(type1)) {
                            HashMap<String, ArrayList<Method>> pmap = staticPropertyMapRegistry.computeIfAbsent(
                                    type0, k -> new HashMap<>());
                            pmap.put(getShortName(klass) + "_" + prop, mList);
                        }
                    }
                }
                // 處理
                for (Class klass : classList) {
                    System.out.println(klass.getTypeName());
                    Element elemClass = xmlDoc.createElement("class");
                    elemClass.setAttribute("name", getShortName(klass));
                    elemClass.setAttribute("package", klass.getPackage().getName());
                    String paramsDeclaration = this.buildGenericDeclaration(klass.getTypeParameters());
                    String paramsName = this.buildGenericName(klass.getTypeParameters());
                    elemClass.setAttribute("genericDeclaration", paramsDeclaration);
                    elemClass.setAttribute("genericDeclarationPrepend", paramsDeclaration.length() == 0
                            ? "" : paramsDeclaration + ", ");
                    elemClass.setAttribute("genericParam", paramsName);
                    elemClass.setAttribute("genericParamPrepend", paramsName.length() == 0
                            ? "" : paramsName + ", ");
                    elemClass.setAttribute("genericName", getShortName(klass)
                            + (paramsName.length() == 0 ? "" : "<" + paramsName + ">"));
                    elemClass.setAttribute("abstract", Boolean.toString(Modifier.isAbstract(klass.getModifiers())));
                    // Parent
                    Type supertype = this.findSuperclass(klass);
                    {
                        if (supertype != null) {
                            String sname = supertype.getTypeName();
                            if (!rootPackages.any(pkg -> sname.startsWith(pkg))) {
                                supertype = null;
                            }
                        }
                    }
                    if (supertype == null) {
                        elemClass.setAttribute("super", "");
                    } else {
                        if (supertype instanceof ParameterizedType) {
                            String superclassName = ((Class) ((ParameterizedType) supertype).getRawType())
                                    .getCanonicalName();
                            elemClass.setAttribute("super", superclassName);
                            String supertypeName = this.fixGenericTypeName(supertype.getTypeName());
                            int index = supertypeName.indexOf("<");
                            if (index >= 0) {
                                String superParam = supertypeName.substring(
                                        supertypeName.indexOf("<") + 1, supertypeName.length() - 1);
                                elemClass.setAttribute("superParam", superParam);
                                elemClass.setAttribute("superParamPrepend", superParam + ", ");
                            } else {
                                elemClass.setAttribute("superParam", "");
                                elemClass.setAttribute("superParamPrepend", "");
                            }
                        } else if (supertype instanceof Class) {
                            String superclassName = ((Class) supertype).getCanonicalName();
                            String supertypeName = this.fixGenericTypeName(supertype.getTypeName());
                            elemClass.setAttribute("super", superclassName);
                            int index = supertypeName.indexOf("<");
                            if (index >= 0) {
                                String superParam = supertypeName.substring(index + 1, supertypeName.length() - 1);
                                elemClass.setAttribute("superParam", superParam);
                                elemClass.setAttribute("superParamPrepend", superParam + ", ");
                            } else {
                                elemClass.setAttribute("superParam", "");
                                elemClass.setAttribute("superParamPrepend", "");
                            }
                        }
                    }
                    // Members
                    for (TypeVariable tvar : klass.getTypeParameters()) {
                        elemClass.appendChild(this.describeTypeParameter(xmlDoc, tvar));
                    }
                    for (Constructor constructor : Arrays.asList(klass.getDeclaredConstructors())
                            .filter(c -> c.isPublic() && !c.isAnnotationPresent(Deprecated.class))
                            .toArrayListSorted(c -> getConstructorSortKey(c))) {
                        elemClass.appendChild(this.describeConstructor(xmlDoc, constructor));
                    }
                    for (Field field : Arrays.asList(klass.getDeclaredFields())
                            .filter(f -> f.isPublic() && !f.isAnnotationPresent(Deprecated.class))
                            .toArrayListSorted(f -> getFieldSortKey(f))) {
                        elemClass.appendChild(this.describeField(xmlDoc, field));
                    }
                    for (Method method : Arrays.asList(klass.getDeclaredMethods())
                            .filter(m -> m.isPublic() && !m.isAnnotationPresent(Deprecated.class))
                            .toArrayListSorted(m -> getMethodSortKey(m))) {
                        elemClass.appendChild(this.describeMethod(xmlDoc, method));
                    }
                    // Properties
                    HashMap<String, ArrayList<Method>> propertyMap = Arrays
                            .asList(klass.getDeclaredMethods())
                            .filter(m -> m.isPublic() && !m.isStatic()
                                    && !m.isAnnotationPresent(Deprecated.class)
                                    && this.isGetterOrSetter(m))
                            .toArrayListSorted(m -> getMethodSortKey(m))
                            .toHashMapGrouped(m -> this.getPropertyName(m.getName()));
                    for (String propName : propertyMap.keySet().toArrayListSorted(n -> n)) {
                        ArrayList<Method> propAccessors = propertyMap.get(propName);
                        List<Method> getterList = propAccessors
                                .filter(m -> m.getName().startsWith("get") || m.getName().startsWith("is"))
                                .toArrayList();
                        if (getterList.size() > 1) {
                            System.out.println("duplicated property getters: " + propName + "; "
                                    + String.join(", ", getterList.map(m -> m.getName() + m.getParameters().length)));
                        }
                        Method getter = getterList.firstOrNull();
                        List<Method> setterList = propAccessors
                                .filter(m -> m.getName().startsWith("set"))
                                .toArrayListSorted(
                                        m -> ((getter == null
                                                || getter.getGenericReturnType()
                                                        .equals(m.getGenericParameterTypes()[0]))
                                                                ? "0" : "1")
                                                + "," + m.getGenericParameterTypes()[0].getTypeName());
                        if (getterList.size() == 0 && setterList.size() == 0) {
                            System.out.println("empty property: " + propName);
                            continue;
                        }
                        elemClass.appendChild(this.describeProperty(xmlDoc, propName, getter, setterList));
                    }
                    // Static Properties
                    HashMap<String, ArrayList<Method>> staticPropertyMap = staticPropertyMapRegistry.get(klass);
                    if (staticPropertyMap != null) {
                        for (String propName : staticPropertyMap.keySet().toArrayListSorted(n -> n)) {
                            ArrayList<Method> propAccessors = staticPropertyMap.get(propName);
                            Method getter = propAccessors.get(0);
                            Method setter = propAccessors.get(1);
                            elemClass.appendChild(this.describeStaticProperty(xmlDoc, propName, getter, setter));
                        }
                    }
                    //
                    elemJar.appendChild(elemClass);
                }
                xmlRoot.appendChild(elemJar);
            }
            Element srcXml = xmlDoc.createElement("xml");
            srcXml.appendChild(xmlDoc.createCDATASection(XML.toText(xmlRoot)));
            xmlRoot.appendChild(srcXml);
            return this.load(engine, args, xmlDoc);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            throw throwable;
        }
    }

    private Element describeProperty(Document doc, String name, Method getter, Collection<Method> setterList) {
        Element elem = doc.createElement("property");
        elem.setAttribute("name", name);
        elem.setAttribute("override", "false");
        elem.setAttribute("static", "false");
        if (getter != null) {
            elem.setAttribute("genericType", this.fixGenericTypeName(
                    getter.getGenericReturnType().getTypeName()));
        } else {
            elem.setAttribute("genericType", this.fixGenericTypeName(
                    setterList.first().getParameters()[0].getParameterizedType().getTypeName()));
        }
        if (getter != null) {
            Element elemGetter = this.describeMethod(doc, getter);
            elem.appendChild(doc.renameNode(elemGetter, null, "getter"));
            if (this.checkMethodOverride(getter)) {
                elem.setAttribute("override", "true");
            }
        }
        int setterIndex = 0;
        for (Method setter : setterList) {
            Element elemSetter = this.describeMethod(doc, setter);
            elemSetter.setAttribute("index", setterIndex == 0 ? "" : Integer.toString(setterIndex));
            String gType = this.fixGenericTypeName(setter.getGenericParameterTypes()[0].getTypeName());
            elemSetter.setAttribute("genericType", gType);
            int ltIndex = gType.indexOf("<");
            if (ltIndex >= 0) {
                elemSetter.setAttribute("genericParam", gType.substring(ltIndex + 1, gType.length() - 1));
                elemSetter.setAttribute("rawType", gType.substring(0, ltIndex));
            } else {
                elemSetter.setAttribute("genericParam", "");
                elemSetter.setAttribute("rawType", gType);
            }
            elem.appendChild(doc.renameNode(elemSetter, null, "setter"));
            if (this.checkMethodOverride(setter)) {
                elem.setAttribute("override", "true");
            }
            setterIndex += 1;
        }
        String gtype = elem.getAttribute("genericType");
        int index = gtype.indexOf("<");
        if (index >= 0) {
            elem.setAttribute("genericParam", gtype.substring(index + 1, gtype.length() - 1));
            elem.setAttribute("rawType", gtype.substring(0, index));
        } else {
            elem.setAttribute("genericParam", "");
            elem.setAttribute("rawType", gtype);
        }
        return elem;
    }

    private Element describeStaticProperty(Document doc, String name, Method getter, Method setter) {
        Element elem = doc.createElement("property");
        elem.setAttribute("name", name);
        elem.setAttribute("override", "false");
        elem.setAttribute("static", "true");
        elem.setAttribute("staticType", getter.getDeclaringClass().getTypeName());
        elem.setAttribute("staticName", this.getPropertyName(getter.getName()));
        elem.setAttribute("genericType", this.fixGenericTypeName(
                setter.getParameters()[1].getParameterizedType().getTypeName()));
        Element elemGetter = this.describeMethod(doc, getter);
        elem.appendChild(doc.renameNode(elemGetter, null, "getter"));
        Element elemSetter = this.describeMethod(doc, setter);
        elemSetter.setAttribute("index", "");
        elem.appendChild(doc.renameNode(elemSetter, null, "setter"));
        String gtype = elem.getAttribute("genericType");
        int index = gtype.indexOf("<");
        if (index >= 0) {
            elem.setAttribute("genericParam", gtype.substring(index + 1, gtype.length() - 1));
            elem.setAttribute("rawType", gtype.substring(0, index));
            elemSetter.setAttribute("genericType", gtype);
            elemSetter.setAttribute("genericParam", gtype.substring(index + 1, gtype.length() - 1));
            elemSetter.setAttribute("rawType", gtype.substring(0, index));
        } else {
            elem.setAttribute("genericParam", "");
            elem.setAttribute("rawType", gtype);
            elemSetter.setAttribute("genericType", gtype);
            elemSetter.setAttribute("genericParam", "");
            elemSetter.setAttribute("rawType", gtype);
        }
        return elem;
    }

    private Element describeField(Document doc, Field field) {
        Element elem = doc.createElement("field");
        elem.setAttribute("name", field.getName());
        elem.setAttribute("type", field.getType().getCanonicalName());
        elem.setAttribute("final", Boolean.toString(field.isFinal()));
        elem.setAttribute("public", Boolean.toString(field.isPublic()));
        elem.setAttribute("static", Boolean.toString(field.isStatic()));
        elem.setAttribute("access", field.getAccessLevel());
        return elem;
    }

    private Element describeConstructor(Document doc, Constructor constructor) {
        Element elem = doc.createElement("constructor");
        elem.setAttribute("name", constructor.getName());
        elem.setAttribute("parameterCount", Integer.toString(constructor.getParameterCount()));
        elem.setAttribute("public", Boolean.toString(constructor.isPublic()));
        elem.setAttribute("static", Boolean.toString(constructor.isStatic()));
        elem.setAttribute("access", constructor.getAccessLevel());
        elem.setAttribute("parametersDeclaration", this.describeParametersDeclaration(constructor.getParameters()));
        elem.setAttribute("parametersCall", this.describeParametersCall(constructor.getParameters()));
        Arrays.asList(constructor.getParameters()).forEach(p -> elem.appendChild(this.describeParameter(doc, p)));
        return elem;
    }

    private Element describeMethod(Document doc, Method method) {
        Element elem = doc.createElement("method");
        elem.setAttribute("name", method.getName());
        elem.setAttribute("returnType", this.fixGenericTypeName(method.getGenericReturnType().getTypeName()));
        elem.setAttribute("parameterCount", Integer.toString(method.getParameterCount()));
        elem.setAttribute("public", Boolean.toString(method.isPublic()));
        elem.setAttribute("static", Boolean.toString(method.isStatic()));
        elem.setAttribute("abstract", Boolean.toString(method.isAbstract()));
        elem.setAttribute("final", Boolean.toString(method.isFinal()));
        elem.setAttribute("access", method.getAccessLevel());
        elem.setAttribute("parametersDeclaration", this.describeParametersDeclaration(method.getParameters()));
        elem.setAttribute("parametersCall", this.describeParametersCall(method.getParameters()));
        elem.setAttribute("override", Boolean.toString(this.checkMethodOverride(method)));
        Arrays.asList(method.getParameters()).forEach(p -> elem.appendChild(this.describeParameter(doc, p)));
        return elem;
    }

    private Element describeTypeParameter(Document doc, TypeVariable typeParameter) {
        Element elem = doc.createElement("typeParameter");
        elem.setAttribute("name", typeParameter.getName());
        return elem;
    }

    private Element describeParameter(Document doc, Parameter parameter) {
        Element elem = doc.createElement("parameter");
        elem.setAttribute("name", parameter.getName());
        elem.setAttribute("type", parameter.getType().getCanonicalName());
        elem.setAttribute("genericType", this.fixGenericTypeName(parameter.getParameterizedType().getTypeName()));
        return elem;
    }

    private String describeParametersCall(Parameter[] parameter) {
        return String.join(", ", Arrays.asList(parameter).map(p -> p.getName()));
    }

    private String describeParametersDeclaration(Parameter[] parameter) {
        return String.join(", ", Arrays.asList(parameter)
                .map(p -> this.fixGenericTypeName(p.getParameterizedType().getTypeName()) + " " + p.getName()));
    }

    private Type findSuperclass(Class klass) {
        if (klass.getSuperclass() == null || klass.getSuperclass() == Object.class) {
            return null;
        }
        Type supertype = klass.getGenericSuperclass();
        if (supertype instanceof ParameterizedType) {
            ParameterizedType superparam = (ParameterizedType) supertype;
            Type superraw = superparam.getRawType();
            if (superraw instanceof Class) {
                Class superclass = (Class) superraw;
                if (!Modifier.isPublic(superclass.getModifiers())) {
                    return this.findSuperclass(superclass);
                }
            }
        }
        if (supertype instanceof Class) {
            Class superclass = (Class) supertype;
            if (!Modifier.isPublic(superclass.getModifiers())) {
                System.out.println("super...");
                return this.findSuperclass(superclass);
            }
        }
        return supertype;
    }

    private String fixGenericTypeName(String genericTypeName) {
        if (genericTypeName.contains("$")) {
            Matcher m = this.genericFixPattern.matcher(genericTypeName);
            if (m.find()) {
                return m.replaceAll("$1.").replace('$', '.');
            }
            return genericTypeName.replace('$', '.');
        }
        return genericTypeName;
    }

    private Class loadClass(ClassLoader loader, String name) {
        try {
            return loader.loadClass(name.replace('/', '.'));
        } catch (Throwable e) {
            System.err.println("failed to load " + name);
            throw new RuntimeException("failed to load " + name, e);
        }
    }

    private List<String> listClassNames(Path jarPath) throws IOException {
        List<String> classNames = new ArrayList<String>();
        try (FileInputStream file = new FileInputStream(jarPath.toFile());
                ZipInputStream zip = new ZipInputStream(file)) {
            for (ZipEntry entry = zip.getNextEntry(); entry != null; entry = zip.getNextEntry()) {
                if (entry.isDirectory()) {
                    continue;
                }
                String name = entry.getName();
                if (!name.endsWith(".class")) {
                    continue;
                }
                int m1 = name.indexOf('$');
                int m2 = name.lastIndexOf('$');
                if (m1 != -1) {
                    if (m1 != m2) {
                        continue;
                    }
                    char c = name.charAt(m1 + 1);
                    if (c >= '0' && c <= '9') {
                        continue;
                    }
                }
                classNames.add(name.substring(0, name.length() - ".class".length()));
            }
        }
        return classNames;
    }

    private String buildGenericDeclaration(TypeVariable[] typeParameters) {
        if (typeParameters.length == 0) {
            return "";
        } else {
            return String.join(
                    ", ", Arrays.asList(typeParameters).map(p -> p.getName()
                            + (p.getBounds().length == 0 ? "" : " extends " + String.join("&",
                                    Arrays.asList(p.getBounds()).map(b -> b.getTypeName())))));
        }
    }

    protected String buildGenericName(TypeVariable[] typeParameters) {
        if (typeParameters.length == 0) {
            return "";
        } else {
            return String.join(", ", Arrays.asList(typeParameters).map(p -> p.getName()));
        }
    }

    /*
    private String insertPostfix(String genericTypeName, String postfix)
    {
        if (genericTypeName == null)
            return null;
        if (genericTypeName.length() == 0)
            return genericTypeName;
        int index = genericTypeName.indexOf('<');
        if (index >= 0)
            return genericTypeName.substring(0, index) + postfix + genericTypeName.substring(index);
        else
            return genericTypeName + postfix;
    }
     */

    private boolean isGetterOrSetter(Method method) {
        String name = method.getName();
        if (name.length() > 2 && name.startsWith("is") && method.getParameterCount() == 0) {
            return true;
        }
        if (name.length() > 3 && name.startsWith("get") && method.getParameterCount() == 0) {
            return true;
        }
        if (name.length() > 3 && name.startsWith("set") && method.getParameterCount() == 1) {
            return true;
        }
        return false;
    }

    private boolean isStaticGetterOrSetter(Method method) {
        String name = method.getName();
        if (name.length() > 2 && name.startsWith("is") && method.getParameterCount() == 1) {
            return true;
        }
        if (name.length() > 3 && name.startsWith("get") && method.getParameterCount() == 1) {
            return true;
        }
        if (name.length() > 3 && name.startsWith("set") && method.getParameterCount() == 2) {
            return true;
        }
        return false;
    }

    private String getPropertyName(String accessorName) {
        if (accessorName.startsWith("is")) {
            return accessorName.substring(2).toUncapitalized();
        } else {
            return accessorName.substring(3).toUncapitalized();
        }
    }

    private boolean checkMethodOverride(Method method) {
        if (method.getDeclaringClass() == Object.class) {
            return false;
        }
        //
        if (method.getName().equals("getSelectedItems")) {
            System.out.println(method.getDeclaringClass().getTypeName() + "found getSelectedItems");
            Iterator<Class> it = new LinkLineIterator<>(
                    method.getDeclaringClass().getSuperclass(), c -> c.getSuperclass());
            while (it.hasNext()) {
                Class klass = it.next();
                if (!Modifier.isPublic(klass.getModifiers())) {
                    continue;
                }
                Arrays.asList(klass.getDeclaredMethods())
                        .filter(m -> m.isPublic() && !m.isStatic() && !m.isAbstract()
                                && m.getName().equals(method.getName()))
                        .forEach(System.out::println);
            }
        }
        //
        Iterator<Class> iterator = new LinkLineIterator<>(
                method.getDeclaringClass().getSuperclass(), c -> c.getSuperclass());
        while (iterator.hasNext()) {
            Class klass = iterator.next();
            if (!Modifier.isPublic(klass.getModifiers())) {
                continue;
            }
            if (Arrays.asList(klass.getDeclaredMethods())
                    .filter(m -> m.isPublic() && !m.isStatic() && !m.isAbstract())
                    .any(m -> m.getName().equals(method.getName()))) {
                return true;
            }
        }
        return false;
    }

    private static String getConstructorSortKey(Constructor constructor) {
        return String.format("%03d: %s",
                constructor.getParameterCount(),
                String.join(",", Arrays.asList(constructor.getGenericParameterTypes()).map(t -> t.getTypeName())));
    }

    private static String getFieldSortKey(Field field) {
        return field.getName();
    }

    private static String getMethodSortKey(Method method) {
        return String.format("%s %s %s",
                method.getName(),
                method.toGenericString(),
                String.join(",", Arrays.asList(method.getGenericParameterTypes()).map(t -> t.getTypeName())));
    }

    private static String getShortName(Class<?> klass) {
        String name = klass.getName();
        int index = name.lastIndexOf('.');
        if (index != -1) {
            name = name.substring(index + 1);
        }
        return name.replace('$', '.');
    }
}

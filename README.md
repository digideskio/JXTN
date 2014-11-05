JXTN
====

Java 8 API Extensions and Utilities



###### License: Public Domain
###### Author:  AqD

#### Projects:
 - **jxtn.core.axi:** Extensions to Java 8 API, to be put into *endorsed* dir.
 - **jxtn.core.dev:** Patches to compilers and IDEs
 - **jxtn.core.fmpp:** FMPP/FreeMarker data loaders for code generation.
 - **jxtn.jfx.axi:** Extensions to JavaFX 8.
 - **jxtn.jfx.builders:** Replacement of deprecated JavaFX builders.

------------------------------------------------------------------------------

jxtn.core.axi
-------------

Extending the Java Collection API by adding non-standard default methods such
as *Iterable.filter* and *Iterable.map*. The library provides the most common
used functions directly on existing Java collections, as a simpler and
easier-to-use alternative to Java 8 Stream API. which should be reserved for
more advanced operations (parallelism etc) only.

##### Examples

   ```java
   String joinNumbersToString(Iterable<Double> list) {
       return String.join(", ", list.filter(d -> d != null).map(d -> String.format("%f", d)));
   }
   ```

   ```java
   Point2D getClosestPoint(Point2D origin, Iterable<Point2D> pointList) {
       return pointList.firstOfMinDouble(p -> p.distance(origin));
   }
   ```


   ```java
   void collapseNestedNodesInTree(javafx.scene.control.TreeItem root) {
       IterableExt.linkTree(root, item -> item.getChildren())
               .skip(1) // skip the root itself
               .forEach(item -> item.setExpanded(false));
   }
   ```

##### Functionality
 - String methods: left/right/padLeft/padRight/...
 - Iterable methods: all/any/concat/filter/map/first/groupBy/avg/max/...
 - Iterator methods: *same as Iterable*
 - dom/NodeList methods: asList
 - generic replacements of non-generic method declarations in the collection
   API, such as:
   * Collection.remove2(E): replaces *Collection.remove(Object)*
   * Map.get2(K): replaces *Map.get(Object)*
   * ......
 - Comparators: generic comparators for comparing arrays and by member.
 - Function interfaces: *FunctionEx*, *SupplierEx*, *ConsumerEx* etc, to allow
   throwing of exceptions while remain compatible with built-in interfaces
   (exceptions are optionally wrapped as _RuntimeException_).
 - Tuples: like javatuples but support null values.

##### Dependencies
 - OpenJDK (as source) for Java version updating: To update the project for
   newer Java versions, simply copy the latest source files from OpenJDK,
   override and modify *interface ...* line of each file to extend extension
   interfaces. For instance:

   ```java
   public interface List<E> extends Collection<E> {}
   ```

   change to:

   ```java
   public interface List<E> extends Collection<E>, ListExt<E> {}
   ```

##### Installation
 1. Build *jxtn.core.axi.jar*
 2. Create the directory _jre/endorsed_ or _jre8/endorsed_
 3. Put *jxtn.core.axi.jar* into _endorsed_
 4. Classes in *jxtn.core.axi.jar* (and all other jar files in _endorsed_) will
    automatically override anything provided in the standard Java class library
    (rt.jar). Note that you should not use the same way to override classes
    under ext or others, because it'd be the bootstrap classloader which loads
    endorsed jars and it cannot see other jars on application classpath.
 5. You may have to configure IDEs for code inspection to work correctly.
    * Eclipse: add jars under _endorsed_ to your JRE system libraries.
    * Intellij: same as above, and edit _config\options\jdk.table.xml_ to
      change the order of JARs (JARs under _endorsed_ should be at top).

##### Compatibility
 - AXI is compatible with Java SE 8u20 but not older versions due to change in
   the default method *Collection.sort* in 8u20 (but not 8). Compatibility
   shall not be an issue afterwards since the collection interfaces have been
   stable for many years.
 - Custom implementations of collection interfaces should not override the new
   generic version of non-generic methods, for the sake of consistency, ex:
   override *Collection.remove(Object)* instead of *Collection.remove2(E)*,
   because *remove2(E)* should always call *remove(Object)* internally.

##### Notes
 - The licenses of modified OpenJDK source remain unchanged. They're NOT under
   public domain like the rest of files.
 - Comments are written in Chinese until I find a way to make dual-language
   javadoc.
 - Primitive methods are named differently depending on their types instead of
   utilizing overloads (ex: *firstOfMin* and *firstOfMinInt*), because
   overloading with function interfaces plus autoboxing tend to break code
   parsing in Java IDEs.
 - No extension to Array classes for now because I don't know how to do it.
 - No test suite available. Some code may be broken since I never test them.

------------------------------------------------------------------------------

jxtn.core.dev
-------------
Provides patches to compilers and IDEs for bugfixes and new features.

##### Patches:
 - [Eclipse JDT; Fix resolve error triggered by *jxtn.core.axi*](jxtn.core.dev/fix_inner_type-eclipse.md)
 - [Eclipse JDT; Multi-line Strings](jxtn.core.dev/multiline_string-eclipse.md)
 - [Eclipse JDT; Suppress Checked Exceptions](jxtn.core.dev/suppress_exception-eclipse.md)
 - [Eclipse SWT; Fix WM_IME_ENDCOMPOSITION](jxtn.core.dev/fix_ime_end-swt.md)

------------------------------------------------------------------------------

jxtn.core.fmpp
--------------

Provides following data loaders:

 - **JarReflectionDataLoader:** translate reflection information from JARs to
   XML, to be used for Java-to-Java code generators (such as builder classes).
 - **SqlSchemaDataLoader:** translate SQL schema to XML, to be used for Java
   code generation from database.

##### Dependencies
 - FMPP at runtime: tested on v0.9.14. The built binary of this project is in
   the form of FMPP plugins and they should be dropped into _fmpp/lib_.

##### Installation
 1. Build *jxtn.core.fmpp.jar*
 2. Drop *jxtn.core.fmpp.jar* into _fmpp\lib_

##### Notes
 - Comments are written in Chinese until I find a way to make dual-language
   javadoc.
 - *JarReflectionDataLoader* is made for JavaFX builders. It skips internal
   members, and is not ready for classes made complex use of generics.
 - *SqlSchemaDataLoader* is made for SQL Server though most of schema is
   obtained from *INFORMATION_SCHEMA* which is SQL standard. It may need minor
   modification for other databases.

------------------------------------------------------------------------------

jxtn.jfx.axi
------------

Overrides and extends classes/interfaces already existing in JavaFX.

##### Functionality
 - ObservableValue methods: asObject(mapper)/asBoolean(mapper)/...

##### Dependencies
 - OpenJDK (as source) for Java version updating: To update the project for
   newer Java versions, simply copy the latest source files from OpenJDK,
   override and modify *interface ...* line of each file to extend extension
   interfaces. For instance:

   ```java
   public interface ObservableValue<T> extends Observable {}
   ```

   change to:

   ```java
   public interface ObservableValue<T> extends Observable, ObservableValueExt<T> {}
   ```

##### Installation
 1. Build *jxtn.jfx.axi*
 2. Drop *jxtn.jfx.axi* into your own project(s). The library overrides
    inner interfaces (called by JavaFX itself, as opposed to builder classes),
    so it wouldn't be as simple as modifying classpath, and _endorsed_ cannot
    work because the class loader which loads endorsed classes is the bootstrap
    one, which cannot load anything under _ext_ as needed by this library.
    There are two ways:

    * Put the library into _jre/lib/ext_, rename the file to something like
      _jfxaxi.jar_ to make sure it's before _jfxrt.jar_ (type *dir* on cmd to
      check this). While there is no guarantee on file order from _File.list()_
      calls, it actually works on NTFS and possibly some of Linux filesystems
      due to the internal organization (mostly B-tree) of file entries on
      directories.

    * Modify the classpath list of _ExtClassLoader_ at runtime by
      _java.net.URLClassLoaderExt.insertURL()_ from _jxtn.core.axi_:

      ```java
      URLClassLoader extClassLoader = (URLClassLoader) IterableExt
              .linkLine(AppClass.class.getClassLoader(), cl -> cl.getParent())
              .first(cl -> cl.getClass().getCanonicalName().equals("sun.misc.Launcher.ExtClassLoader"))
      Path classpath = Paths.get("X:/somewhere/jxtn.jfx.axi.jar");
      URLClassLoaderExt.insertURL(extClassLoader, classpath.toUri().toURL());
      ```
      (that also serves as an example of _Iterable_ extensions)

##### Notes
 - The licenses of modified OpenJDK source remain unchanged. They're NOT under
   public domain like the rest of files.
 - Comments are written in Chinese until I find ways to make dual-language
   javadoc.

------------------------------------------------------------------------------

jxtn.jfx.builders
-----------------

Re-creates the deprecated JavaFX builders, based on FMPP/FreeMarker template
engine. It also provides bindings and you may easily extend the functionality
or use the tool to generate builders for 3rd-party libraries (controlsfx
builders are already included).

##### Dependencies
 - FMPP for re-generation of builder classes: tested on v0.9.14.

##### Additionals
 - ControlsFX v8.20.8: It's optional and you could remove the library and
   builder classes under _org/controlsfx/*_ directory.
 - OpenJFX Dialogs v1.0.2: Part of JavaFX 8u40 to provide dialog support.

##### Installation
 1. Build *jxtn.jfx.builders*
 2. Drop *jxtn.jfx.builders* into your own project(s) and make sure it's before
    _ext/jfxrt.jar_ on classpath.

##### Notes
 - Comments are written in Chinese until I find ways to make dual-language
   javadoc.
 - The re-created builders are nearly identical to official JavaFX builders,
   except the Builder.create() methods are replaced by a single *JFX* to avoid
   naming conflict (somehow Eclipse JDT compiler hates it). Instead of:

   ```java
   TabPaneBuilder.create().tabs(
           TabBuilder.create().text("First Tab").build(),
           TabBuilder.create().text("Second Tab").build()
       ).build();
   ```

   You have to write it as:

   ```java
   JFX.tabPane().tabs(
           JFX.tab().text("First Tab").build(),
           JFX.tab().text("Second Tab").build()
       ).build();
   ```

   You can also add the static *create()* methods back easily by modifying
   _javafx.ftl_, if you don't have to use Eclipse JDT compiler.
 - Selection model builders are omitted because Oracle uses weird class
   hierarchies - there are internal classes in-between public classes...

<#--
  -- This is free and unencumbered software released into the public domain.
  --
  -- Anyone is free to copy, modify, publish, use, compile, sell, or
  -- distribute this software, either in source code form or as a compiled
  -- binary, for any purpose, commercial or non-commercial, and by any
  -- means.
  --
  -- In jurisdictions that recognize copyright laws, the author or authors
  -- of this software dedicate any and all copyright interest in the
  -- software to the public domain. We make this dedication for the benefit
  -- of the public at large and to the detriment of our heirs and
  -- successors. We intend this dedication to be an overt act of
  -- relinquishment in perpetuity of all present and future rights to this
  -- software under copyright law.
  --
  -- THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
  -- EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
  -- MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
  -- IN NO EVENT SHALL THE AUTHORS BE LIABLE FOR ANY CLAIM, DAMAGES OR
  -- OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
  -- ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
  -- OTHER DEALINGS IN THE SOFTWARE.
  --
  -- For more information, please refer to <http://unlicense.org/>
  -->
<#--
  -- Author: AqD
  -->
<#function isFXProp method>
  <#if method.@static == "false" && !method.@name?starts_with("get") && !method.@name?starts_with("set") && method.@name?ends_with("Property") && method.@returnType?contains("Property") && !method.@returnType?contains("ReadOnly")>
    <#return true>
  <#else>
    <#return false>
  </#if>
</#function>
<#function getFXType fullType>
  <#if fullType?contains("<")>
    <#return fullType?substring(fullType?index_of("<") + 1, fullType?length - 1)>
  <#else>
    <#assign inner = fullType?substring(0, fullType?length - 8)>
    <#if inner?contains(".")>
      <#assign inner = inner?substring(inner?last_index_of(".") + 1, inner?length)>
    </#if>
    <#if inner?starts_with("Simple")>
      <#assign inner = inner?substring(6, inner?length)>
    </#if>
    <#switch inner>
        <#case "Double">
        <#case "Float">
        <#case "Integer">
        <#case "Long">
            <#return "Number">
        <#default>
            <#return inner>
    </#switch>
  </#if>
</#function>
<#-- 開始 -->
<@pp.dropOutputFile />
<#assign path = "lib/ext/jfxrt.jar, ../lib/openjfx-dialogs-1.0.2.jar, ../lib/controlsfx-8.20.7.jar">
<#assign pkgs = "javafx.scene, javafx.stage, org.controlsfx">
<#assign root = "java.lang.Object">
<#-- 載入結構 -->
<#assign xml = pp.loadData("jxtn.core.fmpp.JarReflectionDataLoader", path + "|" + pkgs + "|" + root, {})>
<#-- 結構描述檔案 -->
<@pp.changeOutputFile name = "javafx.xml" />
${xml.reflection.xml}
<#-- 建立彙總類別 -->
<#assign fileName = "/jxtn/jfx/builders/JFX.java">
<@pp.changeOutputFile name = fileName />
<@pp.warning message = fileName />
// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package jxtn.jfx.builders;

/**
 * 建構器彙總。
 *
 * @author ${xml.reflection.@loader}
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public final class JFX
{
    private JFX() {}
<#list xml.reflection.jar as jar>
<#list jar.class as class>
<#if !class.@name?ends_with("Event") && !class.@name?ends_with("Model") && class.constructor?size != 0 && class.constructor[0].@access == "public">

    /**
     * 建立新的{@link ${class.@package}.${class.@name}}建構器。
     *
     * @return 新的{@link ${class.@package}.${class.@name}Builder}
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static<#if class.@genericDeclaration != ""> <${class.@genericDeclaration}></#if> ${class.@package}.${class.@name}Builder<${class.@genericParamPrepend}${class.@package}.${class.@genericName}, ?> ${class.@name?uncap_first}()
    {
        return new ${class.@package}.${class.@name}Builder();
    }
</#if>
</#list>
</#list>
}
<#-- 建立個別建構器 -->
<#list xml.reflection.jar as jar>
<#list jar.class as class>
<#if !class.@name?ends_with("Event") && !class.@name?ends_with("Model")>
<#assign fileName = "/" + class.@package?replace(".", "/") + "/" + class.@name+"Builder.java">
<@pp.changeOutputFile name=fileName />
<@pp.warning message=fileName />
// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package ${class.@package};

/**
 * {@link ${class.@name}}建構器。
 *
 * @author ${xml.reflection.@loader}
 * @version ${jar.@file}
 * @param <Z> 要建構的物件型態(需繼承{@link ${class.@name}})
 * @param <B> 建構器本身的型態(需繼承{@link ${class.@name}Builder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ${class.@name}Builder<${class.@genericDeclarationPrepend}Z extends ${class.@genericName}, B extends ${class.@name}Builder<${class.@genericParamPrepend}Z, B>>
    <#if class.@super != "">
        extends ${class.@super}Builder<${class.@superParamPrepend}Z, B>
    <#else>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
    </#if>
        implements ${class.@name}BuilderExt<${class.@genericParamPrepend}Z, B>
{
 <#-- 一般屬性欄位 -->
  <#list class.property as property>
   <#if property.setter?size != 0 && property.setter[0].@abstract == "false" && property.setter[0].@override == "false">
    <#list property.setter as setter>

    private boolean has${property.@name?cap_first}${setter.@index};
    private ${setter.@genericType} val${property.@name?cap_first}${setter.@index};
    </#list>
   <#elseif property.@rawType?contains(".ObservableList") && property.getter?size != 0 && property.getter.@abstract == "false" && property.getter.@override == "false">

    private boolean has${property.@name?cap_first};
    private java.util.Collection<${property.@genericParam}> val${property.@name?cap_first};
   </#if>
  </#list>
 <#-- FX屬性欄位 -->
  <#list class.method as method>
   <#if isFXProp(method)>
    <#assign fxPropName = method.@name?substring(0, method.@name?length - 8)>

    private boolean bound1${fxPropName?cap_first};
    private boolean bound2${fxPropName?cap_first};
    private javafx.beans.value.ObservableValue<? extends ${getFXType(method.@returnType)}> obsrv1${fxPropName?cap_first};
    private javafx.beans.property.Property<${getFXType(method.@returnType)}> obsrv2${fxPropName?cap_first};
   </#if>
  </#list>
 <#-- 結束屬性欄位 -->
 <#-- 套用屬性方法 -->

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
      <#-- 套用一般屬性 -->
      <#list class.property as property>
       <#if property.setter?size != 0 && property.setter[0].@abstract == "false" && property.setter[0].@override == "false">
        <#list property.setter as setter>
        if (this.has${property.@name?cap_first}${setter.@index})
          <#if property.@static == "false">
            instance.set${property.@name?cap_first}(this.val${property.@name?cap_first}${setter.@index});
          <#else>
            ${property.@staticType}.set${property.@staticName?cap_first}(instance, this.val${property.@name?cap_first});
          </#if>
         </#list>
       <#elseif property.@rawType?contains(".ObservableList") && property.getter?size != 0 && property.getter.@abstract == "false" && property.getter.@override == "false">
        if (this.has${property.@name?cap_first})
            instance.get${property.@name?cap_first}().addAll(this.val${property.@name?cap_first});
       </#if>
      </#list>
      <#-- 套用FX屬性 -->
      <#list class.method as method>
       <#if isFXProp(method)>
        <#assign fxPropName = method.@name?substring(0, method.@name?length - 8)>
        if (this.bound1${fxPropName?cap_first})
            instance.${fxPropName}Property().bind(this.obsrv1${fxPropName?cap_first});
        if (this.bound2${fxPropName?cap_first})
            instance.${fxPropName}Property().bindBidirectional(this.obsrv2${fxPropName?cap_first});
       </#if>
      </#list>
      <#-- 套用結束 -->
    }
 <#-- 一般屬性setter -->
  <#list class.property as property>
   <#if property.setter?size != 0 && property.setter[0].@abstract == "false">
    <#list property.setter as setter>

    <#if property.@static == "false">
    /**
     * 設定屬性{@link ${class.@name}#set${property.@name?cap_first}(${setter.@rawType})}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    <#else>
    /**
     * 設定屬性{@link ${property.@staticType}#set${property.@staticName?cap_first}}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    </#if>
    <#if property.setter[0].@override == "true">
    @Override
    </#if>
    @SuppressWarnings("unchecked")
    public B ${property.@name}(${setter.@genericType} value)
    {
        this.has${property.@name?cap_first}${setter.@index} = true;
        this.val${property.@name?cap_first}${setter.@index} = value;
        return (B) this;
    }
    </#list>
   <#elseif property.@rawType?contains(".ObservableList") && property.getter.@abstract == "false">

    /**
     * 設定集合屬性{@link ${class.@name}#get${property.@name?cap_first}}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     * @deprecated 屬性值並非{@link javafx.collections.ObservableList}
     */
    @Deprecated
    <#if property.getter.@override == "true">
    @Override
    </#if>
    @SuppressWarnings("unchecked")
    public final B ${property.@name}(java.util.Collection<${property.@genericParam}> value)
    {
        this.has${property.@name?cap_first} = true;
        this.val${property.@name?cap_first} = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link ${class.@name}#get${property.@name?cap_first}}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    <#if property.getter.@override == "true">
    @Override
    </#if>
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B ${property.@name}(${property.@genericParam}... value)
    {
        this.has${property.@name?cap_first} = true;
        this.val${property.@name?cap_first} = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link ${class.@name}#get${property.@name?cap_first}}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    <#if property.getter.@override == "true">
    @Override
    </#if>
    @SuppressWarnings("unchecked")
    public final B ${property.@name}Add(java.util.Collection<${property.@genericParam}> value)
    {
        java.util.Objects.requireNonNull(value);
        this.has${property.@name?cap_first} = true;
        if (this.val${property.@name?cap_first} == null)
            this.val${property.@name?cap_first} = new java.util.ArrayList<>(value.size());
        this.val${property.@name?cap_first}.addAll(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link ${class.@name}#get${property.@name?cap_first}}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    <#if property.getter.@override == "true">
    @Override
    </#if>
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B ${property.@name}Add(${property.@genericParam}... value)
    {
        java.util.Objects.requireNonNull(value);
        this.has${property.@name?cap_first} = true;
        if (this.val${property.@name?cap_first} == null)
            this.val${property.@name?cap_first} = new java.util.ArrayList<>(value.length);
        this.val${property.@name?cap_first}.addAll(java.util.Arrays.asList(value));
        return (B) this;
    }
   </#if>
  </#list>
 <#-- FX屬性setter -->
  <#list class.method as method>
   <#if isFXProp(method)>
    <#assign fxPropName = method.@name?substring(0, method.@name?length - 8)>

    /**
     * 設定屬性{@link ${class.@name}#${fxPropName}Property}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bind${fxPropName?cap_first}(javafx.beans.value.ObservableValue<? extends ${getFXType(method.@returnType)}> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1${fxPropName?cap_first} = true;
        this.obsrv1${fxPropName?cap_first} = source;
        this.bound2${fxPropName?cap_first} = false;
        this.obsrv2${fxPropName?cap_first} = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ${class.@name}#${fxPropName}Property}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectional${fxPropName?cap_first}(javafx.beans.property.Property<${getFXType(method.@returnType)}> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1${fxPropName?cap_first} = false;
        this.obsrv1${fxPropName?cap_first} = null;
        this.bound2${fxPropName?cap_first} = true;
        this.obsrv2${fxPropName?cap_first} = source;
        return (B) this;
    }
   </#if>
 </#list>
 <#-- 結束屬性setter -->
 <#-- 建構方法 -->
 <#if class.@abstract == "false" && class.constructor?size != 0>
   <#list class.constructor as constructor>

    /**
     * 建構{@link ${class.@name}}物件。
     *
     * @return 新的{@link ${class.@name}}物件實體
     */
    <#if constructor.@parameterCount == "0">
    @Override
    </#if>
    @SuppressWarnings("unchecked")
    public ${class.@genericName} build(${constructor.@parametersDeclaration})
    {
        ${class.@genericName} instance = new ${class.@genericName}(${constructor.@parametersCall});
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
   </#list>
 </#if>
}
<#assign fileName = "/" + class.@package?replace(".", "/") + "/" + class.@name+"BuilderExt.java">
<#if pp.outputFileExists(fileName)>
<#else>
<@pp.changeOutputFile name = fileName />
<@pp.warning message = fileName />
// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package ${class.@package};

/**
 * {@link ${class.@name}}建構器延伸（供客製化）。
 *
 * @author ${xml.reflection.@loader}
 * @version ${jar.@file}
 * @param <Z> 要建構的物件型態(需繼承{@link ${class.@name}})
 * @param <B> 建構器本身的型態(需繼承{@link ${class.@name}Builder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public interface ${class.@name}BuilderExt<${class.@genericDeclarationPrepend}Z extends ${class.@genericName}, B extends ${class.@name}Builder<${class.@genericParamPrepend}Z, B>>
    <#if class.@super != "">
        extends ${class.@super}BuilderExt<${class.@superParamPrepend}Z, B>
    <#else>
        extends jxtn.jfx.builders.AbstractBuilderExt<Z, B>
    </#if>
{
    // nothing yet
}
</#if>
</#if>
</#list>
</#list>
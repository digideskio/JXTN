// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link TreeItem}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link TreeItem})
 * @param <B> 建構器本身的型態(需繼承{@link TreeItemBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class TreeItemBuilder<T extends java.lang.Object, Z extends TreeItem<T>, B extends TreeItemBuilder<T, Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
        implements TreeItemBuilderExt<T, Z, B>
{

    private boolean hasChildren;
    private java.util.Collection<javafx.scene.control.TreeItem<T>> valChildren;

    private boolean hasExpanded;
    private boolean valExpanded;

    private boolean hasGraphic;
    private javafx.scene.Node valGraphic;

    private boolean hasValue;
    private T valValue;

    private boolean bound1Expanded;
    private boolean bound2Expanded;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1Expanded;
    private javafx.beans.property.Property<Boolean> obsrv2Expanded;

    private boolean bound1Graphic;
    private boolean bound2Graphic;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrv1Graphic;
    private javafx.beans.property.Property<javafx.scene.Node> obsrv2Graphic;

    private boolean bound1Value;
    private boolean bound2Value;
    private javafx.beans.value.ObservableValue<? extends T> obsrv1Value;
    private javafx.beans.property.Property<T> obsrv2Value;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasChildren)
            instance.getChildren().addAll(this.valChildren);
        if (this.hasExpanded)
            instance.setExpanded(this.valExpanded);
        if (this.hasGraphic)
            instance.setGraphic(this.valGraphic);
        if (this.hasValue)
            instance.setValue(this.valValue);
        if (this.bound1Expanded)
            instance.expandedProperty().bind(this.obsrv1Expanded);
        if (this.bound2Expanded)
            instance.expandedProperty().bindBidirectional(this.obsrv2Expanded);
        if (this.bound1Graphic)
            instance.graphicProperty().bind(this.obsrv1Graphic);
        if (this.bound2Graphic)
            instance.graphicProperty().bindBidirectional(this.obsrv2Graphic);
        if (this.bound1Value)
            instance.valueProperty().bind(this.obsrv1Value);
        if (this.bound2Value)
            instance.valueProperty().bindBidirectional(this.obsrv2Value);
    }

    /**
     * 設定集合屬性{@link TreeItem#getChildren}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B children(java.util.Collection<javafx.scene.control.TreeItem<T>> value)
    {
        this.hasChildren = true;
        this.valChildren = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link TreeItem#getChildren}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B children(javafx.scene.control.TreeItem<T>... value)
    {
        this.hasChildren = true;
        this.valChildren = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link TreeItem#getChildren}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B childrenAdd(java.util.Collection<javafx.scene.control.TreeItem<T>> value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasChildren = true;
        if (this.valChildren == null)
            this.valChildren = new java.util.ArrayList<>(value.size());
        this.valChildren.addAll(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link TreeItem#getChildren}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B childrenAdd(javafx.scene.control.TreeItem<T>... value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasChildren = true;
        if (this.valChildren == null)
            this.valChildren = new java.util.ArrayList<>(value.length);
        this.valChildren.addAll(java.util.Arrays.asList(value));
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeItem#setExpanded(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B expanded(boolean value)
    {
        this.hasExpanded = true;
        this.valExpanded = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeItem#setGraphic(javafx.scene.Node)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B graphic(javafx.scene.Node value)
    {
        this.hasGraphic = true;
        this.valGraphic = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeItem#setValue(T)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B value(T value)
    {
        this.hasValue = true;
        this.valValue = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeItem#expandedProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindExpanded(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Expanded = true;
        this.obsrv1Expanded = source;
        this.bound2Expanded = false;
        this.obsrv2Expanded = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeItem#expandedProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalExpanded(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Expanded = false;
        this.obsrv1Expanded = null;
        this.bound2Expanded = true;
        this.obsrv2Expanded = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeItem#graphicProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindGraphic(javafx.beans.value.ObservableValue<? extends javafx.scene.Node> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Graphic = true;
        this.obsrv1Graphic = source;
        this.bound2Graphic = false;
        this.obsrv2Graphic = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeItem#graphicProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalGraphic(javafx.beans.property.Property<javafx.scene.Node> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Graphic = false;
        this.obsrv1Graphic = null;
        this.bound2Graphic = true;
        this.obsrv2Graphic = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeItem#valueProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindValue(javafx.beans.value.ObservableValue<? extends T> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Value = true;
        this.obsrv1Value = source;
        this.bound2Value = false;
        this.obsrv2Value = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeItem#valueProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalValue(javafx.beans.property.Property<T> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Value = false;
        this.obsrv1Value = null;
        this.bound2Value = true;
        this.obsrv2Value = source;
        return (B) this;
    }

    /**
     * 建構{@link TreeItem}物件
     *
     * @return 新的{@link TreeItem}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public TreeItem<T> build()
    {
        TreeItem<T> instance = new TreeItem<T>();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link TreeItem}物件
     *
     * @return 新的{@link TreeItem}物件實體
     */
    @SuppressWarnings("unchecked")
    public TreeItem<T> build(T arg0)
    {
        TreeItem<T> instance = new TreeItem<T>(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link TreeItem}物件
     *
     * @return 新的{@link TreeItem}物件實體
     */
    @SuppressWarnings("unchecked")
    public TreeItem<T> build(T arg0, javafx.scene.Node arg1)
    {
        TreeItem<T> instance = new TreeItem<T>(arg0, arg1);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene;

/**
 * {@link Group}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link Group})
 * @param <B> 建構器本身的型態(需繼承{@link GroupBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class GroupBuilder<Z extends Group, B extends GroupBuilder<Z, B>>
        extends javafx.scene.ParentBuilder<Z, B>
        implements GroupBuilderExt<Z, B>
{

    private boolean hasAutoSizeChildren;
    private boolean valAutoSizeChildren;

    private boolean hasChildren;
    private java.util.Collection<javafx.scene.Node> valChildren;

    private boolean bound1AutoSizeChildren;
    private boolean bound2AutoSizeChildren;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1AutoSizeChildren;
    private javafx.beans.property.Property<Boolean> obsrv2AutoSizeChildren;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasAutoSizeChildren)
            instance.setAutoSizeChildren(this.valAutoSizeChildren);
        if (this.hasChildren)
            instance.getChildren().addAll(this.valChildren);
        if (this.bound1AutoSizeChildren)
            instance.autoSizeChildrenProperty().bind(this.obsrv1AutoSizeChildren);
        if (this.bound2AutoSizeChildren)
            instance.autoSizeChildrenProperty().bindBidirectional(this.obsrv2AutoSizeChildren);
    }

    /**
     * 設定屬性{@link Group#setAutoSizeChildren(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B autoSizeChildren(boolean value)
    {
        this.hasAutoSizeChildren = true;
        this.valAutoSizeChildren = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link Group#getChildren}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B children(java.util.Collection<javafx.scene.Node> value)
    {
        this.hasChildren = true;
        this.valChildren = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link Group#getChildren}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B children(javafx.scene.Node... value)
    {
        this.hasChildren = true;
        this.valChildren = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link Group#getChildren}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B childrenAdd(java.util.Collection<javafx.scene.Node> value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasChildren = true;
        if (this.valChildren == null)
            this.valChildren = new java.util.ArrayList<>(value.size());
        this.valChildren.addAll(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link Group#getChildren}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B childrenAdd(javafx.scene.Node... value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasChildren = true;
        if (this.valChildren == null)
            this.valChildren = new java.util.ArrayList<>(value.length);
        this.valChildren.addAll(java.util.Arrays.asList(value));
        return (B) this;
    }

    /**
     * 設定屬性{@link Group#autoSizeChildrenProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindAutoSizeChildren(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1AutoSizeChildren = true;
        this.obsrv1AutoSizeChildren = source;
        this.bound2AutoSizeChildren = false;
        this.obsrv2AutoSizeChildren = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Group#autoSizeChildrenProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalAutoSizeChildren(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1AutoSizeChildren = false;
        this.obsrv1AutoSizeChildren = null;
        this.bound2AutoSizeChildren = true;
        this.obsrv2AutoSizeChildren = source;
        return (B) this;
    }

    /**
     * 建構{@link Group}物件
     *
     * @return 新的{@link Group}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Group build()
    {
        Group instance = new Group();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link Group}物件
     *
     * @return 新的{@link Group}物件實體
     */
    @SuppressWarnings("unchecked")
    public Group build(java.util.Collection<javafx.scene.Node> arg0)
    {
        Group instance = new Group(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link Group}物件
     *
     * @return 新的{@link Group}物件實體
     */
    @SuppressWarnings("unchecked")
    public Group build(javafx.scene.Node[] arg0)
    {
        Group instance = new Group(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

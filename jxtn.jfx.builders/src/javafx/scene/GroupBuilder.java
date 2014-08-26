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
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class GroupBuilder<Z extends Group, B extends GroupBuilder<Z, B>>
        extends javafx.scene.ParentBuilder<Z, B>
{

    protected boolean hasAutoSizeChildren;
    protected boolean valAutoSizeChildren;

    protected boolean hasChildren;
    protected java.util.Collection<javafx.scene.Node> valChildren;

    protected boolean boundAutoSizeChildren;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvAutoSizeChildren;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasAutoSizeChildren)
            instance.setAutoSizeChildren(this.valAutoSizeChildren);
        if (this.hasChildren)
            instance.getChildren().setAll(this.valChildren);
        if (this.boundAutoSizeChildren)
            instance.autoSizeChildrenProperty().bind(this.obsrvAutoSizeChildren);
    }

    /**
     * 設定屬性{@link Group#setAutoSizeChildren}
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
    public B children(java.util.Collection<javafx.scene.Node> value)
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
     * 設定屬性{@link Group#autoSizeChildrenProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindAutoSizeChildren(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundAutoSizeChildren = true;
        this.obsrvAutoSizeChildren = source;
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
}
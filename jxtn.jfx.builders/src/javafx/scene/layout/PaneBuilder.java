// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.layout;

/**
 * {@link Pane}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link Pane})
 * @param <B> 建構器本身的型態(需繼承{@link PaneBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class PaneBuilder<Z extends Pane, B extends PaneBuilder<Z, B>>
        extends javafx.scene.layout.RegionBuilder<Z, B>
        implements PaneBuilderExt<Z, B>
{

    private boolean hasChildren;
    private java.util.Collection<javafx.scene.Node> valChildren;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasChildren)
            instance.getChildren().addAll(this.valChildren);
    }

    /**
     * 設定集合屬性{@link Pane#getChildren}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     * @deprecated 屬性值並非{@link javafx.collections.ObservableList}
     */
    @Deprecated
    @SuppressWarnings("unchecked")
    public final B children(java.util.Collection<javafx.scene.Node> value)
    {
        this.hasChildren = true;
        this.valChildren = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link Pane#getChildren}的內容。
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
     * 增加集合屬性{@link Pane#getChildren}的內容。
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
     * 增加集合屬性{@link Pane#getChildren}的內容。
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
     * 建構{@link Pane}物件。
     *
     * @return 新的{@link Pane}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Pane build()
    {
        Pane instance = new Pane();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link Pane}物件。
     *
     * @return 新的{@link Pane}物件實體
     */
    @SuppressWarnings("unchecked")
    public Pane build(javafx.scene.Node[] arg0)
    {
        Pane instance = new Pane(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

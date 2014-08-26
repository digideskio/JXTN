// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link Hyperlink}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class HyperlinkBuilder<Z extends Hyperlink, B extends HyperlinkBuilder<Z, B>>
        extends javafx.scene.control.ButtonBaseBuilder<Z, B>
{

    protected boolean hasVisited;
    protected boolean valVisited;

    protected boolean boundVisited;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvVisited;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasVisited)
            instance.setVisited(this.valVisited);
        if (this.boundVisited)
            instance.visitedProperty().bind(this.obsrvVisited);
    }

    /**
     * 設定屬性{@link Hyperlink#setVisited}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B visited(boolean value)
    {
        this.hasVisited = true;
        this.valVisited = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Hyperlink#visitedProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindVisited(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundVisited = true;
        this.obsrvVisited = source;
        return (B) this;
    }

    /**
     * 建構{@link Hyperlink}物件
     *
     * @return 新的{@link Hyperlink}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Hyperlink build()
    {
        Hyperlink instance = new Hyperlink();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.shape;

/**
 * {@link PathElement}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link PathElement})
 * @param <B> 建構器本身的型態(需繼承{@link PathElementMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class PathElementMaker<Z extends PathElement, B extends PathElementMaker<Z, B>>
        extends jxtn.jfx.makers.AbstractMaker<Z, B>
        implements PathElementMakerExt<Z, B>
{

    private boolean hasAbsolute;
    private boolean valAbsolute;

    private boolean bound1Absolute;
    private boolean bound2Absolute;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1Absolute;
    private javafx.beans.property.Property<Boolean> obsrv2Absolute;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasAbsolute)
            instance.setAbsolute(this.valAbsolute);
        if (this.bound1Absolute)
            instance.absoluteProperty().bind(this.obsrv1Absolute);
        if (this.bound2Absolute)
            instance.absoluteProperty().bindBidirectional(this.obsrv2Absolute);
    }

    /**
     * 設定屬性{@link PathElement#setAbsolute(boolean)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B absolute(boolean value)
    {
        this.hasAbsolute = true;
        this.valAbsolute = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link PathElement#absoluteProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindAbsolute(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Absolute = true;
        this.obsrv1Absolute = source;
        this.bound2Absolute = false;
        this.obsrv2Absolute = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link PathElement#absoluteProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalAbsolute(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Absolute = false;
        this.obsrv1Absolute = null;
        this.bound2Absolute = true;
        this.obsrv2Absolute = source;
        return (B) this;
    }
}
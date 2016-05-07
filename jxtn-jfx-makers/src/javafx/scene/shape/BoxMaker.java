// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.shape;

/**
 * {@link Box}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link Box})
 * @param <B> 建構器本身的型態(需繼承{@link BoxMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class BoxMaker<Z extends Box, B extends BoxMaker<Z, B>>
        extends javafx.scene.shape.Shape3DMaker<Z, B>
        implements BoxMakerExt<Z, B>
{

    private boolean hasDepth;
    private double valDepth;

    private boolean hasHeight;
    private double valHeight;

    private boolean hasWidth;
    private double valWidth;

    private boolean bound1Depth;
    private boolean bound2Depth;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Depth;
    private javafx.beans.property.Property<Number> obsrv2Depth;

    private boolean bound1Height;
    private boolean bound2Height;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Height;
    private javafx.beans.property.Property<Number> obsrv2Height;

    private boolean bound1Width;
    private boolean bound2Width;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Width;
    private javafx.beans.property.Property<Number> obsrv2Width;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasDepth)
            instance.setDepth(this.valDepth);
        if (this.hasHeight)
            instance.setHeight(this.valHeight);
        if (this.hasWidth)
            instance.setWidth(this.valWidth);
        if (this.bound1Depth)
            instance.depthProperty().bind(this.obsrv1Depth);
        if (this.bound2Depth)
            instance.depthProperty().bindBidirectional(this.obsrv2Depth);
        if (this.bound1Height)
            instance.heightProperty().bind(this.obsrv1Height);
        if (this.bound2Height)
            instance.heightProperty().bindBidirectional(this.obsrv2Height);
        if (this.bound1Width)
            instance.widthProperty().bind(this.obsrv1Width);
        if (this.bound2Width)
            instance.widthProperty().bindBidirectional(this.obsrv2Width);
    }

    /**
     * 設定屬性{@link Box#setDepth(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B depth(double value)
    {
        this.hasDepth = true;
        this.valDepth = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Box#setHeight(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B height(double value)
    {
        this.hasHeight = true;
        this.valHeight = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Box#setWidth(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B width(double value)
    {
        this.hasWidth = true;
        this.valWidth = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Box#depthProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindDepth(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Depth = true;
        this.obsrv1Depth = source;
        this.bound2Depth = false;
        this.obsrv2Depth = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Box#depthProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalDepth(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Depth = false;
        this.obsrv1Depth = null;
        this.bound2Depth = true;
        this.obsrv2Depth = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Box#heightProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindHeight(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Height = true;
        this.obsrv1Height = source;
        this.bound2Height = false;
        this.obsrv2Height = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Box#heightProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalHeight(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Height = false;
        this.obsrv1Height = null;
        this.bound2Height = true;
        this.obsrv2Height = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Box#widthProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindWidth(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Width = true;
        this.obsrv1Width = source;
        this.bound2Width = false;
        this.obsrv2Width = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Box#widthProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalWidth(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Width = false;
        this.obsrv1Width = null;
        this.bound2Width = true;
        this.obsrv2Width = source;
        return (B) this;
    }

    /**
     * 建構{@link Box}物件。
     *
     * @return 新的{@link Box}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Box build()
    {
        Box instance = new Box();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link Box}物件。
     *
     * @return 新的{@link Box}物件實體
     */
    @SuppressWarnings("unchecked")
    public Box build(double arg0, double arg1, double arg2)
    {
        Box instance = new Box(arg0, arg1, arg2);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
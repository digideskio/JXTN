// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.shape;

/**
 * {@link ArcTo}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link ArcTo})
 * @param <B> 建構器本身的型態(需繼承{@link ArcToMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ArcToMaker<Z extends ArcTo, B extends ArcToMaker<Z, B>>
        extends javafx.scene.shape.PathElementMaker<Z, B>
        implements ArcToMakerExt<Z, B>
{

    private boolean hasLargeArcFlag;
    private boolean valLargeArcFlag;

    private boolean hasRadiusX;
    private double valRadiusX;

    private boolean hasRadiusY;
    private double valRadiusY;

    private boolean hasSweepFlag;
    private boolean valSweepFlag;

    private boolean hasX;
    private double valX;

    private boolean hasXAxisRotation;
    private double valXAxisRotation;

    private boolean hasY;
    private double valY;

    private boolean bound1XAxisRotation;
    private boolean bound2XAxisRotation;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1XAxisRotation;
    private javafx.beans.property.Property<Number> obsrv2XAxisRotation;

    private boolean bound1LargeArcFlag;
    private boolean bound2LargeArcFlag;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1LargeArcFlag;
    private javafx.beans.property.Property<Boolean> obsrv2LargeArcFlag;

    private boolean bound1RadiusX;
    private boolean bound2RadiusX;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1RadiusX;
    private javafx.beans.property.Property<Number> obsrv2RadiusX;

    private boolean bound1RadiusY;
    private boolean bound2RadiusY;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1RadiusY;
    private javafx.beans.property.Property<Number> obsrv2RadiusY;

    private boolean bound1SweepFlag;
    private boolean bound2SweepFlag;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1SweepFlag;
    private javafx.beans.property.Property<Boolean> obsrv2SweepFlag;

    private boolean bound1X;
    private boolean bound2X;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1X;
    private javafx.beans.property.Property<Number> obsrv2X;

    private boolean bound1Y;
    private boolean bound2Y;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Y;
    private javafx.beans.property.Property<Number> obsrv2Y;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasLargeArcFlag)
            instance.setLargeArcFlag(this.valLargeArcFlag);
        if (this.hasRadiusX)
            instance.setRadiusX(this.valRadiusX);
        if (this.hasRadiusY)
            instance.setRadiusY(this.valRadiusY);
        if (this.hasSweepFlag)
            instance.setSweepFlag(this.valSweepFlag);
        if (this.hasX)
            instance.setX(this.valX);
        if (this.hasXAxisRotation)
            instance.setXAxisRotation(this.valXAxisRotation);
        if (this.hasY)
            instance.setY(this.valY);
        if (this.bound1XAxisRotation)
            instance.XAxisRotationProperty().bind(this.obsrv1XAxisRotation);
        if (this.bound2XAxisRotation)
            instance.XAxisRotationProperty().bindBidirectional(this.obsrv2XAxisRotation);
        if (this.bound1LargeArcFlag)
            instance.largeArcFlagProperty().bind(this.obsrv1LargeArcFlag);
        if (this.bound2LargeArcFlag)
            instance.largeArcFlagProperty().bindBidirectional(this.obsrv2LargeArcFlag);
        if (this.bound1RadiusX)
            instance.radiusXProperty().bind(this.obsrv1RadiusX);
        if (this.bound2RadiusX)
            instance.radiusXProperty().bindBidirectional(this.obsrv2RadiusX);
        if (this.bound1RadiusY)
            instance.radiusYProperty().bind(this.obsrv1RadiusY);
        if (this.bound2RadiusY)
            instance.radiusYProperty().bindBidirectional(this.obsrv2RadiusY);
        if (this.bound1SweepFlag)
            instance.sweepFlagProperty().bind(this.obsrv1SweepFlag);
        if (this.bound2SweepFlag)
            instance.sweepFlagProperty().bindBidirectional(this.obsrv2SweepFlag);
        if (this.bound1X)
            instance.xProperty().bind(this.obsrv1X);
        if (this.bound2X)
            instance.xProperty().bindBidirectional(this.obsrv2X);
        if (this.bound1Y)
            instance.yProperty().bind(this.obsrv1Y);
        if (this.bound2Y)
            instance.yProperty().bindBidirectional(this.obsrv2Y);
    }

    /**
     * 設定屬性{@link ArcTo#setLargeArcFlag(boolean)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B largeArcFlag(boolean value)
    {
        this.hasLargeArcFlag = true;
        this.valLargeArcFlag = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ArcTo#setRadiusX(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B radiusX(double value)
    {
        this.hasRadiusX = true;
        this.valRadiusX = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ArcTo#setRadiusY(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B radiusY(double value)
    {
        this.hasRadiusY = true;
        this.valRadiusY = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ArcTo#setSweepFlag(boolean)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B sweepFlag(boolean value)
    {
        this.hasSweepFlag = true;
        this.valSweepFlag = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ArcTo#setX(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B x(double value)
    {
        this.hasX = true;
        this.valX = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ArcTo#setXAxisRotation(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B xAxisRotation(double value)
    {
        this.hasXAxisRotation = true;
        this.valXAxisRotation = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ArcTo#setY(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B y(double value)
    {
        this.hasY = true;
        this.valY = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ArcTo#XAxisRotationProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindXAxisRotation(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1XAxisRotation = true;
        this.obsrv1XAxisRotation = source;
        this.bound2XAxisRotation = false;
        this.obsrv2XAxisRotation = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ArcTo#XAxisRotationProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalXAxisRotation(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1XAxisRotation = false;
        this.obsrv1XAxisRotation = null;
        this.bound2XAxisRotation = true;
        this.obsrv2XAxisRotation = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ArcTo#largeArcFlagProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindLargeArcFlag(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1LargeArcFlag = true;
        this.obsrv1LargeArcFlag = source;
        this.bound2LargeArcFlag = false;
        this.obsrv2LargeArcFlag = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ArcTo#largeArcFlagProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalLargeArcFlag(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1LargeArcFlag = false;
        this.obsrv1LargeArcFlag = null;
        this.bound2LargeArcFlag = true;
        this.obsrv2LargeArcFlag = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ArcTo#radiusXProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindRadiusX(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1RadiusX = true;
        this.obsrv1RadiusX = source;
        this.bound2RadiusX = false;
        this.obsrv2RadiusX = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ArcTo#radiusXProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalRadiusX(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1RadiusX = false;
        this.obsrv1RadiusX = null;
        this.bound2RadiusX = true;
        this.obsrv2RadiusX = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ArcTo#radiusYProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindRadiusY(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1RadiusY = true;
        this.obsrv1RadiusY = source;
        this.bound2RadiusY = false;
        this.obsrv2RadiusY = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ArcTo#radiusYProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalRadiusY(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1RadiusY = false;
        this.obsrv1RadiusY = null;
        this.bound2RadiusY = true;
        this.obsrv2RadiusY = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ArcTo#sweepFlagProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindSweepFlag(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1SweepFlag = true;
        this.obsrv1SweepFlag = source;
        this.bound2SweepFlag = false;
        this.obsrv2SweepFlag = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ArcTo#sweepFlagProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalSweepFlag(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1SweepFlag = false;
        this.obsrv1SweepFlag = null;
        this.bound2SweepFlag = true;
        this.obsrv2SweepFlag = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ArcTo#xProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindX(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1X = true;
        this.obsrv1X = source;
        this.bound2X = false;
        this.obsrv2X = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ArcTo#xProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalX(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1X = false;
        this.obsrv1X = null;
        this.bound2X = true;
        this.obsrv2X = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ArcTo#yProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindY(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Y = true;
        this.obsrv1Y = source;
        this.bound2Y = false;
        this.obsrv2Y = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ArcTo#yProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalY(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Y = false;
        this.obsrv1Y = null;
        this.bound2Y = true;
        this.obsrv2Y = source;
        return (B) this;
    }

    /**
     * 建構{@link ArcTo}物件。
     *
     * @return 新的{@link ArcTo}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public ArcTo build()
    {
        ArcTo instance = new ArcTo();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link ArcTo}物件。
     *
     * @return 新的{@link ArcTo}物件實體
     */
    @SuppressWarnings("unchecked")
    public ArcTo build(double arg0, double arg1, double arg2, double arg3, double arg4, boolean arg5, boolean arg6)
    {
        ArcTo instance = new ArcTo(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.shape;

/**
 * {@link CubicCurveTo}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link CubicCurveTo})
 * @param <B> 建構器本身的型態(需繼承{@link CubicCurveToBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class CubicCurveToBuilder<Z extends CubicCurveTo, B extends CubicCurveToBuilder<Z, B>>
        extends javafx.scene.shape.PathElementBuilder<Z, B>
        implements CubicCurveToBuilderExt<Z, B>
{

    private boolean hasControlX1;
    private double valControlX1;

    private boolean hasControlX2;
    private double valControlX2;

    private boolean hasControlY1;
    private double valControlY1;

    private boolean hasControlY2;
    private double valControlY2;

    private boolean hasX;
    private double valX;

    private boolean hasY;
    private double valY;

    private boolean bound1ControlX1;
    private boolean bound2ControlX1;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1ControlX1;
    private javafx.beans.property.Property<Number> obsrv2ControlX1;

    private boolean bound1ControlX2;
    private boolean bound2ControlX2;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1ControlX2;
    private javafx.beans.property.Property<Number> obsrv2ControlX2;

    private boolean bound1ControlY1;
    private boolean bound2ControlY1;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1ControlY1;
    private javafx.beans.property.Property<Number> obsrv2ControlY1;

    private boolean bound1ControlY2;
    private boolean bound2ControlY2;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1ControlY2;
    private javafx.beans.property.Property<Number> obsrv2ControlY2;

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
        if (this.hasControlX1)
            instance.setControlX1(this.valControlX1);
        if (this.hasControlX2)
            instance.setControlX2(this.valControlX2);
        if (this.hasControlY1)
            instance.setControlY1(this.valControlY1);
        if (this.hasControlY2)
            instance.setControlY2(this.valControlY2);
        if (this.hasX)
            instance.setX(this.valX);
        if (this.hasY)
            instance.setY(this.valY);
        if (this.bound1ControlX1)
            instance.controlX1Property().bind(this.obsrv1ControlX1);
        if (this.bound2ControlX1)
            instance.controlX1Property().bindBidirectional(this.obsrv2ControlX1);
        if (this.bound1ControlX2)
            instance.controlX2Property().bind(this.obsrv1ControlX2);
        if (this.bound2ControlX2)
            instance.controlX2Property().bindBidirectional(this.obsrv2ControlX2);
        if (this.bound1ControlY1)
            instance.controlY1Property().bind(this.obsrv1ControlY1);
        if (this.bound2ControlY1)
            instance.controlY1Property().bindBidirectional(this.obsrv2ControlY1);
        if (this.bound1ControlY2)
            instance.controlY2Property().bind(this.obsrv1ControlY2);
        if (this.bound2ControlY2)
            instance.controlY2Property().bindBidirectional(this.obsrv2ControlY2);
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
     * 設定屬性{@link CubicCurveTo#setControlX1(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B controlX1(double value)
    {
        this.hasControlX1 = true;
        this.valControlX1 = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link CubicCurveTo#setControlX2(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B controlX2(double value)
    {
        this.hasControlX2 = true;
        this.valControlX2 = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link CubicCurveTo#setControlY1(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B controlY1(double value)
    {
        this.hasControlY1 = true;
        this.valControlY1 = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link CubicCurveTo#setControlY2(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B controlY2(double value)
    {
        this.hasControlY2 = true;
        this.valControlY2 = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link CubicCurveTo#setX(double)}。
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
     * 設定屬性{@link CubicCurveTo#setY(double)}。
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
     * 設定屬性{@link CubicCurveTo#controlX1Property}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindControlX1(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ControlX1 = true;
        this.obsrv1ControlX1 = source;
        this.bound2ControlX1 = false;
        this.obsrv2ControlX1 = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link CubicCurveTo#controlX1Property}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalControlX1(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ControlX1 = false;
        this.obsrv1ControlX1 = null;
        this.bound2ControlX1 = true;
        this.obsrv2ControlX1 = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link CubicCurveTo#controlX2Property}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindControlX2(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ControlX2 = true;
        this.obsrv1ControlX2 = source;
        this.bound2ControlX2 = false;
        this.obsrv2ControlX2 = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link CubicCurveTo#controlX2Property}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalControlX2(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ControlX2 = false;
        this.obsrv1ControlX2 = null;
        this.bound2ControlX2 = true;
        this.obsrv2ControlX2 = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link CubicCurveTo#controlY1Property}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindControlY1(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ControlY1 = true;
        this.obsrv1ControlY1 = source;
        this.bound2ControlY1 = false;
        this.obsrv2ControlY1 = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link CubicCurveTo#controlY1Property}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalControlY1(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ControlY1 = false;
        this.obsrv1ControlY1 = null;
        this.bound2ControlY1 = true;
        this.obsrv2ControlY1 = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link CubicCurveTo#controlY2Property}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindControlY2(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ControlY2 = true;
        this.obsrv1ControlY2 = source;
        this.bound2ControlY2 = false;
        this.obsrv2ControlY2 = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link CubicCurveTo#controlY2Property}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalControlY2(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ControlY2 = false;
        this.obsrv1ControlY2 = null;
        this.bound2ControlY2 = true;
        this.obsrv2ControlY2 = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link CubicCurveTo#xProperty}的連結。
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
     * 設定屬性{@link CubicCurveTo#xProperty}的雙向連結。
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
     * 設定屬性{@link CubicCurveTo#yProperty}的連結。
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
     * 設定屬性{@link CubicCurveTo#yProperty}的雙向連結。
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
     * 建構{@link CubicCurveTo}物件。
     *
     * @return 新的{@link CubicCurveTo}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public CubicCurveTo build()
    {
        CubicCurveTo instance = new CubicCurveTo();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link CubicCurveTo}物件。
     *
     * @return 新的{@link CubicCurveTo}物件實體
     */
    @SuppressWarnings("unchecked")
    public CubicCurveTo build(double arg0, double arg1, double arg2, double arg3, double arg4, double arg5)
    {
        CubicCurveTo instance = new CubicCurveTo(arg0, arg1, arg2, arg3, arg4, arg5);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

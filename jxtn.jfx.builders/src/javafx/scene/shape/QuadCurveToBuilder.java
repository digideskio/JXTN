// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.shape;

/**
 * {@link QuadCurveTo}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link QuadCurveTo})
 * @param <B> 建構器本身的型態(需繼承{@link QuadCurveToBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class QuadCurveToBuilder<Z extends QuadCurveTo, B extends QuadCurveToBuilder<Z, B>>
        extends javafx.scene.shape.PathElementBuilder<Z, B>
        implements QuadCurveToBuilderExt<Z, B>
{

    private boolean hasControlX;
    private double valControlX;

    private boolean hasControlY;
    private double valControlY;

    private boolean hasX;
    private double valX;

    private boolean hasY;
    private double valY;

    private boolean bound1ControlX;
    private boolean bound2ControlX;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1ControlX;
    private javafx.beans.property.Property<Number> obsrv2ControlX;

    private boolean bound1ControlY;
    private boolean bound2ControlY;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1ControlY;
    private javafx.beans.property.Property<Number> obsrv2ControlY;

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
        if (this.hasControlX)
            instance.setControlX(this.valControlX);
        if (this.hasControlY)
            instance.setControlY(this.valControlY);
        if (this.hasX)
            instance.setX(this.valX);
        if (this.hasY)
            instance.setY(this.valY);
        if (this.bound1ControlX)
            instance.controlXProperty().bind(this.obsrv1ControlX);
        if (this.bound2ControlX)
            instance.controlXProperty().bindBidirectional(this.obsrv2ControlX);
        if (this.bound1ControlY)
            instance.controlYProperty().bind(this.obsrv1ControlY);
        if (this.bound2ControlY)
            instance.controlYProperty().bindBidirectional(this.obsrv2ControlY);
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
     * 設定屬性{@link QuadCurveTo#setControlX(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B controlX(double value)
    {
        this.hasControlX = true;
        this.valControlX = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link QuadCurveTo#setControlY(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B controlY(double value)
    {
        this.hasControlY = true;
        this.valControlY = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link QuadCurveTo#setX(double)}。
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
     * 設定屬性{@link QuadCurveTo#setY(double)}。
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
     * 設定屬性{@link QuadCurveTo#controlXProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindControlX(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ControlX = true;
        this.obsrv1ControlX = source;
        this.bound2ControlX = false;
        this.obsrv2ControlX = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link QuadCurveTo#controlXProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalControlX(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ControlX = false;
        this.obsrv1ControlX = null;
        this.bound2ControlX = true;
        this.obsrv2ControlX = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link QuadCurveTo#controlYProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindControlY(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ControlY = true;
        this.obsrv1ControlY = source;
        this.bound2ControlY = false;
        this.obsrv2ControlY = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link QuadCurveTo#controlYProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalControlY(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ControlY = false;
        this.obsrv1ControlY = null;
        this.bound2ControlY = true;
        this.obsrv2ControlY = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link QuadCurveTo#xProperty}的連結。
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
     * 設定屬性{@link QuadCurveTo#xProperty}的雙向連結。
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
     * 設定屬性{@link QuadCurveTo#yProperty}的連結。
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
     * 設定屬性{@link QuadCurveTo#yProperty}的雙向連結。
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
     * 建構{@link QuadCurveTo}物件。
     *
     * @return 新的{@link QuadCurveTo}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public QuadCurveTo build()
    {
        QuadCurveTo instance = new QuadCurveTo();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link QuadCurveTo}物件。
     *
     * @return 新的{@link QuadCurveTo}物件實體
     */
    @SuppressWarnings("unchecked")
    public QuadCurveTo build(double arg0, double arg1, double arg2, double arg3)
    {
        QuadCurveTo instance = new QuadCurveTo(arg0, arg1, arg2, arg3);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

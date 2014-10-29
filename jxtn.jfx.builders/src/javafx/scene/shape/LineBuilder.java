// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.shape;

/**
 * {@link Line}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link Line})
 * @param <B> 建構器本身的型態(需繼承{@link LineBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class LineBuilder<Z extends Line, B extends LineBuilder<Z, B>>
        extends javafx.scene.shape.ShapeBuilder<Z, B>
        implements LineBuilderExt<Z, B>
{

    private boolean hasEndX;
    private double valEndX;

    private boolean hasEndY;
    private double valEndY;

    private boolean hasStartX;
    private double valStartX;

    private boolean hasStartY;
    private double valStartY;

    private boolean bound1EndX;
    private boolean bound2EndX;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1EndX;
    private javafx.beans.property.Property<Number> obsrv2EndX;

    private boolean bound1EndY;
    private boolean bound2EndY;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1EndY;
    private javafx.beans.property.Property<Number> obsrv2EndY;

    private boolean bound1StartX;
    private boolean bound2StartX;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1StartX;
    private javafx.beans.property.Property<Number> obsrv2StartX;

    private boolean bound1StartY;
    private boolean bound2StartY;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1StartY;
    private javafx.beans.property.Property<Number> obsrv2StartY;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasEndX)
            instance.setEndX(this.valEndX);
        if (this.hasEndY)
            instance.setEndY(this.valEndY);
        if (this.hasStartX)
            instance.setStartX(this.valStartX);
        if (this.hasStartY)
            instance.setStartY(this.valStartY);
        if (this.bound1EndX)
            instance.endXProperty().bind(this.obsrv1EndX);
        if (this.bound2EndX)
            instance.endXProperty().bindBidirectional(this.obsrv2EndX);
        if (this.bound1EndY)
            instance.endYProperty().bind(this.obsrv1EndY);
        if (this.bound2EndY)
            instance.endYProperty().bindBidirectional(this.obsrv2EndY);
        if (this.bound1StartX)
            instance.startXProperty().bind(this.obsrv1StartX);
        if (this.bound2StartX)
            instance.startXProperty().bindBidirectional(this.obsrv2StartX);
        if (this.bound1StartY)
            instance.startYProperty().bind(this.obsrv1StartY);
        if (this.bound2StartY)
            instance.startYProperty().bindBidirectional(this.obsrv2StartY);
    }

    /**
     * 設定屬性{@link Line#setEndX(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B endX(double value)
    {
        this.hasEndX = true;
        this.valEndX = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Line#setEndY(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B endY(double value)
    {
        this.hasEndY = true;
        this.valEndY = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Line#setStartX(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B startX(double value)
    {
        this.hasStartX = true;
        this.valStartX = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Line#setStartY(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B startY(double value)
    {
        this.hasStartY = true;
        this.valStartY = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Line#endXProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindEndX(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1EndX = true;
        this.obsrv1EndX = source;
        this.bound2EndX = false;
        this.obsrv2EndX = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Line#endXProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalEndX(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1EndX = false;
        this.obsrv1EndX = null;
        this.bound2EndX = true;
        this.obsrv2EndX = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Line#endYProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindEndY(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1EndY = true;
        this.obsrv1EndY = source;
        this.bound2EndY = false;
        this.obsrv2EndY = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Line#endYProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalEndY(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1EndY = false;
        this.obsrv1EndY = null;
        this.bound2EndY = true;
        this.obsrv2EndY = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Line#startXProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindStartX(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1StartX = true;
        this.obsrv1StartX = source;
        this.bound2StartX = false;
        this.obsrv2StartX = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Line#startXProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalStartX(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1StartX = false;
        this.obsrv1StartX = null;
        this.bound2StartX = true;
        this.obsrv2StartX = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Line#startYProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindStartY(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1StartY = true;
        this.obsrv1StartY = source;
        this.bound2StartY = false;
        this.obsrv2StartY = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Line#startYProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalStartY(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1StartY = false;
        this.obsrv1StartY = null;
        this.bound2StartY = true;
        this.obsrv2StartY = source;
        return (B) this;
    }

    /**
     * 建構{@link Line}物件。
     *
     * @return 新的{@link Line}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Line build()
    {
        Line instance = new Line();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link Line}物件。
     *
     * @return 新的{@link Line}物件實體
     */
    @SuppressWarnings("unchecked")
    public Line build(double arg0, double arg1, double arg2, double arg3)
    {
        Line instance = new Line(arg0, arg1, arg2, arg3);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

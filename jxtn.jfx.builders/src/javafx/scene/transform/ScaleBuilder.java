// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.transform;

/**
 * {@link Scale}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link Scale})
 * @param <B> 建構器本身的型態(需繼承{@link ScaleBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ScaleBuilder<Z extends Scale, B extends ScaleBuilder<Z, B>>
        extends javafx.scene.transform.TransformBuilder<Z, B>
        implements ScaleBuilderExt<Z, B>
{

    private boolean hasPivotX;
    private double valPivotX;

    private boolean hasPivotY;
    private double valPivotY;

    private boolean hasPivotZ;
    private double valPivotZ;

    private boolean hasX;
    private double valX;

    private boolean hasY;
    private double valY;

    private boolean hasZ;
    private double valZ;

    private boolean bound1PivotX;
    private boolean bound2PivotX;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1PivotX;
    private javafx.beans.property.Property<Number> obsrv2PivotX;

    private boolean bound1PivotY;
    private boolean bound2PivotY;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1PivotY;
    private javafx.beans.property.Property<Number> obsrv2PivotY;

    private boolean bound1PivotZ;
    private boolean bound2PivotZ;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1PivotZ;
    private javafx.beans.property.Property<Number> obsrv2PivotZ;

    private boolean bound1X;
    private boolean bound2X;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1X;
    private javafx.beans.property.Property<Number> obsrv2X;

    private boolean bound1Y;
    private boolean bound2Y;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Y;
    private javafx.beans.property.Property<Number> obsrv2Y;

    private boolean bound1Z;
    private boolean bound2Z;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Z;
    private javafx.beans.property.Property<Number> obsrv2Z;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasPivotX)
            instance.setPivotX(this.valPivotX);
        if (this.hasPivotY)
            instance.setPivotY(this.valPivotY);
        if (this.hasPivotZ)
            instance.setPivotZ(this.valPivotZ);
        if (this.hasX)
            instance.setX(this.valX);
        if (this.hasY)
            instance.setY(this.valY);
        if (this.hasZ)
            instance.setZ(this.valZ);
        if (this.bound1PivotX)
            instance.pivotXProperty().bind(this.obsrv1PivotX);
        if (this.bound2PivotX)
            instance.pivotXProperty().bindBidirectional(this.obsrv2PivotX);
        if (this.bound1PivotY)
            instance.pivotYProperty().bind(this.obsrv1PivotY);
        if (this.bound2PivotY)
            instance.pivotYProperty().bindBidirectional(this.obsrv2PivotY);
        if (this.bound1PivotZ)
            instance.pivotZProperty().bind(this.obsrv1PivotZ);
        if (this.bound2PivotZ)
            instance.pivotZProperty().bindBidirectional(this.obsrv2PivotZ);
        if (this.bound1X)
            instance.xProperty().bind(this.obsrv1X);
        if (this.bound2X)
            instance.xProperty().bindBidirectional(this.obsrv2X);
        if (this.bound1Y)
            instance.yProperty().bind(this.obsrv1Y);
        if (this.bound2Y)
            instance.yProperty().bindBidirectional(this.obsrv2Y);
        if (this.bound1Z)
            instance.zProperty().bind(this.obsrv1Z);
        if (this.bound2Z)
            instance.zProperty().bindBidirectional(this.obsrv2Z);
    }

    /**
     * 設定屬性{@link Scale#setPivotX(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B pivotX(double value)
    {
        this.hasPivotX = true;
        this.valPivotX = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Scale#setPivotY(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B pivotY(double value)
    {
        this.hasPivotY = true;
        this.valPivotY = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Scale#setPivotZ(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B pivotZ(double value)
    {
        this.hasPivotZ = true;
        this.valPivotZ = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Scale#setX(double)}
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
     * 設定屬性{@link Scale#setY(double)}
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
     * 設定屬性{@link Scale#setZ(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B z(double value)
    {
        this.hasZ = true;
        this.valZ = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Scale#pivotXProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindPivotX(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1PivotX = true;
        this.obsrv1PivotX = source;
        this.bound2PivotX = false;
        this.obsrv2PivotX = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Scale#pivotXProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalPivotX(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1PivotX = false;
        this.obsrv1PivotX = null;
        this.bound2PivotX = true;
        this.obsrv2PivotX = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Scale#pivotYProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindPivotY(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1PivotY = true;
        this.obsrv1PivotY = source;
        this.bound2PivotY = false;
        this.obsrv2PivotY = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Scale#pivotYProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalPivotY(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1PivotY = false;
        this.obsrv1PivotY = null;
        this.bound2PivotY = true;
        this.obsrv2PivotY = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Scale#pivotZProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindPivotZ(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1PivotZ = true;
        this.obsrv1PivotZ = source;
        this.bound2PivotZ = false;
        this.obsrv2PivotZ = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Scale#pivotZProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalPivotZ(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1PivotZ = false;
        this.obsrv1PivotZ = null;
        this.bound2PivotZ = true;
        this.obsrv2PivotZ = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Scale#xProperty}的連結
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
     * 設定屬性{@link Scale#xProperty}的雙向連結
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
     * 設定屬性{@link Scale#yProperty}的連結
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
     * 設定屬性{@link Scale#yProperty}的雙向連結
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
     * 設定屬性{@link Scale#zProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindZ(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Z = true;
        this.obsrv1Z = source;
        this.bound2Z = false;
        this.obsrv2Z = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Scale#zProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalZ(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Z = false;
        this.obsrv1Z = null;
        this.bound2Z = true;
        this.obsrv2Z = source;
        return (B) this;
    }

    /**
     * 建構{@link Scale}物件
     *
     * @return 新的{@link Scale}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Scale build()
    {
        Scale instance = new Scale();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link Scale}物件
     *
     * @return 新的{@link Scale}物件實體
     */
    @SuppressWarnings("unchecked")
    public Scale build(double arg0, double arg1)
    {
        Scale instance = new Scale(arg0, arg1);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link Scale}物件
     *
     * @return 新的{@link Scale}物件實體
     */
    @SuppressWarnings("unchecked")
    public Scale build(double arg0, double arg1, double arg2)
    {
        Scale instance = new Scale(arg0, arg1, arg2);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link Scale}物件
     *
     * @return 新的{@link Scale}物件實體
     */
    @SuppressWarnings("unchecked")
    public Scale build(double arg0, double arg1, double arg2, double arg3)
    {
        Scale instance = new Scale(arg0, arg1, arg2, arg3);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link Scale}物件
     *
     * @return 新的{@link Scale}物件實體
     */
    @SuppressWarnings("unchecked")
    public Scale build(double arg0, double arg1, double arg2, double arg3, double arg4, double arg5)
    {
        Scale instance = new Scale(arg0, arg1, arg2, arg3, arg4, arg5);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

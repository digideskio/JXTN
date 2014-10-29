// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.transform;

/**
 * {@link Shear}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link Shear})
 * @param <B> 建構器本身的型態(需繼承{@link ShearBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ShearBuilder<Z extends Shear, B extends ShearBuilder<Z, B>>
        extends javafx.scene.transform.TransformBuilder<Z, B>
        implements ShearBuilderExt<Z, B>
{

    private boolean hasPivotX;
    private double valPivotX;

    private boolean hasPivotY;
    private double valPivotY;

    private boolean hasX;
    private double valX;

    private boolean hasY;
    private double valY;

    private boolean bound1PivotX;
    private boolean bound2PivotX;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1PivotX;
    private javafx.beans.property.Property<Number> obsrv2PivotX;

    private boolean bound1PivotY;
    private boolean bound2PivotY;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1PivotY;
    private javafx.beans.property.Property<Number> obsrv2PivotY;

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
        if (this.hasPivotX)
            instance.setPivotX(this.valPivotX);
        if (this.hasPivotY)
            instance.setPivotY(this.valPivotY);
        if (this.hasX)
            instance.setX(this.valX);
        if (this.hasY)
            instance.setY(this.valY);
        if (this.bound1PivotX)
            instance.pivotXProperty().bind(this.obsrv1PivotX);
        if (this.bound2PivotX)
            instance.pivotXProperty().bindBidirectional(this.obsrv2PivotX);
        if (this.bound1PivotY)
            instance.pivotYProperty().bind(this.obsrv1PivotY);
        if (this.bound2PivotY)
            instance.pivotYProperty().bindBidirectional(this.obsrv2PivotY);
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
     * 設定屬性{@link Shear#setPivotX(double)}。
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
     * 設定屬性{@link Shear#setPivotY(double)}。
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
     * 設定屬性{@link Shear#setX(double)}。
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
     * 設定屬性{@link Shear#setY(double)}。
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
     * 設定屬性{@link Shear#pivotXProperty}的連結。
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
     * 設定屬性{@link Shear#pivotXProperty}的雙向連結。
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
     * 設定屬性{@link Shear#pivotYProperty}的連結。
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
     * 設定屬性{@link Shear#pivotYProperty}的雙向連結。
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
     * 設定屬性{@link Shear#xProperty}的連結。
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
     * 設定屬性{@link Shear#xProperty}的雙向連結。
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
     * 設定屬性{@link Shear#yProperty}的連結。
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
     * 設定屬性{@link Shear#yProperty}的雙向連結。
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
     * 建構{@link Shear}物件。
     *
     * @return 新的{@link Shear}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Shear build()
    {
        Shear instance = new Shear();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link Shear}物件。
     *
     * @return 新的{@link Shear}物件實體
     */
    @SuppressWarnings("unchecked")
    public Shear build(double arg0, double arg1)
    {
        Shear instance = new Shear(arg0, arg1);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link Shear}物件。
     *
     * @return 新的{@link Shear}物件實體
     */
    @SuppressWarnings("unchecked")
    public Shear build(double arg0, double arg1, double arg2, double arg3)
    {
        Shear instance = new Shear(arg0, arg1, arg2, arg3);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

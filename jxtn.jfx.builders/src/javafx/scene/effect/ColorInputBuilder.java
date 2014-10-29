// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.effect;

/**
 * {@link ColorInput}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link ColorInput})
 * @param <B> 建構器本身的型態(需繼承{@link ColorInputBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ColorInputBuilder<Z extends ColorInput, B extends ColorInputBuilder<Z, B>>
        extends javafx.scene.effect.EffectBuilder<Z, B>
        implements ColorInputBuilderExt<Z, B>
{

    private boolean hasHeight;
    private double valHeight;

    private boolean hasPaint;
    private javafx.scene.paint.Paint valPaint;

    private boolean hasWidth;
    private double valWidth;

    private boolean hasX;
    private double valX;

    private boolean hasY;
    private double valY;

    private boolean bound1Height;
    private boolean bound2Height;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Height;
    private javafx.beans.property.Property<Number> obsrv2Height;

    private boolean bound1Paint;
    private boolean bound2Paint;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.paint.Paint> obsrv1Paint;
    private javafx.beans.property.Property<javafx.scene.paint.Paint> obsrv2Paint;

    private boolean bound1Width;
    private boolean bound2Width;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Width;
    private javafx.beans.property.Property<Number> obsrv2Width;

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
        if (this.hasHeight)
            instance.setHeight(this.valHeight);
        if (this.hasPaint)
            instance.setPaint(this.valPaint);
        if (this.hasWidth)
            instance.setWidth(this.valWidth);
        if (this.hasX)
            instance.setX(this.valX);
        if (this.hasY)
            instance.setY(this.valY);
        if (this.bound1Height)
            instance.heightProperty().bind(this.obsrv1Height);
        if (this.bound2Height)
            instance.heightProperty().bindBidirectional(this.obsrv2Height);
        if (this.bound1Paint)
            instance.paintProperty().bind(this.obsrv1Paint);
        if (this.bound2Paint)
            instance.paintProperty().bindBidirectional(this.obsrv2Paint);
        if (this.bound1Width)
            instance.widthProperty().bind(this.obsrv1Width);
        if (this.bound2Width)
            instance.widthProperty().bindBidirectional(this.obsrv2Width);
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
     * 設定屬性{@link ColorInput#setHeight(double)}。
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
     * 設定屬性{@link ColorInput#setPaint(javafx.scene.paint.Paint)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B paint(javafx.scene.paint.Paint value)
    {
        this.hasPaint = true;
        this.valPaint = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ColorInput#setWidth(double)}。
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
     * 設定屬性{@link ColorInput#setX(double)}。
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
     * 設定屬性{@link ColorInput#setY(double)}。
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
     * 設定屬性{@link ColorInput#heightProperty}的連結。
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
     * 設定屬性{@link ColorInput#heightProperty}的雙向連結。
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
     * 設定屬性{@link ColorInput#paintProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindPaint(javafx.beans.value.ObservableValue<? extends javafx.scene.paint.Paint> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Paint = true;
        this.obsrv1Paint = source;
        this.bound2Paint = false;
        this.obsrv2Paint = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ColorInput#paintProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalPaint(javafx.beans.property.Property<javafx.scene.paint.Paint> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Paint = false;
        this.obsrv1Paint = null;
        this.bound2Paint = true;
        this.obsrv2Paint = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ColorInput#widthProperty}的連結。
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
     * 設定屬性{@link ColorInput#widthProperty}的雙向連結。
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
     * 設定屬性{@link ColorInput#xProperty}的連結。
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
     * 設定屬性{@link ColorInput#xProperty}的雙向連結。
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
     * 設定屬性{@link ColorInput#yProperty}的連結。
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
     * 設定屬性{@link ColorInput#yProperty}的雙向連結。
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
     * 建構{@link ColorInput}物件。
     *
     * @return 新的{@link ColorInput}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public ColorInput build()
    {
        ColorInput instance = new ColorInput();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link ColorInput}物件。
     *
     * @return 新的{@link ColorInput}物件實體
     */
    @SuppressWarnings("unchecked")
    public ColorInput build(double arg0, double arg1, double arg2, double arg3, javafx.scene.paint.Paint arg4)
    {
        ColorInput instance = new ColorInput(arg0, arg1, arg2, arg3, arg4);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

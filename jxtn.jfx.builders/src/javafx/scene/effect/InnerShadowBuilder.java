// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.effect;

/**
 * {@link InnerShadow}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link InnerShadow})
 * @param <B> 建構器本身的型態(需繼承{@link InnerShadowBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class InnerShadowBuilder<Z extends InnerShadow, B extends InnerShadowBuilder<Z, B>>
        extends javafx.scene.effect.EffectBuilder<Z, B>
        implements InnerShadowBuilderExt<Z, B>
{

    private boolean hasBlurType;
    private javafx.scene.effect.BlurType valBlurType;

    private boolean hasChoke;
    private double valChoke;

    private boolean hasColor;
    private javafx.scene.paint.Color valColor;

    private boolean hasHeight;
    private double valHeight;

    private boolean hasInput;
    private javafx.scene.effect.Effect valInput;

    private boolean hasOffsetX;
    private double valOffsetX;

    private boolean hasOffsetY;
    private double valOffsetY;

    private boolean hasRadius;
    private double valRadius;

    private boolean hasWidth;
    private double valWidth;

    private boolean bound1BlurType;
    private boolean bound2BlurType;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.effect.BlurType> obsrv1BlurType;
    private javafx.beans.property.Property<javafx.scene.effect.BlurType> obsrv2BlurType;

    private boolean bound1Choke;
    private boolean bound2Choke;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Choke;
    private javafx.beans.property.Property<Number> obsrv2Choke;

    private boolean bound1Color;
    private boolean bound2Color;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.paint.Color> obsrv1Color;
    private javafx.beans.property.Property<javafx.scene.paint.Color> obsrv2Color;

    private boolean bound1Height;
    private boolean bound2Height;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Height;
    private javafx.beans.property.Property<Number> obsrv2Height;

    private boolean bound1Input;
    private boolean bound2Input;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.effect.Effect> obsrv1Input;
    private javafx.beans.property.Property<javafx.scene.effect.Effect> obsrv2Input;

    private boolean bound1OffsetX;
    private boolean bound2OffsetX;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1OffsetX;
    private javafx.beans.property.Property<Number> obsrv2OffsetX;

    private boolean bound1OffsetY;
    private boolean bound2OffsetY;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1OffsetY;
    private javafx.beans.property.Property<Number> obsrv2OffsetY;

    private boolean bound1Radius;
    private boolean bound2Radius;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Radius;
    private javafx.beans.property.Property<Number> obsrv2Radius;

    private boolean bound1Width;
    private boolean bound2Width;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Width;
    private javafx.beans.property.Property<Number> obsrv2Width;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasBlurType)
            instance.setBlurType(this.valBlurType);
        if (this.hasChoke)
            instance.setChoke(this.valChoke);
        if (this.hasColor)
            instance.setColor(this.valColor);
        if (this.hasHeight)
            instance.setHeight(this.valHeight);
        if (this.hasInput)
            instance.setInput(this.valInput);
        if (this.hasOffsetX)
            instance.setOffsetX(this.valOffsetX);
        if (this.hasOffsetY)
            instance.setOffsetY(this.valOffsetY);
        if (this.hasRadius)
            instance.setRadius(this.valRadius);
        if (this.hasWidth)
            instance.setWidth(this.valWidth);
        if (this.bound1BlurType)
            instance.blurTypeProperty().bind(this.obsrv1BlurType);
        if (this.bound2BlurType)
            instance.blurTypeProperty().bindBidirectional(this.obsrv2BlurType);
        if (this.bound1Choke)
            instance.chokeProperty().bind(this.obsrv1Choke);
        if (this.bound2Choke)
            instance.chokeProperty().bindBidirectional(this.obsrv2Choke);
        if (this.bound1Color)
            instance.colorProperty().bind(this.obsrv1Color);
        if (this.bound2Color)
            instance.colorProperty().bindBidirectional(this.obsrv2Color);
        if (this.bound1Height)
            instance.heightProperty().bind(this.obsrv1Height);
        if (this.bound2Height)
            instance.heightProperty().bindBidirectional(this.obsrv2Height);
        if (this.bound1Input)
            instance.inputProperty().bind(this.obsrv1Input);
        if (this.bound2Input)
            instance.inputProperty().bindBidirectional(this.obsrv2Input);
        if (this.bound1OffsetX)
            instance.offsetXProperty().bind(this.obsrv1OffsetX);
        if (this.bound2OffsetX)
            instance.offsetXProperty().bindBidirectional(this.obsrv2OffsetX);
        if (this.bound1OffsetY)
            instance.offsetYProperty().bind(this.obsrv1OffsetY);
        if (this.bound2OffsetY)
            instance.offsetYProperty().bindBidirectional(this.obsrv2OffsetY);
        if (this.bound1Radius)
            instance.radiusProperty().bind(this.obsrv1Radius);
        if (this.bound2Radius)
            instance.radiusProperty().bindBidirectional(this.obsrv2Radius);
        if (this.bound1Width)
            instance.widthProperty().bind(this.obsrv1Width);
        if (this.bound2Width)
            instance.widthProperty().bindBidirectional(this.obsrv2Width);
    }

    /**
     * 設定屬性{@link InnerShadow#setBlurType(javafx.scene.effect.BlurType)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B blurType(javafx.scene.effect.BlurType value)
    {
        this.hasBlurType = true;
        this.valBlurType = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link InnerShadow#setChoke(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B choke(double value)
    {
        this.hasChoke = true;
        this.valChoke = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link InnerShadow#setColor(javafx.scene.paint.Color)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B color(javafx.scene.paint.Color value)
    {
        this.hasColor = true;
        this.valColor = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link InnerShadow#setHeight(double)}
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
     * 設定屬性{@link InnerShadow#setInput(javafx.scene.effect.Effect)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B input(javafx.scene.effect.Effect value)
    {
        this.hasInput = true;
        this.valInput = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link InnerShadow#setOffsetX(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B offsetX(double value)
    {
        this.hasOffsetX = true;
        this.valOffsetX = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link InnerShadow#setOffsetY(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B offsetY(double value)
    {
        this.hasOffsetY = true;
        this.valOffsetY = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link InnerShadow#setRadius(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B radius(double value)
    {
        this.hasRadius = true;
        this.valRadius = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link InnerShadow#setWidth(double)}
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
     * 設定屬性{@link InnerShadow#blurTypeProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBlurType(javafx.beans.value.ObservableValue<? extends javafx.scene.effect.BlurType> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1BlurType = true;
        this.obsrv1BlurType = source;
        this.bound2BlurType = false;
        this.obsrv2BlurType = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link InnerShadow#blurTypeProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalBlurType(javafx.beans.property.Property<javafx.scene.effect.BlurType> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1BlurType = false;
        this.obsrv1BlurType = null;
        this.bound2BlurType = true;
        this.obsrv2BlurType = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link InnerShadow#chokeProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindChoke(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Choke = true;
        this.obsrv1Choke = source;
        this.bound2Choke = false;
        this.obsrv2Choke = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link InnerShadow#chokeProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalChoke(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Choke = false;
        this.obsrv1Choke = null;
        this.bound2Choke = true;
        this.obsrv2Choke = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link InnerShadow#colorProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindColor(javafx.beans.value.ObservableValue<? extends javafx.scene.paint.Color> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Color = true;
        this.obsrv1Color = source;
        this.bound2Color = false;
        this.obsrv2Color = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link InnerShadow#colorProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalColor(javafx.beans.property.Property<javafx.scene.paint.Color> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Color = false;
        this.obsrv1Color = null;
        this.bound2Color = true;
        this.obsrv2Color = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link InnerShadow#heightProperty}的連結
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
     * 設定屬性{@link InnerShadow#heightProperty}的雙向連結
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
     * 設定屬性{@link InnerShadow#inputProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindInput(javafx.beans.value.ObservableValue<? extends javafx.scene.effect.Effect> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Input = true;
        this.obsrv1Input = source;
        this.bound2Input = false;
        this.obsrv2Input = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link InnerShadow#inputProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalInput(javafx.beans.property.Property<javafx.scene.effect.Effect> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Input = false;
        this.obsrv1Input = null;
        this.bound2Input = true;
        this.obsrv2Input = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link InnerShadow#offsetXProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOffsetX(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OffsetX = true;
        this.obsrv1OffsetX = source;
        this.bound2OffsetX = false;
        this.obsrv2OffsetX = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link InnerShadow#offsetXProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalOffsetX(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OffsetX = false;
        this.obsrv1OffsetX = null;
        this.bound2OffsetX = true;
        this.obsrv2OffsetX = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link InnerShadow#offsetYProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOffsetY(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OffsetY = true;
        this.obsrv1OffsetY = source;
        this.bound2OffsetY = false;
        this.obsrv2OffsetY = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link InnerShadow#offsetYProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalOffsetY(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OffsetY = false;
        this.obsrv1OffsetY = null;
        this.bound2OffsetY = true;
        this.obsrv2OffsetY = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link InnerShadow#radiusProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindRadius(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Radius = true;
        this.obsrv1Radius = source;
        this.bound2Radius = false;
        this.obsrv2Radius = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link InnerShadow#radiusProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalRadius(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Radius = false;
        this.obsrv1Radius = null;
        this.bound2Radius = true;
        this.obsrv2Radius = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link InnerShadow#widthProperty}的連結
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
     * 設定屬性{@link InnerShadow#widthProperty}的雙向連結
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
     * 建構{@link InnerShadow}物件
     *
     * @return 新的{@link InnerShadow}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public InnerShadow build()
    {
        InnerShadow instance = new InnerShadow();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

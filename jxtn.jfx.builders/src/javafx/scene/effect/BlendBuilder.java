// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.effect;

/**
 * {@link Blend}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link Blend})
 * @param <B> 建構器本身的型態(需繼承{@link BlendBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class BlendBuilder<Z extends Blend, B extends BlendBuilder<Z, B>>
        extends javafx.scene.effect.EffectBuilder<Z, B>
        implements BlendBuilderExt<Z, B>
{

    private boolean hasBottomInput;
    private javafx.scene.effect.Effect valBottomInput;

    private boolean hasMode;
    private javafx.scene.effect.BlendMode valMode;

    private boolean hasOpacity;
    private double valOpacity;

    private boolean hasTopInput;
    private javafx.scene.effect.Effect valTopInput;

    private boolean bound1BottomInput;
    private boolean bound2BottomInput;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.effect.Effect> obsrv1BottomInput;
    private javafx.beans.property.Property<javafx.scene.effect.Effect> obsrv2BottomInput;

    private boolean bound1Mode;
    private boolean bound2Mode;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.effect.BlendMode> obsrv1Mode;
    private javafx.beans.property.Property<javafx.scene.effect.BlendMode> obsrv2Mode;

    private boolean bound1Opacity;
    private boolean bound2Opacity;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Opacity;
    private javafx.beans.property.Property<Number> obsrv2Opacity;

    private boolean bound1TopInput;
    private boolean bound2TopInput;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.effect.Effect> obsrv1TopInput;
    private javafx.beans.property.Property<javafx.scene.effect.Effect> obsrv2TopInput;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasBottomInput)
            instance.setBottomInput(this.valBottomInput);
        if (this.hasMode)
            instance.setMode(this.valMode);
        if (this.hasOpacity)
            instance.setOpacity(this.valOpacity);
        if (this.hasTopInput)
            instance.setTopInput(this.valTopInput);
        if (this.bound1BottomInput)
            instance.bottomInputProperty().bind(this.obsrv1BottomInput);
        if (this.bound2BottomInput)
            instance.bottomInputProperty().bindBidirectional(this.obsrv2BottomInput);
        if (this.bound1Mode)
            instance.modeProperty().bind(this.obsrv1Mode);
        if (this.bound2Mode)
            instance.modeProperty().bindBidirectional(this.obsrv2Mode);
        if (this.bound1Opacity)
            instance.opacityProperty().bind(this.obsrv1Opacity);
        if (this.bound2Opacity)
            instance.opacityProperty().bindBidirectional(this.obsrv2Opacity);
        if (this.bound1TopInput)
            instance.topInputProperty().bind(this.obsrv1TopInput);
        if (this.bound2TopInput)
            instance.topInputProperty().bindBidirectional(this.obsrv2TopInput);
    }

    /**
     * 設定屬性{@link Blend#setBottomInput(javafx.scene.effect.Effect)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bottomInput(javafx.scene.effect.Effect value)
    {
        this.hasBottomInput = true;
        this.valBottomInput = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Blend#setMode(javafx.scene.effect.BlendMode)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B mode(javafx.scene.effect.BlendMode value)
    {
        this.hasMode = true;
        this.valMode = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Blend#setOpacity(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B opacity(double value)
    {
        this.hasOpacity = true;
        this.valOpacity = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Blend#setTopInput(javafx.scene.effect.Effect)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B topInput(javafx.scene.effect.Effect value)
    {
        this.hasTopInput = true;
        this.valTopInput = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Blend#bottomInputProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBottomInput(javafx.beans.value.ObservableValue<? extends javafx.scene.effect.Effect> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1BottomInput = true;
        this.obsrv1BottomInput = source;
        this.bound2BottomInput = false;
        this.obsrv2BottomInput = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Blend#bottomInputProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalBottomInput(javafx.beans.property.Property<javafx.scene.effect.Effect> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1BottomInput = false;
        this.obsrv1BottomInput = null;
        this.bound2BottomInput = true;
        this.obsrv2BottomInput = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Blend#modeProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindMode(javafx.beans.value.ObservableValue<? extends javafx.scene.effect.BlendMode> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Mode = true;
        this.obsrv1Mode = source;
        this.bound2Mode = false;
        this.obsrv2Mode = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Blend#modeProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalMode(javafx.beans.property.Property<javafx.scene.effect.BlendMode> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Mode = false;
        this.obsrv1Mode = null;
        this.bound2Mode = true;
        this.obsrv2Mode = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Blend#opacityProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOpacity(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Opacity = true;
        this.obsrv1Opacity = source;
        this.bound2Opacity = false;
        this.obsrv2Opacity = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Blend#opacityProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalOpacity(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Opacity = false;
        this.obsrv1Opacity = null;
        this.bound2Opacity = true;
        this.obsrv2Opacity = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Blend#topInputProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindTopInput(javafx.beans.value.ObservableValue<? extends javafx.scene.effect.Effect> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1TopInput = true;
        this.obsrv1TopInput = source;
        this.bound2TopInput = false;
        this.obsrv2TopInput = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Blend#topInputProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalTopInput(javafx.beans.property.Property<javafx.scene.effect.Effect> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1TopInput = false;
        this.obsrv1TopInput = null;
        this.bound2TopInput = true;
        this.obsrv2TopInput = source;
        return (B) this;
    }

    /**
     * 建構{@link Blend}物件。
     *
     * @return 新的{@link Blend}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Blend build()
    {
        Blend instance = new Blend();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link Blend}物件。
     *
     * @return 新的{@link Blend}物件實體
     */
    @SuppressWarnings("unchecked")
    public Blend build(javafx.scene.effect.BlendMode arg0)
    {
        Blend instance = new Blend(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link Blend}物件。
     *
     * @return 新的{@link Blend}物件實體
     */
    @SuppressWarnings("unchecked")
    public Blend build(javafx.scene.effect.BlendMode arg0, javafx.scene.effect.Effect arg1, javafx.scene.effect.Effect arg2)
    {
        Blend instance = new Blend(arg0, arg1, arg2);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

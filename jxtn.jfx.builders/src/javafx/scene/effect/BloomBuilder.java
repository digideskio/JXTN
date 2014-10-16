// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.effect;

/**
 * {@link Bloom}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link Bloom})
 * @param <B> 建構器本身的型態(需繼承{@link BloomBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class BloomBuilder<Z extends Bloom, B extends BloomBuilder<Z, B>>
        extends javafx.scene.effect.EffectBuilder<Z, B>
        implements BloomBuilderExt<Z, B>
{

    private boolean hasInput;
    private javafx.scene.effect.Effect valInput;

    private boolean hasThreshold;
    private double valThreshold;

    private boolean bound1Input;
    private boolean bound2Input;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.effect.Effect> obsrv1Input;
    private javafx.beans.property.Property<javafx.scene.effect.Effect> obsrv2Input;

    private boolean bound1Threshold;
    private boolean bound2Threshold;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Threshold;
    private javafx.beans.property.Property<Number> obsrv2Threshold;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasInput)
            instance.setInput(this.valInput);
        if (this.hasThreshold)
            instance.setThreshold(this.valThreshold);
        if (this.bound1Input)
            instance.inputProperty().bind(this.obsrv1Input);
        if (this.bound2Input)
            instance.inputProperty().bindBidirectional(this.obsrv2Input);
        if (this.bound1Threshold)
            instance.thresholdProperty().bind(this.obsrv1Threshold);
        if (this.bound2Threshold)
            instance.thresholdProperty().bindBidirectional(this.obsrv2Threshold);
    }

    /**
     * 設定屬性{@link Bloom#setInput(javafx.scene.effect.Effect)}
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
     * 設定屬性{@link Bloom#setThreshold(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B threshold(double value)
    {
        this.hasThreshold = true;
        this.valThreshold = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Bloom#inputProperty}的連結
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
     * 設定屬性{@link Bloom#inputProperty}的雙向連結
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
     * 設定屬性{@link Bloom#thresholdProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindThreshold(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Threshold = true;
        this.obsrv1Threshold = source;
        this.bound2Threshold = false;
        this.obsrv2Threshold = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Bloom#thresholdProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalThreshold(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Threshold = false;
        this.obsrv1Threshold = null;
        this.bound2Threshold = true;
        this.obsrv2Threshold = source;
        return (B) this;
    }

    /**
     * 建構{@link Bloom}物件
     *
     * @return 新的{@link Bloom}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Bloom build()
    {
        Bloom instance = new Bloom();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link Bloom}物件
     *
     * @return 新的{@link Bloom}物件實體
     */
    @SuppressWarnings("unchecked")
    public Bloom build(double arg0)
    {
        Bloom instance = new Bloom(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

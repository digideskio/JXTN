// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.effect;

/**
 * {@link SepiaTone}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link SepiaTone})
 * @param <B> 建構器本身的型態(需繼承{@link SepiaToneBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class SepiaToneBuilder<Z extends SepiaTone, B extends SepiaToneBuilder<Z, B>>
        extends javafx.scene.effect.EffectBuilder<Z, B>
        implements SepiaToneBuilderExt<Z, B>
{

    private boolean hasInput;
    private javafx.scene.effect.Effect valInput;

    private boolean hasLevel;
    private double valLevel;

    private boolean bound1Input;
    private boolean bound2Input;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.effect.Effect> obsrv1Input;
    private javafx.beans.property.Property<javafx.scene.effect.Effect> obsrv2Input;

    private boolean bound1Level;
    private boolean bound2Level;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Level;
    private javafx.beans.property.Property<Number> obsrv2Level;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasInput)
            instance.setInput(this.valInput);
        if (this.hasLevel)
            instance.setLevel(this.valLevel);
        if (this.bound1Input)
            instance.inputProperty().bind(this.obsrv1Input);
        if (this.bound2Input)
            instance.inputProperty().bindBidirectional(this.obsrv2Input);
        if (this.bound1Level)
            instance.levelProperty().bind(this.obsrv1Level);
        if (this.bound2Level)
            instance.levelProperty().bindBidirectional(this.obsrv2Level);
    }

    /**
     * 設定屬性{@link SepiaTone#setInput(javafx.scene.effect.Effect)}。
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
     * 設定屬性{@link SepiaTone#setLevel(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B level(double value)
    {
        this.hasLevel = true;
        this.valLevel = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SepiaTone#inputProperty}的連結。
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
     * 設定屬性{@link SepiaTone#inputProperty}的雙向連結。
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
     * 設定屬性{@link SepiaTone#levelProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindLevel(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Level = true;
        this.obsrv1Level = source;
        this.bound2Level = false;
        this.obsrv2Level = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link SepiaTone#levelProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalLevel(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Level = false;
        this.obsrv1Level = null;
        this.bound2Level = true;
        this.obsrv2Level = source;
        return (B) this;
    }

    /**
     * 建構{@link SepiaTone}物件。
     *
     * @return 新的{@link SepiaTone}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public SepiaTone build()
    {
        SepiaTone instance = new SepiaTone();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link SepiaTone}物件。
     *
     * @return 新的{@link SepiaTone}物件實體
     */
    @SuppressWarnings("unchecked")
    public SepiaTone build(double arg0)
    {
        SepiaTone instance = new SepiaTone(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

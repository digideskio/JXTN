// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link SpinnerValueFactory.DoubleSpinnerValueFactory}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link SpinnerValueFactory.DoubleSpinnerValueFactory})
 * @param <B> 建構器本身的型態(需繼承{@link SpinnerValueFactory.DoubleSpinnerValueFactoryMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class SpinnerValueFactory_DoubleSpinnerValueFactoryMaker<Z extends SpinnerValueFactory.DoubleSpinnerValueFactory, B extends SpinnerValueFactory_DoubleSpinnerValueFactoryMaker<Z, B>>
        extends javafx.scene.control.SpinnerValueFactoryMaker<java.lang.Double, Z, B>
        implements SpinnerValueFactory_DoubleSpinnerValueFactoryMakerExt<Z, B>
{

    private boolean hasAmountToStepBy;
    private double valAmountToStepBy;

    private boolean hasMax;
    private double valMax;

    private boolean hasMin;
    private double valMin;

    private boolean bound1AmountToStepBy;
    private boolean bound2AmountToStepBy;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1AmountToStepBy;
    private javafx.beans.property.Property<Number> obsrv2AmountToStepBy;

    private boolean bound1Max;
    private boolean bound2Max;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Max;
    private javafx.beans.property.Property<Number> obsrv2Max;

    private boolean bound1Min;
    private boolean bound2Min;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Min;
    private javafx.beans.property.Property<Number> obsrv2Min;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasAmountToStepBy)
            instance.setAmountToStepBy(this.valAmountToStepBy);
        if (this.hasMax)
            instance.setMax(this.valMax);
        if (this.hasMin)
            instance.setMin(this.valMin);
        if (this.bound1AmountToStepBy)
            instance.amountToStepByProperty().bind(this.obsrv1AmountToStepBy);
        if (this.bound2AmountToStepBy)
            instance.amountToStepByProperty().bindBidirectional(this.obsrv2AmountToStepBy);
        if (this.bound1Max)
            instance.maxProperty().bind(this.obsrv1Max);
        if (this.bound2Max)
            instance.maxProperty().bindBidirectional(this.obsrv2Max);
        if (this.bound1Min)
            instance.minProperty().bind(this.obsrv1Min);
        if (this.bound2Min)
            instance.minProperty().bindBidirectional(this.obsrv2Min);
    }

    /**
     * 設定屬性{@link SpinnerValueFactory.DoubleSpinnerValueFactory#setAmountToStepBy(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B amountToStepBy(double value)
    {
        this.hasAmountToStepBy = true;
        this.valAmountToStepBy = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpinnerValueFactory.DoubleSpinnerValueFactory#setMax(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B max(double value)
    {
        this.hasMax = true;
        this.valMax = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpinnerValueFactory.DoubleSpinnerValueFactory#setMin(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B min(double value)
    {
        this.hasMin = true;
        this.valMin = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpinnerValueFactory.DoubleSpinnerValueFactory#amountToStepByProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindAmountToStepBy(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1AmountToStepBy = true;
        this.obsrv1AmountToStepBy = source;
        this.bound2AmountToStepBy = false;
        this.obsrv2AmountToStepBy = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpinnerValueFactory.DoubleSpinnerValueFactory#amountToStepByProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalAmountToStepBy(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1AmountToStepBy = false;
        this.obsrv1AmountToStepBy = null;
        this.bound2AmountToStepBy = true;
        this.obsrv2AmountToStepBy = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpinnerValueFactory.DoubleSpinnerValueFactory#maxProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindMax(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Max = true;
        this.obsrv1Max = source;
        this.bound2Max = false;
        this.obsrv2Max = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpinnerValueFactory.DoubleSpinnerValueFactory#maxProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalMax(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Max = false;
        this.obsrv1Max = null;
        this.bound2Max = true;
        this.obsrv2Max = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpinnerValueFactory.DoubleSpinnerValueFactory#minProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindMin(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Min = true;
        this.obsrv1Min = source;
        this.bound2Min = false;
        this.obsrv2Min = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpinnerValueFactory.DoubleSpinnerValueFactory#minProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalMin(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Min = false;
        this.obsrv1Min = null;
        this.bound2Min = true;
        this.obsrv2Min = source;
        return (B) this;
    }

    /**
     * 建構{@link SpinnerValueFactory.DoubleSpinnerValueFactory}物件。
     *
     * @return 新的{@link SpinnerValueFactory.DoubleSpinnerValueFactory}物件實體
     */
    @SuppressWarnings("unchecked")
    public SpinnerValueFactory.DoubleSpinnerValueFactory build(double arg0, double arg1)
    {
        SpinnerValueFactory.DoubleSpinnerValueFactory instance = new SpinnerValueFactory.DoubleSpinnerValueFactory(arg0, arg1);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link SpinnerValueFactory.DoubleSpinnerValueFactory}物件。
     *
     * @return 新的{@link SpinnerValueFactory.DoubleSpinnerValueFactory}物件實體
     */
    @SuppressWarnings("unchecked")
    public SpinnerValueFactory.DoubleSpinnerValueFactory build(double arg0, double arg1, double arg2)
    {
        SpinnerValueFactory.DoubleSpinnerValueFactory instance = new SpinnerValueFactory.DoubleSpinnerValueFactory(arg0, arg1, arg2);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link SpinnerValueFactory.DoubleSpinnerValueFactory}物件。
     *
     * @return 新的{@link SpinnerValueFactory.DoubleSpinnerValueFactory}物件實體
     */
    @SuppressWarnings("unchecked")
    public SpinnerValueFactory.DoubleSpinnerValueFactory build(double arg0, double arg1, double arg2, double arg3)
    {
        SpinnerValueFactory.DoubleSpinnerValueFactory instance = new SpinnerValueFactory.DoubleSpinnerValueFactory(arg0, arg1, arg2, arg3);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
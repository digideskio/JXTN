// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.chart;

/**
 * {@link NumberAxis}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link NumberAxis})
 * @param <B> 建構器本身的型態(需繼承{@link NumberAxisBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class NumberAxisBuilder<Z extends NumberAxis, B extends NumberAxisBuilder<Z, B>>
        extends javafx.scene.chart.ValueAxisBuilder<java.lang.Number, Z, B>
        implements NumberAxisBuilderExt<Z, B>
{

    private boolean hasForceZeroInRange;
    private boolean valForceZeroInRange;

    private boolean hasTickUnit;
    private double valTickUnit;

    private boolean bound1ForceZeroInRange;
    private boolean bound2ForceZeroInRange;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1ForceZeroInRange;
    private javafx.beans.property.Property<Boolean> obsrv2ForceZeroInRange;

    private boolean bound1TickUnit;
    private boolean bound2TickUnit;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1TickUnit;
    private javafx.beans.property.Property<Number> obsrv2TickUnit;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasForceZeroInRange)
            instance.setForceZeroInRange(this.valForceZeroInRange);
        if (this.hasTickUnit)
            instance.setTickUnit(this.valTickUnit);
        if (this.bound1ForceZeroInRange)
            instance.forceZeroInRangeProperty().bind(this.obsrv1ForceZeroInRange);
        if (this.bound2ForceZeroInRange)
            instance.forceZeroInRangeProperty().bindBidirectional(this.obsrv2ForceZeroInRange);
        if (this.bound1TickUnit)
            instance.tickUnitProperty().bind(this.obsrv1TickUnit);
        if (this.bound2TickUnit)
            instance.tickUnitProperty().bindBidirectional(this.obsrv2TickUnit);
    }

    /**
     * 設定屬性{@link NumberAxis#setForceZeroInRange(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B forceZeroInRange(boolean value)
    {
        this.hasForceZeroInRange = true;
        this.valForceZeroInRange = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link NumberAxis#setTickUnit(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B tickUnit(double value)
    {
        this.hasTickUnit = true;
        this.valTickUnit = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link NumberAxis#forceZeroInRangeProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindForceZeroInRange(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ForceZeroInRange = true;
        this.obsrv1ForceZeroInRange = source;
        this.bound2ForceZeroInRange = false;
        this.obsrv2ForceZeroInRange = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link NumberAxis#forceZeroInRangeProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalForceZeroInRange(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ForceZeroInRange = false;
        this.obsrv1ForceZeroInRange = null;
        this.bound2ForceZeroInRange = true;
        this.obsrv2ForceZeroInRange = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link NumberAxis#tickUnitProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindTickUnit(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1TickUnit = true;
        this.obsrv1TickUnit = source;
        this.bound2TickUnit = false;
        this.obsrv2TickUnit = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link NumberAxis#tickUnitProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalTickUnit(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1TickUnit = false;
        this.obsrv1TickUnit = null;
        this.bound2TickUnit = true;
        this.obsrv2TickUnit = source;
        return (B) this;
    }

    /**
     * 建構{@link NumberAxis}物件
     *
     * @return 新的{@link NumberAxis}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public NumberAxis build()
    {
        NumberAxis instance = new NumberAxis();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

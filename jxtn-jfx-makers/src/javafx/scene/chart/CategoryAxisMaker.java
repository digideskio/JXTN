// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.chart;

/**
 * {@link CategoryAxis}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link CategoryAxis})
 * @param <B> 建構器本身的型態(需繼承{@link CategoryAxisMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class CategoryAxisMaker<Z extends CategoryAxis, B extends CategoryAxisMaker<Z, B>>
        extends javafx.scene.chart.AxisMaker<java.lang.String, Z, B>
        implements CategoryAxisMakerExt<Z, B>
{

    private boolean hasCategories;
    private javafx.collections.ObservableList<java.lang.String> valCategories;

    private boolean hasEndMargin;
    private double valEndMargin;

    private boolean hasGapStartAndEnd;
    private boolean valGapStartAndEnd;

    private boolean hasStartMargin;
    private double valStartMargin;

    private boolean bound1EndMargin;
    private boolean bound2EndMargin;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1EndMargin;
    private javafx.beans.property.Property<Number> obsrv2EndMargin;

    private boolean bound1GapStartAndEnd;
    private boolean bound2GapStartAndEnd;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1GapStartAndEnd;
    private javafx.beans.property.Property<Boolean> obsrv2GapStartAndEnd;

    private boolean bound1StartMargin;
    private boolean bound2StartMargin;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1StartMargin;
    private javafx.beans.property.Property<Number> obsrv2StartMargin;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasCategories)
            instance.setCategories(this.valCategories);
        if (this.hasEndMargin)
            instance.setEndMargin(this.valEndMargin);
        if (this.hasGapStartAndEnd)
            instance.setGapStartAndEnd(this.valGapStartAndEnd);
        if (this.hasStartMargin)
            instance.setStartMargin(this.valStartMargin);
        if (this.bound1EndMargin)
            instance.endMarginProperty().bind(this.obsrv1EndMargin);
        if (this.bound2EndMargin)
            instance.endMarginProperty().bindBidirectional(this.obsrv2EndMargin);
        if (this.bound1GapStartAndEnd)
            instance.gapStartAndEndProperty().bind(this.obsrv1GapStartAndEnd);
        if (this.bound2GapStartAndEnd)
            instance.gapStartAndEndProperty().bindBidirectional(this.obsrv2GapStartAndEnd);
        if (this.bound1StartMargin)
            instance.startMarginProperty().bind(this.obsrv1StartMargin);
        if (this.bound2StartMargin)
            instance.startMarginProperty().bindBidirectional(this.obsrv2StartMargin);
    }

    /**
     * 設定屬性{@link CategoryAxis#setCategories(javafx.collections.ObservableList)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B categories(javafx.collections.ObservableList<java.lang.String> value)
    {
        this.hasCategories = true;
        this.valCategories = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link CategoryAxis#setEndMargin(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B endMargin(double value)
    {
        this.hasEndMargin = true;
        this.valEndMargin = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link CategoryAxis#setGapStartAndEnd(boolean)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B gapStartAndEnd(boolean value)
    {
        this.hasGapStartAndEnd = true;
        this.valGapStartAndEnd = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link CategoryAxis#setStartMargin(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B startMargin(double value)
    {
        this.hasStartMargin = true;
        this.valStartMargin = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link CategoryAxis#endMarginProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindEndMargin(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1EndMargin = true;
        this.obsrv1EndMargin = source;
        this.bound2EndMargin = false;
        this.obsrv2EndMargin = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link CategoryAxis#endMarginProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalEndMargin(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1EndMargin = false;
        this.obsrv1EndMargin = null;
        this.bound2EndMargin = true;
        this.obsrv2EndMargin = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link CategoryAxis#gapStartAndEndProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindGapStartAndEnd(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1GapStartAndEnd = true;
        this.obsrv1GapStartAndEnd = source;
        this.bound2GapStartAndEnd = false;
        this.obsrv2GapStartAndEnd = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link CategoryAxis#gapStartAndEndProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalGapStartAndEnd(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1GapStartAndEnd = false;
        this.obsrv1GapStartAndEnd = null;
        this.bound2GapStartAndEnd = true;
        this.obsrv2GapStartAndEnd = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link CategoryAxis#startMarginProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindStartMargin(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1StartMargin = true;
        this.obsrv1StartMargin = source;
        this.bound2StartMargin = false;
        this.obsrv2StartMargin = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link CategoryAxis#startMarginProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalStartMargin(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1StartMargin = false;
        this.obsrv1StartMargin = null;
        this.bound2StartMargin = true;
        this.obsrv2StartMargin = source;
        return (B) this;
    }

    /**
     * 建構{@link CategoryAxis}物件。
     *
     * @return 新的{@link CategoryAxis}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public CategoryAxis build()
    {
        CategoryAxis instance = new CategoryAxis();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link CategoryAxis}物件。
     *
     * @return 新的{@link CategoryAxis}物件實體
     */
    @SuppressWarnings("unchecked")
    public CategoryAxis build(javafx.collections.ObservableList<java.lang.String> arg0)
    {
        CategoryAxis instance = new CategoryAxis(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
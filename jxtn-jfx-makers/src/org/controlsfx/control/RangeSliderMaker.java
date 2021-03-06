// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control;

/**
 * {@link RangeSlider}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.40.10.jar
 * @param <Z> 要建構的物件型態(需繼承{@link RangeSlider})
 * @param <B> 建構器本身的型態(需繼承{@link RangeSliderMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class RangeSliderMaker<Z extends RangeSlider, B extends RangeSliderMaker<Z, B>>
        extends javafx.scene.control.ControlMaker<Z, B>
        implements RangeSliderMakerExt<Z, B>
{

    private boolean hasBlockIncrement;
    private double valBlockIncrement;

    private boolean hasHighValue;
    private double valHighValue;

    private boolean hasHighValueChanging;
    private boolean valHighValueChanging;

    private boolean hasLabelFormatter;
    private javafx.util.StringConverter<java.lang.Number> valLabelFormatter;

    private boolean hasLowValue;
    private double valLowValue;

    private boolean hasLowValueChanging;
    private boolean valLowValueChanging;

    private boolean hasMajorTickUnit;
    private double valMajorTickUnit;

    private boolean hasMax;
    private double valMax;

    private boolean hasMin;
    private double valMin;

    private boolean hasMinorTickCount;
    private int valMinorTickCount;

    private boolean hasOrientation;
    private javafx.geometry.Orientation valOrientation;

    private boolean hasShowTickLabels;
    private boolean valShowTickLabels;

    private boolean hasShowTickMarks;
    private boolean valShowTickMarks;

    private boolean hasSnapToTicks;
    private boolean valSnapToTicks;

    private boolean bound1BlockIncrement;
    private boolean bound2BlockIncrement;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1BlockIncrement;
    private javafx.beans.property.Property<Number> obsrv2BlockIncrement;

    private boolean bound1HighValueChanging;
    private boolean bound2HighValueChanging;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1HighValueChanging;
    private javafx.beans.property.Property<Boolean> obsrv2HighValueChanging;

    private boolean bound1HighValue;
    private boolean bound2HighValue;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1HighValue;
    private javafx.beans.property.Property<Number> obsrv2HighValue;

    private boolean bound1LabelFormatter;
    private boolean bound2LabelFormatter;
    private javafx.beans.value.ObservableValue<? extends javafx.util.StringConverter<java.lang.Number>> obsrv1LabelFormatter;
    private javafx.beans.property.Property<javafx.util.StringConverter<java.lang.Number>> obsrv2LabelFormatter;

    private boolean bound1LowValueChanging;
    private boolean bound2LowValueChanging;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1LowValueChanging;
    private javafx.beans.property.Property<Boolean> obsrv2LowValueChanging;

    private boolean bound1LowValue;
    private boolean bound2LowValue;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1LowValue;
    private javafx.beans.property.Property<Number> obsrv2LowValue;

    private boolean bound1MajorTickUnit;
    private boolean bound2MajorTickUnit;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1MajorTickUnit;
    private javafx.beans.property.Property<Number> obsrv2MajorTickUnit;

    private boolean bound1Max;
    private boolean bound2Max;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Max;
    private javafx.beans.property.Property<Number> obsrv2Max;

    private boolean bound1Min;
    private boolean bound2Min;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Min;
    private javafx.beans.property.Property<Number> obsrv2Min;

    private boolean bound1MinorTickCount;
    private boolean bound2MinorTickCount;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1MinorTickCount;
    private javafx.beans.property.Property<Number> obsrv2MinorTickCount;

    private boolean bound1Orientation;
    private boolean bound2Orientation;
    private javafx.beans.value.ObservableValue<? extends javafx.geometry.Orientation> obsrv1Orientation;
    private javafx.beans.property.Property<javafx.geometry.Orientation> obsrv2Orientation;

    private boolean bound1ShowTickLabels;
    private boolean bound2ShowTickLabels;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1ShowTickLabels;
    private javafx.beans.property.Property<Boolean> obsrv2ShowTickLabels;

    private boolean bound1ShowTickMarks;
    private boolean bound2ShowTickMarks;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1ShowTickMarks;
    private javafx.beans.property.Property<Boolean> obsrv2ShowTickMarks;

    private boolean bound1SnapToTicks;
    private boolean bound2SnapToTicks;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1SnapToTicks;
    private javafx.beans.property.Property<Boolean> obsrv2SnapToTicks;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasBlockIncrement)
            instance.setBlockIncrement(this.valBlockIncrement);
        if (this.hasHighValue)
            instance.setHighValue(this.valHighValue);
        if (this.hasHighValueChanging)
            instance.setHighValueChanging(this.valHighValueChanging);
        if (this.hasLabelFormatter)
            instance.setLabelFormatter(this.valLabelFormatter);
        if (this.hasLowValue)
            instance.setLowValue(this.valLowValue);
        if (this.hasLowValueChanging)
            instance.setLowValueChanging(this.valLowValueChanging);
        if (this.hasMajorTickUnit)
            instance.setMajorTickUnit(this.valMajorTickUnit);
        if (this.hasMax)
            instance.setMax(this.valMax);
        if (this.hasMin)
            instance.setMin(this.valMin);
        if (this.hasMinorTickCount)
            instance.setMinorTickCount(this.valMinorTickCount);
        if (this.hasOrientation)
            instance.setOrientation(this.valOrientation);
        if (this.hasShowTickLabels)
            instance.setShowTickLabels(this.valShowTickLabels);
        if (this.hasShowTickMarks)
            instance.setShowTickMarks(this.valShowTickMarks);
        if (this.hasSnapToTicks)
            instance.setSnapToTicks(this.valSnapToTicks);
        if (this.bound1BlockIncrement)
            instance.blockIncrementProperty().bind(this.obsrv1BlockIncrement);
        if (this.bound2BlockIncrement)
            instance.blockIncrementProperty().bindBidirectional(this.obsrv2BlockIncrement);
        if (this.bound1HighValueChanging)
            instance.highValueChangingProperty().bind(this.obsrv1HighValueChanging);
        if (this.bound2HighValueChanging)
            instance.highValueChangingProperty().bindBidirectional(this.obsrv2HighValueChanging);
        if (this.bound1HighValue)
            instance.highValueProperty().bind(this.obsrv1HighValue);
        if (this.bound2HighValue)
            instance.highValueProperty().bindBidirectional(this.obsrv2HighValue);
        if (this.bound1LabelFormatter)
            instance.labelFormatterProperty().bind(this.obsrv1LabelFormatter);
        if (this.bound2LabelFormatter)
            instance.labelFormatterProperty().bindBidirectional(this.obsrv2LabelFormatter);
        if (this.bound1LowValueChanging)
            instance.lowValueChangingProperty().bind(this.obsrv1LowValueChanging);
        if (this.bound2LowValueChanging)
            instance.lowValueChangingProperty().bindBidirectional(this.obsrv2LowValueChanging);
        if (this.bound1LowValue)
            instance.lowValueProperty().bind(this.obsrv1LowValue);
        if (this.bound2LowValue)
            instance.lowValueProperty().bindBidirectional(this.obsrv2LowValue);
        if (this.bound1MajorTickUnit)
            instance.majorTickUnitProperty().bind(this.obsrv1MajorTickUnit);
        if (this.bound2MajorTickUnit)
            instance.majorTickUnitProperty().bindBidirectional(this.obsrv2MajorTickUnit);
        if (this.bound1Max)
            instance.maxProperty().bind(this.obsrv1Max);
        if (this.bound2Max)
            instance.maxProperty().bindBidirectional(this.obsrv2Max);
        if (this.bound1Min)
            instance.minProperty().bind(this.obsrv1Min);
        if (this.bound2Min)
            instance.minProperty().bindBidirectional(this.obsrv2Min);
        if (this.bound1MinorTickCount)
            instance.minorTickCountProperty().bind(this.obsrv1MinorTickCount);
        if (this.bound2MinorTickCount)
            instance.minorTickCountProperty().bindBidirectional(this.obsrv2MinorTickCount);
        if (this.bound1Orientation)
            instance.orientationProperty().bind(this.obsrv1Orientation);
        if (this.bound2Orientation)
            instance.orientationProperty().bindBidirectional(this.obsrv2Orientation);
        if (this.bound1ShowTickLabels)
            instance.showTickLabelsProperty().bind(this.obsrv1ShowTickLabels);
        if (this.bound2ShowTickLabels)
            instance.showTickLabelsProperty().bindBidirectional(this.obsrv2ShowTickLabels);
        if (this.bound1ShowTickMarks)
            instance.showTickMarksProperty().bind(this.obsrv1ShowTickMarks);
        if (this.bound2ShowTickMarks)
            instance.showTickMarksProperty().bindBidirectional(this.obsrv2ShowTickMarks);
        if (this.bound1SnapToTicks)
            instance.snapToTicksProperty().bind(this.obsrv1SnapToTicks);
        if (this.bound2SnapToTicks)
            instance.snapToTicksProperty().bindBidirectional(this.obsrv2SnapToTicks);
    }

    /**
     * 設定屬性{@link RangeSlider#setBlockIncrement(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B blockIncrement(double value)
    {
        this.hasBlockIncrement = true;
        this.valBlockIncrement = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link RangeSlider#setHighValue(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B highValue(double value)
    {
        this.hasHighValue = true;
        this.valHighValue = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link RangeSlider#setHighValueChanging(boolean)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B highValueChanging(boolean value)
    {
        this.hasHighValueChanging = true;
        this.valHighValueChanging = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link RangeSlider#setLabelFormatter(javafx.util.StringConverter)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B labelFormatter(javafx.util.StringConverter<java.lang.Number> value)
    {
        this.hasLabelFormatter = true;
        this.valLabelFormatter = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link RangeSlider#setLowValue(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B lowValue(double value)
    {
        this.hasLowValue = true;
        this.valLowValue = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link RangeSlider#setLowValueChanging(boolean)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B lowValueChanging(boolean value)
    {
        this.hasLowValueChanging = true;
        this.valLowValueChanging = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link RangeSlider#setMajorTickUnit(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B majorTickUnit(double value)
    {
        this.hasMajorTickUnit = true;
        this.valMajorTickUnit = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link RangeSlider#setMax(double)}。
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
     * 設定屬性{@link RangeSlider#setMin(double)}。
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
     * 設定屬性{@link RangeSlider#setMinorTickCount(int)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B minorTickCount(int value)
    {
        this.hasMinorTickCount = true;
        this.valMinorTickCount = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link RangeSlider#setOrientation(javafx.geometry.Orientation)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B orientation(javafx.geometry.Orientation value)
    {
        this.hasOrientation = true;
        this.valOrientation = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link RangeSlider#setShowTickLabels(boolean)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B showTickLabels(boolean value)
    {
        this.hasShowTickLabels = true;
        this.valShowTickLabels = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link RangeSlider#setShowTickMarks(boolean)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B showTickMarks(boolean value)
    {
        this.hasShowTickMarks = true;
        this.valShowTickMarks = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link RangeSlider#setSnapToTicks(boolean)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B snapToTicks(boolean value)
    {
        this.hasSnapToTicks = true;
        this.valSnapToTicks = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link RangeSlider#blockIncrementProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBlockIncrement(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1BlockIncrement = true;
        this.obsrv1BlockIncrement = source;
        this.bound2BlockIncrement = false;
        this.obsrv2BlockIncrement = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link RangeSlider#blockIncrementProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalBlockIncrement(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1BlockIncrement = false;
        this.obsrv1BlockIncrement = null;
        this.bound2BlockIncrement = true;
        this.obsrv2BlockIncrement = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link RangeSlider#highValueChangingProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindHighValueChanging(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1HighValueChanging = true;
        this.obsrv1HighValueChanging = source;
        this.bound2HighValueChanging = false;
        this.obsrv2HighValueChanging = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link RangeSlider#highValueChangingProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalHighValueChanging(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1HighValueChanging = false;
        this.obsrv1HighValueChanging = null;
        this.bound2HighValueChanging = true;
        this.obsrv2HighValueChanging = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link RangeSlider#highValueProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindHighValue(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1HighValue = true;
        this.obsrv1HighValue = source;
        this.bound2HighValue = false;
        this.obsrv2HighValue = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link RangeSlider#highValueProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalHighValue(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1HighValue = false;
        this.obsrv1HighValue = null;
        this.bound2HighValue = true;
        this.obsrv2HighValue = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link RangeSlider#labelFormatterProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindLabelFormatter(javafx.beans.value.ObservableValue<? extends javafx.util.StringConverter<java.lang.Number>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1LabelFormatter = true;
        this.obsrv1LabelFormatter = source;
        this.bound2LabelFormatter = false;
        this.obsrv2LabelFormatter = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link RangeSlider#labelFormatterProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalLabelFormatter(javafx.beans.property.Property<javafx.util.StringConverter<java.lang.Number>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1LabelFormatter = false;
        this.obsrv1LabelFormatter = null;
        this.bound2LabelFormatter = true;
        this.obsrv2LabelFormatter = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link RangeSlider#lowValueChangingProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindLowValueChanging(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1LowValueChanging = true;
        this.obsrv1LowValueChanging = source;
        this.bound2LowValueChanging = false;
        this.obsrv2LowValueChanging = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link RangeSlider#lowValueChangingProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalLowValueChanging(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1LowValueChanging = false;
        this.obsrv1LowValueChanging = null;
        this.bound2LowValueChanging = true;
        this.obsrv2LowValueChanging = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link RangeSlider#lowValueProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindLowValue(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1LowValue = true;
        this.obsrv1LowValue = source;
        this.bound2LowValue = false;
        this.obsrv2LowValue = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link RangeSlider#lowValueProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalLowValue(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1LowValue = false;
        this.obsrv1LowValue = null;
        this.bound2LowValue = true;
        this.obsrv2LowValue = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link RangeSlider#majorTickUnitProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindMajorTickUnit(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1MajorTickUnit = true;
        this.obsrv1MajorTickUnit = source;
        this.bound2MajorTickUnit = false;
        this.obsrv2MajorTickUnit = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link RangeSlider#majorTickUnitProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalMajorTickUnit(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1MajorTickUnit = false;
        this.obsrv1MajorTickUnit = null;
        this.bound2MajorTickUnit = true;
        this.obsrv2MajorTickUnit = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link RangeSlider#maxProperty}的連結。
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
     * 設定屬性{@link RangeSlider#maxProperty}的雙向連結。
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
     * 設定屬性{@link RangeSlider#minProperty}的連結。
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
     * 設定屬性{@link RangeSlider#minProperty}的雙向連結。
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
     * 設定屬性{@link RangeSlider#minorTickCountProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindMinorTickCount(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1MinorTickCount = true;
        this.obsrv1MinorTickCount = source;
        this.bound2MinorTickCount = false;
        this.obsrv2MinorTickCount = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link RangeSlider#minorTickCountProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalMinorTickCount(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1MinorTickCount = false;
        this.obsrv1MinorTickCount = null;
        this.bound2MinorTickCount = true;
        this.obsrv2MinorTickCount = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link RangeSlider#orientationProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOrientation(javafx.beans.value.ObservableValue<? extends javafx.geometry.Orientation> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Orientation = true;
        this.obsrv1Orientation = source;
        this.bound2Orientation = false;
        this.obsrv2Orientation = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link RangeSlider#orientationProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalOrientation(javafx.beans.property.Property<javafx.geometry.Orientation> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Orientation = false;
        this.obsrv1Orientation = null;
        this.bound2Orientation = true;
        this.obsrv2Orientation = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link RangeSlider#showTickLabelsProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindShowTickLabels(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ShowTickLabels = true;
        this.obsrv1ShowTickLabels = source;
        this.bound2ShowTickLabels = false;
        this.obsrv2ShowTickLabels = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link RangeSlider#showTickLabelsProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalShowTickLabels(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ShowTickLabels = false;
        this.obsrv1ShowTickLabels = null;
        this.bound2ShowTickLabels = true;
        this.obsrv2ShowTickLabels = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link RangeSlider#showTickMarksProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindShowTickMarks(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ShowTickMarks = true;
        this.obsrv1ShowTickMarks = source;
        this.bound2ShowTickMarks = false;
        this.obsrv2ShowTickMarks = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link RangeSlider#showTickMarksProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalShowTickMarks(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ShowTickMarks = false;
        this.obsrv1ShowTickMarks = null;
        this.bound2ShowTickMarks = true;
        this.obsrv2ShowTickMarks = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link RangeSlider#snapToTicksProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindSnapToTicks(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1SnapToTicks = true;
        this.obsrv1SnapToTicks = source;
        this.bound2SnapToTicks = false;
        this.obsrv2SnapToTicks = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link RangeSlider#snapToTicksProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalSnapToTicks(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1SnapToTicks = false;
        this.obsrv1SnapToTicks = null;
        this.bound2SnapToTicks = true;
        this.obsrv2SnapToTicks = source;
        return (B) this;
    }

    /**
     * 建構{@link RangeSlider}物件。
     *
     * @return 新的{@link RangeSlider}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public RangeSlider build()
    {
        RangeSlider instance = new RangeSlider();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link RangeSlider}物件。
     *
     * @return 新的{@link RangeSlider}物件實體
     */
    @SuppressWarnings("unchecked")
    public RangeSlider build(double arg0, double arg1, double arg2, double arg3)
    {
        RangeSlider instance = new RangeSlider(arg0, arg1, arg2, arg3);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

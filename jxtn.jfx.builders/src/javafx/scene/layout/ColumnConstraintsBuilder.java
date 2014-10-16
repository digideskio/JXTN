// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.layout;

/**
 * {@link ColumnConstraints}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link ColumnConstraints})
 * @param <B> 建構器本身的型態(需繼承{@link ColumnConstraintsBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ColumnConstraintsBuilder<Z extends ColumnConstraints, B extends ColumnConstraintsBuilder<Z, B>>
        extends javafx.scene.layout.ConstraintsBaseBuilder<Z, B>
        implements ColumnConstraintsBuilderExt<Z, B>
{

    private boolean hasFillWidth;
    private boolean valFillWidth;

    private boolean hasHalignment;
    private javafx.geometry.HPos valHalignment;

    private boolean hasHgrow;
    private javafx.scene.layout.Priority valHgrow;

    private boolean hasMaxWidth;
    private double valMaxWidth;

    private boolean hasMinWidth;
    private double valMinWidth;

    private boolean hasPercentWidth;
    private double valPercentWidth;

    private boolean hasPrefWidth;
    private double valPrefWidth;

    private boolean bound1FillWidth;
    private boolean bound2FillWidth;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1FillWidth;
    private javafx.beans.property.Property<Boolean> obsrv2FillWidth;

    private boolean bound1Halignment;
    private boolean bound2Halignment;
    private javafx.beans.value.ObservableValue<? extends javafx.geometry.HPos> obsrv1Halignment;
    private javafx.beans.property.Property<javafx.geometry.HPos> obsrv2Halignment;

    private boolean bound1Hgrow;
    private boolean bound2Hgrow;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.layout.Priority> obsrv1Hgrow;
    private javafx.beans.property.Property<javafx.scene.layout.Priority> obsrv2Hgrow;

    private boolean bound1MaxWidth;
    private boolean bound2MaxWidth;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1MaxWidth;
    private javafx.beans.property.Property<Number> obsrv2MaxWidth;

    private boolean bound1MinWidth;
    private boolean bound2MinWidth;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1MinWidth;
    private javafx.beans.property.Property<Number> obsrv2MinWidth;

    private boolean bound1PercentWidth;
    private boolean bound2PercentWidth;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1PercentWidth;
    private javafx.beans.property.Property<Number> obsrv2PercentWidth;

    private boolean bound1PrefWidth;
    private boolean bound2PrefWidth;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1PrefWidth;
    private javafx.beans.property.Property<Number> obsrv2PrefWidth;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasFillWidth)
            instance.setFillWidth(this.valFillWidth);
        if (this.hasHalignment)
            instance.setHalignment(this.valHalignment);
        if (this.hasHgrow)
            instance.setHgrow(this.valHgrow);
        if (this.hasMaxWidth)
            instance.setMaxWidth(this.valMaxWidth);
        if (this.hasMinWidth)
            instance.setMinWidth(this.valMinWidth);
        if (this.hasPercentWidth)
            instance.setPercentWidth(this.valPercentWidth);
        if (this.hasPrefWidth)
            instance.setPrefWidth(this.valPrefWidth);
        if (this.bound1FillWidth)
            instance.fillWidthProperty().bind(this.obsrv1FillWidth);
        if (this.bound2FillWidth)
            instance.fillWidthProperty().bindBidirectional(this.obsrv2FillWidth);
        if (this.bound1Halignment)
            instance.halignmentProperty().bind(this.obsrv1Halignment);
        if (this.bound2Halignment)
            instance.halignmentProperty().bindBidirectional(this.obsrv2Halignment);
        if (this.bound1Hgrow)
            instance.hgrowProperty().bind(this.obsrv1Hgrow);
        if (this.bound2Hgrow)
            instance.hgrowProperty().bindBidirectional(this.obsrv2Hgrow);
        if (this.bound1MaxWidth)
            instance.maxWidthProperty().bind(this.obsrv1MaxWidth);
        if (this.bound2MaxWidth)
            instance.maxWidthProperty().bindBidirectional(this.obsrv2MaxWidth);
        if (this.bound1MinWidth)
            instance.minWidthProperty().bind(this.obsrv1MinWidth);
        if (this.bound2MinWidth)
            instance.minWidthProperty().bindBidirectional(this.obsrv2MinWidth);
        if (this.bound1PercentWidth)
            instance.percentWidthProperty().bind(this.obsrv1PercentWidth);
        if (this.bound2PercentWidth)
            instance.percentWidthProperty().bindBidirectional(this.obsrv2PercentWidth);
        if (this.bound1PrefWidth)
            instance.prefWidthProperty().bind(this.obsrv1PrefWidth);
        if (this.bound2PrefWidth)
            instance.prefWidthProperty().bindBidirectional(this.obsrv2PrefWidth);
    }

    /**
     * 設定屬性{@link ColumnConstraints#setFillWidth(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B fillWidth(boolean value)
    {
        this.hasFillWidth = true;
        this.valFillWidth = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ColumnConstraints#setHalignment(javafx.geometry.HPos)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B halignment(javafx.geometry.HPos value)
    {
        this.hasHalignment = true;
        this.valHalignment = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ColumnConstraints#setHgrow(javafx.scene.layout.Priority)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B hgrow(javafx.scene.layout.Priority value)
    {
        this.hasHgrow = true;
        this.valHgrow = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ColumnConstraints#setMaxWidth(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B maxWidth(double value)
    {
        this.hasMaxWidth = true;
        this.valMaxWidth = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ColumnConstraints#setMinWidth(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B minWidth(double value)
    {
        this.hasMinWidth = true;
        this.valMinWidth = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ColumnConstraints#setPercentWidth(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B percentWidth(double value)
    {
        this.hasPercentWidth = true;
        this.valPercentWidth = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ColumnConstraints#setPrefWidth(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B prefWidth(double value)
    {
        this.hasPrefWidth = true;
        this.valPrefWidth = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ColumnConstraints#fillWidthProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindFillWidth(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1FillWidth = true;
        this.obsrv1FillWidth = source;
        this.bound2FillWidth = false;
        this.obsrv2FillWidth = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ColumnConstraints#fillWidthProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalFillWidth(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1FillWidth = false;
        this.obsrv1FillWidth = null;
        this.bound2FillWidth = true;
        this.obsrv2FillWidth = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ColumnConstraints#halignmentProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindHalignment(javafx.beans.value.ObservableValue<? extends javafx.geometry.HPos> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Halignment = true;
        this.obsrv1Halignment = source;
        this.bound2Halignment = false;
        this.obsrv2Halignment = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ColumnConstraints#halignmentProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalHalignment(javafx.beans.property.Property<javafx.geometry.HPos> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Halignment = false;
        this.obsrv1Halignment = null;
        this.bound2Halignment = true;
        this.obsrv2Halignment = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ColumnConstraints#hgrowProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindHgrow(javafx.beans.value.ObservableValue<? extends javafx.scene.layout.Priority> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Hgrow = true;
        this.obsrv1Hgrow = source;
        this.bound2Hgrow = false;
        this.obsrv2Hgrow = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ColumnConstraints#hgrowProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalHgrow(javafx.beans.property.Property<javafx.scene.layout.Priority> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Hgrow = false;
        this.obsrv1Hgrow = null;
        this.bound2Hgrow = true;
        this.obsrv2Hgrow = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ColumnConstraints#maxWidthProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindMaxWidth(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1MaxWidth = true;
        this.obsrv1MaxWidth = source;
        this.bound2MaxWidth = false;
        this.obsrv2MaxWidth = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ColumnConstraints#maxWidthProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalMaxWidth(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1MaxWidth = false;
        this.obsrv1MaxWidth = null;
        this.bound2MaxWidth = true;
        this.obsrv2MaxWidth = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ColumnConstraints#minWidthProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindMinWidth(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1MinWidth = true;
        this.obsrv1MinWidth = source;
        this.bound2MinWidth = false;
        this.obsrv2MinWidth = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ColumnConstraints#minWidthProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalMinWidth(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1MinWidth = false;
        this.obsrv1MinWidth = null;
        this.bound2MinWidth = true;
        this.obsrv2MinWidth = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ColumnConstraints#percentWidthProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindPercentWidth(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1PercentWidth = true;
        this.obsrv1PercentWidth = source;
        this.bound2PercentWidth = false;
        this.obsrv2PercentWidth = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ColumnConstraints#percentWidthProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalPercentWidth(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1PercentWidth = false;
        this.obsrv1PercentWidth = null;
        this.bound2PercentWidth = true;
        this.obsrv2PercentWidth = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ColumnConstraints#prefWidthProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindPrefWidth(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1PrefWidth = true;
        this.obsrv1PrefWidth = source;
        this.bound2PrefWidth = false;
        this.obsrv2PrefWidth = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ColumnConstraints#prefWidthProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalPrefWidth(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1PrefWidth = false;
        this.obsrv1PrefWidth = null;
        this.bound2PrefWidth = true;
        this.obsrv2PrefWidth = source;
        return (B) this;
    }

    /**
     * 建構{@link ColumnConstraints}物件
     *
     * @return 新的{@link ColumnConstraints}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public ColumnConstraints build()
    {
        ColumnConstraints instance = new ColumnConstraints();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link ColumnConstraints}物件
     *
     * @return 新的{@link ColumnConstraints}物件實體
     */
    @SuppressWarnings("unchecked")
    public ColumnConstraints build(double arg0)
    {
        ColumnConstraints instance = new ColumnConstraints(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link ColumnConstraints}物件
     *
     * @return 新的{@link ColumnConstraints}物件實體
     */
    @SuppressWarnings("unchecked")
    public ColumnConstraints build(double arg0, double arg1, double arg2)
    {
        ColumnConstraints instance = new ColumnConstraints(arg0, arg1, arg2);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link ColumnConstraints}物件
     *
     * @return 新的{@link ColumnConstraints}物件實體
     */
    @SuppressWarnings("unchecked")
    public ColumnConstraints build(double arg0, double arg1, double arg2, javafx.scene.layout.Priority arg3, javafx.geometry.HPos arg4, boolean arg5)
    {
        ColumnConstraints instance = new ColumnConstraints(arg0, arg1, arg2, arg3, arg4, arg5);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.layout;

/**
 * {@link VBox}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link VBox})
 * @param <B> 建構器本身的型態(需繼承{@link VBoxBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class VBoxBuilder<Z extends VBox, B extends VBoxBuilder<Z, B>>
        extends javafx.scene.layout.PaneBuilder<Z, B>
        implements VBoxBuilderExt<Z, B>
{

    private boolean hasAlignment;
    private javafx.geometry.Pos valAlignment;

    private boolean hasFillWidth;
    private boolean valFillWidth;

    private boolean hasSpacing;
    private double valSpacing;

    private boolean bound1Alignment;
    private boolean bound2Alignment;
    private javafx.beans.value.ObservableValue<? extends javafx.geometry.Pos> obsrv1Alignment;
    private javafx.beans.property.Property<javafx.geometry.Pos> obsrv2Alignment;

    private boolean bound1FillWidth;
    private boolean bound2FillWidth;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1FillWidth;
    private javafx.beans.property.Property<Boolean> obsrv2FillWidth;

    private boolean bound1Spacing;
    private boolean bound2Spacing;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Spacing;
    private javafx.beans.property.Property<Number> obsrv2Spacing;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasAlignment)
            instance.setAlignment(this.valAlignment);
        if (this.hasFillWidth)
            instance.setFillWidth(this.valFillWidth);
        if (this.hasSpacing)
            instance.setSpacing(this.valSpacing);
        if (this.bound1Alignment)
            instance.alignmentProperty().bind(this.obsrv1Alignment);
        if (this.bound2Alignment)
            instance.alignmentProperty().bindBidirectional(this.obsrv2Alignment);
        if (this.bound1FillWidth)
            instance.fillWidthProperty().bind(this.obsrv1FillWidth);
        if (this.bound2FillWidth)
            instance.fillWidthProperty().bindBidirectional(this.obsrv2FillWidth);
        if (this.bound1Spacing)
            instance.spacingProperty().bind(this.obsrv1Spacing);
        if (this.bound2Spacing)
            instance.spacingProperty().bindBidirectional(this.obsrv2Spacing);
    }

    /**
     * 設定屬性{@link VBox#setAlignment(javafx.geometry.Pos)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B alignment(javafx.geometry.Pos value)
    {
        this.hasAlignment = true;
        this.valAlignment = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link VBox#setFillWidth(boolean)}
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
     * 設定屬性{@link VBox#setSpacing(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B spacing(double value)
    {
        this.hasSpacing = true;
        this.valSpacing = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link VBox#alignmentProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindAlignment(javafx.beans.value.ObservableValue<? extends javafx.geometry.Pos> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Alignment = true;
        this.obsrv1Alignment = source;
        this.bound2Alignment = false;
        this.obsrv2Alignment = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link VBox#alignmentProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalAlignment(javafx.beans.property.Property<javafx.geometry.Pos> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Alignment = false;
        this.obsrv1Alignment = null;
        this.bound2Alignment = true;
        this.obsrv2Alignment = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link VBox#fillWidthProperty}的連結
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
     * 設定屬性{@link VBox#fillWidthProperty}的雙向連結
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
     * 設定屬性{@link VBox#spacingProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindSpacing(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Spacing = true;
        this.obsrv1Spacing = source;
        this.bound2Spacing = false;
        this.obsrv2Spacing = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link VBox#spacingProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalSpacing(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Spacing = false;
        this.obsrv1Spacing = null;
        this.bound2Spacing = true;
        this.obsrv2Spacing = source;
        return (B) this;
    }

    /**
     * 建構{@link VBox}物件
     *
     * @return 新的{@link VBox}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public VBox build()
    {
        VBox instance = new VBox();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link VBox}物件
     *
     * @return 新的{@link VBox}物件實體
     */
    @SuppressWarnings("unchecked")
    public VBox build(double arg0)
    {
        VBox instance = new VBox(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link VBox}物件
     *
     * @return 新的{@link VBox}物件實體
     */
    @SuppressWarnings("unchecked")
    public VBox build(javafx.scene.Node[] arg0)
    {
        VBox instance = new VBox(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link VBox}物件
     *
     * @return 新的{@link VBox}物件實體
     */
    @SuppressWarnings("unchecked")
    public VBox build(double arg0, javafx.scene.Node[] arg1)
    {
        VBox instance = new VBox(arg0, arg1);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

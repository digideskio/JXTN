// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control;

/**
 * {@link SnapshotView}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.20.7.jar
 * @param <Z> 要建構的物件型態(需繼承{@link SnapshotView})
 * @param <B> 建構器本身的型態(需繼承{@link SnapshotViewBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class SnapshotViewBuilder<Z extends SnapshotView, B extends SnapshotViewBuilder<Z, B>>
        extends javafx.scene.control.ControlBuilder<Z, B>
        implements SnapshotViewBuilderExt<Z, B>
{

    private boolean hasFixedSelectionRatio;
    private double valFixedSelectionRatio;

    private boolean hasNode;
    private javafx.scene.Node valNode;

    private boolean hasSelection;
    private javafx.geometry.Rectangle2D valSelection;

    private boolean hasSelectionActive;
    private boolean valSelectionActive;

    private boolean hasSelectionActivityExplicitlyManaged;
    private boolean valSelectionActivityExplicitlyManaged;

    private boolean hasSelectionRatioFixed;
    private boolean valSelectionRatioFixed;

    private boolean bound1FixedSelectionRatio;
    private boolean bound2FixedSelectionRatio;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1FixedSelectionRatio;
    private javafx.beans.property.Property<Number> obsrv2FixedSelectionRatio;

    private boolean bound1Node;
    private boolean bound2Node;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrv1Node;
    private javafx.beans.property.Property<javafx.scene.Node> obsrv2Node;

    private boolean bound1SelectionActive;
    private boolean bound2SelectionActive;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1SelectionActive;
    private javafx.beans.property.Property<Boolean> obsrv2SelectionActive;

    private boolean bound1SelectionActivityExplicitlyManaged;
    private boolean bound2SelectionActivityExplicitlyManaged;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1SelectionActivityExplicitlyManaged;
    private javafx.beans.property.Property<Boolean> obsrv2SelectionActivityExplicitlyManaged;

    private boolean bound1SelectionChanging;
    private boolean bound2SelectionChanging;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1SelectionChanging;
    private javafx.beans.property.Property<Boolean> obsrv2SelectionChanging;

    private boolean bound1Selection;
    private boolean bound2Selection;
    private javafx.beans.value.ObservableValue<? extends javafx.geometry.Rectangle2D> obsrv1Selection;
    private javafx.beans.property.Property<javafx.geometry.Rectangle2D> obsrv2Selection;

    private boolean bound1SelectionRatioFixed;
    private boolean bound2SelectionRatioFixed;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1SelectionRatioFixed;
    private javafx.beans.property.Property<Boolean> obsrv2SelectionRatioFixed;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasFixedSelectionRatio)
            instance.setFixedSelectionRatio(this.valFixedSelectionRatio);
        if (this.hasNode)
            instance.setNode(this.valNode);
        if (this.hasSelection)
            instance.setSelection(this.valSelection);
        if (this.hasSelectionActive)
            instance.setSelectionActive(this.valSelectionActive);
        if (this.hasSelectionActivityExplicitlyManaged)
            instance.setSelectionActivityExplicitlyManaged(this.valSelectionActivityExplicitlyManaged);
        if (this.hasSelectionRatioFixed)
            instance.setSelectionRatioFixed(this.valSelectionRatioFixed);
        if (this.bound1FixedSelectionRatio)
            instance.fixedSelectionRatioProperty().bind(this.obsrv1FixedSelectionRatio);
        if (this.bound2FixedSelectionRatio)
            instance.fixedSelectionRatioProperty().bindBidirectional(this.obsrv2FixedSelectionRatio);
        if (this.bound1Node)
            instance.nodeProperty().bind(this.obsrv1Node);
        if (this.bound2Node)
            instance.nodeProperty().bindBidirectional(this.obsrv2Node);
        if (this.bound1SelectionActive)
            instance.selectionActiveProperty().bind(this.obsrv1SelectionActive);
        if (this.bound2SelectionActive)
            instance.selectionActiveProperty().bindBidirectional(this.obsrv2SelectionActive);
        if (this.bound1SelectionActivityExplicitlyManaged)
            instance.selectionActivityExplicitlyManagedProperty().bind(this.obsrv1SelectionActivityExplicitlyManaged);
        if (this.bound2SelectionActivityExplicitlyManaged)
            instance.selectionActivityExplicitlyManagedProperty().bindBidirectional(this.obsrv2SelectionActivityExplicitlyManaged);
        if (this.bound1SelectionChanging)
            instance.selectionChangingProperty().bind(this.obsrv1SelectionChanging);
        if (this.bound2SelectionChanging)
            instance.selectionChangingProperty().bindBidirectional(this.obsrv2SelectionChanging);
        if (this.bound1Selection)
            instance.selectionProperty().bind(this.obsrv1Selection);
        if (this.bound2Selection)
            instance.selectionProperty().bindBidirectional(this.obsrv2Selection);
        if (this.bound1SelectionRatioFixed)
            instance.selectionRatioFixedProperty().bind(this.obsrv1SelectionRatioFixed);
        if (this.bound2SelectionRatioFixed)
            instance.selectionRatioFixedProperty().bindBidirectional(this.obsrv2SelectionRatioFixed);
    }

    /**
     * 設定屬性{@link SnapshotView#setFixedSelectionRatio(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B fixedSelectionRatio(double value)
    {
        this.hasFixedSelectionRatio = true;
        this.valFixedSelectionRatio = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SnapshotView#setNode(javafx.scene.Node)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B node(javafx.scene.Node value)
    {
        this.hasNode = true;
        this.valNode = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SnapshotView#setSelection(javafx.geometry.Rectangle2D)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B selection(javafx.geometry.Rectangle2D value)
    {
        this.hasSelection = true;
        this.valSelection = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SnapshotView#setSelectionActive(boolean)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B selectionActive(boolean value)
    {
        this.hasSelectionActive = true;
        this.valSelectionActive = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SnapshotView#setSelectionActivityExplicitlyManaged(boolean)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B selectionActivityExplicitlyManaged(boolean value)
    {
        this.hasSelectionActivityExplicitlyManaged = true;
        this.valSelectionActivityExplicitlyManaged = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SnapshotView#setSelectionRatioFixed(boolean)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B selectionRatioFixed(boolean value)
    {
        this.hasSelectionRatioFixed = true;
        this.valSelectionRatioFixed = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SnapshotView#fixedSelectionRatioProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindFixedSelectionRatio(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1FixedSelectionRatio = true;
        this.obsrv1FixedSelectionRatio = source;
        this.bound2FixedSelectionRatio = false;
        this.obsrv2FixedSelectionRatio = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link SnapshotView#fixedSelectionRatioProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalFixedSelectionRatio(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1FixedSelectionRatio = false;
        this.obsrv1FixedSelectionRatio = null;
        this.bound2FixedSelectionRatio = true;
        this.obsrv2FixedSelectionRatio = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link SnapshotView#nodeProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindNode(javafx.beans.value.ObservableValue<? extends javafx.scene.Node> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Node = true;
        this.obsrv1Node = source;
        this.bound2Node = false;
        this.obsrv2Node = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link SnapshotView#nodeProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalNode(javafx.beans.property.Property<javafx.scene.Node> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Node = false;
        this.obsrv1Node = null;
        this.bound2Node = true;
        this.obsrv2Node = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link SnapshotView#selectionActiveProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindSelectionActive(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1SelectionActive = true;
        this.obsrv1SelectionActive = source;
        this.bound2SelectionActive = false;
        this.obsrv2SelectionActive = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link SnapshotView#selectionActiveProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalSelectionActive(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1SelectionActive = false;
        this.obsrv1SelectionActive = null;
        this.bound2SelectionActive = true;
        this.obsrv2SelectionActive = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link SnapshotView#selectionActivityExplicitlyManagedProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindSelectionActivityExplicitlyManaged(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1SelectionActivityExplicitlyManaged = true;
        this.obsrv1SelectionActivityExplicitlyManaged = source;
        this.bound2SelectionActivityExplicitlyManaged = false;
        this.obsrv2SelectionActivityExplicitlyManaged = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link SnapshotView#selectionActivityExplicitlyManagedProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalSelectionActivityExplicitlyManaged(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1SelectionActivityExplicitlyManaged = false;
        this.obsrv1SelectionActivityExplicitlyManaged = null;
        this.bound2SelectionActivityExplicitlyManaged = true;
        this.obsrv2SelectionActivityExplicitlyManaged = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link SnapshotView#selectionChangingProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindSelectionChanging(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1SelectionChanging = true;
        this.obsrv1SelectionChanging = source;
        this.bound2SelectionChanging = false;
        this.obsrv2SelectionChanging = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link SnapshotView#selectionChangingProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalSelectionChanging(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1SelectionChanging = false;
        this.obsrv1SelectionChanging = null;
        this.bound2SelectionChanging = true;
        this.obsrv2SelectionChanging = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link SnapshotView#selectionProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindSelection(javafx.beans.value.ObservableValue<? extends javafx.geometry.Rectangle2D> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Selection = true;
        this.obsrv1Selection = source;
        this.bound2Selection = false;
        this.obsrv2Selection = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link SnapshotView#selectionProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalSelection(javafx.beans.property.Property<javafx.geometry.Rectangle2D> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Selection = false;
        this.obsrv1Selection = null;
        this.bound2Selection = true;
        this.obsrv2Selection = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link SnapshotView#selectionRatioFixedProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindSelectionRatioFixed(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1SelectionRatioFixed = true;
        this.obsrv1SelectionRatioFixed = source;
        this.bound2SelectionRatioFixed = false;
        this.obsrv2SelectionRatioFixed = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link SnapshotView#selectionRatioFixedProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalSelectionRatioFixed(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1SelectionRatioFixed = false;
        this.obsrv1SelectionRatioFixed = null;
        this.bound2SelectionRatioFixed = true;
        this.obsrv2SelectionRatioFixed = source;
        return (B) this;
    }

    /**
     * 建構{@link SnapshotView}物件。
     *
     * @return 新的{@link SnapshotView}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public SnapshotView build()
    {
        SnapshotView instance = new SnapshotView();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link SnapshotView}物件。
     *
     * @return 新的{@link SnapshotView}物件實體
     */
    @SuppressWarnings("unchecked")
    public SnapshotView build(java.lang.String arg0)
    {
        SnapshotView instance = new SnapshotView(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link SnapshotView}物件。
     *
     * @return 新的{@link SnapshotView}物件實體
     */
    @SuppressWarnings("unchecked")
    public SnapshotView build(javafx.scene.Node arg0)
    {
        SnapshotView instance = new SnapshotView(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

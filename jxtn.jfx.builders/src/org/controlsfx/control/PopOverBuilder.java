// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control;

/**
 * {@link PopOver}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.0.6_20.jar
 * @param <Z> 要建構的物件型態(需繼承{@link PopOver})
 * @param <B> 建構器本身的型態(需繼承{@link PopOverBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class PopOverBuilder<Z extends PopOver, B extends PopOverBuilder<Z, B>>
        extends javafx.scene.control.PopupControlBuilder<Z, B>
        implements PopOverBuilderExt<Z, B>
{

    private boolean hasArrowIndent;
    private double valArrowIndent;

    private boolean hasArrowLocation;
    private org.controlsfx.control.PopOver.ArrowLocation valArrowLocation;

    private boolean hasArrowSize;
    private double valArrowSize;

    private boolean hasContentNode;
    private javafx.scene.Node valContentNode;

    private boolean hasCornerRadius;
    private double valCornerRadius;

    private boolean hasDetachable;
    private boolean valDetachable;

    private boolean hasDetached;
    private boolean valDetached;

    private boolean hasDetachedTitle;
    private java.lang.String valDetachedTitle;

    private boolean bound1ArrowIndent;
    private boolean bound2ArrowIndent;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1ArrowIndent;
    private javafx.beans.property.Property<Number> obsrv2ArrowIndent;

    private boolean bound1ArrowLocation;
    private boolean bound2ArrowLocation;
    private javafx.beans.value.ObservableValue<? extends org.controlsfx.control.PopOver.ArrowLocation> obsrv1ArrowLocation;
    private javafx.beans.property.Property<org.controlsfx.control.PopOver.ArrowLocation> obsrv2ArrowLocation;

    private boolean bound1ArrowSize;
    private boolean bound2ArrowSize;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1ArrowSize;
    private javafx.beans.property.Property<Number> obsrv2ArrowSize;

    private boolean bound1ContentNode;
    private boolean bound2ContentNode;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrv1ContentNode;
    private javafx.beans.property.Property<javafx.scene.Node> obsrv2ContentNode;

    private boolean bound1CornerRadius;
    private boolean bound2CornerRadius;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1CornerRadius;
    private javafx.beans.property.Property<Number> obsrv2CornerRadius;

    private boolean bound1Detachable;
    private boolean bound2Detachable;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1Detachable;
    private javafx.beans.property.Property<Boolean> obsrv2Detachable;

    private boolean bound1Detached;
    private boolean bound2Detached;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1Detached;
    private javafx.beans.property.Property<Boolean> obsrv2Detached;

    private boolean bound1DetachedTitle;
    private boolean bound2DetachedTitle;
    private javafx.beans.value.ObservableValue<? extends String> obsrv1DetachedTitle;
    private javafx.beans.property.Property<String> obsrv2DetachedTitle;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasArrowIndent)
            instance.setArrowIndent(this.valArrowIndent);
        if (this.hasArrowLocation)
            instance.setArrowLocation(this.valArrowLocation);
        if (this.hasArrowSize)
            instance.setArrowSize(this.valArrowSize);
        if (this.hasContentNode)
            instance.setContentNode(this.valContentNode);
        if (this.hasCornerRadius)
            instance.setCornerRadius(this.valCornerRadius);
        if (this.hasDetachable)
            instance.setDetachable(this.valDetachable);
        if (this.hasDetached)
            instance.setDetached(this.valDetached);
        if (this.hasDetachedTitle)
            instance.setDetachedTitle(this.valDetachedTitle);
        if (this.bound1ArrowIndent)
            instance.arrowIndentProperty().bind(this.obsrv1ArrowIndent);
        if (this.bound2ArrowIndent)
            instance.arrowIndentProperty().bindBidirectional(this.obsrv2ArrowIndent);
        if (this.bound1ArrowLocation)
            instance.arrowLocationProperty().bind(this.obsrv1ArrowLocation);
        if (this.bound2ArrowLocation)
            instance.arrowLocationProperty().bindBidirectional(this.obsrv2ArrowLocation);
        if (this.bound1ArrowSize)
            instance.arrowSizeProperty().bind(this.obsrv1ArrowSize);
        if (this.bound2ArrowSize)
            instance.arrowSizeProperty().bindBidirectional(this.obsrv2ArrowSize);
        if (this.bound1ContentNode)
            instance.contentNodeProperty().bind(this.obsrv1ContentNode);
        if (this.bound2ContentNode)
            instance.contentNodeProperty().bindBidirectional(this.obsrv2ContentNode);
        if (this.bound1CornerRadius)
            instance.cornerRadiusProperty().bind(this.obsrv1CornerRadius);
        if (this.bound2CornerRadius)
            instance.cornerRadiusProperty().bindBidirectional(this.obsrv2CornerRadius);
        if (this.bound1Detachable)
            instance.detachableProperty().bind(this.obsrv1Detachable);
        if (this.bound2Detachable)
            instance.detachableProperty().bindBidirectional(this.obsrv2Detachable);
        if (this.bound1Detached)
            instance.detachedProperty().bind(this.obsrv1Detached);
        if (this.bound2Detached)
            instance.detachedProperty().bindBidirectional(this.obsrv2Detached);
        if (this.bound1DetachedTitle)
            instance.detachedTitleProperty().bind(this.obsrv1DetachedTitle);
        if (this.bound2DetachedTitle)
            instance.detachedTitleProperty().bindBidirectional(this.obsrv2DetachedTitle);
    }

    /**
     * 設定屬性{@link PopOver#setArrowIndent(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B arrowIndent(double value)
    {
        this.hasArrowIndent = true;
        this.valArrowIndent = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link PopOver#setArrowLocation(org.controlsfx.control.PopOver.ArrowLocation)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B arrowLocation(org.controlsfx.control.PopOver.ArrowLocation value)
    {
        this.hasArrowLocation = true;
        this.valArrowLocation = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link PopOver#setArrowSize(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B arrowSize(double value)
    {
        this.hasArrowSize = true;
        this.valArrowSize = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link PopOver#setContentNode(javafx.scene.Node)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B contentNode(javafx.scene.Node value)
    {
        this.hasContentNode = true;
        this.valContentNode = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link PopOver#setCornerRadius(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B cornerRadius(double value)
    {
        this.hasCornerRadius = true;
        this.valCornerRadius = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link PopOver#setDetachable(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B detachable(boolean value)
    {
        this.hasDetachable = true;
        this.valDetachable = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link PopOver#setDetached(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B detached(boolean value)
    {
        this.hasDetached = true;
        this.valDetached = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link PopOver#setDetachedTitle(java.lang.String)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B detachedTitle(java.lang.String value)
    {
        this.hasDetachedTitle = true;
        this.valDetachedTitle = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link PopOver#arrowIndentProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindArrowIndent(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ArrowIndent = true;
        this.obsrv1ArrowIndent = source;
        this.bound2ArrowIndent = false;
        this.obsrv2ArrowIndent = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link PopOver#arrowIndentProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalArrowIndent(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ArrowIndent = false;
        this.obsrv1ArrowIndent = null;
        this.bound2ArrowIndent = true;
        this.obsrv2ArrowIndent = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link PopOver#arrowLocationProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindArrowLocation(javafx.beans.value.ObservableValue<? extends org.controlsfx.control.PopOver.ArrowLocation> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ArrowLocation = true;
        this.obsrv1ArrowLocation = source;
        this.bound2ArrowLocation = false;
        this.obsrv2ArrowLocation = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link PopOver#arrowLocationProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalArrowLocation(javafx.beans.property.Property<org.controlsfx.control.PopOver.ArrowLocation> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ArrowLocation = false;
        this.obsrv1ArrowLocation = null;
        this.bound2ArrowLocation = true;
        this.obsrv2ArrowLocation = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link PopOver#arrowSizeProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindArrowSize(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ArrowSize = true;
        this.obsrv1ArrowSize = source;
        this.bound2ArrowSize = false;
        this.obsrv2ArrowSize = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link PopOver#arrowSizeProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalArrowSize(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ArrowSize = false;
        this.obsrv1ArrowSize = null;
        this.bound2ArrowSize = true;
        this.obsrv2ArrowSize = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link PopOver#contentNodeProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindContentNode(javafx.beans.value.ObservableValue<? extends javafx.scene.Node> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ContentNode = true;
        this.obsrv1ContentNode = source;
        this.bound2ContentNode = false;
        this.obsrv2ContentNode = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link PopOver#contentNodeProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalContentNode(javafx.beans.property.Property<javafx.scene.Node> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ContentNode = false;
        this.obsrv1ContentNode = null;
        this.bound2ContentNode = true;
        this.obsrv2ContentNode = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link PopOver#cornerRadiusProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindCornerRadius(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1CornerRadius = true;
        this.obsrv1CornerRadius = source;
        this.bound2CornerRadius = false;
        this.obsrv2CornerRadius = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link PopOver#cornerRadiusProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalCornerRadius(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1CornerRadius = false;
        this.obsrv1CornerRadius = null;
        this.bound2CornerRadius = true;
        this.obsrv2CornerRadius = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link PopOver#detachableProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindDetachable(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Detachable = true;
        this.obsrv1Detachable = source;
        this.bound2Detachable = false;
        this.obsrv2Detachable = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link PopOver#detachableProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalDetachable(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Detachable = false;
        this.obsrv1Detachable = null;
        this.bound2Detachable = true;
        this.obsrv2Detachable = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link PopOver#detachedProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindDetached(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Detached = true;
        this.obsrv1Detached = source;
        this.bound2Detached = false;
        this.obsrv2Detached = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link PopOver#detachedProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalDetached(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Detached = false;
        this.obsrv1Detached = null;
        this.bound2Detached = true;
        this.obsrv2Detached = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link PopOver#detachedTitleProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindDetachedTitle(javafx.beans.value.ObservableValue<? extends String> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1DetachedTitle = true;
        this.obsrv1DetachedTitle = source;
        this.bound2DetachedTitle = false;
        this.obsrv2DetachedTitle = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link PopOver#detachedTitleProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalDetachedTitle(javafx.beans.property.Property<String> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1DetachedTitle = false;
        this.obsrv1DetachedTitle = null;
        this.bound2DetachedTitle = true;
        this.obsrv2DetachedTitle = source;
        return (B) this;
    }

    /**
     * 建構{@link PopOver}物件
     *
     * @return 新的{@link PopOver}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public PopOver build()
    {
        PopOver instance = new PopOver();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

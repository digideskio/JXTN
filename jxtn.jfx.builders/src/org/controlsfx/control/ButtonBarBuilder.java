// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control;

/**
 * {@link ButtonBar}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.0.6_20.jar
 * @param <Z> 要建構的物件型態(需繼承{@link ButtonBar})
 * @param <B> 建構器本身的型態(需繼承{@link ButtonBarBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ButtonBarBuilder<Z extends ButtonBar, B extends ButtonBarBuilder<Z, B>>
        extends javafx.scene.control.ControlBuilder<Z, B>
        implements ButtonBarBuilderExt<Z, B>
{

    private boolean hasButtonMinWidth;
    private double valButtonMinWidth;

    private boolean hasButtonOrder;
    private java.lang.String valButtonOrder;

    private boolean hasButtonUniformSize;
    private boolean valButtonUniformSize;

    private boolean hasButtons;
    private java.util.Collection<javafx.scene.control.ButtonBase> valButtons;

    private boolean bound1ButtonMinWidth;
    private boolean bound2ButtonMinWidth;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1ButtonMinWidth;
    private javafx.beans.property.Property<Number> obsrv2ButtonMinWidth;

    private boolean bound1ButtonOrder;
    private boolean bound2ButtonOrder;
    private javafx.beans.value.ObservableValue<? extends String> obsrv1ButtonOrder;
    private javafx.beans.property.Property<String> obsrv2ButtonOrder;

    private boolean bound1ButtonUniformSize;
    private boolean bound2ButtonUniformSize;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1ButtonUniformSize;
    private javafx.beans.property.Property<Boolean> obsrv2ButtonUniformSize;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasButtonMinWidth)
            instance.setButtonMinWidth(this.valButtonMinWidth);
        if (this.hasButtonOrder)
            instance.setButtonOrder(this.valButtonOrder);
        if (this.hasButtonUniformSize)
            instance.setButtonUniformSize(this.valButtonUniformSize);
        if (this.hasButtons)
            instance.getButtons().addAll(this.valButtons);
        if (this.bound1ButtonMinWidth)
            instance.buttonMinWidthProperty().bind(this.obsrv1ButtonMinWidth);
        if (this.bound2ButtonMinWidth)
            instance.buttonMinWidthProperty().bindBidirectional(this.obsrv2ButtonMinWidth);
        if (this.bound1ButtonOrder)
            instance.buttonOrderProperty().bind(this.obsrv1ButtonOrder);
        if (this.bound2ButtonOrder)
            instance.buttonOrderProperty().bindBidirectional(this.obsrv2ButtonOrder);
        if (this.bound1ButtonUniformSize)
            instance.buttonUniformSizeProperty().bind(this.obsrv1ButtonUniformSize);
        if (this.bound2ButtonUniformSize)
            instance.buttonUniformSizeProperty().bindBidirectional(this.obsrv2ButtonUniformSize);
    }

    /**
     * 設定屬性{@link ButtonBar#setButtonMinWidth(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B buttonMinWidth(double value)
    {
        this.hasButtonMinWidth = true;
        this.valButtonMinWidth = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ButtonBar#setButtonOrder(java.lang.String)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B buttonOrder(java.lang.String value)
    {
        this.hasButtonOrder = true;
        this.valButtonOrder = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ButtonBar#setButtonUniformSize(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B buttonUniformSize(boolean value)
    {
        this.hasButtonUniformSize = true;
        this.valButtonUniformSize = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link ButtonBar#getButtons}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B buttons(java.util.Collection<javafx.scene.control.ButtonBase> value)
    {
        this.hasButtons = true;
        this.valButtons = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link ButtonBar#getButtons}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B buttons(javafx.scene.control.ButtonBase... value)
    {
        this.hasButtons = true;
        this.valButtons = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link ButtonBar#getButtons}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B buttonsAdd(java.util.Collection<javafx.scene.control.ButtonBase> value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasButtons = true;
        if (this.valButtons == null)
            this.valButtons = new java.util.ArrayList<>(value.size());
        this.valButtons.addAll(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link ButtonBar#getButtons}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B buttonsAdd(javafx.scene.control.ButtonBase... value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasButtons = true;
        if (this.valButtons == null)
            this.valButtons = new java.util.ArrayList<>(value.length);
        this.valButtons.addAll(java.util.Arrays.asList(value));
        return (B) this;
    }

    /**
     * 設定屬性{@link ButtonBar#buttonMinWidthProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindButtonMinWidth(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ButtonMinWidth = true;
        this.obsrv1ButtonMinWidth = source;
        this.bound2ButtonMinWidth = false;
        this.obsrv2ButtonMinWidth = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ButtonBar#buttonMinWidthProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalButtonMinWidth(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ButtonMinWidth = false;
        this.obsrv1ButtonMinWidth = null;
        this.bound2ButtonMinWidth = true;
        this.obsrv2ButtonMinWidth = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ButtonBar#buttonOrderProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindButtonOrder(javafx.beans.value.ObservableValue<? extends String> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ButtonOrder = true;
        this.obsrv1ButtonOrder = source;
        this.bound2ButtonOrder = false;
        this.obsrv2ButtonOrder = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ButtonBar#buttonOrderProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalButtonOrder(javafx.beans.property.Property<String> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ButtonOrder = false;
        this.obsrv1ButtonOrder = null;
        this.bound2ButtonOrder = true;
        this.obsrv2ButtonOrder = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ButtonBar#buttonUniformSizeProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindButtonUniformSize(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ButtonUniformSize = true;
        this.obsrv1ButtonUniformSize = source;
        this.bound2ButtonUniformSize = false;
        this.obsrv2ButtonUniformSize = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ButtonBar#buttonUniformSizeProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalButtonUniformSize(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ButtonUniformSize = false;
        this.obsrv1ButtonUniformSize = null;
        this.bound2ButtonUniformSize = true;
        this.obsrv2ButtonUniformSize = source;
        return (B) this;
    }

    /**
     * 建構{@link ButtonBar}物件
     *
     * @return 新的{@link ButtonBar}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public ButtonBar build()
    {
        ButtonBar instance = new ButtonBar();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

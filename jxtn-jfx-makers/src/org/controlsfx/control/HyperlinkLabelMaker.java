// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control;

/**
 * {@link HyperlinkLabel}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.40.10.jar
 * @param <Z> 要建構的物件型態(需繼承{@link HyperlinkLabel})
 * @param <B> 建構器本身的型態(需繼承{@link HyperlinkLabelMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class HyperlinkLabelMaker<Z extends HyperlinkLabel, B extends HyperlinkLabelMaker<Z, B>>
        extends javafx.scene.control.ControlMaker<Z, B>
        implements HyperlinkLabelMakerExt<Z, B>
{

    private boolean hasOnAction;
    private javafx.event.EventHandler<javafx.event.ActionEvent> valOnAction;

    private boolean hasText;
    private java.lang.String valText;

    private boolean bound1OnAction;
    private boolean bound2OnAction;
    private javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.ActionEvent>> obsrv1OnAction;
    private javafx.beans.property.Property<javafx.event.EventHandler<javafx.event.ActionEvent>> obsrv2OnAction;

    private boolean bound1Text;
    private boolean bound2Text;
    private javafx.beans.value.ObservableValue<? extends String> obsrv1Text;
    private javafx.beans.property.Property<String> obsrv2Text;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasOnAction)
            instance.setOnAction(this.valOnAction);
        if (this.hasText)
            instance.setText(this.valText);
        if (this.bound1OnAction)
            instance.onActionProperty().bind(this.obsrv1OnAction);
        if (this.bound2OnAction)
            instance.onActionProperty().bindBidirectional(this.obsrv2OnAction);
        if (this.bound1Text)
            instance.textProperty().bind(this.obsrv1Text);
        if (this.bound2Text)
            instance.textProperty().bindBidirectional(this.obsrv2Text);
    }

    /**
     * 設定屬性{@link HyperlinkLabel#setOnAction(javafx.event.EventHandler)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onAction(javafx.event.EventHandler<javafx.event.ActionEvent> value)
    {
        this.hasOnAction = true;
        this.valOnAction = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link HyperlinkLabel#setText(java.lang.String)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B text(java.lang.String value)
    {
        this.hasText = true;
        this.valText = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link HyperlinkLabel#onActionProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOnAction(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.ActionEvent>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnAction = true;
        this.obsrv1OnAction = source;
        this.bound2OnAction = false;
        this.obsrv2OnAction = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link HyperlinkLabel#onActionProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalOnAction(javafx.beans.property.Property<javafx.event.EventHandler<javafx.event.ActionEvent>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnAction = false;
        this.obsrv1OnAction = null;
        this.bound2OnAction = true;
        this.obsrv2OnAction = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link HyperlinkLabel#textProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindText(javafx.beans.value.ObservableValue<? extends String> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Text = true;
        this.obsrv1Text = source;
        this.bound2Text = false;
        this.obsrv2Text = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link HyperlinkLabel#textProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalText(javafx.beans.property.Property<String> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Text = false;
        this.obsrv1Text = null;
        this.bound2Text = true;
        this.obsrv2Text = source;
        return (B) this;
    }

    /**
     * 建構{@link HyperlinkLabel}物件。
     *
     * @return 新的{@link HyperlinkLabel}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public HyperlinkLabel build()
    {
        HyperlinkLabel instance = new HyperlinkLabel();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link HyperlinkLabel}物件。
     *
     * @return 新的{@link HyperlinkLabel}物件實體
     */
    @SuppressWarnings("unchecked")
    public HyperlinkLabel build(java.lang.String arg0)
    {
        HyperlinkLabel instance = new HyperlinkLabel(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

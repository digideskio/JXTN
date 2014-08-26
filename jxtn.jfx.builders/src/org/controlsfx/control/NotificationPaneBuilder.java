// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control;

/**
 * {@link NotificationPane}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.0.6_20.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class NotificationPaneBuilder<Z extends NotificationPane, B extends NotificationPaneBuilder<Z, B>>
        extends javafx.scene.control.ControlBuilder<Z, B>
{

    protected boolean hasActions;
    protected java.util.Collection<org.controlsfx.control.action.Action> valActions;

    protected boolean hasContent;
    protected javafx.scene.Node valContent;

    protected boolean hasGraphic;
    protected javafx.scene.Node valGraphic;

    protected boolean hasOnHidden;
    protected javafx.event.EventHandler<javafx.event.Event> valOnHidden;

    protected boolean hasOnHiding;
    protected javafx.event.EventHandler<javafx.event.Event> valOnHiding;

    protected boolean hasOnShowing;
    protected javafx.event.EventHandler<javafx.event.Event> valOnShowing;

    protected boolean hasOnShown;
    protected javafx.event.EventHandler<javafx.event.Event> valOnShown;

    protected boolean hasShowFromTop;
    protected boolean valShowFromTop;

    protected boolean hasText;
    protected java.lang.String valText;

    protected boolean boundContent;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrvContent;

    protected boolean boundGraphic;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrvGraphic;

    protected boolean boundOnHidden;
    protected javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> obsrvOnHidden;

    protected boolean boundOnHiding;
    protected javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> obsrvOnHiding;

    protected boolean boundOnShowing;
    protected javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> obsrvOnShowing;

    protected boolean boundOnShown;
    protected javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> obsrvOnShown;

    protected boolean boundShowFromTop;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvShowFromTop;

    protected boolean boundText;
    protected javafx.beans.value.ObservableValue<? extends String> obsrvText;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasActions)
            instance.getActions().setAll(this.valActions);
        if (this.hasContent)
            instance.setContent(this.valContent);
        if (this.hasGraphic)
            instance.setGraphic(this.valGraphic);
        if (this.hasOnHidden)
            instance.setOnHidden(this.valOnHidden);
        if (this.hasOnHiding)
            instance.setOnHiding(this.valOnHiding);
        if (this.hasOnShowing)
            instance.setOnShowing(this.valOnShowing);
        if (this.hasOnShown)
            instance.setOnShown(this.valOnShown);
        if (this.hasShowFromTop)
            instance.setShowFromTop(this.valShowFromTop);
        if (this.hasText)
            instance.setText(this.valText);
        if (this.boundContent)
            instance.contentProperty().bind(this.obsrvContent);
        if (this.boundGraphic)
            instance.graphicProperty().bind(this.obsrvGraphic);
        if (this.boundOnHidden)
            instance.onHiddenProperty().bind(this.obsrvOnHidden);
        if (this.boundOnHiding)
            instance.onHidingProperty().bind(this.obsrvOnHiding);
        if (this.boundOnShowing)
            instance.onShowingProperty().bind(this.obsrvOnShowing);
        if (this.boundOnShown)
            instance.onShownProperty().bind(this.obsrvOnShown);
        if (this.boundShowFromTop)
            instance.showFromTopProperty().bind(this.obsrvShowFromTop);
        if (this.boundText)
            instance.textProperty().bind(this.obsrvText);
    }

    /**
     * 設定集合屬性{@link NotificationPane#getActions}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B actions(java.util.Collection<org.controlsfx.control.action.Action> value)
    {
        this.hasActions = true;
        this.valActions = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link NotificationPane#getActions}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B actions(org.controlsfx.control.action.Action... value)
    {
        this.hasActions = true;
        this.valActions = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 設定屬性{@link NotificationPane#setContent}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B content(javafx.scene.Node value)
    {
        this.hasContent = true;
        this.valContent = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link NotificationPane#setGraphic}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B graphic(javafx.scene.Node value)
    {
        this.hasGraphic = true;
        this.valGraphic = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link NotificationPane#setOnHidden}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onHidden(javafx.event.EventHandler<javafx.event.Event> value)
    {
        this.hasOnHidden = true;
        this.valOnHidden = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link NotificationPane#setOnHiding}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onHiding(javafx.event.EventHandler<javafx.event.Event> value)
    {
        this.hasOnHiding = true;
        this.valOnHiding = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link NotificationPane#setOnShowing}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onShowing(javafx.event.EventHandler<javafx.event.Event> value)
    {
        this.hasOnShowing = true;
        this.valOnShowing = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link NotificationPane#setOnShown}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onShown(javafx.event.EventHandler<javafx.event.Event> value)
    {
        this.hasOnShown = true;
        this.valOnShown = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link NotificationPane#setShowFromTop}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B showFromTop(boolean value)
    {
        this.hasShowFromTop = true;
        this.valShowFromTop = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link NotificationPane#setText}
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
     * 設定屬性{@link NotificationPane#contentProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindContent(javafx.beans.value.ObservableValue<? extends javafx.scene.Node> source)
    {
        assert (source != null);
        this.boundContent = true;
        this.obsrvContent = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link NotificationPane#graphicProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindGraphic(javafx.beans.value.ObservableValue<? extends javafx.scene.Node> source)
    {
        assert (source != null);
        this.boundGraphic = true;
        this.obsrvGraphic = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link NotificationPane#onHiddenProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindOnHidden(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> source)
    {
        assert (source != null);
        this.boundOnHidden = true;
        this.obsrvOnHidden = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link NotificationPane#onHidingProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindOnHiding(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> source)
    {
        assert (source != null);
        this.boundOnHiding = true;
        this.obsrvOnHiding = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link NotificationPane#onShowingProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindOnShowing(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> source)
    {
        assert (source != null);
        this.boundOnShowing = true;
        this.obsrvOnShowing = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link NotificationPane#onShownProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindOnShown(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> source)
    {
        assert (source != null);
        this.boundOnShown = true;
        this.obsrvOnShown = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link NotificationPane#showFromTopProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindShowFromTop(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundShowFromTop = true;
        this.obsrvShowFromTop = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link NotificationPane#textProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindText(javafx.beans.value.ObservableValue<? extends String> source)
    {
        assert (source != null);
        this.boundText = true;
        this.obsrvText = source;
        return (B) this;
    }

    /**
     * 建構{@link NotificationPane}物件
     *
     * @return 新的{@link NotificationPane}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public NotificationPane build()
    {
        NotificationPane instance = new NotificationPane();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
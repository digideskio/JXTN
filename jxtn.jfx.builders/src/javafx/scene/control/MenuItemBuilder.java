// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link MenuItem}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link MenuItem})
 * @param <B> 建構器本身的型態(需繼承{@link MenuItemBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class MenuItemBuilder<Z extends MenuItem, B extends MenuItemBuilder<Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
        implements jxtn.jfx.builders.AbstractBuilderExt<Z, B>
{

    private boolean hasAccelerator;
    private javafx.scene.input.KeyCombination valAccelerator;

    private boolean hasDisable;
    private boolean valDisable;

    private boolean hasGraphic;
    private javafx.scene.Node valGraphic;

    private boolean hasId;
    private java.lang.String valId;

    private boolean hasMnemonicParsing;
    private boolean valMnemonicParsing;

    private boolean hasOnAction;
    private javafx.event.EventHandler<javafx.event.ActionEvent> valOnAction;

    private boolean hasOnMenuValidation;
    private javafx.event.EventHandler<javafx.event.Event> valOnMenuValidation;

    private boolean hasStyle;
    private java.lang.String valStyle;

    private boolean hasStyleClass;
    private java.util.Collection<java.lang.String> valStyleClass;

    private boolean hasText;
    private java.lang.String valText;

    private boolean hasUserData;
    private java.lang.Object valUserData;

    private boolean hasVisible;
    private boolean valVisible;

    private boolean bound1Accelerator;
    private boolean bound2Accelerator;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.input.KeyCombination> obsrv1Accelerator;
    private javafx.beans.property.Property<javafx.scene.input.KeyCombination> obsrv2Accelerator;

    private boolean bound1Disable;
    private boolean bound2Disable;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1Disable;
    private javafx.beans.property.Property<Boolean> obsrv2Disable;

    private boolean bound1Graphic;
    private boolean bound2Graphic;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrv1Graphic;
    private javafx.beans.property.Property<javafx.scene.Node> obsrv2Graphic;

    private boolean bound1Id;
    private boolean bound2Id;
    private javafx.beans.value.ObservableValue<? extends String> obsrv1Id;
    private javafx.beans.property.Property<String> obsrv2Id;

    private boolean bound1MnemonicParsing;
    private boolean bound2MnemonicParsing;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1MnemonicParsing;
    private javafx.beans.property.Property<Boolean> obsrv2MnemonicParsing;

    private boolean bound1OnAction;
    private boolean bound2OnAction;
    private javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.ActionEvent>> obsrv1OnAction;
    private javafx.beans.property.Property<javafx.event.EventHandler<javafx.event.ActionEvent>> obsrv2OnAction;

    private boolean bound1OnMenuValidation;
    private boolean bound2OnMenuValidation;
    private javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> obsrv1OnMenuValidation;
    private javafx.beans.property.Property<javafx.event.EventHandler<javafx.event.Event>> obsrv2OnMenuValidation;

    private boolean bound1Style;
    private boolean bound2Style;
    private javafx.beans.value.ObservableValue<? extends String> obsrv1Style;
    private javafx.beans.property.Property<String> obsrv2Style;

    private boolean bound1Text;
    private boolean bound2Text;
    private javafx.beans.value.ObservableValue<? extends String> obsrv1Text;
    private javafx.beans.property.Property<String> obsrv2Text;

    private boolean bound1Visible;
    private boolean bound2Visible;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1Visible;
    private javafx.beans.property.Property<Boolean> obsrv2Visible;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasAccelerator)
            instance.setAccelerator(this.valAccelerator);
        if (this.hasDisable)
            instance.setDisable(this.valDisable);
        if (this.hasGraphic)
            instance.setGraphic(this.valGraphic);
        if (this.hasId)
            instance.setId(this.valId);
        if (this.hasMnemonicParsing)
            instance.setMnemonicParsing(this.valMnemonicParsing);
        if (this.hasOnAction)
            instance.setOnAction(this.valOnAction);
        if (this.hasOnMenuValidation)
            instance.setOnMenuValidation(this.valOnMenuValidation);
        if (this.hasStyle)
            instance.setStyle(this.valStyle);
        if (this.hasStyleClass)
            instance.getStyleClass().addAll(this.valStyleClass);
        if (this.hasText)
            instance.setText(this.valText);
        if (this.hasUserData)
            instance.setUserData(this.valUserData);
        if (this.hasVisible)
            instance.setVisible(this.valVisible);
        if (this.bound1Accelerator)
            instance.acceleratorProperty().bind(this.obsrv1Accelerator);
        if (this.bound2Accelerator)
            instance.acceleratorProperty().bindBidirectional(this.obsrv2Accelerator);
        if (this.bound1Disable)
            instance.disableProperty().bind(this.obsrv1Disable);
        if (this.bound2Disable)
            instance.disableProperty().bindBidirectional(this.obsrv2Disable);
        if (this.bound1Graphic)
            instance.graphicProperty().bind(this.obsrv1Graphic);
        if (this.bound2Graphic)
            instance.graphicProperty().bindBidirectional(this.obsrv2Graphic);
        if (this.bound1Id)
            instance.idProperty().bind(this.obsrv1Id);
        if (this.bound2Id)
            instance.idProperty().bindBidirectional(this.obsrv2Id);
        if (this.bound1MnemonicParsing)
            instance.mnemonicParsingProperty().bind(this.obsrv1MnemonicParsing);
        if (this.bound2MnemonicParsing)
            instance.mnemonicParsingProperty().bindBidirectional(this.obsrv2MnemonicParsing);
        if (this.bound1OnAction)
            instance.onActionProperty().bind(this.obsrv1OnAction);
        if (this.bound2OnAction)
            instance.onActionProperty().bindBidirectional(this.obsrv2OnAction);
        if (this.bound1OnMenuValidation)
            instance.onMenuValidationProperty().bind(this.obsrv1OnMenuValidation);
        if (this.bound2OnMenuValidation)
            instance.onMenuValidationProperty().bindBidirectional(this.obsrv2OnMenuValidation);
        if (this.bound1Style)
            instance.styleProperty().bind(this.obsrv1Style);
        if (this.bound2Style)
            instance.styleProperty().bindBidirectional(this.obsrv2Style);
        if (this.bound1Text)
            instance.textProperty().bind(this.obsrv1Text);
        if (this.bound2Text)
            instance.textProperty().bindBidirectional(this.obsrv2Text);
        if (this.bound1Visible)
            instance.visibleProperty().bind(this.obsrv1Visible);
        if (this.bound2Visible)
            instance.visibleProperty().bindBidirectional(this.obsrv2Visible);
    }

    /**
     * 設定屬性{@link MenuItem#setAccelerator(javafx.scene.input.KeyCombination)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B accelerator(javafx.scene.input.KeyCombination value)
    {
        this.hasAccelerator = true;
        this.valAccelerator = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MenuItem#setDisable(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B disable(boolean value)
    {
        this.hasDisable = true;
        this.valDisable = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MenuItem#setGraphic(javafx.scene.Node)}
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
     * 設定屬性{@link MenuItem#setId(java.lang.String)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B id(java.lang.String value)
    {
        this.hasId = true;
        this.valId = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MenuItem#setMnemonicParsing(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B mnemonicParsing(boolean value)
    {
        this.hasMnemonicParsing = true;
        this.valMnemonicParsing = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MenuItem#setOnAction(javafx.event.EventHandler)}
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
     * 設定屬性{@link MenuItem#setOnMenuValidation(javafx.event.EventHandler)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onMenuValidation(javafx.event.EventHandler<javafx.event.Event> value)
    {
        this.hasOnMenuValidation = true;
        this.valOnMenuValidation = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MenuItem#setStyle(java.lang.String)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B style(java.lang.String value)
    {
        this.hasStyle = true;
        this.valStyle = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link MenuItem#getStyleClass}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B styleClass(java.util.Collection<java.lang.String> value)
    {
        this.hasStyleClass = true;
        this.valStyleClass = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link MenuItem#getStyleClass}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B styleClass(java.lang.String... value)
    {
        this.hasStyleClass = true;
        this.valStyleClass = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link MenuItem#getStyleClass}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B styleClassAdd(java.util.Collection<java.lang.String> value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasStyleClass = true;
        if (this.valStyleClass == null)
            this.valStyleClass = new java.util.ArrayList<>(value.size());
        this.valStyleClass.addAll(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link MenuItem#getStyleClass}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B styleClassAdd(java.lang.String... value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasStyleClass = true;
        if (this.valStyleClass == null)
            this.valStyleClass = new java.util.ArrayList<>(value.length);
        this.valStyleClass.addAll(java.util.Arrays.asList(value));
        return (B) this;
    }

    /**
     * 設定屬性{@link MenuItem#setText(java.lang.String)}
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
     * 設定屬性{@link MenuItem#setUserData(java.lang.Object)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B userData(java.lang.Object value)
    {
        this.hasUserData = true;
        this.valUserData = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MenuItem#setVisible(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B visible(boolean value)
    {
        this.hasVisible = true;
        this.valVisible = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MenuItem#acceleratorProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindAccelerator(javafx.beans.value.ObservableValue<? extends javafx.scene.input.KeyCombination> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Accelerator = true;
        this.obsrv1Accelerator = source;
        this.bound2Accelerator = false;
        this.obsrv2Accelerator = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link MenuItem#acceleratorProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalAccelerator(javafx.beans.property.Property<javafx.scene.input.KeyCombination> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Accelerator = false;
        this.obsrv1Accelerator = null;
        this.bound2Accelerator = true;
        this.obsrv2Accelerator = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link MenuItem#disableProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindDisable(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Disable = true;
        this.obsrv1Disable = source;
        this.bound2Disable = false;
        this.obsrv2Disable = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link MenuItem#disableProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalDisable(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Disable = false;
        this.obsrv1Disable = null;
        this.bound2Disable = true;
        this.obsrv2Disable = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link MenuItem#graphicProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindGraphic(javafx.beans.value.ObservableValue<? extends javafx.scene.Node> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Graphic = true;
        this.obsrv1Graphic = source;
        this.bound2Graphic = false;
        this.obsrv2Graphic = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link MenuItem#graphicProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalGraphic(javafx.beans.property.Property<javafx.scene.Node> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Graphic = false;
        this.obsrv1Graphic = null;
        this.bound2Graphic = true;
        this.obsrv2Graphic = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link MenuItem#idProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindId(javafx.beans.value.ObservableValue<? extends String> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Id = true;
        this.obsrv1Id = source;
        this.bound2Id = false;
        this.obsrv2Id = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link MenuItem#idProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalId(javafx.beans.property.Property<String> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Id = false;
        this.obsrv1Id = null;
        this.bound2Id = true;
        this.obsrv2Id = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link MenuItem#mnemonicParsingProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindMnemonicParsing(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1MnemonicParsing = true;
        this.obsrv1MnemonicParsing = source;
        this.bound2MnemonicParsing = false;
        this.obsrv2MnemonicParsing = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link MenuItem#mnemonicParsingProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalMnemonicParsing(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1MnemonicParsing = false;
        this.obsrv1MnemonicParsing = null;
        this.bound2MnemonicParsing = true;
        this.obsrv2MnemonicParsing = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link MenuItem#onActionProperty}的連結
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
     * 設定屬性{@link MenuItem#onActionProperty}的雙向連結
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
     * 設定屬性{@link MenuItem#onMenuValidationProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOnMenuValidation(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnMenuValidation = true;
        this.obsrv1OnMenuValidation = source;
        this.bound2OnMenuValidation = false;
        this.obsrv2OnMenuValidation = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link MenuItem#onMenuValidationProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalOnMenuValidation(javafx.beans.property.Property<javafx.event.EventHandler<javafx.event.Event>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnMenuValidation = false;
        this.obsrv1OnMenuValidation = null;
        this.bound2OnMenuValidation = true;
        this.obsrv2OnMenuValidation = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link MenuItem#styleProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindStyle(javafx.beans.value.ObservableValue<? extends String> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Style = true;
        this.obsrv1Style = source;
        this.bound2Style = false;
        this.obsrv2Style = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link MenuItem#styleProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalStyle(javafx.beans.property.Property<String> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Style = false;
        this.obsrv1Style = null;
        this.bound2Style = true;
        this.obsrv2Style = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link MenuItem#textProperty}的連結
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
     * 設定屬性{@link MenuItem#textProperty}的雙向連結
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
     * 設定屬性{@link MenuItem#visibleProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindVisible(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Visible = true;
        this.obsrv1Visible = source;
        this.bound2Visible = false;
        this.obsrv2Visible = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link MenuItem#visibleProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalVisible(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Visible = false;
        this.obsrv1Visible = null;
        this.bound2Visible = true;
        this.obsrv2Visible = source;
        return (B) this;
    }

    /**
     * 建構{@link MenuItem}物件
     *
     * @return 新的{@link MenuItem}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public MenuItem build()
    {
        MenuItem instance = new MenuItem();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

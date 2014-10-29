// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link TextInputControl}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link TextInputControl})
 * @param <B> 建構器本身的型態(需繼承{@link TextInputControlBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class TextInputControlBuilder<Z extends TextInputControl, B extends TextInputControlBuilder<Z, B>>
        extends javafx.scene.control.ControlBuilder<Z, B>
        implements TextInputControlBuilderExt<Z, B>
{

    private boolean hasEditable;
    private boolean valEditable;

    private boolean hasFont;
    private javafx.scene.text.Font valFont;

    private boolean hasPromptText;
    private java.lang.String valPromptText;

    private boolean hasText;
    private java.lang.String valText;

    private boolean bound1Editable;
    private boolean bound2Editable;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1Editable;
    private javafx.beans.property.Property<Boolean> obsrv2Editable;

    private boolean bound1Font;
    private boolean bound2Font;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.text.Font> obsrv1Font;
    private javafx.beans.property.Property<javafx.scene.text.Font> obsrv2Font;

    private boolean bound1PromptText;
    private boolean bound2PromptText;
    private javafx.beans.value.ObservableValue<? extends String> obsrv1PromptText;
    private javafx.beans.property.Property<String> obsrv2PromptText;

    private boolean bound1Text;
    private boolean bound2Text;
    private javafx.beans.value.ObservableValue<? extends String> obsrv1Text;
    private javafx.beans.property.Property<String> obsrv2Text;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasEditable)
            instance.setEditable(this.valEditable);
        if (this.hasFont)
            instance.setFont(this.valFont);
        if (this.hasPromptText)
            instance.setPromptText(this.valPromptText);
        if (this.hasText)
            instance.setText(this.valText);
        if (this.bound1Editable)
            instance.editableProperty().bind(this.obsrv1Editable);
        if (this.bound2Editable)
            instance.editableProperty().bindBidirectional(this.obsrv2Editable);
        if (this.bound1Font)
            instance.fontProperty().bind(this.obsrv1Font);
        if (this.bound2Font)
            instance.fontProperty().bindBidirectional(this.obsrv2Font);
        if (this.bound1PromptText)
            instance.promptTextProperty().bind(this.obsrv1PromptText);
        if (this.bound2PromptText)
            instance.promptTextProperty().bindBidirectional(this.obsrv2PromptText);
        if (this.bound1Text)
            instance.textProperty().bind(this.obsrv1Text);
        if (this.bound2Text)
            instance.textProperty().bindBidirectional(this.obsrv2Text);
    }

    /**
     * 設定屬性{@link TextInputControl#setEditable(boolean)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B editable(boolean value)
    {
        this.hasEditable = true;
        this.valEditable = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TextInputControl#setFont(javafx.scene.text.Font)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B font(javafx.scene.text.Font value)
    {
        this.hasFont = true;
        this.valFont = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TextInputControl#setPromptText(java.lang.String)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B promptText(java.lang.String value)
    {
        this.hasPromptText = true;
        this.valPromptText = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TextInputControl#setText(java.lang.String)}。
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
     * 設定屬性{@link TextInputControl#editableProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindEditable(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Editable = true;
        this.obsrv1Editable = source;
        this.bound2Editable = false;
        this.obsrv2Editable = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link TextInputControl#editableProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalEditable(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Editable = false;
        this.obsrv1Editable = null;
        this.bound2Editable = true;
        this.obsrv2Editable = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TextInputControl#fontProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindFont(javafx.beans.value.ObservableValue<? extends javafx.scene.text.Font> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Font = true;
        this.obsrv1Font = source;
        this.bound2Font = false;
        this.obsrv2Font = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link TextInputControl#fontProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalFont(javafx.beans.property.Property<javafx.scene.text.Font> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Font = false;
        this.obsrv1Font = null;
        this.bound2Font = true;
        this.obsrv2Font = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TextInputControl#promptTextProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindPromptText(javafx.beans.value.ObservableValue<? extends String> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1PromptText = true;
        this.obsrv1PromptText = source;
        this.bound2PromptText = false;
        this.obsrv2PromptText = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link TextInputControl#promptTextProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalPromptText(javafx.beans.property.Property<String> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1PromptText = false;
        this.obsrv1PromptText = null;
        this.bound2PromptText = true;
        this.obsrv2PromptText = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TextInputControl#textProperty}的連結。
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
     * 設定屬性{@link TextInputControl#textProperty}的雙向連結。
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
}

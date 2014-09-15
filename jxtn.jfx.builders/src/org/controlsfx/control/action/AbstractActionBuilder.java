// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control.action;

/**
 * {@link AbstractAction}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.0.6_20.jar
 * @param <Z> 要建構的物件型態(需繼承{@link AbstractAction})
 * @param <B> 建構器本身的型態(需繼承{@link AbstractActionBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class AbstractActionBuilder<Z extends AbstractAction, B extends AbstractActionBuilder<Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
        implements jxtn.jfx.builders.AbstractBuilderExt<Z, B>
{

    private boolean hasAccelerator;
    private javafx.scene.input.KeyCombination valAccelerator;

    private boolean hasDisabled;
    private boolean valDisabled;

    private boolean hasGraphic;
    private javafx.scene.Node valGraphic;

    private boolean hasLongText;
    private java.lang.String valLongText;

    private boolean hasText;
    private java.lang.String valText;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasAccelerator)
            instance.setAccelerator(this.valAccelerator);
        if (this.hasDisabled)
            instance.setDisabled(this.valDisabled);
        if (this.hasGraphic)
            instance.setGraphic(this.valGraphic);
        if (this.hasLongText)
            instance.setLongText(this.valLongText);
        if (this.hasText)
            instance.setText(this.valText);
    }

    /**
     * 設定屬性{@link AbstractAction#setAccelerator(javafx.scene.input.KeyCombination)}
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
     * 設定屬性{@link AbstractAction#setDisabled(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B disabled(boolean value)
    {
        this.hasDisabled = true;
        this.valDisabled = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link AbstractAction#setGraphic(javafx.scene.Node)}
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
     * 設定屬性{@link AbstractAction#setLongText(java.lang.String)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B longText(java.lang.String value)
    {
        this.hasLongText = true;
        this.valLongText = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link AbstractAction#setText(java.lang.String)}
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
}

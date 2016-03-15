// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.property;

/**
 * {@link BeanProperty}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.40.10.jar
 * @param <Z> 要建構的物件型態(需繼承{@link BeanProperty})
 * @param <B> 建構器本身的型態(需繼承{@link BeanPropertyMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class BeanPropertyMaker<Z extends BeanProperty, B extends BeanPropertyMaker<Z, B>>
        extends jxtn.jfx.makers.AbstractMaker<Z, B>
        implements BeanPropertyMakerExt<Z, B>
{

    private boolean hasEditable;
    private boolean valEditable;

    private boolean hasValue;
    private java.lang.Object valValue;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasEditable)
            instance.setEditable(this.valEditable);
        if (this.hasValue)
            instance.setValue(this.valValue);
    }

    /**
     * 設定屬性{@link BeanProperty#setEditable(boolean)}。
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
     * 設定屬性{@link BeanProperty#setValue(java.lang.Object)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B value(java.lang.Object value)
    {
        this.hasValue = true;
        this.valValue = value;
        return (B) this;
    }

    /**
     * 建構{@link BeanProperty}物件。
     *
     * @return 新的{@link BeanProperty}物件實體
     */
    @SuppressWarnings("unchecked")
    public BeanProperty build(java.lang.Object arg0, java.beans.PropertyDescriptor arg1)
    {
        BeanProperty instance = new BeanProperty(arg0, arg1);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

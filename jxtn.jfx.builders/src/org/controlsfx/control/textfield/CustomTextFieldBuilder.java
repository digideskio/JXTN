// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control.textfield;

/**
 * {@link CustomTextField}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.0.6_20.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class CustomTextFieldBuilder<Z extends CustomTextField, B extends CustomTextFieldBuilder<Z, B>>
        extends javafx.scene.control.TextFieldBuilder<Z, B>
{

    protected boolean hasLeft;
    protected javafx.scene.Node valLeft;

    protected boolean hasRight;
    protected javafx.scene.Node valRight;

    protected boolean boundLeft;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrvLeft;

    protected boolean boundRight;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrvRight;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasLeft)
            instance.setLeft(this.valLeft);
        if (this.hasRight)
            instance.setRight(this.valRight);
        if (this.boundLeft)
            instance.leftProperty().bind(this.obsrvLeft);
        if (this.boundRight)
            instance.rightProperty().bind(this.obsrvRight);
    }

    /**
     * 設定屬性{@link CustomTextField#setLeft}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B left(javafx.scene.Node value)
    {
        this.hasLeft = true;
        this.valLeft = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link CustomTextField#setRight}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B right(javafx.scene.Node value)
    {
        this.hasRight = true;
        this.valRight = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link CustomTextField#leftProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindLeft(javafx.beans.value.ObservableValue<? extends javafx.scene.Node> source)
    {
        assert (source != null);
        this.boundLeft = true;
        this.obsrvLeft = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link CustomTextField#rightProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindRight(javafx.beans.value.ObservableValue<? extends javafx.scene.Node> source)
    {
        assert (source != null);
        this.boundRight = true;
        this.obsrvRight = source;
        return (B) this;
    }

    /**
     * 建構{@link CustomTextField}物件
     *
     * @return 新的{@link CustomTextField}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public CustomTextField build()
    {
        CustomTextField instance = new CustomTextField();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
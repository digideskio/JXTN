// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control.textfield;

/**
 * {@link CustomPasswordField}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.0.6_20.jar
 * @param <Z> 要建構的物件型態(需繼承{@link CustomPasswordField})
 * @param <B> 建構器本身的型態(需繼承{@link CustomPasswordFieldBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class CustomPasswordFieldBuilder<Z extends CustomPasswordField, B extends CustomPasswordFieldBuilder<Z, B>>
        extends javafx.scene.control.PasswordFieldBuilder<Z, B>
        implements CustomPasswordFieldBuilderExt<Z, B>
{

    private boolean hasLeft;
    private javafx.scene.Node valLeft;

    private boolean hasRight;
    private javafx.scene.Node valRight;

    private boolean bound1Left;
    private boolean bound2Left;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrv1Left;
    private javafx.beans.property.Property<javafx.scene.Node> obsrv2Left;

    private boolean bound1Right;
    private boolean bound2Right;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrv1Right;
    private javafx.beans.property.Property<javafx.scene.Node> obsrv2Right;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasLeft)
            instance.setLeft(this.valLeft);
        if (this.hasRight)
            instance.setRight(this.valRight);
        if (this.bound1Left)
            instance.leftProperty().bind(this.obsrv1Left);
        if (this.bound2Left)
            instance.leftProperty().bindBidirectional(this.obsrv2Left);
        if (this.bound1Right)
            instance.rightProperty().bind(this.obsrv1Right);
        if (this.bound2Right)
            instance.rightProperty().bindBidirectional(this.obsrv2Right);
    }

    /**
     * 設定屬性{@link CustomPasswordField#setLeft(javafx.scene.Node)}
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
     * 設定屬性{@link CustomPasswordField#setRight(javafx.scene.Node)}
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
     * 設定屬性{@link CustomPasswordField#leftProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindLeft(javafx.beans.value.ObservableValue<? extends javafx.scene.Node> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Left = true;
        this.obsrv1Left = source;
        this.bound2Left = false;
        this.obsrv2Left = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link CustomPasswordField#leftProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalLeft(javafx.beans.property.Property<javafx.scene.Node> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Left = false;
        this.obsrv1Left = null;
        this.bound2Left = true;
        this.obsrv2Left = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link CustomPasswordField#rightProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindRight(javafx.beans.value.ObservableValue<? extends javafx.scene.Node> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Right = true;
        this.obsrv1Right = source;
        this.bound2Right = false;
        this.obsrv2Right = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link CustomPasswordField#rightProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalRight(javafx.beans.property.Property<javafx.scene.Node> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Right = false;
        this.obsrv1Right = null;
        this.bound2Right = true;
        this.obsrv2Right = source;
        return (B) this;
    }

    /**
     * 建構{@link CustomPasswordField}物件
     *
     * @return 新的{@link CustomPasswordField}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public CustomPasswordField build()
    {
        CustomPasswordField instance = new CustomPasswordField();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

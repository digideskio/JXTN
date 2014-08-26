// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control;

/**
 * {@link HiddenSidesPane}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.0.6_20.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class HiddenSidesPaneBuilder<Z extends HiddenSidesPane, B extends HiddenSidesPaneBuilder<Z, B>>
        extends javafx.scene.control.ControlBuilder<Z, B>
{

    protected boolean hasBottom;
    protected javafx.scene.Node valBottom;

    protected boolean hasContent;
    protected javafx.scene.Node valContent;

    protected boolean hasLeft;
    protected javafx.scene.Node valLeft;

    protected boolean hasPinnedSide;
    protected javafx.geometry.Side valPinnedSide;

    protected boolean hasRight;
    protected javafx.scene.Node valRight;

    protected boolean hasTop;
    protected javafx.scene.Node valTop;

    protected boolean hasTriggerDistance;
    protected double valTriggerDistance;

    protected boolean boundBottom;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrvBottom;

    protected boolean boundContent;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrvContent;

    protected boolean boundLeft;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrvLeft;

    protected boolean boundPinnedSide;
    protected javafx.beans.value.ObservableValue<? extends javafx.geometry.Side> obsrvPinnedSide;

    protected boolean boundRight;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrvRight;

    protected boolean boundTop;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrvTop;

    protected boolean boundTriggerDistance;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvTriggerDistance;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasBottom)
            instance.setBottom(this.valBottom);
        if (this.hasContent)
            instance.setContent(this.valContent);
        if (this.hasLeft)
            instance.setLeft(this.valLeft);
        if (this.hasPinnedSide)
            instance.setPinnedSide(this.valPinnedSide);
        if (this.hasRight)
            instance.setRight(this.valRight);
        if (this.hasTop)
            instance.setTop(this.valTop);
        if (this.hasTriggerDistance)
            instance.setTriggerDistance(this.valTriggerDistance);
        if (this.boundBottom)
            instance.bottomProperty().bind(this.obsrvBottom);
        if (this.boundContent)
            instance.contentProperty().bind(this.obsrvContent);
        if (this.boundLeft)
            instance.leftProperty().bind(this.obsrvLeft);
        if (this.boundPinnedSide)
            instance.pinnedSideProperty().bind(this.obsrvPinnedSide);
        if (this.boundRight)
            instance.rightProperty().bind(this.obsrvRight);
        if (this.boundTop)
            instance.topProperty().bind(this.obsrvTop);
        if (this.boundTriggerDistance)
            instance.triggerDistanceProperty().bind(this.obsrvTriggerDistance);
    }

    /**
     * 設定屬性{@link HiddenSidesPane#setBottom}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bottom(javafx.scene.Node value)
    {
        this.hasBottom = true;
        this.valBottom = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link HiddenSidesPane#setContent}
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
     * 設定屬性{@link HiddenSidesPane#setLeft}
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
     * 設定屬性{@link HiddenSidesPane#setPinnedSide}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B pinnedSide(javafx.geometry.Side value)
    {
        this.hasPinnedSide = true;
        this.valPinnedSide = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link HiddenSidesPane#setRight}
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
     * 設定屬性{@link HiddenSidesPane#setTop}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B top(javafx.scene.Node value)
    {
        this.hasTop = true;
        this.valTop = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link HiddenSidesPane#setTriggerDistance}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B triggerDistance(double value)
    {
        this.hasTriggerDistance = true;
        this.valTriggerDistance = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link HiddenSidesPane#bottomProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindBottom(javafx.beans.value.ObservableValue<? extends javafx.scene.Node> source)
    {
        assert (source != null);
        this.boundBottom = true;
        this.obsrvBottom = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link HiddenSidesPane#contentProperty}的連結
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
     * 設定屬性{@link HiddenSidesPane#leftProperty}的連結
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
     * 設定屬性{@link HiddenSidesPane#pinnedSideProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindPinnedSide(javafx.beans.value.ObservableValue<? extends javafx.geometry.Side> source)
    {
        assert (source != null);
        this.boundPinnedSide = true;
        this.obsrvPinnedSide = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link HiddenSidesPane#rightProperty}的連結
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
     * 設定屬性{@link HiddenSidesPane#topProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindTop(javafx.beans.value.ObservableValue<? extends javafx.scene.Node> source)
    {
        assert (source != null);
        this.boundTop = true;
        this.obsrvTop = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link HiddenSidesPane#triggerDistanceProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindTriggerDistance(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundTriggerDistance = true;
        this.obsrvTriggerDistance = source;
        return (B) this;
    }

    /**
     * 建構{@link HiddenSidesPane}物件
     *
     * @return 新的{@link HiddenSidesPane}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public HiddenSidesPane build()
    {
        HiddenSidesPane instance = new HiddenSidesPane();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
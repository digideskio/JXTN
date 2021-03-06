// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control;

/**
 * {@link Rating}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.40.10.jar
 * @param <Z> 要建構的物件型態(需繼承{@link Rating})
 * @param <B> 建構器本身的型態(需繼承{@link RatingMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class RatingMaker<Z extends Rating, B extends RatingMaker<Z, B>>
        extends javafx.scene.control.ControlMaker<Z, B>
        implements RatingMakerExt<Z, B>
{

    private boolean hasMax;
    private int valMax;

    private boolean hasOrientation;
    private javafx.geometry.Orientation valOrientation;

    private boolean hasPartialRating;
    private boolean valPartialRating;

    private boolean hasRating;
    private double valRating;

    private boolean hasUpdateOnHover;
    private boolean valUpdateOnHover;

    private boolean bound1Max;
    private boolean bound2Max;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Max;
    private javafx.beans.property.Property<Number> obsrv2Max;

    private boolean bound1Orientation;
    private boolean bound2Orientation;
    private javafx.beans.value.ObservableValue<? extends javafx.geometry.Orientation> obsrv1Orientation;
    private javafx.beans.property.Property<javafx.geometry.Orientation> obsrv2Orientation;

    private boolean bound1PartialRating;
    private boolean bound2PartialRating;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1PartialRating;
    private javafx.beans.property.Property<Boolean> obsrv2PartialRating;

    private boolean bound1Rating;
    private boolean bound2Rating;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Rating;
    private javafx.beans.property.Property<Number> obsrv2Rating;

    private boolean bound1UpdateOnHover;
    private boolean bound2UpdateOnHover;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1UpdateOnHover;
    private javafx.beans.property.Property<Boolean> obsrv2UpdateOnHover;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasMax)
            instance.setMax(this.valMax);
        if (this.hasOrientation)
            instance.setOrientation(this.valOrientation);
        if (this.hasPartialRating)
            instance.setPartialRating(this.valPartialRating);
        if (this.hasRating)
            instance.setRating(this.valRating);
        if (this.hasUpdateOnHover)
            instance.setUpdateOnHover(this.valUpdateOnHover);
        if (this.bound1Max)
            instance.maxProperty().bind(this.obsrv1Max);
        if (this.bound2Max)
            instance.maxProperty().bindBidirectional(this.obsrv2Max);
        if (this.bound1Orientation)
            instance.orientationProperty().bind(this.obsrv1Orientation);
        if (this.bound2Orientation)
            instance.orientationProperty().bindBidirectional(this.obsrv2Orientation);
        if (this.bound1PartialRating)
            instance.partialRatingProperty().bind(this.obsrv1PartialRating);
        if (this.bound2PartialRating)
            instance.partialRatingProperty().bindBidirectional(this.obsrv2PartialRating);
        if (this.bound1Rating)
            instance.ratingProperty().bind(this.obsrv1Rating);
        if (this.bound2Rating)
            instance.ratingProperty().bindBidirectional(this.obsrv2Rating);
        if (this.bound1UpdateOnHover)
            instance.updateOnHoverProperty().bind(this.obsrv1UpdateOnHover);
        if (this.bound2UpdateOnHover)
            instance.updateOnHoverProperty().bindBidirectional(this.obsrv2UpdateOnHover);
    }

    /**
     * 設定屬性{@link Rating#setMax(int)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B max(int value)
    {
        this.hasMax = true;
        this.valMax = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Rating#setOrientation(javafx.geometry.Orientation)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B orientation(javafx.geometry.Orientation value)
    {
        this.hasOrientation = true;
        this.valOrientation = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Rating#setPartialRating(boolean)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B partialRating(boolean value)
    {
        this.hasPartialRating = true;
        this.valPartialRating = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Rating#setRating(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B rating(double value)
    {
        this.hasRating = true;
        this.valRating = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Rating#setUpdateOnHover(boolean)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B updateOnHover(boolean value)
    {
        this.hasUpdateOnHover = true;
        this.valUpdateOnHover = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Rating#maxProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindMax(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Max = true;
        this.obsrv1Max = source;
        this.bound2Max = false;
        this.obsrv2Max = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Rating#maxProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalMax(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Max = false;
        this.obsrv1Max = null;
        this.bound2Max = true;
        this.obsrv2Max = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Rating#orientationProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOrientation(javafx.beans.value.ObservableValue<? extends javafx.geometry.Orientation> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Orientation = true;
        this.obsrv1Orientation = source;
        this.bound2Orientation = false;
        this.obsrv2Orientation = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Rating#orientationProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalOrientation(javafx.beans.property.Property<javafx.geometry.Orientation> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Orientation = false;
        this.obsrv1Orientation = null;
        this.bound2Orientation = true;
        this.obsrv2Orientation = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Rating#partialRatingProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindPartialRating(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1PartialRating = true;
        this.obsrv1PartialRating = source;
        this.bound2PartialRating = false;
        this.obsrv2PartialRating = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Rating#partialRatingProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalPartialRating(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1PartialRating = false;
        this.obsrv1PartialRating = null;
        this.bound2PartialRating = true;
        this.obsrv2PartialRating = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Rating#ratingProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindRating(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Rating = true;
        this.obsrv1Rating = source;
        this.bound2Rating = false;
        this.obsrv2Rating = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Rating#ratingProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalRating(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Rating = false;
        this.obsrv1Rating = null;
        this.bound2Rating = true;
        this.obsrv2Rating = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Rating#updateOnHoverProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindUpdateOnHover(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1UpdateOnHover = true;
        this.obsrv1UpdateOnHover = source;
        this.bound2UpdateOnHover = false;
        this.obsrv2UpdateOnHover = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Rating#updateOnHoverProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalUpdateOnHover(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1UpdateOnHover = false;
        this.obsrv1UpdateOnHover = null;
        this.bound2UpdateOnHover = true;
        this.obsrv2UpdateOnHover = source;
        return (B) this;
    }

    /**
     * 建構{@link Rating}物件。
     *
     * @return 新的{@link Rating}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Rating build()
    {
        Rating instance = new Rating();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link Rating}物件。
     *
     * @return 新的{@link Rating}物件實體
     */
    @SuppressWarnings("unchecked")
    public Rating build(int arg0)
    {
        Rating instance = new Rating(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link Rating}物件。
     *
     * @return 新的{@link Rating}物件實體
     */
    @SuppressWarnings("unchecked")
    public Rating build(int arg0, int arg1)
    {
        Rating instance = new Rating(arg0, arg1);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

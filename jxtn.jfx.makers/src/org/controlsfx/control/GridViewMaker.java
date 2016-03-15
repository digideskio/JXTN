// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control;

/**
 * {@link GridView}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.40.10.jar
 * @param <Z> 要建構的物件型態(需繼承{@link GridView})
 * @param <B> 建構器本身的型態(需繼承{@link GridViewMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class GridViewMaker<T extends java.lang.Object, Z extends GridView<T>, B extends GridViewMaker<T, Z, B>>
        extends javafx.scene.control.ControlMaker<Z, B>
        implements GridViewMakerExt<T, Z, B>
{

    private boolean hasCellFactory;
    private javafx.util.Callback<org.controlsfx.control.GridView<T>, org.controlsfx.control.GridCell<T>> valCellFactory;

    private boolean hasCellHeight;
    private double valCellHeight;

    private boolean hasCellWidth;
    private double valCellWidth;

    private boolean hasHorizontalCellSpacing;
    private double valHorizontalCellSpacing;

    private boolean hasItems;
    private javafx.collections.ObservableList<T> valItems;

    private boolean hasVerticalCellSpacing;
    private double valVerticalCellSpacing;

    private boolean bound1CellFactory;
    private boolean bound2CellFactory;
    private javafx.beans.value.ObservableValue<? extends javafx.util.Callback<org.controlsfx.control.GridView<T>, org.controlsfx.control.GridCell<T>>> obsrv1CellFactory;
    private javafx.beans.property.Property<javafx.util.Callback<org.controlsfx.control.GridView<T>, org.controlsfx.control.GridCell<T>>> obsrv2CellFactory;

    private boolean bound1CellHeight;
    private boolean bound2CellHeight;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1CellHeight;
    private javafx.beans.property.Property<Number> obsrv2CellHeight;

    private boolean bound1CellWidth;
    private boolean bound2CellWidth;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1CellWidth;
    private javafx.beans.property.Property<Number> obsrv2CellWidth;

    private boolean bound1HorizontalCellSpacing;
    private boolean bound2HorizontalCellSpacing;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1HorizontalCellSpacing;
    private javafx.beans.property.Property<Number> obsrv2HorizontalCellSpacing;

    private boolean bound1Items;
    private boolean bound2Items;
    private javafx.beans.value.ObservableValue<? extends javafx.collections.ObservableList<T>> obsrv1Items;
    private javafx.beans.property.Property<javafx.collections.ObservableList<T>> obsrv2Items;

    private boolean bound1VerticalCellSpacing;
    private boolean bound2VerticalCellSpacing;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1VerticalCellSpacing;
    private javafx.beans.property.Property<Number> obsrv2VerticalCellSpacing;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasCellFactory)
            instance.setCellFactory(this.valCellFactory);
        if (this.hasCellHeight)
            instance.setCellHeight(this.valCellHeight);
        if (this.hasCellWidth)
            instance.setCellWidth(this.valCellWidth);
        if (this.hasHorizontalCellSpacing)
            instance.setHorizontalCellSpacing(this.valHorizontalCellSpacing);
        if (this.hasItems)
            instance.setItems(this.valItems);
        if (this.hasVerticalCellSpacing)
            instance.setVerticalCellSpacing(this.valVerticalCellSpacing);
        if (this.bound1CellFactory)
            instance.cellFactoryProperty().bind(this.obsrv1CellFactory);
        if (this.bound2CellFactory)
            instance.cellFactoryProperty().bindBidirectional(this.obsrv2CellFactory);
        if (this.bound1CellHeight)
            instance.cellHeightProperty().bind(this.obsrv1CellHeight);
        if (this.bound2CellHeight)
            instance.cellHeightProperty().bindBidirectional(this.obsrv2CellHeight);
        if (this.bound1CellWidth)
            instance.cellWidthProperty().bind(this.obsrv1CellWidth);
        if (this.bound2CellWidth)
            instance.cellWidthProperty().bindBidirectional(this.obsrv2CellWidth);
        if (this.bound1HorizontalCellSpacing)
            instance.horizontalCellSpacingProperty().bind(this.obsrv1HorizontalCellSpacing);
        if (this.bound2HorizontalCellSpacing)
            instance.horizontalCellSpacingProperty().bindBidirectional(this.obsrv2HorizontalCellSpacing);
        if (this.bound1Items)
            instance.itemsProperty().bind(this.obsrv1Items);
        if (this.bound2Items)
            instance.itemsProperty().bindBidirectional(this.obsrv2Items);
        if (this.bound1VerticalCellSpacing)
            instance.verticalCellSpacingProperty().bind(this.obsrv1VerticalCellSpacing);
        if (this.bound2VerticalCellSpacing)
            instance.verticalCellSpacingProperty().bindBidirectional(this.obsrv2VerticalCellSpacing);
    }

    /**
     * 設定屬性{@link GridView#setCellFactory(javafx.util.Callback)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B cellFactory(javafx.util.Callback<org.controlsfx.control.GridView<T>, org.controlsfx.control.GridCell<T>> value)
    {
        this.hasCellFactory = true;
        this.valCellFactory = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link GridView#setCellHeight(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B cellHeight(double value)
    {
        this.hasCellHeight = true;
        this.valCellHeight = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link GridView#setCellWidth(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B cellWidth(double value)
    {
        this.hasCellWidth = true;
        this.valCellWidth = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link GridView#setHorizontalCellSpacing(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B horizontalCellSpacing(double value)
    {
        this.hasHorizontalCellSpacing = true;
        this.valHorizontalCellSpacing = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link GridView#setItems(javafx.collections.ObservableList)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B items(javafx.collections.ObservableList<T> value)
    {
        this.hasItems = true;
        this.valItems = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link GridView#setVerticalCellSpacing(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B verticalCellSpacing(double value)
    {
        this.hasVerticalCellSpacing = true;
        this.valVerticalCellSpacing = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link GridView#cellFactoryProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindCellFactory(javafx.beans.value.ObservableValue<? extends javafx.util.Callback<org.controlsfx.control.GridView<T>, org.controlsfx.control.GridCell<T>>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1CellFactory = true;
        this.obsrv1CellFactory = source;
        this.bound2CellFactory = false;
        this.obsrv2CellFactory = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link GridView#cellFactoryProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalCellFactory(javafx.beans.property.Property<javafx.util.Callback<org.controlsfx.control.GridView<T>, org.controlsfx.control.GridCell<T>>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1CellFactory = false;
        this.obsrv1CellFactory = null;
        this.bound2CellFactory = true;
        this.obsrv2CellFactory = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link GridView#cellHeightProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindCellHeight(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1CellHeight = true;
        this.obsrv1CellHeight = source;
        this.bound2CellHeight = false;
        this.obsrv2CellHeight = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link GridView#cellHeightProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalCellHeight(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1CellHeight = false;
        this.obsrv1CellHeight = null;
        this.bound2CellHeight = true;
        this.obsrv2CellHeight = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link GridView#cellWidthProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindCellWidth(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1CellWidth = true;
        this.obsrv1CellWidth = source;
        this.bound2CellWidth = false;
        this.obsrv2CellWidth = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link GridView#cellWidthProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalCellWidth(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1CellWidth = false;
        this.obsrv1CellWidth = null;
        this.bound2CellWidth = true;
        this.obsrv2CellWidth = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link GridView#horizontalCellSpacingProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindHorizontalCellSpacing(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1HorizontalCellSpacing = true;
        this.obsrv1HorizontalCellSpacing = source;
        this.bound2HorizontalCellSpacing = false;
        this.obsrv2HorizontalCellSpacing = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link GridView#horizontalCellSpacingProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalHorizontalCellSpacing(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1HorizontalCellSpacing = false;
        this.obsrv1HorizontalCellSpacing = null;
        this.bound2HorizontalCellSpacing = true;
        this.obsrv2HorizontalCellSpacing = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link GridView#itemsProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindItems(javafx.beans.value.ObservableValue<? extends javafx.collections.ObservableList<T>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Items = true;
        this.obsrv1Items = source;
        this.bound2Items = false;
        this.obsrv2Items = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link GridView#itemsProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalItems(javafx.beans.property.Property<javafx.collections.ObservableList<T>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Items = false;
        this.obsrv1Items = null;
        this.bound2Items = true;
        this.obsrv2Items = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link GridView#verticalCellSpacingProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindVerticalCellSpacing(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1VerticalCellSpacing = true;
        this.obsrv1VerticalCellSpacing = source;
        this.bound2VerticalCellSpacing = false;
        this.obsrv2VerticalCellSpacing = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link GridView#verticalCellSpacingProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalVerticalCellSpacing(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1VerticalCellSpacing = false;
        this.obsrv1VerticalCellSpacing = null;
        this.bound2VerticalCellSpacing = true;
        this.obsrv2VerticalCellSpacing = source;
        return (B) this;
    }

    /**
     * 建構{@link GridView}物件。
     *
     * @return 新的{@link GridView}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public GridView<T> build()
    {
        GridView<T> instance = new GridView<T>();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link GridView}物件。
     *
     * @return 新的{@link GridView}物件實體
     */
    @SuppressWarnings("unchecked")
    public GridView<T> build(javafx.collections.ObservableList<T> arg0)
    {
        GridView<T> instance = new GridView<T>(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

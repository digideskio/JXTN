// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link ListView}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link ListView})
 * @param <B> 建構器本身的型態(需繼承{@link ListViewBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ListViewBuilder<T extends java.lang.Object, Z extends ListView<T>, B extends ListViewBuilder<T, Z, B>>
        extends javafx.scene.control.ControlBuilder<Z, B>
        implements ListViewBuilderExt<T, Z, B>
{

    private boolean hasCellFactory;
    private javafx.util.Callback<javafx.scene.control.ListView<T>, javafx.scene.control.ListCell<T>> valCellFactory;

    private boolean hasEditable;
    private boolean valEditable;

    private boolean hasFixedCellSize;
    private double valFixedCellSize;

    private boolean hasFocusModel;
    private javafx.scene.control.FocusModel<T> valFocusModel;

    private boolean hasItems;
    private javafx.collections.ObservableList<T> valItems;

    private boolean hasOnEditCancel;
    private javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>> valOnEditCancel;

    private boolean hasOnEditCommit;
    private javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>> valOnEditCommit;

    private boolean hasOnEditStart;
    private javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>> valOnEditStart;

    private boolean hasOnScrollTo;
    private javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<java.lang.Integer>> valOnScrollTo;

    private boolean hasOrientation;
    private javafx.geometry.Orientation valOrientation;

    private boolean hasPlaceholder;
    private javafx.scene.Node valPlaceholder;

    private boolean hasSelectionModel;
    private javafx.scene.control.MultipleSelectionModel<T> valSelectionModel;

    private boolean bound1CellFactory;
    private boolean bound2CellFactory;
    private javafx.beans.value.ObservableValue<? extends javafx.util.Callback<javafx.scene.control.ListView<T>, javafx.scene.control.ListCell<T>>> obsrv1CellFactory;
    private javafx.beans.property.Property<javafx.util.Callback<javafx.scene.control.ListView<T>, javafx.scene.control.ListCell<T>>> obsrv2CellFactory;

    private boolean bound1Editable;
    private boolean bound2Editable;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1Editable;
    private javafx.beans.property.Property<Boolean> obsrv2Editable;

    private boolean bound1FixedCellSize;
    private boolean bound2FixedCellSize;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1FixedCellSize;
    private javafx.beans.property.Property<Number> obsrv2FixedCellSize;

    private boolean bound1FocusModel;
    private boolean bound2FocusModel;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.control.FocusModel<T>> obsrv1FocusModel;
    private javafx.beans.property.Property<javafx.scene.control.FocusModel<T>> obsrv2FocusModel;

    private boolean bound1Items;
    private boolean bound2Items;
    private javafx.beans.value.ObservableValue<? extends javafx.collections.ObservableList<T>> obsrv1Items;
    private javafx.beans.property.Property<javafx.collections.ObservableList<T>> obsrv2Items;

    private boolean bound1OnEditCancel;
    private boolean bound2OnEditCancel;
    private javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>>> obsrv1OnEditCancel;
    private javafx.beans.property.Property<javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>>> obsrv2OnEditCancel;

    private boolean bound1OnEditCommit;
    private boolean bound2OnEditCommit;
    private javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>>> obsrv1OnEditCommit;
    private javafx.beans.property.Property<javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>>> obsrv2OnEditCommit;

    private boolean bound1OnEditStart;
    private boolean bound2OnEditStart;
    private javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>>> obsrv1OnEditStart;
    private javafx.beans.property.Property<javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>>> obsrv2OnEditStart;

    private boolean bound1Orientation;
    private boolean bound2Orientation;
    private javafx.beans.value.ObservableValue<? extends javafx.geometry.Orientation> obsrv1Orientation;
    private javafx.beans.property.Property<javafx.geometry.Orientation> obsrv2Orientation;

    private boolean bound1Placeholder;
    private boolean bound2Placeholder;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrv1Placeholder;
    private javafx.beans.property.Property<javafx.scene.Node> obsrv2Placeholder;

    private boolean bound1SelectionModel;
    private boolean bound2SelectionModel;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.control.MultipleSelectionModel<T>> obsrv1SelectionModel;
    private javafx.beans.property.Property<javafx.scene.control.MultipleSelectionModel<T>> obsrv2SelectionModel;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasCellFactory)
            instance.setCellFactory(this.valCellFactory);
        if (this.hasEditable)
            instance.setEditable(this.valEditable);
        if (this.hasFixedCellSize)
            instance.setFixedCellSize(this.valFixedCellSize);
        if (this.hasFocusModel)
            instance.setFocusModel(this.valFocusModel);
        if (this.hasItems)
            instance.setItems(this.valItems);
        if (this.hasOnEditCancel)
            instance.setOnEditCancel(this.valOnEditCancel);
        if (this.hasOnEditCommit)
            instance.setOnEditCommit(this.valOnEditCommit);
        if (this.hasOnEditStart)
            instance.setOnEditStart(this.valOnEditStart);
        if (this.hasOnScrollTo)
            instance.setOnScrollTo(this.valOnScrollTo);
        if (this.hasOrientation)
            instance.setOrientation(this.valOrientation);
        if (this.hasPlaceholder)
            instance.setPlaceholder(this.valPlaceholder);
        if (this.hasSelectionModel)
            instance.setSelectionModel(this.valSelectionModel);
        if (this.bound1CellFactory)
            instance.cellFactoryProperty().bind(this.obsrv1CellFactory);
        if (this.bound2CellFactory)
            instance.cellFactoryProperty().bindBidirectional(this.obsrv2CellFactory);
        if (this.bound1Editable)
            instance.editableProperty().bind(this.obsrv1Editable);
        if (this.bound2Editable)
            instance.editableProperty().bindBidirectional(this.obsrv2Editable);
        if (this.bound1FixedCellSize)
            instance.fixedCellSizeProperty().bind(this.obsrv1FixedCellSize);
        if (this.bound2FixedCellSize)
            instance.fixedCellSizeProperty().bindBidirectional(this.obsrv2FixedCellSize);
        if (this.bound1FocusModel)
            instance.focusModelProperty().bind(this.obsrv1FocusModel);
        if (this.bound2FocusModel)
            instance.focusModelProperty().bindBidirectional(this.obsrv2FocusModel);
        if (this.bound1Items)
            instance.itemsProperty().bind(this.obsrv1Items);
        if (this.bound2Items)
            instance.itemsProperty().bindBidirectional(this.obsrv2Items);
        if (this.bound1OnEditCancel)
            instance.onEditCancelProperty().bind(this.obsrv1OnEditCancel);
        if (this.bound2OnEditCancel)
            instance.onEditCancelProperty().bindBidirectional(this.obsrv2OnEditCancel);
        if (this.bound1OnEditCommit)
            instance.onEditCommitProperty().bind(this.obsrv1OnEditCommit);
        if (this.bound2OnEditCommit)
            instance.onEditCommitProperty().bindBidirectional(this.obsrv2OnEditCommit);
        if (this.bound1OnEditStart)
            instance.onEditStartProperty().bind(this.obsrv1OnEditStart);
        if (this.bound2OnEditStart)
            instance.onEditStartProperty().bindBidirectional(this.obsrv2OnEditStart);
        if (this.bound1Orientation)
            instance.orientationProperty().bind(this.obsrv1Orientation);
        if (this.bound2Orientation)
            instance.orientationProperty().bindBidirectional(this.obsrv2Orientation);
        if (this.bound1Placeholder)
            instance.placeholderProperty().bind(this.obsrv1Placeholder);
        if (this.bound2Placeholder)
            instance.placeholderProperty().bindBidirectional(this.obsrv2Placeholder);
        if (this.bound1SelectionModel)
            instance.selectionModelProperty().bind(this.obsrv1SelectionModel);
        if (this.bound2SelectionModel)
            instance.selectionModelProperty().bindBidirectional(this.obsrv2SelectionModel);
    }

    /**
     * 設定屬性{@link ListView#setCellFactory(javafx.util.Callback)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B cellFactory(javafx.util.Callback<javafx.scene.control.ListView<T>, javafx.scene.control.ListCell<T>> value)
    {
        this.hasCellFactory = true;
        this.valCellFactory = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ListView#setEditable(boolean)}
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
     * 設定屬性{@link ListView#setFixedCellSize(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B fixedCellSize(double value)
    {
        this.hasFixedCellSize = true;
        this.valFixedCellSize = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ListView#setFocusModel(javafx.scene.control.FocusModel)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B focusModel(javafx.scene.control.FocusModel<T> value)
    {
        this.hasFocusModel = true;
        this.valFocusModel = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ListView#setItems(javafx.collections.ObservableList)}
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
     * 設定屬性{@link ListView#setOnEditCancel(javafx.event.EventHandler)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onEditCancel(javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>> value)
    {
        this.hasOnEditCancel = true;
        this.valOnEditCancel = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ListView#setOnEditCommit(javafx.event.EventHandler)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onEditCommit(javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>> value)
    {
        this.hasOnEditCommit = true;
        this.valOnEditCommit = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ListView#setOnEditStart(javafx.event.EventHandler)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onEditStart(javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>> value)
    {
        this.hasOnEditStart = true;
        this.valOnEditStart = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ListView#setOnScrollTo(javafx.event.EventHandler)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onScrollTo(javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<java.lang.Integer>> value)
    {
        this.hasOnScrollTo = true;
        this.valOnScrollTo = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ListView#setOrientation(javafx.geometry.Orientation)}
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
     * 設定屬性{@link ListView#setPlaceholder(javafx.scene.Node)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B placeholder(javafx.scene.Node value)
    {
        this.hasPlaceholder = true;
        this.valPlaceholder = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ListView#setSelectionModel(javafx.scene.control.MultipleSelectionModel)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B selectionModel(javafx.scene.control.MultipleSelectionModel<T> value)
    {
        this.hasSelectionModel = true;
        this.valSelectionModel = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ListView#cellFactoryProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindCellFactory(javafx.beans.value.ObservableValue<? extends javafx.util.Callback<javafx.scene.control.ListView<T>, javafx.scene.control.ListCell<T>>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1CellFactory = true;
        this.obsrv1CellFactory = source;
        this.bound2CellFactory = false;
        this.obsrv2CellFactory = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ListView#cellFactoryProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalCellFactory(javafx.beans.property.Property<javafx.util.Callback<javafx.scene.control.ListView<T>, javafx.scene.control.ListCell<T>>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1CellFactory = false;
        this.obsrv1CellFactory = null;
        this.bound2CellFactory = true;
        this.obsrv2CellFactory = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ListView#editableProperty}的連結
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
     * 設定屬性{@link ListView#editableProperty}的雙向連結
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
     * 設定屬性{@link ListView#fixedCellSizeProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindFixedCellSize(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1FixedCellSize = true;
        this.obsrv1FixedCellSize = source;
        this.bound2FixedCellSize = false;
        this.obsrv2FixedCellSize = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ListView#fixedCellSizeProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalFixedCellSize(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1FixedCellSize = false;
        this.obsrv1FixedCellSize = null;
        this.bound2FixedCellSize = true;
        this.obsrv2FixedCellSize = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ListView#focusModelProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindFocusModel(javafx.beans.value.ObservableValue<? extends javafx.scene.control.FocusModel<T>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1FocusModel = true;
        this.obsrv1FocusModel = source;
        this.bound2FocusModel = false;
        this.obsrv2FocusModel = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ListView#focusModelProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalFocusModel(javafx.beans.property.Property<javafx.scene.control.FocusModel<T>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1FocusModel = false;
        this.obsrv1FocusModel = null;
        this.bound2FocusModel = true;
        this.obsrv2FocusModel = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ListView#itemsProperty}的連結
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
     * 設定屬性{@link ListView#itemsProperty}的雙向連結
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
     * 設定屬性{@link ListView#onEditCancelProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOnEditCancel(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnEditCancel = true;
        this.obsrv1OnEditCancel = source;
        this.bound2OnEditCancel = false;
        this.obsrv2OnEditCancel = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ListView#onEditCancelProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalOnEditCancel(javafx.beans.property.Property<javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnEditCancel = false;
        this.obsrv1OnEditCancel = null;
        this.bound2OnEditCancel = true;
        this.obsrv2OnEditCancel = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ListView#onEditCommitProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOnEditCommit(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnEditCommit = true;
        this.obsrv1OnEditCommit = source;
        this.bound2OnEditCommit = false;
        this.obsrv2OnEditCommit = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ListView#onEditCommitProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalOnEditCommit(javafx.beans.property.Property<javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnEditCommit = false;
        this.obsrv1OnEditCommit = null;
        this.bound2OnEditCommit = true;
        this.obsrv2OnEditCommit = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ListView#onEditStartProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOnEditStart(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnEditStart = true;
        this.obsrv1OnEditStart = source;
        this.bound2OnEditStart = false;
        this.obsrv2OnEditStart = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ListView#onEditStartProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalOnEditStart(javafx.beans.property.Property<javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnEditStart = false;
        this.obsrv1OnEditStart = null;
        this.bound2OnEditStart = true;
        this.obsrv2OnEditStart = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ListView#orientationProperty}的連結
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
     * 設定屬性{@link ListView#orientationProperty}的雙向連結
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
     * 設定屬性{@link ListView#placeholderProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindPlaceholder(javafx.beans.value.ObservableValue<? extends javafx.scene.Node> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Placeholder = true;
        this.obsrv1Placeholder = source;
        this.bound2Placeholder = false;
        this.obsrv2Placeholder = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ListView#placeholderProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalPlaceholder(javafx.beans.property.Property<javafx.scene.Node> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Placeholder = false;
        this.obsrv1Placeholder = null;
        this.bound2Placeholder = true;
        this.obsrv2Placeholder = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ListView#selectionModelProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindSelectionModel(javafx.beans.value.ObservableValue<? extends javafx.scene.control.MultipleSelectionModel<T>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1SelectionModel = true;
        this.obsrv1SelectionModel = source;
        this.bound2SelectionModel = false;
        this.obsrv2SelectionModel = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ListView#selectionModelProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalSelectionModel(javafx.beans.property.Property<javafx.scene.control.MultipleSelectionModel<T>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1SelectionModel = false;
        this.obsrv1SelectionModel = null;
        this.bound2SelectionModel = true;
        this.obsrv2SelectionModel = source;
        return (B) this;
    }

    /**
     * 建構{@link ListView}物件
     *
     * @return 新的{@link ListView}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public ListView<T> build()
    {
        ListView<T> instance = new ListView<T>();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

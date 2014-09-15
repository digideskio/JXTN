// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link TreeView}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link TreeView})
 * @param <B> 建構器本身的型態(需繼承{@link TreeViewBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class TreeViewBuilder<T extends java.lang.Object, Z extends TreeView<T>, B extends TreeViewBuilder<T, Z, B>>
        extends javafx.scene.control.ControlBuilder<Z, B>
        implements TreeViewBuilderExt<T, Z, B>
{

    private boolean hasCellFactory;
    private javafx.util.Callback<javafx.scene.control.TreeView<T>, javafx.scene.control.TreeCell<T>> valCellFactory;

    private boolean hasEditable;
    private boolean valEditable;

    private boolean hasFixedCellSize;
    private double valFixedCellSize;

    private boolean hasFocusModel;
    private javafx.scene.control.FocusModel<javafx.scene.control.TreeItem<T>> valFocusModel;

    private boolean hasOnEditCancel;
    private javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>> valOnEditCancel;

    private boolean hasOnEditCommit;
    private javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>> valOnEditCommit;

    private boolean hasOnEditStart;
    private javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>> valOnEditStart;

    private boolean hasOnScrollTo;
    private javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<java.lang.Integer>> valOnScrollTo;

    private boolean hasRoot;
    private javafx.scene.control.TreeItem<T> valRoot;

    private boolean hasSelectionModel;
    private javafx.scene.control.MultipleSelectionModel<javafx.scene.control.TreeItem<T>> valSelectionModel;

    private boolean hasShowRoot;
    private boolean valShowRoot;

    private boolean bound1CellFactory;
    private boolean bound2CellFactory;
    private javafx.beans.value.ObservableValue<? extends javafx.util.Callback<javafx.scene.control.TreeView<T>, javafx.scene.control.TreeCell<T>>> obsrv1CellFactory;
    private javafx.beans.property.Property<javafx.util.Callback<javafx.scene.control.TreeView<T>, javafx.scene.control.TreeCell<T>>> obsrv2CellFactory;

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
    private javafx.beans.value.ObservableValue<? extends javafx.scene.control.FocusModel<javafx.scene.control.TreeItem<T>>> obsrv1FocusModel;
    private javafx.beans.property.Property<javafx.scene.control.FocusModel<javafx.scene.control.TreeItem<T>>> obsrv2FocusModel;

    private boolean bound1OnEditCancel;
    private boolean bound2OnEditCancel;
    private javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>>> obsrv1OnEditCancel;
    private javafx.beans.property.Property<javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>>> obsrv2OnEditCancel;

    private boolean bound1OnEditCommit;
    private boolean bound2OnEditCommit;
    private javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>>> obsrv1OnEditCommit;
    private javafx.beans.property.Property<javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>>> obsrv2OnEditCommit;

    private boolean bound1OnEditStart;
    private boolean bound2OnEditStart;
    private javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>>> obsrv1OnEditStart;
    private javafx.beans.property.Property<javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>>> obsrv2OnEditStart;

    private boolean bound1Root;
    private boolean bound2Root;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.control.TreeItem<T>> obsrv1Root;
    private javafx.beans.property.Property<javafx.scene.control.TreeItem<T>> obsrv2Root;

    private boolean bound1SelectionModel;
    private boolean bound2SelectionModel;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.control.MultipleSelectionModel<javafx.scene.control.TreeItem<T>>> obsrv1SelectionModel;
    private javafx.beans.property.Property<javafx.scene.control.MultipleSelectionModel<javafx.scene.control.TreeItem<T>>> obsrv2SelectionModel;

    private boolean bound1ShowRoot;
    private boolean bound2ShowRoot;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1ShowRoot;
    private javafx.beans.property.Property<Boolean> obsrv2ShowRoot;

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
        if (this.hasOnEditCancel)
            instance.setOnEditCancel(this.valOnEditCancel);
        if (this.hasOnEditCommit)
            instance.setOnEditCommit(this.valOnEditCommit);
        if (this.hasOnEditStart)
            instance.setOnEditStart(this.valOnEditStart);
        if (this.hasOnScrollTo)
            instance.setOnScrollTo(this.valOnScrollTo);
        if (this.hasRoot)
            instance.setRoot(this.valRoot);
        if (this.hasSelectionModel)
            instance.setSelectionModel(this.valSelectionModel);
        if (this.hasShowRoot)
            instance.setShowRoot(this.valShowRoot);
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
        if (this.bound1Root)
            instance.rootProperty().bind(this.obsrv1Root);
        if (this.bound2Root)
            instance.rootProperty().bindBidirectional(this.obsrv2Root);
        if (this.bound1SelectionModel)
            instance.selectionModelProperty().bind(this.obsrv1SelectionModel);
        if (this.bound2SelectionModel)
            instance.selectionModelProperty().bindBidirectional(this.obsrv2SelectionModel);
        if (this.bound1ShowRoot)
            instance.showRootProperty().bind(this.obsrv1ShowRoot);
        if (this.bound2ShowRoot)
            instance.showRootProperty().bindBidirectional(this.obsrv2ShowRoot);
    }

    /**
     * 設定屬性{@link TreeView#setCellFactory(javafx.util.Callback)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B cellFactory(javafx.util.Callback<javafx.scene.control.TreeView<T>, javafx.scene.control.TreeCell<T>> value)
    {
        this.hasCellFactory = true;
        this.valCellFactory = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeView#setEditable(boolean)}
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
     * 設定屬性{@link TreeView#setFixedCellSize(double)}
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
     * 設定屬性{@link TreeView#setFocusModel(javafx.scene.control.FocusModel)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B focusModel(javafx.scene.control.FocusModel<javafx.scene.control.TreeItem<T>> value)
    {
        this.hasFocusModel = true;
        this.valFocusModel = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeView#setOnEditCancel(javafx.event.EventHandler)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onEditCancel(javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>> value)
    {
        this.hasOnEditCancel = true;
        this.valOnEditCancel = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeView#setOnEditCommit(javafx.event.EventHandler)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onEditCommit(javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>> value)
    {
        this.hasOnEditCommit = true;
        this.valOnEditCommit = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeView#setOnEditStart(javafx.event.EventHandler)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onEditStart(javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>> value)
    {
        this.hasOnEditStart = true;
        this.valOnEditStart = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeView#setOnScrollTo(javafx.event.EventHandler)}
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
     * 設定屬性{@link TreeView#setRoot(javafx.scene.control.TreeItem)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B root(javafx.scene.control.TreeItem<T> value)
    {
        this.hasRoot = true;
        this.valRoot = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeView#setSelectionModel(javafx.scene.control.MultipleSelectionModel)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B selectionModel(javafx.scene.control.MultipleSelectionModel<javafx.scene.control.TreeItem<T>> value)
    {
        this.hasSelectionModel = true;
        this.valSelectionModel = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeView#setShowRoot(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B showRoot(boolean value)
    {
        this.hasShowRoot = true;
        this.valShowRoot = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeView#cellFactoryProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindCellFactory(javafx.beans.value.ObservableValue<? extends javafx.util.Callback<javafx.scene.control.TreeView<T>, javafx.scene.control.TreeCell<T>>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1CellFactory = true;
        this.obsrv1CellFactory = source;
        this.bound2CellFactory = false;
        this.obsrv2CellFactory = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeView#cellFactoryProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalCellFactory(javafx.beans.property.Property<javafx.util.Callback<javafx.scene.control.TreeView<T>, javafx.scene.control.TreeCell<T>>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1CellFactory = false;
        this.obsrv1CellFactory = null;
        this.bound2CellFactory = true;
        this.obsrv2CellFactory = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeView#editableProperty}的連結
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
     * 設定屬性{@link TreeView#editableProperty}的雙向連結
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
     * 設定屬性{@link TreeView#fixedCellSizeProperty}的連結
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
     * 設定屬性{@link TreeView#fixedCellSizeProperty}的雙向連結
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
     * 設定屬性{@link TreeView#focusModelProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindFocusModel(javafx.beans.value.ObservableValue<? extends javafx.scene.control.FocusModel<javafx.scene.control.TreeItem<T>>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1FocusModel = true;
        this.obsrv1FocusModel = source;
        this.bound2FocusModel = false;
        this.obsrv2FocusModel = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeView#focusModelProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalFocusModel(javafx.beans.property.Property<javafx.scene.control.FocusModel<javafx.scene.control.TreeItem<T>>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1FocusModel = false;
        this.obsrv1FocusModel = null;
        this.bound2FocusModel = true;
        this.obsrv2FocusModel = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeView#onEditCancelProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOnEditCancel(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnEditCancel = true;
        this.obsrv1OnEditCancel = source;
        this.bound2OnEditCancel = false;
        this.obsrv2OnEditCancel = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeView#onEditCancelProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalOnEditCancel(javafx.beans.property.Property<javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnEditCancel = false;
        this.obsrv1OnEditCancel = null;
        this.bound2OnEditCancel = true;
        this.obsrv2OnEditCancel = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeView#onEditCommitProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOnEditCommit(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnEditCommit = true;
        this.obsrv1OnEditCommit = source;
        this.bound2OnEditCommit = false;
        this.obsrv2OnEditCommit = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeView#onEditCommitProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalOnEditCommit(javafx.beans.property.Property<javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnEditCommit = false;
        this.obsrv1OnEditCommit = null;
        this.bound2OnEditCommit = true;
        this.obsrv2OnEditCommit = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeView#onEditStartProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOnEditStart(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnEditStart = true;
        this.obsrv1OnEditStart = source;
        this.bound2OnEditStart = false;
        this.obsrv2OnEditStart = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeView#onEditStartProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalOnEditStart(javafx.beans.property.Property<javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnEditStart = false;
        this.obsrv1OnEditStart = null;
        this.bound2OnEditStart = true;
        this.obsrv2OnEditStart = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeView#rootProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindRoot(javafx.beans.value.ObservableValue<? extends javafx.scene.control.TreeItem<T>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Root = true;
        this.obsrv1Root = source;
        this.bound2Root = false;
        this.obsrv2Root = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeView#rootProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalRoot(javafx.beans.property.Property<javafx.scene.control.TreeItem<T>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Root = false;
        this.obsrv1Root = null;
        this.bound2Root = true;
        this.obsrv2Root = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeView#selectionModelProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindSelectionModel(javafx.beans.value.ObservableValue<? extends javafx.scene.control.MultipleSelectionModel<javafx.scene.control.TreeItem<T>>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1SelectionModel = true;
        this.obsrv1SelectionModel = source;
        this.bound2SelectionModel = false;
        this.obsrv2SelectionModel = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeView#selectionModelProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalSelectionModel(javafx.beans.property.Property<javafx.scene.control.MultipleSelectionModel<javafx.scene.control.TreeItem<T>>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1SelectionModel = false;
        this.obsrv1SelectionModel = null;
        this.bound2SelectionModel = true;
        this.obsrv2SelectionModel = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeView#showRootProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindShowRoot(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ShowRoot = true;
        this.obsrv1ShowRoot = source;
        this.bound2ShowRoot = false;
        this.obsrv2ShowRoot = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeView#showRootProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalShowRoot(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ShowRoot = false;
        this.obsrv1ShowRoot = null;
        this.bound2ShowRoot = true;
        this.obsrv2ShowRoot = source;
        return (B) this;
    }

    /**
     * 建構{@link TreeView}物件
     *
     * @return 新的{@link TreeView}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public TreeView<T> build()
    {
        TreeView<T> instance = new TreeView<T>();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

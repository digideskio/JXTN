// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link ComboBox}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link ComboBox})
 * @param <B> 建構器本身的型態(需繼承{@link ComboBoxBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ComboBoxBuilder<T extends java.lang.Object, Z extends ComboBox<T>, B extends ComboBoxBuilder<T, Z, B>>
        extends javafx.scene.control.ComboBoxBaseBuilder<T, Z, B>
        implements ComboBoxBuilderExt<T, Z, B>
{

    private boolean hasButtonCell;
    private javafx.scene.control.ListCell<T> valButtonCell;

    private boolean hasCellFactory;
    private javafx.util.Callback<javafx.scene.control.ListView<T>, javafx.scene.control.ListCell<T>> valCellFactory;

    private boolean hasConverter;
    private javafx.util.StringConverter<T> valConverter;

    private boolean hasItems;
    private javafx.collections.ObservableList<T> valItems;

    private boolean hasPlaceholder;
    private javafx.scene.Node valPlaceholder;

    private boolean hasSelectionModel;
    private javafx.scene.control.SingleSelectionModel<T> valSelectionModel;

    private boolean hasVisibleRowCount;
    private int valVisibleRowCount;

    private boolean bound1Placeholder;
    private boolean bound2Placeholder;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrv1Placeholder;
    private javafx.beans.property.Property<javafx.scene.Node> obsrv2Placeholder;

    private boolean bound1SelectionModel;
    private boolean bound2SelectionModel;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.control.SingleSelectionModel<T>> obsrv1SelectionModel;
    private javafx.beans.property.Property<javafx.scene.control.SingleSelectionModel<T>> obsrv2SelectionModel;

    private boolean bound1VisibleRowCount;
    private boolean bound2VisibleRowCount;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1VisibleRowCount;
    private javafx.beans.property.Property<Number> obsrv2VisibleRowCount;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasButtonCell)
            instance.setButtonCell(this.valButtonCell);
        if (this.hasCellFactory)
            instance.setCellFactory(this.valCellFactory);
        if (this.hasConverter)
            instance.setConverter(this.valConverter);
        if (this.hasItems)
            instance.setItems(this.valItems);
        if (this.hasPlaceholder)
            instance.setPlaceholder(this.valPlaceholder);
        if (this.hasSelectionModel)
            instance.setSelectionModel(this.valSelectionModel);
        if (this.hasVisibleRowCount)
            instance.setVisibleRowCount(this.valVisibleRowCount);
        if (this.bound1Placeholder)
            instance.placeholderProperty().bind(this.obsrv1Placeholder);
        if (this.bound2Placeholder)
            instance.placeholderProperty().bindBidirectional(this.obsrv2Placeholder);
        if (this.bound1SelectionModel)
            instance.selectionModelProperty().bind(this.obsrv1SelectionModel);
        if (this.bound2SelectionModel)
            instance.selectionModelProperty().bindBidirectional(this.obsrv2SelectionModel);
        if (this.bound1VisibleRowCount)
            instance.visibleRowCountProperty().bind(this.obsrv1VisibleRowCount);
        if (this.bound2VisibleRowCount)
            instance.visibleRowCountProperty().bindBidirectional(this.obsrv2VisibleRowCount);
    }

    /**
     * 設定屬性{@link ComboBox#setButtonCell(javafx.scene.control.ListCell)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B buttonCell(javafx.scene.control.ListCell<T> value)
    {
        this.hasButtonCell = true;
        this.valButtonCell = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ComboBox#setCellFactory(javafx.util.Callback)}
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
     * 設定屬性{@link ComboBox#setConverter(javafx.util.StringConverter)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B converter(javafx.util.StringConverter<T> value)
    {
        this.hasConverter = true;
        this.valConverter = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ComboBox#setItems(javafx.collections.ObservableList)}
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
     * 設定屬性{@link ComboBox#setPlaceholder(javafx.scene.Node)}
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
     * 設定屬性{@link ComboBox#setSelectionModel(javafx.scene.control.SingleSelectionModel)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B selectionModel(javafx.scene.control.SingleSelectionModel<T> value)
    {
        this.hasSelectionModel = true;
        this.valSelectionModel = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ComboBox#setVisibleRowCount(int)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B visibleRowCount(int value)
    {
        this.hasVisibleRowCount = true;
        this.valVisibleRowCount = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ComboBox#placeholderProperty}的連結
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
     * 設定屬性{@link ComboBox#placeholderProperty}的雙向連結
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
     * 設定屬性{@link ComboBox#selectionModelProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindSelectionModel(javafx.beans.value.ObservableValue<? extends javafx.scene.control.SingleSelectionModel<T>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1SelectionModel = true;
        this.obsrv1SelectionModel = source;
        this.bound2SelectionModel = false;
        this.obsrv2SelectionModel = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ComboBox#selectionModelProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalSelectionModel(javafx.beans.property.Property<javafx.scene.control.SingleSelectionModel<T>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1SelectionModel = false;
        this.obsrv1SelectionModel = null;
        this.bound2SelectionModel = true;
        this.obsrv2SelectionModel = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ComboBox#visibleRowCountProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindVisibleRowCount(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1VisibleRowCount = true;
        this.obsrv1VisibleRowCount = source;
        this.bound2VisibleRowCount = false;
        this.obsrv2VisibleRowCount = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ComboBox#visibleRowCountProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalVisibleRowCount(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1VisibleRowCount = false;
        this.obsrv1VisibleRowCount = null;
        this.bound2VisibleRowCount = true;
        this.obsrv2VisibleRowCount = source;
        return (B) this;
    }

    /**
     * 建構{@link ComboBox}物件
     *
     * @return 新的{@link ComboBox}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public ComboBox<T> build()
    {
        ComboBox<T> instance = new ComboBox<T>();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link ComboBox}物件
     *
     * @return 新的{@link ComboBox}物件實體
     */
    @SuppressWarnings("unchecked")
    public ComboBox<T> build(javafx.collections.ObservableList<T> arg0)
    {
        ComboBox<T> instance = new ComboBox<T>(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

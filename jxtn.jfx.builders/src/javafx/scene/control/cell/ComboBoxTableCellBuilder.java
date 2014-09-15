// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control.cell;

/**
 * {@link ComboBoxTableCell}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link ComboBoxTableCell})
 * @param <B> 建構器本身的型態(需繼承{@link ComboBoxTableCellBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ComboBoxTableCellBuilder<S extends java.lang.Object, T extends java.lang.Object, Z extends ComboBoxTableCell<S, T>, B extends ComboBoxTableCellBuilder<S, T, Z, B>>
        extends javafx.scene.control.TableCellBuilder<S, T, Z, B>
        implements ComboBoxTableCellBuilderExt<S, T, Z, B>
{

    private boolean hasComboBoxEditable;
    private boolean valComboBoxEditable;

    private boolean hasConverter;
    private javafx.util.StringConverter<T> valConverter;

    private boolean hasItems;
    private java.util.Collection<T> valItems;

    private boolean bound1ComboBoxEditable;
    private boolean bound2ComboBoxEditable;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1ComboBoxEditable;
    private javafx.beans.property.Property<Boolean> obsrv2ComboBoxEditable;

    private boolean bound1Converter;
    private boolean bound2Converter;
    private javafx.beans.value.ObservableValue<? extends javafx.util.StringConverter<T>> obsrv1Converter;
    private javafx.beans.property.Property<javafx.util.StringConverter<T>> obsrv2Converter;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasComboBoxEditable)
            instance.setComboBoxEditable(this.valComboBoxEditable);
        if (this.hasConverter)
            instance.setConverter(this.valConverter);
        if (this.hasItems)
            instance.getItems().addAll(this.valItems);
        if (this.bound1ComboBoxEditable)
            instance.comboBoxEditableProperty().bind(this.obsrv1ComboBoxEditable);
        if (this.bound2ComboBoxEditable)
            instance.comboBoxEditableProperty().bindBidirectional(this.obsrv2ComboBoxEditable);
        if (this.bound1Converter)
            instance.converterProperty().bind(this.obsrv1Converter);
        if (this.bound2Converter)
            instance.converterProperty().bindBidirectional(this.obsrv2Converter);
    }

    /**
     * 設定屬性{@link ComboBoxTableCell#setComboBoxEditable(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B comboBoxEditable(boolean value)
    {
        this.hasComboBoxEditable = true;
        this.valComboBoxEditable = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ComboBoxTableCell#setConverter(javafx.util.StringConverter)}
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
     * 設定集合屬性{@link ComboBoxTableCell#getItems}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B items(java.util.Collection<T> value)
    {
        this.hasItems = true;
        this.valItems = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link ComboBoxTableCell#getItems}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B items(T... value)
    {
        this.hasItems = true;
        this.valItems = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link ComboBoxTableCell#getItems}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B itemsAdd(java.util.Collection<T> value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasItems = true;
        if (this.valItems == null)
            this.valItems = new java.util.ArrayList<>(value.size());
        this.valItems.addAll(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link ComboBoxTableCell#getItems}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B itemsAdd(T... value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasItems = true;
        if (this.valItems == null)
            this.valItems = new java.util.ArrayList<>(value.length);
        this.valItems.addAll(java.util.Arrays.asList(value));
        return (B) this;
    }

    /**
     * 設定屬性{@link ComboBoxTableCell#comboBoxEditableProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindComboBoxEditable(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ComboBoxEditable = true;
        this.obsrv1ComboBoxEditable = source;
        this.bound2ComboBoxEditable = false;
        this.obsrv2ComboBoxEditable = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ComboBoxTableCell#comboBoxEditableProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalComboBoxEditable(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ComboBoxEditable = false;
        this.obsrv1ComboBoxEditable = null;
        this.bound2ComboBoxEditable = true;
        this.obsrv2ComboBoxEditable = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ComboBoxTableCell#converterProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindConverter(javafx.beans.value.ObservableValue<? extends javafx.util.StringConverter<T>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Converter = true;
        this.obsrv1Converter = source;
        this.bound2Converter = false;
        this.obsrv2Converter = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ComboBoxTableCell#converterProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalConverter(javafx.beans.property.Property<javafx.util.StringConverter<T>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Converter = false;
        this.obsrv1Converter = null;
        this.bound2Converter = true;
        this.obsrv2Converter = source;
        return (B) this;
    }

    /**
     * 建構{@link ComboBoxTableCell}物件
     *
     * @return 新的{@link ComboBoxTableCell}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public ComboBoxTableCell<S, T> build()
    {
        ComboBoxTableCell<S, T> instance = new ComboBoxTableCell<S, T>();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

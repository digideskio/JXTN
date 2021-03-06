// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control.cell;

/**
 * {@link ChoiceBoxTreeCell}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link ChoiceBoxTreeCell})
 * @param <B> 建構器本身的型態(需繼承{@link ChoiceBoxTreeCellMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ChoiceBoxTreeCellMaker<T extends java.lang.Object, Z extends ChoiceBoxTreeCell<T>, B extends ChoiceBoxTreeCellMaker<T, Z, B>>
        extends javafx.scene.control.TreeCellMaker<T, Z, B>
        implements ChoiceBoxTreeCellMakerExt<T, Z, B>
{

    private boolean hasConverter;
    private javafx.util.StringConverter<T> valConverter;

    private boolean hasItems;
    private java.util.Collection<T> valItems;

    private boolean bound1Converter;
    private boolean bound2Converter;
    private javafx.beans.value.ObservableValue<? extends javafx.util.StringConverter<T>> obsrv1Converter;
    private javafx.beans.property.Property<javafx.util.StringConverter<T>> obsrv2Converter;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasConverter)
            instance.setConverter(this.valConverter);
        if (this.hasItems)
            instance.getItems().addAll(this.valItems);
        if (this.bound1Converter)
            instance.converterProperty().bind(this.obsrv1Converter);
        if (this.bound2Converter)
            instance.converterProperty().bindBidirectional(this.obsrv2Converter);
    }

    /**
     * 設定屬性{@link ChoiceBoxTreeCell#setConverter(javafx.util.StringConverter)}。
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
     * 設定集合屬性{@link ChoiceBoxTreeCell#getItems}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     * @deprecated 屬性值並非{@link javafx.collections.ObservableList}
     */
    @Deprecated
    @SuppressWarnings("unchecked")
    public final B items(java.util.Collection<? extends T> value)
    {
        this.hasItems = true;
        this.valItems = (java.util.Collection<T>) value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link ChoiceBoxTreeCell#getItems}的內容。
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
     * 增加集合屬性{@link ChoiceBoxTreeCell#getItems}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B itemsAdd(java.util.Collection<? extends T> value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasItems = true;
        if (this.valItems == null)
            this.valItems = new java.util.ArrayList<>(value.size());
        this.valItems.addAll(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link ChoiceBoxTreeCell#getItems}的內容。
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
     * 增加集合屬性{@link ChoiceBoxTreeCell#getItems}的內容，排除null項目。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B itemsAddNonNull(java.util.Collection<? extends T> value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasItems = true;
        if (this.valItems == null)
            this.valItems = new java.util.ArrayList<>(value.size());
        for (T i : value)
            if (i != null)
                this.valItems.add(i);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link ChoiceBoxTreeCell#getItems}的內容，排除null項目。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B itemsAddNonNull(T... value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasItems = true;
        if (this.valItems == null)
            this.valItems = new java.util.ArrayList<>(value.length);
        for (T i : value)
            if (i != null)
                this.valItems.add(i);
        return (B) this;
    }

    /**
     * 設定屬性{@link ChoiceBoxTreeCell#converterProperty}的連結。
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
     * 設定屬性{@link ChoiceBoxTreeCell#converterProperty}的雙向連結。
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
     * 建構{@link ChoiceBoxTreeCell}物件。
     *
     * @return 新的{@link ChoiceBoxTreeCell}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public ChoiceBoxTreeCell<T> build()
    {
        ChoiceBoxTreeCell<T> instance = new ChoiceBoxTreeCell<T>();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link ChoiceBoxTreeCell}物件。
     *
     * @return 新的{@link ChoiceBoxTreeCell}物件實體
     */
    @SuppressWarnings("unchecked")
    public ChoiceBoxTreeCell<T> build(T[] arg0)
    {
        ChoiceBoxTreeCell<T> instance = new ChoiceBoxTreeCell<T>(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link ChoiceBoxTreeCell}物件。
     *
     * @return 新的{@link ChoiceBoxTreeCell}物件實體
     */
    @SuppressWarnings("unchecked")
    public ChoiceBoxTreeCell<T> build(javafx.collections.ObservableList<T> arg0)
    {
        ChoiceBoxTreeCell<T> instance = new ChoiceBoxTreeCell<T>(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link ChoiceBoxTreeCell}物件。
     *
     * @return 新的{@link ChoiceBoxTreeCell}物件實體
     */
    @SuppressWarnings("unchecked")
    public ChoiceBoxTreeCell<T> build(javafx.util.StringConverter<T> arg0, T[] arg1)
    {
        ChoiceBoxTreeCell<T> instance = new ChoiceBoxTreeCell<T>(arg0, arg1);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link ChoiceBoxTreeCell}物件。
     *
     * @return 新的{@link ChoiceBoxTreeCell}物件實體
     */
    @SuppressWarnings("unchecked")
    public ChoiceBoxTreeCell<T> build(javafx.util.StringConverter<T> arg0, javafx.collections.ObservableList<T> arg1)
    {
        ChoiceBoxTreeCell<T> instance = new ChoiceBoxTreeCell<T>(arg0, arg1);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

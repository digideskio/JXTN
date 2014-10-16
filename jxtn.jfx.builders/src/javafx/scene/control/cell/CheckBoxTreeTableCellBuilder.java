// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control.cell;

/**
 * {@link CheckBoxTreeTableCell}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link CheckBoxTreeTableCell})
 * @param <B> 建構器本身的型態(需繼承{@link CheckBoxTreeTableCellBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class CheckBoxTreeTableCellBuilder<S extends java.lang.Object, T extends java.lang.Object, Z extends CheckBoxTreeTableCell<S, T>, B extends CheckBoxTreeTableCellBuilder<S, T, Z, B>>
        extends javafx.scene.control.TreeTableCellBuilder<S, T, Z, B>
        implements CheckBoxTreeTableCellBuilderExt<S, T, Z, B>
{

    private boolean hasConverter;
    private javafx.util.StringConverter<T> valConverter;

    private boolean hasSelectedStateCallback;
    private javafx.util.Callback<java.lang.Integer, javafx.beans.value.ObservableValue<java.lang.Boolean>> valSelectedStateCallback;

    private boolean bound1Converter;
    private boolean bound2Converter;
    private javafx.beans.value.ObservableValue<? extends javafx.util.StringConverter<T>> obsrv1Converter;
    private javafx.beans.property.Property<javafx.util.StringConverter<T>> obsrv2Converter;

    private boolean bound1SelectedStateCallback;
    private boolean bound2SelectedStateCallback;
    private javafx.beans.value.ObservableValue<? extends javafx.util.Callback<java.lang.Integer, javafx.beans.value.ObservableValue<java.lang.Boolean>>> obsrv1SelectedStateCallback;
    private javafx.beans.property.Property<javafx.util.Callback<java.lang.Integer, javafx.beans.value.ObservableValue<java.lang.Boolean>>> obsrv2SelectedStateCallback;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasConverter)
            instance.setConverter(this.valConverter);
        if (this.hasSelectedStateCallback)
            instance.setSelectedStateCallback(this.valSelectedStateCallback);
        if (this.bound1Converter)
            instance.converterProperty().bind(this.obsrv1Converter);
        if (this.bound2Converter)
            instance.converterProperty().bindBidirectional(this.obsrv2Converter);
        if (this.bound1SelectedStateCallback)
            instance.selectedStateCallbackProperty().bind(this.obsrv1SelectedStateCallback);
        if (this.bound2SelectedStateCallback)
            instance.selectedStateCallbackProperty().bindBidirectional(this.obsrv2SelectedStateCallback);
    }

    /**
     * 設定屬性{@link CheckBoxTreeTableCell#setConverter(javafx.util.StringConverter)}
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
     * 設定屬性{@link CheckBoxTreeTableCell#setSelectedStateCallback(javafx.util.Callback)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B selectedStateCallback(javafx.util.Callback<java.lang.Integer, javafx.beans.value.ObservableValue<java.lang.Boolean>> value)
    {
        this.hasSelectedStateCallback = true;
        this.valSelectedStateCallback = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link CheckBoxTreeTableCell#converterProperty}的連結
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
     * 設定屬性{@link CheckBoxTreeTableCell#converterProperty}的雙向連結
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
     * 設定屬性{@link CheckBoxTreeTableCell#selectedStateCallbackProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindSelectedStateCallback(javafx.beans.value.ObservableValue<? extends javafx.util.Callback<java.lang.Integer, javafx.beans.value.ObservableValue<java.lang.Boolean>>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1SelectedStateCallback = true;
        this.obsrv1SelectedStateCallback = source;
        this.bound2SelectedStateCallback = false;
        this.obsrv2SelectedStateCallback = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link CheckBoxTreeTableCell#selectedStateCallbackProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalSelectedStateCallback(javafx.beans.property.Property<javafx.util.Callback<java.lang.Integer, javafx.beans.value.ObservableValue<java.lang.Boolean>>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1SelectedStateCallback = false;
        this.obsrv1SelectedStateCallback = null;
        this.bound2SelectedStateCallback = true;
        this.obsrv2SelectedStateCallback = source;
        return (B) this;
    }

    /**
     * 建構{@link CheckBoxTreeTableCell}物件
     *
     * @return 新的{@link CheckBoxTreeTableCell}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public CheckBoxTreeTableCell<S, T> build()
    {
        CheckBoxTreeTableCell<S, T> instance = new CheckBoxTreeTableCell<S, T>();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link CheckBoxTreeTableCell}物件
     *
     * @return 新的{@link CheckBoxTreeTableCell}物件實體
     */
    @SuppressWarnings("unchecked")
    public CheckBoxTreeTableCell<S, T> build(javafx.util.Callback<java.lang.Integer, javafx.beans.value.ObservableValue<java.lang.Boolean>> arg0)
    {
        CheckBoxTreeTableCell<S, T> instance = new CheckBoxTreeTableCell<S, T>(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link CheckBoxTreeTableCell}物件
     *
     * @return 新的{@link CheckBoxTreeTableCell}物件實體
     */
    @SuppressWarnings("unchecked")
    public CheckBoxTreeTableCell<S, T> build(javafx.util.Callback<java.lang.Integer, javafx.beans.value.ObservableValue<java.lang.Boolean>> arg0, javafx.util.StringConverter<T> arg1)
    {
        CheckBoxTreeTableCell<S, T> instance = new CheckBoxTreeTableCell<S, T>(arg0, arg1);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

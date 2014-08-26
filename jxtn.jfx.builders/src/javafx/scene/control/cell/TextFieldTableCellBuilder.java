// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control.cell;

/**
 * {@link TextFieldTableCell}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class TextFieldTableCellBuilder<S extends java.lang.Object, T extends java.lang.Object, Z extends TextFieldTableCell<S, T>, B extends TextFieldTableCellBuilder<S, T, Z, B>>
        extends javafx.scene.control.TableCellBuilder<S, T, Z, B>
{

    protected boolean hasConverter;
    protected javafx.util.StringConverter<T> valConverter;

    protected boolean boundConverter;
    protected javafx.beans.value.ObservableValue<? extends javafx.util.StringConverter<T>> obsrvConverter;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasConverter)
            instance.setConverter(this.valConverter);
        if (this.boundConverter)
            instance.converterProperty().bind(this.obsrvConverter);
    }

    /**
     * 設定屬性{@link TextFieldTableCell#setConverter}
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
     * 設定屬性{@link TextFieldTableCell#converterProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindConverter(javafx.beans.value.ObservableValue<? extends javafx.util.StringConverter<T>> source)
    {
        assert (source != null);
        this.boundConverter = true;
        this.obsrvConverter = source;
        return (B) this;
    }

    /**
     * 建構{@link TextFieldTableCell}物件
     *
     * @return 新的{@link TextFieldTableCell}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public TextFieldTableCell<S, T> build()
    {
        TextFieldTableCell<S, T> instance = new TextFieldTableCell<S, T>();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
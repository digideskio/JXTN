// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link ChoiceDialog}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version openjfx-dialogs-1.0.2.jar
 * @param <Z> 要建構的物件型態(需繼承{@link ChoiceDialog})
 * @param <B> 建構器本身的型態(需繼承{@link ChoiceDialogBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ChoiceDialogBuilder<T extends java.lang.Object, Z extends ChoiceDialog<T>, B extends ChoiceDialogBuilder<T, Z, B>>
        extends javafx.scene.control.DialogBuilder<T, Z, B>
        implements ChoiceDialogBuilderExt<T, Z, B>
{

    private boolean hasItems;
    private java.util.Collection<T> valItems;

    private boolean hasSelectedItem;
    private T valSelectedItem;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasItems)
            instance.getItems().addAll(this.valItems);
        if (this.hasSelectedItem)
            instance.setSelectedItem(this.valSelectedItem);
    }

    /**
     * 設定集合屬性{@link ChoiceDialog#getItems}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     * @deprecated 屬性值並非{@link javafx.collections.ObservableList}
     */
    @Deprecated
    @SuppressWarnings("unchecked")
    public final B items(java.util.Collection<T> value)
    {
        this.hasItems = true;
        this.valItems = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link ChoiceDialog#getItems}的內容。
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
     * 增加集合屬性{@link ChoiceDialog#getItems}的內容。
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
     * 增加集合屬性{@link ChoiceDialog#getItems}的內容。
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
     * 設定屬性{@link ChoiceDialog#setSelectedItem(T)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B selectedItem(T value)
    {
        this.hasSelectedItem = true;
        this.valSelectedItem = value;
        return (B) this;
    }

    /**
     * 建構{@link ChoiceDialog}物件。
     *
     * @return 新的{@link ChoiceDialog}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public ChoiceDialog<T> build()
    {
        ChoiceDialog<T> instance = new ChoiceDialog<T>();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link ChoiceDialog}物件。
     *
     * @return 新的{@link ChoiceDialog}物件實體
     */
    @SuppressWarnings("unchecked")
    public ChoiceDialog<T> build(T arg0, java.util.Collection<T> arg1)
    {
        ChoiceDialog<T> instance = new ChoiceDialog<T>(arg0, arg1);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link ChoiceDialog}物件。
     *
     * @return 新的{@link ChoiceDialog}物件實體
     */
    @SuppressWarnings("unchecked")
    public ChoiceDialog<T> build(T arg0, T[] arg1)
    {
        ChoiceDialog<T> instance = new ChoiceDialog<T>(arg0, arg1);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

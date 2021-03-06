// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control;

/**
 * {@link PropertySheet}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.40.10.jar
 * @param <Z> 要建構的物件型態(需繼承{@link PropertySheet})
 * @param <B> 建構器本身的型態(需繼承{@link PropertySheetMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class PropertySheetMaker<Z extends PropertySheet, B extends PropertySheetMaker<Z, B>>
        extends javafx.scene.control.ControlMaker<Z, B>
        implements PropertySheetMakerExt<Z, B>
{

    private boolean hasItems;
    private java.util.Collection<org.controlsfx.control.PropertySheet.Item> valItems;

    private boolean hasMode;
    private org.controlsfx.control.PropertySheet.Mode valMode;

    private boolean hasModeSwitcherVisible;
    private boolean valModeSwitcherVisible;

    private boolean hasPropertyEditorFactory;
    private javafx.util.Callback<org.controlsfx.control.PropertySheet.Item, org.controlsfx.property.editor.PropertyEditor<?>> valPropertyEditorFactory;

    private boolean hasSearchBoxVisible;
    private boolean valSearchBoxVisible;

    private boolean hasTitleFilter;
    private java.lang.String valTitleFilter;

    private boolean bound1Mode;
    private boolean bound2Mode;
    private javafx.beans.value.ObservableValue<? extends org.controlsfx.control.PropertySheet.Mode> obsrv1Mode;
    private javafx.beans.property.Property<org.controlsfx.control.PropertySheet.Mode> obsrv2Mode;

    private boolean bound1ModeSwitcherVisible;
    private boolean bound2ModeSwitcherVisible;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1ModeSwitcherVisible;
    private javafx.beans.property.Property<Boolean> obsrv2ModeSwitcherVisible;

    private boolean bound1SearchBoxVisible;
    private boolean bound2SearchBoxVisible;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1SearchBoxVisible;
    private javafx.beans.property.Property<Boolean> obsrv2SearchBoxVisible;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasItems)
            instance.getItems().addAll(this.valItems);
        if (this.hasMode)
            instance.setMode(this.valMode);
        if (this.hasModeSwitcherVisible)
            instance.setModeSwitcherVisible(this.valModeSwitcherVisible);
        if (this.hasPropertyEditorFactory)
            instance.setPropertyEditorFactory(this.valPropertyEditorFactory);
        if (this.hasSearchBoxVisible)
            instance.setSearchBoxVisible(this.valSearchBoxVisible);
        if (this.hasTitleFilter)
            instance.setTitleFilter(this.valTitleFilter);
        if (this.bound1Mode)
            instance.modeProperty().bind(this.obsrv1Mode);
        if (this.bound2Mode)
            instance.modeProperty().bindBidirectional(this.obsrv2Mode);
        if (this.bound1ModeSwitcherVisible)
            instance.modeSwitcherVisibleProperty().bind(this.obsrv1ModeSwitcherVisible);
        if (this.bound2ModeSwitcherVisible)
            instance.modeSwitcherVisibleProperty().bindBidirectional(this.obsrv2ModeSwitcherVisible);
        if (this.bound1SearchBoxVisible)
            instance.searchBoxVisibleProperty().bind(this.obsrv1SearchBoxVisible);
        if (this.bound2SearchBoxVisible)
            instance.searchBoxVisibleProperty().bindBidirectional(this.obsrv2SearchBoxVisible);
    }

    /**
     * 設定集合屬性{@link PropertySheet#getItems}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     * @deprecated 屬性值並非{@link javafx.collections.ObservableList}
     */
    @Deprecated
    @SuppressWarnings("unchecked")
    public final B items(java.util.Collection<? extends org.controlsfx.control.PropertySheet.Item> value)
    {
        this.hasItems = true;
        this.valItems = (java.util.Collection<org.controlsfx.control.PropertySheet.Item>) value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link PropertySheet#getItems}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B items(org.controlsfx.control.PropertySheet.Item... value)
    {
        this.hasItems = true;
        this.valItems = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link PropertySheet#getItems}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B itemsAdd(java.util.Collection<? extends org.controlsfx.control.PropertySheet.Item> value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasItems = true;
        if (this.valItems == null)
            this.valItems = new java.util.ArrayList<>(value.size());
        this.valItems.addAll(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link PropertySheet#getItems}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B itemsAdd(org.controlsfx.control.PropertySheet.Item... value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasItems = true;
        if (this.valItems == null)
            this.valItems = new java.util.ArrayList<>(value.length);
        this.valItems.addAll(java.util.Arrays.asList(value));
        return (B) this;
    }

    /**
     * 增加集合屬性{@link PropertySheet#getItems}的內容，排除null項目。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B itemsAddNonNull(java.util.Collection<? extends org.controlsfx.control.PropertySheet.Item> value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasItems = true;
        if (this.valItems == null)
            this.valItems = new java.util.ArrayList<>(value.size());
        for (org.controlsfx.control.PropertySheet.Item i : value)
            if (i != null)
                this.valItems.add(i);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link PropertySheet#getItems}的內容，排除null項目。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B itemsAddNonNull(org.controlsfx.control.PropertySheet.Item... value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasItems = true;
        if (this.valItems == null)
            this.valItems = new java.util.ArrayList<>(value.length);
        for (org.controlsfx.control.PropertySheet.Item i : value)
            if (i != null)
                this.valItems.add(i);
        return (B) this;
    }

    /**
     * 設定屬性{@link PropertySheet#setMode(org.controlsfx.control.PropertySheet.Mode)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B mode(org.controlsfx.control.PropertySheet.Mode value)
    {
        this.hasMode = true;
        this.valMode = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link PropertySheet#setModeSwitcherVisible(boolean)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B modeSwitcherVisible(boolean value)
    {
        this.hasModeSwitcherVisible = true;
        this.valModeSwitcherVisible = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link PropertySheet#setPropertyEditorFactory(javafx.util.Callback)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B propertyEditorFactory(javafx.util.Callback<org.controlsfx.control.PropertySheet.Item, org.controlsfx.property.editor.PropertyEditor<?>> value)
    {
        this.hasPropertyEditorFactory = true;
        this.valPropertyEditorFactory = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link PropertySheet#setSearchBoxVisible(boolean)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B searchBoxVisible(boolean value)
    {
        this.hasSearchBoxVisible = true;
        this.valSearchBoxVisible = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link PropertySheet#setTitleFilter(java.lang.String)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B titleFilter(java.lang.String value)
    {
        this.hasTitleFilter = true;
        this.valTitleFilter = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link PropertySheet#modeProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindMode(javafx.beans.value.ObservableValue<? extends org.controlsfx.control.PropertySheet.Mode> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Mode = true;
        this.obsrv1Mode = source;
        this.bound2Mode = false;
        this.obsrv2Mode = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link PropertySheet#modeProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalMode(javafx.beans.property.Property<org.controlsfx.control.PropertySheet.Mode> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Mode = false;
        this.obsrv1Mode = null;
        this.bound2Mode = true;
        this.obsrv2Mode = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link PropertySheet#modeSwitcherVisibleProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindModeSwitcherVisible(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ModeSwitcherVisible = true;
        this.obsrv1ModeSwitcherVisible = source;
        this.bound2ModeSwitcherVisible = false;
        this.obsrv2ModeSwitcherVisible = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link PropertySheet#modeSwitcherVisibleProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalModeSwitcherVisible(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ModeSwitcherVisible = false;
        this.obsrv1ModeSwitcherVisible = null;
        this.bound2ModeSwitcherVisible = true;
        this.obsrv2ModeSwitcherVisible = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link PropertySheet#searchBoxVisibleProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindSearchBoxVisible(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1SearchBoxVisible = true;
        this.obsrv1SearchBoxVisible = source;
        this.bound2SearchBoxVisible = false;
        this.obsrv2SearchBoxVisible = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link PropertySheet#searchBoxVisibleProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalSearchBoxVisible(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1SearchBoxVisible = false;
        this.obsrv1SearchBoxVisible = null;
        this.bound2SearchBoxVisible = true;
        this.obsrv2SearchBoxVisible = source;
        return (B) this;
    }

    /**
     * 建構{@link PropertySheet}物件。
     *
     * @return 新的{@link PropertySheet}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public PropertySheet build()
    {
        PropertySheet instance = new PropertySheet();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link PropertySheet}物件。
     *
     * @return 新的{@link PropertySheet}物件實體
     */
    @SuppressWarnings("unchecked")
    public PropertySheet build(javafx.collections.ObservableList<org.controlsfx.control.PropertySheet.Item> arg0)
    {
        PropertySheet instance = new PropertySheet(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

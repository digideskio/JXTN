// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control.table;

/**
 * {@link TableFilter}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.40.10.jar
 * @param <Z> 要建構的物件型態(需繼承{@link TableFilter})
 * @param <B> 建構器本身的型態(需繼承{@link TableFilterMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class TableFilterMaker<T extends java.lang.Object, Z extends TableFilter<T>, B extends TableFilterMaker<T, Z, B>>
        extends jxtn.jfx.makers.AbstractMaker<Z, B>
        implements TableFilterMakerExt<T, Z, B>
{

    private boolean hasBackingList;
    private java.util.Collection<T> valBackingList;

    private boolean hasColumnFilters;
    private java.util.Collection<impl.org.controlsfx.table.ColumnFilter<T>> valColumnFilters;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasBackingList)
            instance.getBackingList().addAll(this.valBackingList);
        if (this.hasColumnFilters)
            instance.getColumnFilters().addAll(this.valColumnFilters);
    }

    /**
     * 設定集合屬性{@link TableFilter#getBackingList}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     * @deprecated 屬性值並非{@link javafx.collections.ObservableList}
     */
    @Deprecated
    @SuppressWarnings("unchecked")
    public final B backingList(java.util.Collection<? extends T> value)
    {
        this.hasBackingList = true;
        this.valBackingList = (java.util.Collection<T>) value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link TableFilter#getBackingList}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B backingList(T... value)
    {
        this.hasBackingList = true;
        this.valBackingList = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link TableFilter#getBackingList}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B backingListAdd(java.util.Collection<? extends T> value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasBackingList = true;
        if (this.valBackingList == null)
            this.valBackingList = new java.util.ArrayList<>(value.size());
        this.valBackingList.addAll(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link TableFilter#getBackingList}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B backingListAdd(T... value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasBackingList = true;
        if (this.valBackingList == null)
            this.valBackingList = new java.util.ArrayList<>(value.length);
        this.valBackingList.addAll(java.util.Arrays.asList(value));
        return (B) this;
    }

    /**
     * 增加集合屬性{@link TableFilter#getBackingList}的內容，排除null項目。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B backingListAddNonNull(java.util.Collection<? extends T> value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasBackingList = true;
        if (this.valBackingList == null)
            this.valBackingList = new java.util.ArrayList<>(value.size());
        for (T i : value)
            if (i != null)
                this.valBackingList.add(i);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link TableFilter#getBackingList}的內容，排除null項目。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B backingListAddNonNull(T... value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasBackingList = true;
        if (this.valBackingList == null)
            this.valBackingList = new java.util.ArrayList<>(value.length);
        for (T i : value)
            if (i != null)
                this.valBackingList.add(i);
        return (B) this;
    }

    /**
     * 設定集合屬性{@link TableFilter#getColumnFilters}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     * @deprecated 屬性值並非{@link javafx.collections.ObservableList}
     */
    @Deprecated
    @SuppressWarnings("unchecked")
    public final B columnFilters(java.util.Collection<? extends impl.org.controlsfx.table.ColumnFilter<T>> value)
    {
        this.hasColumnFilters = true;
        this.valColumnFilters = (java.util.Collection<impl.org.controlsfx.table.ColumnFilter<T>>) value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link TableFilter#getColumnFilters}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B columnFilters(impl.org.controlsfx.table.ColumnFilter<T>... value)
    {
        this.hasColumnFilters = true;
        this.valColumnFilters = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link TableFilter#getColumnFilters}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B columnFiltersAdd(java.util.Collection<? extends impl.org.controlsfx.table.ColumnFilter<T>> value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasColumnFilters = true;
        if (this.valColumnFilters == null)
            this.valColumnFilters = new java.util.ArrayList<>(value.size());
        this.valColumnFilters.addAll(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link TableFilter#getColumnFilters}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B columnFiltersAdd(impl.org.controlsfx.table.ColumnFilter<T>... value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasColumnFilters = true;
        if (this.valColumnFilters == null)
            this.valColumnFilters = new java.util.ArrayList<>(value.length);
        this.valColumnFilters.addAll(java.util.Arrays.asList(value));
        return (B) this;
    }

    /**
     * 增加集合屬性{@link TableFilter#getColumnFilters}的內容，排除null項目。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B columnFiltersAddNonNull(java.util.Collection<? extends impl.org.controlsfx.table.ColumnFilter<T>> value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasColumnFilters = true;
        if (this.valColumnFilters == null)
            this.valColumnFilters = new java.util.ArrayList<>(value.size());
        for (impl.org.controlsfx.table.ColumnFilter<T> i : value)
            if (i != null)
                this.valColumnFilters.add(i);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link TableFilter#getColumnFilters}的內容，排除null項目。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B columnFiltersAddNonNull(impl.org.controlsfx.table.ColumnFilter<T>... value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasColumnFilters = true;
        if (this.valColumnFilters == null)
            this.valColumnFilters = new java.util.ArrayList<>(value.length);
        for (impl.org.controlsfx.table.ColumnFilter<T> i : value)
            if (i != null)
                this.valColumnFilters.add(i);
        return (B) this;
    }

    /**
     * 建構{@link TableFilter}物件。
     *
     * @return 新的{@link TableFilter}物件實體
     */
    @SuppressWarnings("unchecked")
    public TableFilter<T> build(javafx.scene.control.TableView<T> arg0)
    {
        TableFilter<T> instance = new TableFilter<T>(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control;

/**
 * {@link GridCell}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.40.10.jar
 * @param <Z> 要建構的物件型態(需繼承{@link GridCell})
 * @param <B> 建構器本身的型態(需繼承{@link GridCellMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class GridCellMaker<T extends java.lang.Object, Z extends GridCell<T>, B extends GridCellMaker<T, Z, B>>
        extends javafx.scene.control.IndexedCellMaker<T, Z, B>
        implements GridCellMakerExt<T, Z, B>
{

    private boolean bound1GridView;
    private boolean bound2GridView;
    private javafx.beans.value.ObservableValue<? extends org.controlsfx.control.GridView<T>> obsrv1GridView;
    private javafx.beans.property.Property<org.controlsfx.control.GridView<T>> obsrv2GridView;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.bound1GridView)
            instance.gridViewProperty().bind(this.obsrv1GridView);
        if (this.bound2GridView)
            instance.gridViewProperty().bindBidirectional(this.obsrv2GridView);
    }

    /**
     * 設定屬性{@link GridCell#gridViewProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindGridView(javafx.beans.value.ObservableValue<? extends org.controlsfx.control.GridView<T>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1GridView = true;
        this.obsrv1GridView = source;
        this.bound2GridView = false;
        this.obsrv2GridView = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link GridCell#gridViewProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalGridView(javafx.beans.property.Property<org.controlsfx.control.GridView<T>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1GridView = false;
        this.obsrv1GridView = null;
        this.bound2GridView = true;
        this.obsrv2GridView = source;
        return (B) this;
    }

    /**
     * 建構{@link GridCell}物件。
     *
     * @return 新的{@link GridCell}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public GridCell<T> build()
    {
        GridCell<T> instance = new GridCell<T>();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

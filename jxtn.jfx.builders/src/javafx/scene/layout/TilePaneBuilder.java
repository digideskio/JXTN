// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.layout;

/**
 * {@link TilePane}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link TilePane})
 * @param <B> 建構器本身的型態(需繼承{@link TilePaneBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class TilePaneBuilder<Z extends TilePane, B extends TilePaneBuilder<Z, B>>
        extends javafx.scene.layout.PaneBuilder<Z, B>
        implements TilePaneBuilderExt<Z, B>
{

    private boolean hasAlignment;
    private javafx.geometry.Pos valAlignment;

    private boolean hasHgap;
    private double valHgap;

    private boolean hasOrientation;
    private javafx.geometry.Orientation valOrientation;

    private boolean hasPrefColumns;
    private int valPrefColumns;

    private boolean hasPrefRows;
    private int valPrefRows;

    private boolean hasPrefTileHeight;
    private double valPrefTileHeight;

    private boolean hasPrefTileWidth;
    private double valPrefTileWidth;

    private boolean hasTileAlignment;
    private javafx.geometry.Pos valTileAlignment;

    private boolean hasVgap;
    private double valVgap;

    private boolean bound1Alignment;
    private boolean bound2Alignment;
    private javafx.beans.value.ObservableValue<? extends javafx.geometry.Pos> obsrv1Alignment;
    private javafx.beans.property.Property<javafx.geometry.Pos> obsrv2Alignment;

    private boolean bound1Hgap;
    private boolean bound2Hgap;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Hgap;
    private javafx.beans.property.Property<Number> obsrv2Hgap;

    private boolean bound1Orientation;
    private boolean bound2Orientation;
    private javafx.beans.value.ObservableValue<? extends javafx.geometry.Orientation> obsrv1Orientation;
    private javafx.beans.property.Property<javafx.geometry.Orientation> obsrv2Orientation;

    private boolean bound1PrefColumns;
    private boolean bound2PrefColumns;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1PrefColumns;
    private javafx.beans.property.Property<Number> obsrv2PrefColumns;

    private boolean bound1PrefRows;
    private boolean bound2PrefRows;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1PrefRows;
    private javafx.beans.property.Property<Number> obsrv2PrefRows;

    private boolean bound1PrefTileHeight;
    private boolean bound2PrefTileHeight;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1PrefTileHeight;
    private javafx.beans.property.Property<Number> obsrv2PrefTileHeight;

    private boolean bound1PrefTileWidth;
    private boolean bound2PrefTileWidth;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1PrefTileWidth;
    private javafx.beans.property.Property<Number> obsrv2PrefTileWidth;

    private boolean bound1TileAlignment;
    private boolean bound2TileAlignment;
    private javafx.beans.value.ObservableValue<? extends javafx.geometry.Pos> obsrv1TileAlignment;
    private javafx.beans.property.Property<javafx.geometry.Pos> obsrv2TileAlignment;

    private boolean bound1Vgap;
    private boolean bound2Vgap;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Vgap;
    private javafx.beans.property.Property<Number> obsrv2Vgap;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasAlignment)
            instance.setAlignment(this.valAlignment);
        if (this.hasHgap)
            instance.setHgap(this.valHgap);
        if (this.hasOrientation)
            instance.setOrientation(this.valOrientation);
        if (this.hasPrefColumns)
            instance.setPrefColumns(this.valPrefColumns);
        if (this.hasPrefRows)
            instance.setPrefRows(this.valPrefRows);
        if (this.hasPrefTileHeight)
            instance.setPrefTileHeight(this.valPrefTileHeight);
        if (this.hasPrefTileWidth)
            instance.setPrefTileWidth(this.valPrefTileWidth);
        if (this.hasTileAlignment)
            instance.setTileAlignment(this.valTileAlignment);
        if (this.hasVgap)
            instance.setVgap(this.valVgap);
        if (this.bound1Alignment)
            instance.alignmentProperty().bind(this.obsrv1Alignment);
        if (this.bound2Alignment)
            instance.alignmentProperty().bindBidirectional(this.obsrv2Alignment);
        if (this.bound1Hgap)
            instance.hgapProperty().bind(this.obsrv1Hgap);
        if (this.bound2Hgap)
            instance.hgapProperty().bindBidirectional(this.obsrv2Hgap);
        if (this.bound1Orientation)
            instance.orientationProperty().bind(this.obsrv1Orientation);
        if (this.bound2Orientation)
            instance.orientationProperty().bindBidirectional(this.obsrv2Orientation);
        if (this.bound1PrefColumns)
            instance.prefColumnsProperty().bind(this.obsrv1PrefColumns);
        if (this.bound2PrefColumns)
            instance.prefColumnsProperty().bindBidirectional(this.obsrv2PrefColumns);
        if (this.bound1PrefRows)
            instance.prefRowsProperty().bind(this.obsrv1PrefRows);
        if (this.bound2PrefRows)
            instance.prefRowsProperty().bindBidirectional(this.obsrv2PrefRows);
        if (this.bound1PrefTileHeight)
            instance.prefTileHeightProperty().bind(this.obsrv1PrefTileHeight);
        if (this.bound2PrefTileHeight)
            instance.prefTileHeightProperty().bindBidirectional(this.obsrv2PrefTileHeight);
        if (this.bound1PrefTileWidth)
            instance.prefTileWidthProperty().bind(this.obsrv1PrefTileWidth);
        if (this.bound2PrefTileWidth)
            instance.prefTileWidthProperty().bindBidirectional(this.obsrv2PrefTileWidth);
        if (this.bound1TileAlignment)
            instance.tileAlignmentProperty().bind(this.obsrv1TileAlignment);
        if (this.bound2TileAlignment)
            instance.tileAlignmentProperty().bindBidirectional(this.obsrv2TileAlignment);
        if (this.bound1Vgap)
            instance.vgapProperty().bind(this.obsrv1Vgap);
        if (this.bound2Vgap)
            instance.vgapProperty().bindBidirectional(this.obsrv2Vgap);
    }

    /**
     * 設定屬性{@link TilePane#setAlignment(javafx.geometry.Pos)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B alignment(javafx.geometry.Pos value)
    {
        this.hasAlignment = true;
        this.valAlignment = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TilePane#setHgap(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B hgap(double value)
    {
        this.hasHgap = true;
        this.valHgap = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TilePane#setOrientation(javafx.geometry.Orientation)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B orientation(javafx.geometry.Orientation value)
    {
        this.hasOrientation = true;
        this.valOrientation = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TilePane#setPrefColumns(int)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B prefColumns(int value)
    {
        this.hasPrefColumns = true;
        this.valPrefColumns = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TilePane#setPrefRows(int)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B prefRows(int value)
    {
        this.hasPrefRows = true;
        this.valPrefRows = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TilePane#setPrefTileHeight(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B prefTileHeight(double value)
    {
        this.hasPrefTileHeight = true;
        this.valPrefTileHeight = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TilePane#setPrefTileWidth(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B prefTileWidth(double value)
    {
        this.hasPrefTileWidth = true;
        this.valPrefTileWidth = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TilePane#setTileAlignment(javafx.geometry.Pos)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B tileAlignment(javafx.geometry.Pos value)
    {
        this.hasTileAlignment = true;
        this.valTileAlignment = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TilePane#setVgap(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B vgap(double value)
    {
        this.hasVgap = true;
        this.valVgap = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TilePane#alignmentProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindAlignment(javafx.beans.value.ObservableValue<? extends javafx.geometry.Pos> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Alignment = true;
        this.obsrv1Alignment = source;
        this.bound2Alignment = false;
        this.obsrv2Alignment = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link TilePane#alignmentProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalAlignment(javafx.beans.property.Property<javafx.geometry.Pos> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Alignment = false;
        this.obsrv1Alignment = null;
        this.bound2Alignment = true;
        this.obsrv2Alignment = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TilePane#hgapProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindHgap(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Hgap = true;
        this.obsrv1Hgap = source;
        this.bound2Hgap = false;
        this.obsrv2Hgap = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link TilePane#hgapProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalHgap(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Hgap = false;
        this.obsrv1Hgap = null;
        this.bound2Hgap = true;
        this.obsrv2Hgap = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TilePane#orientationProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOrientation(javafx.beans.value.ObservableValue<? extends javafx.geometry.Orientation> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Orientation = true;
        this.obsrv1Orientation = source;
        this.bound2Orientation = false;
        this.obsrv2Orientation = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link TilePane#orientationProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalOrientation(javafx.beans.property.Property<javafx.geometry.Orientation> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Orientation = false;
        this.obsrv1Orientation = null;
        this.bound2Orientation = true;
        this.obsrv2Orientation = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TilePane#prefColumnsProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindPrefColumns(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1PrefColumns = true;
        this.obsrv1PrefColumns = source;
        this.bound2PrefColumns = false;
        this.obsrv2PrefColumns = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link TilePane#prefColumnsProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalPrefColumns(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1PrefColumns = false;
        this.obsrv1PrefColumns = null;
        this.bound2PrefColumns = true;
        this.obsrv2PrefColumns = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TilePane#prefRowsProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindPrefRows(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1PrefRows = true;
        this.obsrv1PrefRows = source;
        this.bound2PrefRows = false;
        this.obsrv2PrefRows = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link TilePane#prefRowsProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalPrefRows(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1PrefRows = false;
        this.obsrv1PrefRows = null;
        this.bound2PrefRows = true;
        this.obsrv2PrefRows = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TilePane#prefTileHeightProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindPrefTileHeight(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1PrefTileHeight = true;
        this.obsrv1PrefTileHeight = source;
        this.bound2PrefTileHeight = false;
        this.obsrv2PrefTileHeight = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link TilePane#prefTileHeightProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalPrefTileHeight(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1PrefTileHeight = false;
        this.obsrv1PrefTileHeight = null;
        this.bound2PrefTileHeight = true;
        this.obsrv2PrefTileHeight = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TilePane#prefTileWidthProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindPrefTileWidth(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1PrefTileWidth = true;
        this.obsrv1PrefTileWidth = source;
        this.bound2PrefTileWidth = false;
        this.obsrv2PrefTileWidth = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link TilePane#prefTileWidthProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalPrefTileWidth(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1PrefTileWidth = false;
        this.obsrv1PrefTileWidth = null;
        this.bound2PrefTileWidth = true;
        this.obsrv2PrefTileWidth = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TilePane#tileAlignmentProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindTileAlignment(javafx.beans.value.ObservableValue<? extends javafx.geometry.Pos> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1TileAlignment = true;
        this.obsrv1TileAlignment = source;
        this.bound2TileAlignment = false;
        this.obsrv2TileAlignment = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link TilePane#tileAlignmentProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalTileAlignment(javafx.beans.property.Property<javafx.geometry.Pos> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1TileAlignment = false;
        this.obsrv1TileAlignment = null;
        this.bound2TileAlignment = true;
        this.obsrv2TileAlignment = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TilePane#vgapProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindVgap(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Vgap = true;
        this.obsrv1Vgap = source;
        this.bound2Vgap = false;
        this.obsrv2Vgap = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link TilePane#vgapProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalVgap(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Vgap = false;
        this.obsrv1Vgap = null;
        this.bound2Vgap = true;
        this.obsrv2Vgap = source;
        return (B) this;
    }

    /**
     * 建構{@link TilePane}物件
     *
     * @return 新的{@link TilePane}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public TilePane build()
    {
        TilePane instance = new TilePane();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

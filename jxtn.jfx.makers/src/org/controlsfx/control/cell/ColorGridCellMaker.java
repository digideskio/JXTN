// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control.cell;

/**
 * {@link ColorGridCell}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.40.11-20151113.010656-84.jar
 * @param <Z> 要建構的物件型態(需繼承{@link ColorGridCell})
 * @param <B> 建構器本身的型態(需繼承{@link ColorGridCellMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ColorGridCellMaker<Z extends ColorGridCell, B extends ColorGridCellMaker<Z, B>>
        extends org.controlsfx.control.GridCellMaker<javafx.scene.paint.Color, Z, B>
        implements ColorGridCellMakerExt<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link ColorGridCell}物件。
     *
     * @return 新的{@link ColorGridCell}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public ColorGridCell build()
    {
        ColorGridCell instance = new ColorGridCell();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

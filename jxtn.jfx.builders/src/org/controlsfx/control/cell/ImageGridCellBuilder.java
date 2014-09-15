// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control.cell;

/**
 * {@link ImageGridCell}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.0.6_20.jar
 * @param <Z> 要建構的物件型態(需繼承{@link ImageGridCell})
 * @param <B> 建構器本身的型態(需繼承{@link ImageGridCellBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ImageGridCellBuilder<Z extends ImageGridCell, B extends ImageGridCellBuilder<Z, B>>
        extends org.controlsfx.control.GridCellBuilder<javafx.scene.image.Image, Z, B>
        implements ImageGridCellBuilderExt<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link ImageGridCell}物件
     *
     * @return 新的{@link ImageGridCell}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public ImageGridCell build()
    {
        ImageGridCell instance = new ImageGridCell();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

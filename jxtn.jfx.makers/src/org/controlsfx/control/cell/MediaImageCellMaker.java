// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control.cell;

/**
 * {@link MediaImageCell}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.40.10.jar
 * @param <Z> 要建構的物件型態(需繼承{@link MediaImageCell})
 * @param <B> 建構器本身的型態(需繼承{@link MediaImageCellMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class MediaImageCellMaker<Z extends MediaImageCell, B extends MediaImageCellMaker<Z, B>>
        extends org.controlsfx.control.GridCellMaker<javafx.scene.media.Media, Z, B>
        implements MediaImageCellMakerExt<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link MediaImageCell}物件。
     *
     * @return 新的{@link MediaImageCell}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public MediaImageCell build()
    {
        MediaImageCell instance = new MediaImageCell();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

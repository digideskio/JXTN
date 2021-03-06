// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene;

/**
 * {@link SnapshotParameters}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link SnapshotParameters})
 * @param <B> 建構器本身的型態(需繼承{@link SnapshotParametersMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class SnapshotParametersMaker<Z extends SnapshotParameters, B extends SnapshotParametersMaker<Z, B>>
        extends jxtn.jfx.makers.AbstractMaker<Z, B>
        implements SnapshotParametersMakerExt<Z, B>
{

    private boolean hasCamera;
    private javafx.scene.Camera valCamera;

    private boolean hasDepthBuffer;
    private boolean valDepthBuffer;

    private boolean hasFill;
    private javafx.scene.paint.Paint valFill;

    private boolean hasTransform;
    private javafx.scene.transform.Transform valTransform;

    private boolean hasViewport;
    private javafx.geometry.Rectangle2D valViewport;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasCamera)
            instance.setCamera(this.valCamera);
        if (this.hasDepthBuffer)
            instance.setDepthBuffer(this.valDepthBuffer);
        if (this.hasFill)
            instance.setFill(this.valFill);
        if (this.hasTransform)
            instance.setTransform(this.valTransform);
        if (this.hasViewport)
            instance.setViewport(this.valViewport);
    }

    /**
     * 設定屬性{@link SnapshotParameters#setCamera(javafx.scene.Camera)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B camera(javafx.scene.Camera value)
    {
        this.hasCamera = true;
        this.valCamera = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SnapshotParameters#setDepthBuffer(boolean)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B depthBuffer(boolean value)
    {
        this.hasDepthBuffer = true;
        this.valDepthBuffer = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SnapshotParameters#setFill(javafx.scene.paint.Paint)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B fill(javafx.scene.paint.Paint value)
    {
        this.hasFill = true;
        this.valFill = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SnapshotParameters#setTransform(javafx.scene.transform.Transform)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B transform(javafx.scene.transform.Transform value)
    {
        this.hasTransform = true;
        this.valTransform = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SnapshotParameters#setViewport(javafx.geometry.Rectangle2D)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B viewport(javafx.geometry.Rectangle2D value)
    {
        this.hasViewport = true;
        this.valViewport = value;
        return (B) this;
    }

    /**
     * 建構{@link SnapshotParameters}物件。
     *
     * @return 新的{@link SnapshotParameters}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public SnapshotParameters build()
    {
        SnapshotParameters instance = new SnapshotParameters();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

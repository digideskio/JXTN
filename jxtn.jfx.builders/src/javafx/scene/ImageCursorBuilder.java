// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene;

/**
 * {@link ImageCursor}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link ImageCursor})
 * @param <B> 建構器本身的型態(需繼承{@link ImageCursorBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ImageCursorBuilder<Z extends ImageCursor, B extends ImageCursorBuilder<Z, B>>
        extends javafx.scene.CursorBuilder<Z, B>
        implements ImageCursorBuilderExt<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link ImageCursor}物件
     *
     * @return 新的{@link ImageCursor}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public ImageCursor build()
    {
        ImageCursor instance = new ImageCursor();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link ImageCursor}物件
     *
     * @return 新的{@link ImageCursor}物件實體
     */
    @SuppressWarnings("unchecked")
    public ImageCursor build(javafx.scene.image.Image arg0)
    {
        ImageCursor instance = new ImageCursor(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link ImageCursor}物件
     *
     * @return 新的{@link ImageCursor}物件實體
     */
    @SuppressWarnings("unchecked")
    public ImageCursor build(javafx.scene.image.Image arg0, double arg1, double arg2)
    {
        ImageCursor instance = new ImageCursor(arg0, arg1, arg2);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

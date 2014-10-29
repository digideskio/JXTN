// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.image;

/**
 * {@link Image}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link Image})
 * @param <B> 建構器本身的型態(需繼承{@link ImageBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ImageBuilder<Z extends Image, B extends ImageBuilder<Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
        implements ImageBuilderExt<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link Image}物件。
     *
     * @return 新的{@link Image}物件實體
     */
    @SuppressWarnings("unchecked")
    public Image build(java.io.InputStream arg0)
    {
        Image instance = new Image(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link Image}物件。
     *
     * @return 新的{@link Image}物件實體
     */
    @SuppressWarnings("unchecked")
    public Image build(java.lang.String arg0)
    {
        Image instance = new Image(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link Image}物件。
     *
     * @return 新的{@link Image}物件實體
     */
    @SuppressWarnings("unchecked")
    public Image build(java.lang.String arg0, boolean arg1)
    {
        Image instance = new Image(arg0, arg1);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link Image}物件。
     *
     * @return 新的{@link Image}物件實體
     */
    @SuppressWarnings("unchecked")
    public Image build(java.lang.String arg0, double arg1, double arg2, boolean arg3, boolean arg4)
    {
        Image instance = new Image(arg0, arg1, arg2, arg3, arg4);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link Image}物件。
     *
     * @return 新的{@link Image}物件實體
     */
    @SuppressWarnings("unchecked")
    public Image build(java.io.InputStream arg0, double arg1, double arg2, boolean arg3, boolean arg4)
    {
        Image instance = new Image(arg0, arg1, arg2, arg3, arg4);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link Image}物件。
     *
     * @return 新的{@link Image}物件實體
     */
    @SuppressWarnings("unchecked")
    public Image build(java.lang.String arg0, double arg1, double arg2, boolean arg3, boolean arg4, boolean arg5)
    {
        Image instance = new Image(arg0, arg1, arg2, arg3, arg4, arg5);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

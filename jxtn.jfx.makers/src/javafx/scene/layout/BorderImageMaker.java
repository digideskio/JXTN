// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.layout;

/**
 * {@link BorderImage}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link BorderImage})
 * @param <B> 建構器本身的型態(需繼承{@link BorderImageMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class BorderImageMaker<Z extends BorderImage, B extends BorderImageMaker<Z, B>>
        extends jxtn.jfx.makers.AbstractMaker<Z, B>
        implements BorderImageMakerExt<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link BorderImage}物件。
     *
     * @return 新的{@link BorderImage}物件實體
     */
    @SuppressWarnings("unchecked")
    public BorderImage build(javafx.scene.image.Image arg0, javafx.scene.layout.BorderWidths arg1, javafx.geometry.Insets arg2, javafx.scene.layout.BorderWidths arg3, boolean arg4, javafx.scene.layout.BorderRepeat arg5, javafx.scene.layout.BorderRepeat arg6)
    {
        BorderImage instance = new BorderImage(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.paint;

/**
 * {@link Color}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link Color})
 * @param <B> 建構器本身的型態(需繼承{@link ColorBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ColorBuilder<Z extends Color, B extends ColorBuilder<Z, B>>
        extends javafx.scene.paint.PaintBuilder<Z, B>
        implements ColorBuilderExt<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link Color}物件
     *
     * @return 新的{@link Color}物件實體
     */
    @SuppressWarnings("unchecked")
    public Color build(double arg0, double arg1, double arg2, double arg3)
    {
        Color instance = new Color(arg0, arg1, arg2, arg3);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

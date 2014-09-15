// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.layout;

/**
 * {@link CornerRadii}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link CornerRadii})
 * @param <B> 建構器本身的型態(需繼承{@link CornerRadiiBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class CornerRadiiBuilder<Z extends CornerRadii, B extends CornerRadiiBuilder<Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
        implements jxtn.jfx.builders.AbstractBuilderExt<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link CornerRadii}物件
     *
     * @return 新的{@link CornerRadii}物件實體
     */
    @SuppressWarnings("unchecked")
    public CornerRadii build(double arg0)
    {
        CornerRadii instance = new CornerRadii(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

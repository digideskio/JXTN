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
        implements CornerRadiiBuilderExt<Z, B>
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

    /**
     * 建構{@link CornerRadii}物件
     *
     * @return 新的{@link CornerRadii}物件實體
     */
    @SuppressWarnings("unchecked")
    public CornerRadii build(double arg0, boolean arg1)
    {
        CornerRadii instance = new CornerRadii(arg0, arg1);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link CornerRadii}物件
     *
     * @return 新的{@link CornerRadii}物件實體
     */
    @SuppressWarnings("unchecked")
    public CornerRadii build(double arg0, double arg1, double arg2, double arg3, boolean arg4)
    {
        CornerRadii instance = new CornerRadii(arg0, arg1, arg2, arg3, arg4);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link CornerRadii}物件
     *
     * @return 新的{@link CornerRadii}物件實體
     */
    @SuppressWarnings("unchecked")
    public CornerRadii build(double arg0, double arg1, double arg2, double arg3, double arg4, double arg5, double arg6, double arg7, boolean arg8, boolean arg9, boolean arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15)
    {
        CornerRadii instance = new CornerRadii(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

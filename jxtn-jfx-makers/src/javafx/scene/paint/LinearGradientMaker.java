// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.paint;

/**
 * {@link LinearGradient}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link LinearGradient})
 * @param <B> 建構器本身的型態(需繼承{@link LinearGradientMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class LinearGradientMaker<Z extends LinearGradient, B extends LinearGradientMaker<Z, B>>
        extends javafx.scene.paint.PaintMaker<Z, B>
        implements LinearGradientMakerExt<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link LinearGradient}物件。
     *
     * @return 新的{@link LinearGradient}物件實體
     */
    @SuppressWarnings("unchecked")
    public LinearGradient build(double arg0, double arg1, double arg2, double arg3, boolean arg4, javafx.scene.paint.CycleMethod arg5, java.util.List<javafx.scene.paint.Stop> arg6)
    {
        LinearGradient instance = new LinearGradient(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link LinearGradient}物件。
     *
     * @return 新的{@link LinearGradient}物件實體
     */
    @SuppressWarnings("unchecked")
    public LinearGradient build(double arg0, double arg1, double arg2, double arg3, boolean arg4, javafx.scene.paint.CycleMethod arg5, javafx.scene.paint.Stop[] arg6)
    {
        LinearGradient instance = new LinearGradient(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

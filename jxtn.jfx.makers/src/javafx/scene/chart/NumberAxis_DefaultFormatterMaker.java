// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.chart;

/**
 * {@link NumberAxis.DefaultFormatter}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link NumberAxis.DefaultFormatter})
 * @param <B> 建構器本身的型態(需繼承{@link NumberAxis.DefaultFormatterMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class NumberAxis_DefaultFormatterMaker<Z extends NumberAxis.DefaultFormatter, B extends NumberAxis_DefaultFormatterMaker<Z, B>>
        extends jxtn.jfx.makers.AbstractMaker<Z, B>
        implements NumberAxis_DefaultFormatterMakerExt<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link NumberAxis.DefaultFormatter}物件。
     *
     * @return 新的{@link NumberAxis.DefaultFormatter}物件實體
     */
    @SuppressWarnings("unchecked")
    public NumberAxis.DefaultFormatter build(javafx.scene.chart.NumberAxis arg0)
    {
        NumberAxis.DefaultFormatter instance = new NumberAxis.DefaultFormatter(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link NumberAxis.DefaultFormatter}物件。
     *
     * @return 新的{@link NumberAxis.DefaultFormatter}物件實體
     */
    @SuppressWarnings("unchecked")
    public NumberAxis.DefaultFormatter build(javafx.scene.chart.NumberAxis arg0, java.lang.String arg1, java.lang.String arg2)
    {
        NumberAxis.DefaultFormatter instance = new NumberAxis.DefaultFormatter(arg0, arg1, arg2);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

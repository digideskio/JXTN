// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link ResizeFeaturesBase}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link ResizeFeaturesBase})
 * @param <B> 建構器本身的型態(需繼承{@link ResizeFeaturesBaseBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ResizeFeaturesBaseBuilder<S extends java.lang.Object, Z extends ResizeFeaturesBase<S>, B extends ResizeFeaturesBaseBuilder<S, Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
        implements ResizeFeaturesBaseBuilderExt<S, Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link ResizeFeaturesBase}物件。
     *
     * @return 新的{@link ResizeFeaturesBase}物件實體
     */
    @SuppressWarnings("unchecked")
    public ResizeFeaturesBase<S> build(javafx.scene.control.TableColumnBase<S, ?> arg0, java.lang.Double arg1)
    {
        ResizeFeaturesBase<S> instance = new ResizeFeaturesBase<S>(arg0, arg1);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

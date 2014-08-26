// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene;

/**
 * {@link AmbientLight}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class AmbientLightBuilder<Z extends AmbientLight, B extends AmbientLightBuilder<Z, B>>
        extends javafx.scene.LightBaseBuilder<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link AmbientLight}物件
     *
     * @return 新的{@link AmbientLight}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public AmbientLight build()
    {
        AmbientLight instance = new AmbientLight();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
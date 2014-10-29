// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control.cell;

/**
 * {@link PropertyValueFactory}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link PropertyValueFactory})
 * @param <B> 建構器本身的型態(需繼承{@link PropertyValueFactoryBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class PropertyValueFactoryBuilder<S extends java.lang.Object, T extends java.lang.Object, Z extends PropertyValueFactory<S, T>, B extends PropertyValueFactoryBuilder<S, T, Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
        implements PropertyValueFactoryBuilderExt<S, T, Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link PropertyValueFactory}物件。
     *
     * @return 新的{@link PropertyValueFactory}物件實體
     */
    @SuppressWarnings("unchecked")
    public PropertyValueFactory<S, T> build(java.lang.String arg0)
    {
        PropertyValueFactory<S, T> instance = new PropertyValueFactory<S, T>(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control.action;

/**
 * {@link DefaultActionFactory}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.40.10.jar
 * @param <Z> 要建構的物件型態(需繼承{@link DefaultActionFactory})
 * @param <B> 建構器本身的型態(需繼承{@link DefaultActionFactoryMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class DefaultActionFactoryMaker<Z extends DefaultActionFactory, B extends DefaultActionFactoryMaker<Z, B>>
        extends jxtn.jfx.makers.AbstractMaker<Z, B>
        implements DefaultActionFactoryMakerExt<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link DefaultActionFactory}物件。
     *
     * @return 新的{@link DefaultActionFactory}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public DefaultActionFactory build()
    {
        DefaultActionFactory instance = new DefaultActionFactory();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

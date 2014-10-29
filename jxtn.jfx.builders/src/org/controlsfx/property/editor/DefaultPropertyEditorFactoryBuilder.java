// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.property.editor;

/**
 * {@link DefaultPropertyEditorFactory}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.20.7.jar
 * @param <Z> 要建構的物件型態(需繼承{@link DefaultPropertyEditorFactory})
 * @param <B> 建構器本身的型態(需繼承{@link DefaultPropertyEditorFactoryBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class DefaultPropertyEditorFactoryBuilder<Z extends DefaultPropertyEditorFactory, B extends DefaultPropertyEditorFactoryBuilder<Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
        implements DefaultPropertyEditorFactoryBuilderExt<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link DefaultPropertyEditorFactory}物件。
     *
     * @return 新的{@link DefaultPropertyEditorFactory}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public DefaultPropertyEditorFactory build()
    {
        DefaultPropertyEditorFactory instance = new DefaultPropertyEditorFactory();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

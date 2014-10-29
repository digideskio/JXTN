// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.tools;

/**
 * {@link Utils}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.20.7.jar
 * @param <Z> 要建構的物件型態(需繼承{@link Utils})
 * @param <B> 建構器本身的型態(需繼承{@link UtilsBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class UtilsBuilder<Z extends Utils, B extends UtilsBuilder<Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
        implements UtilsBuilderExt<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link Utils}物件。
     *
     * @return 新的{@link Utils}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Utils build()
    {
        Utils instance = new Utils();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

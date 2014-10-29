// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.dialog;

/**
 * {@link FontSelectorDialog}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.20.7.jar
 * @param <Z> 要建構的物件型態(需繼承{@link FontSelectorDialog})
 * @param <B> 建構器本身的型態(需繼承{@link FontSelectorDialogBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class FontSelectorDialogBuilder<Z extends FontSelectorDialog, B extends FontSelectorDialogBuilder<Z, B>>
        extends javafx.scene.control.DialogBuilder<javafx.scene.text.Font, Z, B>
        implements FontSelectorDialogBuilderExt<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link FontSelectorDialog}物件。
     *
     * @return 新的{@link FontSelectorDialog}物件實體
     */
    @SuppressWarnings("unchecked")
    public FontSelectorDialog build(javafx.scene.text.Font arg0)
    {
        FontSelectorDialog instance = new FontSelectorDialog(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

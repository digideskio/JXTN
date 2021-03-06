// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.dialog;

/**
 * {@link CommandLinksDialog.CommandLinksButtonType}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.40.10.jar
 * @param <Z> 要建構的物件型態(需繼承{@link CommandLinksDialog.CommandLinksButtonType})
 * @param <B> 建構器本身的型態(需繼承{@link CommandLinksDialog.CommandLinksButtonTypeMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class CommandLinksDialog_CommandLinksButtonTypeMaker<Z extends CommandLinksDialog.CommandLinksButtonType, B extends CommandLinksDialog_CommandLinksButtonTypeMaker<Z, B>>
        extends jxtn.jfx.makers.AbstractMaker<Z, B>
        implements CommandLinksDialog_CommandLinksButtonTypeMakerExt<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link CommandLinksDialog.CommandLinksButtonType}物件。
     *
     * @return 新的{@link CommandLinksDialog.CommandLinksButtonType}物件實體
     */
    @SuppressWarnings("unchecked")
    public CommandLinksDialog.CommandLinksButtonType build(java.lang.String arg0, boolean arg1)
    {
        CommandLinksDialog.CommandLinksButtonType instance = new CommandLinksDialog.CommandLinksButtonType(arg0, arg1);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link CommandLinksDialog.CommandLinksButtonType}物件。
     *
     * @return 新的{@link CommandLinksDialog.CommandLinksButtonType}物件實體
     */
    @SuppressWarnings("unchecked")
    public CommandLinksDialog.CommandLinksButtonType build(java.lang.String arg0, java.lang.String arg1, boolean arg2)
    {
        CommandLinksDialog.CommandLinksButtonType instance = new CommandLinksDialog.CommandLinksButtonType(arg0, arg1, arg2);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link CommandLinksDialog.CommandLinksButtonType}物件。
     *
     * @return 新的{@link CommandLinksDialog.CommandLinksButtonType}物件實體
     */
    @SuppressWarnings("unchecked")
    public CommandLinksDialog.CommandLinksButtonType build(java.lang.String arg0, java.lang.String arg1, javafx.scene.Node arg2, boolean arg3)
    {
        CommandLinksDialog.CommandLinksButtonType instance = new CommandLinksDialog.CommandLinksButtonType(arg0, arg1, arg2, arg3);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.dialog;

/**
 * {@link CommandLinksDialog}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.40.10.jar
 * @param <Z> 要建構的物件型態(需繼承{@link CommandLinksDialog})
 * @param <B> 建構器本身的型態(需繼承{@link CommandLinksDialogMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class CommandLinksDialogMaker<Z extends CommandLinksDialog, B extends CommandLinksDialogMaker<Z, B>>
        extends javafx.scene.control.DialogMaker<javafx.scene.control.ButtonType, Z, B>
        implements CommandLinksDialogMakerExt<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link CommandLinksDialog}物件。
     *
     * @return 新的{@link CommandLinksDialog}物件實體
     */
    @SuppressWarnings("unchecked")
    public CommandLinksDialog build(java.util.List<org.controlsfx.dialog.CommandLinksDialog.CommandLinksButtonType> arg0)
    {
        CommandLinksDialog instance = new CommandLinksDialog(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link CommandLinksDialog}物件。
     *
     * @return 新的{@link CommandLinksDialog}物件實體
     */
    @SuppressWarnings("unchecked")
    public CommandLinksDialog build(org.controlsfx.dialog.CommandLinksDialog.CommandLinksButtonType[] arg0)
    {
        CommandLinksDialog instance = new CommandLinksDialog(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

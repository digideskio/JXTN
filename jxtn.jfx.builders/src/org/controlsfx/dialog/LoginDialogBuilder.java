// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.dialog;

/**
 * {@link LoginDialog}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.20.7.jar
 * @param <Z> 要建構的物件型態(需繼承{@link LoginDialog})
 * @param <B> 建構器本身的型態(需繼承{@link LoginDialogBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class LoginDialogBuilder<Z extends LoginDialog, B extends LoginDialogBuilder<Z, B>>
        extends javafx.scene.control.DialogBuilder<javafx.util.Pair<java.lang.String, java.lang.String>, Z, B>
        implements LoginDialogBuilderExt<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link LoginDialog}物件
     *
     * @return 新的{@link LoginDialog}物件實體
     */
    @SuppressWarnings("unchecked")
    public LoginDialog build(javafx.util.Pair<java.lang.String, java.lang.String> arg0, javafx.util.Callback<javafx.util.Pair<java.lang.String, java.lang.String>, java.lang.Void> arg1)
    {
        LoginDialog instance = new LoginDialog(arg0, arg1);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

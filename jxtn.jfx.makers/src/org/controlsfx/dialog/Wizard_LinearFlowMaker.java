// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.dialog;

/**
 * {@link Wizard.LinearFlow}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.40.11-20151113.010656-84.jar
 * @param <Z> 要建構的物件型態(需繼承{@link Wizard.LinearFlow})
 * @param <B> 建構器本身的型態(需繼承{@link Wizard.LinearFlowMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class Wizard_LinearFlowMaker<Z extends Wizard.LinearFlow, B extends Wizard_LinearFlowMaker<Z, B>>
        extends jxtn.jfx.makers.AbstractMaker<Z, B>
        implements Wizard_LinearFlowMakerExt<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link Wizard.LinearFlow}物件。
     *
     * @return 新的{@link Wizard.LinearFlow}物件實體
     */
    @SuppressWarnings("unchecked")
    public Wizard.LinearFlow build(java.util.Collection<org.controlsfx.dialog.WizardPane> arg0)
    {
        Wizard.LinearFlow instance = new Wizard.LinearFlow(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link Wizard.LinearFlow}物件。
     *
     * @return 新的{@link Wizard.LinearFlow}物件實體
     */
    @SuppressWarnings("unchecked")
    public Wizard.LinearFlow build(org.controlsfx.dialog.WizardPane[] arg0)
    {
        Wizard.LinearFlow instance = new Wizard.LinearFlow(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control;

/**
 * {@link ToggleSwitch}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.40.10.jar
 * @param <Z> 要建構的物件型態(需繼承{@link ToggleSwitch})
 * @param <B> 建構器本身的型態(需繼承{@link ToggleSwitchMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ToggleSwitchMaker<Z extends ToggleSwitch, B extends ToggleSwitchMaker<Z, B>>
        extends javafx.scene.control.LabeledMaker<Z, B>
        implements ToggleSwitchMakerExt<Z, B>
{

    private boolean hasSelected;
    private boolean valSelected;

    private boolean bound1Selected;
    private boolean bound2Selected;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1Selected;
    private javafx.beans.property.Property<Boolean> obsrv2Selected;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasSelected)
            instance.setSelected(this.valSelected);
        if (this.bound1Selected)
            instance.selectedProperty().bind(this.obsrv1Selected);
        if (this.bound2Selected)
            instance.selectedProperty().bindBidirectional(this.obsrv2Selected);
    }

    /**
     * 設定屬性{@link ToggleSwitch#setSelected(boolean)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B selected(boolean value)
    {
        this.hasSelected = true;
        this.valSelected = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ToggleSwitch#selectedProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindSelected(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Selected = true;
        this.obsrv1Selected = source;
        this.bound2Selected = false;
        this.obsrv2Selected = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ToggleSwitch#selectedProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalSelected(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Selected = false;
        this.obsrv1Selected = null;
        this.bound2Selected = true;
        this.obsrv2Selected = source;
        return (B) this;
    }

    /**
     * 建構{@link ToggleSwitch}物件。
     *
     * @return 新的{@link ToggleSwitch}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public ToggleSwitch build()
    {
        ToggleSwitch instance = new ToggleSwitch();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link ToggleSwitch}物件。
     *
     * @return 新的{@link ToggleSwitch}物件實體
     */
    @SuppressWarnings("unchecked")
    public ToggleSwitch build(java.lang.String arg0)
    {
        ToggleSwitch instance = new ToggleSwitch(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

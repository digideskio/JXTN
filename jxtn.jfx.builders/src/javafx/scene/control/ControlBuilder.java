// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link Control}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link Control})
 * @param <B> 建構器本身的型態(需繼承{@link ControlBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ControlBuilder<Z extends Control, B extends ControlBuilder<Z, B>>
        extends javafx.scene.layout.RegionBuilder<Z, B>
        implements ControlBuilderExt<Z, B>
{

    private boolean hasContextMenu;
    private javafx.scene.control.ContextMenu valContextMenu;

    private boolean hasSkin;
    private javafx.scene.control.Skin<?> valSkin;

    private boolean hasTooltip;
    private javafx.scene.control.Tooltip valTooltip;

    private boolean bound1ContextMenu;
    private boolean bound2ContextMenu;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.control.ContextMenu> obsrv1ContextMenu;
    private javafx.beans.property.Property<javafx.scene.control.ContextMenu> obsrv2ContextMenu;

    private boolean bound1Skin;
    private boolean bound2Skin;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.control.Skin<?>> obsrv1Skin;
    private javafx.beans.property.Property<javafx.scene.control.Skin<?>> obsrv2Skin;

    private boolean bound1Tooltip;
    private boolean bound2Tooltip;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.control.Tooltip> obsrv1Tooltip;
    private javafx.beans.property.Property<javafx.scene.control.Tooltip> obsrv2Tooltip;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasContextMenu)
            instance.setContextMenu(this.valContextMenu);
        if (this.hasSkin)
            instance.setSkin(this.valSkin);
        if (this.hasTooltip)
            instance.setTooltip(this.valTooltip);
        if (this.bound1ContextMenu)
            instance.contextMenuProperty().bind(this.obsrv1ContextMenu);
        if (this.bound2ContextMenu)
            instance.contextMenuProperty().bindBidirectional(this.obsrv2ContextMenu);
        if (this.bound1Skin)
            instance.skinProperty().bind(this.obsrv1Skin);
        if (this.bound2Skin)
            instance.skinProperty().bindBidirectional(this.obsrv2Skin);
        if (this.bound1Tooltip)
            instance.tooltipProperty().bind(this.obsrv1Tooltip);
        if (this.bound2Tooltip)
            instance.tooltipProperty().bindBidirectional(this.obsrv2Tooltip);
    }

    /**
     * 設定屬性{@link Control#setContextMenu(javafx.scene.control.ContextMenu)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B contextMenu(javafx.scene.control.ContextMenu value)
    {
        this.hasContextMenu = true;
        this.valContextMenu = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Control#setSkin(javafx.scene.control.Skin)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B skin(javafx.scene.control.Skin<?> value)
    {
        this.hasSkin = true;
        this.valSkin = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Control#setTooltip(javafx.scene.control.Tooltip)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B tooltip(javafx.scene.control.Tooltip value)
    {
        this.hasTooltip = true;
        this.valTooltip = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Control#contextMenuProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindContextMenu(javafx.beans.value.ObservableValue<? extends javafx.scene.control.ContextMenu> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ContextMenu = true;
        this.obsrv1ContextMenu = source;
        this.bound2ContextMenu = false;
        this.obsrv2ContextMenu = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Control#contextMenuProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalContextMenu(javafx.beans.property.Property<javafx.scene.control.ContextMenu> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ContextMenu = false;
        this.obsrv1ContextMenu = null;
        this.bound2ContextMenu = true;
        this.obsrv2ContextMenu = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Control#skinProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindSkin(javafx.beans.value.ObservableValue<? extends javafx.scene.control.Skin<?>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Skin = true;
        this.obsrv1Skin = source;
        this.bound2Skin = false;
        this.obsrv2Skin = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Control#skinProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalSkin(javafx.beans.property.Property<javafx.scene.control.Skin<?>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Skin = false;
        this.obsrv1Skin = null;
        this.bound2Skin = true;
        this.obsrv2Skin = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Control#tooltipProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindTooltip(javafx.beans.value.ObservableValue<? extends javafx.scene.control.Tooltip> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Tooltip = true;
        this.obsrv1Tooltip = source;
        this.bound2Tooltip = false;
        this.obsrv2Tooltip = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Control#tooltipProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalTooltip(javafx.beans.property.Property<javafx.scene.control.Tooltip> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Tooltip = false;
        this.obsrv1Tooltip = null;
        this.bound2Tooltip = true;
        this.obsrv2Tooltip = source;
        return (B) this;
    }
}

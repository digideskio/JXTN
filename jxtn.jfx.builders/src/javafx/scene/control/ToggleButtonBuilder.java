// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link ToggleButton}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link ToggleButton})
 * @param <B> 建構器本身的型態(需繼承{@link ToggleButtonBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ToggleButtonBuilder<Z extends ToggleButton, B extends ToggleButtonBuilder<Z, B>>
        extends javafx.scene.control.ButtonBaseBuilder<Z, B>
        implements ToggleButtonBuilderExt<Z, B>
{

    private boolean hasSelected;
    private boolean valSelected;

    private boolean hasToggleGroup;
    private javafx.scene.control.ToggleGroup valToggleGroup;

    private boolean bound1Selected;
    private boolean bound2Selected;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1Selected;
    private javafx.beans.property.Property<Boolean> obsrv2Selected;

    private boolean bound1ToggleGroup;
    private boolean bound2ToggleGroup;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.control.ToggleGroup> obsrv1ToggleGroup;
    private javafx.beans.property.Property<javafx.scene.control.ToggleGroup> obsrv2ToggleGroup;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasSelected)
            instance.setSelected(this.valSelected);
        if (this.hasToggleGroup)
            instance.setToggleGroup(this.valToggleGroup);
        if (this.bound1Selected)
            instance.selectedProperty().bind(this.obsrv1Selected);
        if (this.bound2Selected)
            instance.selectedProperty().bindBidirectional(this.obsrv2Selected);
        if (this.bound1ToggleGroup)
            instance.toggleGroupProperty().bind(this.obsrv1ToggleGroup);
        if (this.bound2ToggleGroup)
            instance.toggleGroupProperty().bindBidirectional(this.obsrv2ToggleGroup);
    }

    /**
     * 設定屬性{@link ToggleButton#setSelected(boolean)}。
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
     * 設定屬性{@link ToggleButton#setToggleGroup(javafx.scene.control.ToggleGroup)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B toggleGroup(javafx.scene.control.ToggleGroup value)
    {
        this.hasToggleGroup = true;
        this.valToggleGroup = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ToggleButton#selectedProperty}的連結。
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
     * 設定屬性{@link ToggleButton#selectedProperty}的雙向連結。
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
     * 設定屬性{@link ToggleButton#toggleGroupProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindToggleGroup(javafx.beans.value.ObservableValue<? extends javafx.scene.control.ToggleGroup> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ToggleGroup = true;
        this.obsrv1ToggleGroup = source;
        this.bound2ToggleGroup = false;
        this.obsrv2ToggleGroup = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ToggleButton#toggleGroupProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalToggleGroup(javafx.beans.property.Property<javafx.scene.control.ToggleGroup> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ToggleGroup = false;
        this.obsrv1ToggleGroup = null;
        this.bound2ToggleGroup = true;
        this.obsrv2ToggleGroup = source;
        return (B) this;
    }

    /**
     * 建構{@link ToggleButton}物件。
     *
     * @return 新的{@link ToggleButton}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public ToggleButton build()
    {
        ToggleButton instance = new ToggleButton();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link ToggleButton}物件。
     *
     * @return 新的{@link ToggleButton}物件實體
     */
    @SuppressWarnings("unchecked")
    public ToggleButton build(java.lang.String arg0)
    {
        ToggleButton instance = new ToggleButton(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link ToggleButton}物件。
     *
     * @return 新的{@link ToggleButton}物件實體
     */
    @SuppressWarnings("unchecked")
    public ToggleButton build(java.lang.String arg0, javafx.scene.Node arg1)
    {
        ToggleButton instance = new ToggleButton(arg0, arg1);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

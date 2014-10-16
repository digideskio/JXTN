// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control;

/**
 * {@link SegmentedButton}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.20.7.jar
 * @param <Z> 要建構的物件型態(需繼承{@link SegmentedButton})
 * @param <B> 建構器本身的型態(需繼承{@link SegmentedButtonBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class SegmentedButtonBuilder<Z extends SegmentedButton, B extends SegmentedButtonBuilder<Z, B>>
        extends javafx.scene.control.ControlBuilder<Z, B>
        implements SegmentedButtonBuilderExt<Z, B>
{

    private boolean hasButtons;
    private java.util.Collection<javafx.scene.control.ToggleButton> valButtons;

    private boolean hasToggleGroup;
    private javafx.scene.control.ToggleGroup valToggleGroup;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasButtons)
            instance.getButtons().addAll(this.valButtons);
        if (this.hasToggleGroup)
            instance.setToggleGroup(this.valToggleGroup);
    }

    /**
     * 設定集合屬性{@link SegmentedButton#getButtons}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B buttons(java.util.Collection<javafx.scene.control.ToggleButton> value)
    {
        this.hasButtons = true;
        this.valButtons = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link SegmentedButton#getButtons}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B buttons(javafx.scene.control.ToggleButton... value)
    {
        this.hasButtons = true;
        this.valButtons = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link SegmentedButton#getButtons}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B buttonsAdd(java.util.Collection<javafx.scene.control.ToggleButton> value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasButtons = true;
        if (this.valButtons == null)
            this.valButtons = new java.util.ArrayList<>(value.size());
        this.valButtons.addAll(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link SegmentedButton#getButtons}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B buttonsAdd(javafx.scene.control.ToggleButton... value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasButtons = true;
        if (this.valButtons == null)
            this.valButtons = new java.util.ArrayList<>(value.length);
        this.valButtons.addAll(java.util.Arrays.asList(value));
        return (B) this;
    }

    /**
     * 設定屬性{@link SegmentedButton#setToggleGroup(javafx.scene.control.ToggleGroup)}
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
     * 建構{@link SegmentedButton}物件
     *
     * @return 新的{@link SegmentedButton}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public SegmentedButton build()
    {
        SegmentedButton instance = new SegmentedButton();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link SegmentedButton}物件
     *
     * @return 新的{@link SegmentedButton}物件實體
     */
    @SuppressWarnings("unchecked")
    public SegmentedButton build(javafx.collections.ObservableList<javafx.scene.control.ToggleButton> arg0)
    {
        SegmentedButton instance = new SegmentedButton(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link SegmentedButton}物件
     *
     * @return 新的{@link SegmentedButton}物件實體
     */
    @SuppressWarnings("unchecked")
    public SegmentedButton build(javafx.scene.control.ToggleButton[] arg0)
    {
        SegmentedButton instance = new SegmentedButton(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link ColorPicker}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link ColorPicker})
 * @param <B> 建構器本身的型態(需繼承{@link ColorPickerBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ColorPickerBuilder<Z extends ColorPicker, B extends ColorPickerBuilder<Z, B>>
        extends javafx.scene.control.ComboBoxBaseBuilder<javafx.scene.paint.Color, Z, B>
        implements ColorPickerBuilderExt<Z, B>
{

    private boolean hasCustomColors;
    private java.util.Collection<javafx.scene.paint.Color> valCustomColors;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasCustomColors)
            instance.getCustomColors().addAll(this.valCustomColors);
    }

    /**
     * 設定集合屬性{@link ColorPicker#getCustomColors}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B customColors(java.util.Collection<javafx.scene.paint.Color> value)
    {
        this.hasCustomColors = true;
        this.valCustomColors = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link ColorPicker#getCustomColors}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B customColors(javafx.scene.paint.Color... value)
    {
        this.hasCustomColors = true;
        this.valCustomColors = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link ColorPicker#getCustomColors}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B customColorsAdd(java.util.Collection<javafx.scene.paint.Color> value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasCustomColors = true;
        if (this.valCustomColors == null)
            this.valCustomColors = new java.util.ArrayList<>(value.size());
        this.valCustomColors.addAll(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link ColorPicker#getCustomColors}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B customColorsAdd(javafx.scene.paint.Color... value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasCustomColors = true;
        if (this.valCustomColors == null)
            this.valCustomColors = new java.util.ArrayList<>(value.length);
        this.valCustomColors.addAll(java.util.Arrays.asList(value));
        return (B) this;
    }

    /**
     * 建構{@link ColorPicker}物件
     *
     * @return 新的{@link ColorPicker}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public ColorPicker build()
    {
        ColorPicker instance = new ColorPicker();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

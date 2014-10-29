// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.canvas;

/**
 * {@link GraphicsContext}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link GraphicsContext})
 * @param <B> 建構器本身的型態(需繼承{@link GraphicsContextBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class GraphicsContextBuilder<Z extends GraphicsContext, B extends GraphicsContextBuilder<Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
        implements GraphicsContextBuilderExt<Z, B>
{

    private boolean hasEffect;
    private javafx.scene.effect.Effect valEffect;

    private boolean hasFill;
    private javafx.scene.paint.Paint valFill;

    private boolean hasFillRule;
    private javafx.scene.shape.FillRule valFillRule;

    private boolean hasFont;
    private javafx.scene.text.Font valFont;

    private boolean hasGlobalAlpha;
    private double valGlobalAlpha;

    private boolean hasGlobalBlendMode;
    private javafx.scene.effect.BlendMode valGlobalBlendMode;

    private boolean hasLineCap;
    private javafx.scene.shape.StrokeLineCap valLineCap;

    private boolean hasLineJoin;
    private javafx.scene.shape.StrokeLineJoin valLineJoin;

    private boolean hasLineWidth;
    private double valLineWidth;

    private boolean hasMiterLimit;
    private double valMiterLimit;

    private boolean hasStroke;
    private javafx.scene.paint.Paint valStroke;

    private boolean hasTextAlign;
    private javafx.scene.text.TextAlignment valTextAlign;

    private boolean hasTextBaseline;
    private javafx.geometry.VPos valTextBaseline;

    private boolean hasTransform;
    private javafx.scene.transform.Affine valTransform;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasEffect)
            instance.setEffect(this.valEffect);
        if (this.hasFill)
            instance.setFill(this.valFill);
        if (this.hasFillRule)
            instance.setFillRule(this.valFillRule);
        if (this.hasFont)
            instance.setFont(this.valFont);
        if (this.hasGlobalAlpha)
            instance.setGlobalAlpha(this.valGlobalAlpha);
        if (this.hasGlobalBlendMode)
            instance.setGlobalBlendMode(this.valGlobalBlendMode);
        if (this.hasLineCap)
            instance.setLineCap(this.valLineCap);
        if (this.hasLineJoin)
            instance.setLineJoin(this.valLineJoin);
        if (this.hasLineWidth)
            instance.setLineWidth(this.valLineWidth);
        if (this.hasMiterLimit)
            instance.setMiterLimit(this.valMiterLimit);
        if (this.hasStroke)
            instance.setStroke(this.valStroke);
        if (this.hasTextAlign)
            instance.setTextAlign(this.valTextAlign);
        if (this.hasTextBaseline)
            instance.setTextBaseline(this.valTextBaseline);
        if (this.hasTransform)
            instance.setTransform(this.valTransform);
    }

    /**
     * 設定屬性{@link GraphicsContext#setEffect(javafx.scene.effect.Effect)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B effect(javafx.scene.effect.Effect value)
    {
        this.hasEffect = true;
        this.valEffect = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link GraphicsContext#setFill(javafx.scene.paint.Paint)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B fill(javafx.scene.paint.Paint value)
    {
        this.hasFill = true;
        this.valFill = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link GraphicsContext#setFillRule(javafx.scene.shape.FillRule)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B fillRule(javafx.scene.shape.FillRule value)
    {
        this.hasFillRule = true;
        this.valFillRule = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link GraphicsContext#setFont(javafx.scene.text.Font)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B font(javafx.scene.text.Font value)
    {
        this.hasFont = true;
        this.valFont = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link GraphicsContext#setGlobalAlpha(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B globalAlpha(double value)
    {
        this.hasGlobalAlpha = true;
        this.valGlobalAlpha = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link GraphicsContext#setGlobalBlendMode(javafx.scene.effect.BlendMode)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B globalBlendMode(javafx.scene.effect.BlendMode value)
    {
        this.hasGlobalBlendMode = true;
        this.valGlobalBlendMode = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link GraphicsContext#setLineCap(javafx.scene.shape.StrokeLineCap)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B lineCap(javafx.scene.shape.StrokeLineCap value)
    {
        this.hasLineCap = true;
        this.valLineCap = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link GraphicsContext#setLineJoin(javafx.scene.shape.StrokeLineJoin)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B lineJoin(javafx.scene.shape.StrokeLineJoin value)
    {
        this.hasLineJoin = true;
        this.valLineJoin = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link GraphicsContext#setLineWidth(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B lineWidth(double value)
    {
        this.hasLineWidth = true;
        this.valLineWidth = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link GraphicsContext#setMiterLimit(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B miterLimit(double value)
    {
        this.hasMiterLimit = true;
        this.valMiterLimit = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link GraphicsContext#setStroke(javafx.scene.paint.Paint)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B stroke(javafx.scene.paint.Paint value)
    {
        this.hasStroke = true;
        this.valStroke = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link GraphicsContext#setTextAlign(javafx.scene.text.TextAlignment)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B textAlign(javafx.scene.text.TextAlignment value)
    {
        this.hasTextAlign = true;
        this.valTextAlign = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link GraphicsContext#setTextBaseline(javafx.geometry.VPos)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B textBaseline(javafx.geometry.VPos value)
    {
        this.hasTextBaseline = true;
        this.valTextBaseline = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link GraphicsContext#setTransform(javafx.scene.transform.Affine)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B transform(javafx.scene.transform.Affine value)
    {
        this.hasTransform = true;
        this.valTransform = value;
        return (B) this;
    }
}

// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.effect;

/**
 * {@link BoxBlur}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class BoxBlurBuilder<Z extends BoxBlur, B extends BoxBlurBuilder<Z, B>>
        extends javafx.scene.effect.EffectBuilder<Z, B>
{

    protected boolean hasHeight;
    protected double valHeight;

    protected boolean hasInput;
    protected javafx.scene.effect.Effect valInput;

    protected boolean hasIterations;
    protected int valIterations;

    protected boolean hasWidth;
    protected double valWidth;

    protected boolean boundHeight;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvHeight;

    protected boolean boundInput;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.effect.Effect> obsrvInput;

    protected boolean boundIterations;
    protected javafx.beans.value.ObservableValue<? extends Integer> obsrvIterations;

    protected boolean boundWidth;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvWidth;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasHeight)
            instance.setHeight(this.valHeight);
        if (this.hasInput)
            instance.setInput(this.valInput);
        if (this.hasIterations)
            instance.setIterations(this.valIterations);
        if (this.hasWidth)
            instance.setWidth(this.valWidth);
        if (this.boundHeight)
            instance.heightProperty().bind(this.obsrvHeight);
        if (this.boundInput)
            instance.inputProperty().bind(this.obsrvInput);
        if (this.boundIterations)
            instance.iterationsProperty().bind(this.obsrvIterations);
        if (this.boundWidth)
            instance.widthProperty().bind(this.obsrvWidth);
    }

    /**
     * 設定屬性{@link BoxBlur#setHeight}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B height(double value)
    {
        this.hasHeight = true;
        this.valHeight = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link BoxBlur#setInput}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B input(javafx.scene.effect.Effect value)
    {
        this.hasInput = true;
        this.valInput = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link BoxBlur#setIterations}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B iterations(int value)
    {
        this.hasIterations = true;
        this.valIterations = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link BoxBlur#setWidth}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B width(double value)
    {
        this.hasWidth = true;
        this.valWidth = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link BoxBlur#heightProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindHeight(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundHeight = true;
        this.obsrvHeight = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link BoxBlur#inputProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindInput(javafx.beans.value.ObservableValue<? extends javafx.scene.effect.Effect> source)
    {
        assert (source != null);
        this.boundInput = true;
        this.obsrvInput = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link BoxBlur#iterationsProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindIterations(javafx.beans.value.ObservableValue<? extends Integer> source)
    {
        assert (source != null);
        this.boundIterations = true;
        this.obsrvIterations = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link BoxBlur#widthProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindWidth(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundWidth = true;
        this.obsrvWidth = source;
        return (B) this;
    }

    /**
     * 建構{@link BoxBlur}物件
     *
     * @return 新的{@link BoxBlur}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public BoxBlur build()
    {
        BoxBlur instance = new BoxBlur();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.transform;

/**
 * {@link Scale}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ScaleBuilder<Z extends Scale, B extends ScaleBuilder<Z, B>>
        extends javafx.scene.transform.TransformBuilder<Z, B>
{

    protected boolean hasPivotX;
    protected double valPivotX;

    protected boolean hasPivotY;
    protected double valPivotY;

    protected boolean hasPivotZ;
    protected double valPivotZ;

    protected boolean hasX;
    protected double valX;

    protected boolean hasY;
    protected double valY;

    protected boolean hasZ;
    protected double valZ;

    protected boolean boundPivotX;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvPivotX;

    protected boolean boundPivotY;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvPivotY;

    protected boolean boundPivotZ;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvPivotZ;

    protected boolean boundX;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvX;

    protected boolean boundY;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvY;

    protected boolean boundZ;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvZ;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasPivotX)
            instance.setPivotX(this.valPivotX);
        if (this.hasPivotY)
            instance.setPivotY(this.valPivotY);
        if (this.hasPivotZ)
            instance.setPivotZ(this.valPivotZ);
        if (this.hasX)
            instance.setX(this.valX);
        if (this.hasY)
            instance.setY(this.valY);
        if (this.hasZ)
            instance.setZ(this.valZ);
        if (this.boundPivotX)
            instance.pivotXProperty().bind(this.obsrvPivotX);
        if (this.boundPivotY)
            instance.pivotYProperty().bind(this.obsrvPivotY);
        if (this.boundPivotZ)
            instance.pivotZProperty().bind(this.obsrvPivotZ);
        if (this.boundX)
            instance.xProperty().bind(this.obsrvX);
        if (this.boundY)
            instance.yProperty().bind(this.obsrvY);
        if (this.boundZ)
            instance.zProperty().bind(this.obsrvZ);
    }

    /**
     * 設定屬性{@link Scale#setPivotX}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B pivotX(double value)
    {
        this.hasPivotX = true;
        this.valPivotX = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Scale#setPivotY}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B pivotY(double value)
    {
        this.hasPivotY = true;
        this.valPivotY = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Scale#setPivotZ}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B pivotZ(double value)
    {
        this.hasPivotZ = true;
        this.valPivotZ = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Scale#setX}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B x(double value)
    {
        this.hasX = true;
        this.valX = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Scale#setY}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B y(double value)
    {
        this.hasY = true;
        this.valY = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Scale#setZ}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B z(double value)
    {
        this.hasZ = true;
        this.valZ = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Scale#pivotXProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindPivotX(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundPivotX = true;
        this.obsrvPivotX = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Scale#pivotYProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindPivotY(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundPivotY = true;
        this.obsrvPivotY = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Scale#pivotZProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindPivotZ(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundPivotZ = true;
        this.obsrvPivotZ = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Scale#xProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindX(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundX = true;
        this.obsrvX = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Scale#yProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindY(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundY = true;
        this.obsrvY = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Scale#zProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindZ(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundZ = true;
        this.obsrvZ = source;
        return (B) this;
    }

    /**
     * 建構{@link Scale}物件
     *
     * @return 新的{@link Scale}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Scale build()
    {
        Scale instance = new Scale();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
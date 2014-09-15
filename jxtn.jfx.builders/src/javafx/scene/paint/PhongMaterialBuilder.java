// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.paint;

/**
 * {@link PhongMaterial}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link PhongMaterial})
 * @param <B> 建構器本身的型態(需繼承{@link PhongMaterialBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class PhongMaterialBuilder<Z extends PhongMaterial, B extends PhongMaterialBuilder<Z, B>>
        extends javafx.scene.paint.MaterialBuilder<Z, B>
        implements PhongMaterialBuilderExt<Z, B>
{

    private boolean hasBumpMap;
    private javafx.scene.image.Image valBumpMap;

    private boolean hasDiffuseColor;
    private javafx.scene.paint.Color valDiffuseColor;

    private boolean hasDiffuseMap;
    private javafx.scene.image.Image valDiffuseMap;

    private boolean hasSelfIlluminationMap;
    private javafx.scene.image.Image valSelfIlluminationMap;

    private boolean hasSpecularColor;
    private javafx.scene.paint.Color valSpecularColor;

    private boolean hasSpecularMap;
    private javafx.scene.image.Image valSpecularMap;

    private boolean hasSpecularPower;
    private double valSpecularPower;

    private boolean bound1BumpMap;
    private boolean bound2BumpMap;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.image.Image> obsrv1BumpMap;
    private javafx.beans.property.Property<javafx.scene.image.Image> obsrv2BumpMap;

    private boolean bound1DiffuseColor;
    private boolean bound2DiffuseColor;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.paint.Color> obsrv1DiffuseColor;
    private javafx.beans.property.Property<javafx.scene.paint.Color> obsrv2DiffuseColor;

    private boolean bound1DiffuseMap;
    private boolean bound2DiffuseMap;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.image.Image> obsrv1DiffuseMap;
    private javafx.beans.property.Property<javafx.scene.image.Image> obsrv2DiffuseMap;

    private boolean bound1SelfIlluminationMap;
    private boolean bound2SelfIlluminationMap;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.image.Image> obsrv1SelfIlluminationMap;
    private javafx.beans.property.Property<javafx.scene.image.Image> obsrv2SelfIlluminationMap;

    private boolean bound1SpecularColor;
    private boolean bound2SpecularColor;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.paint.Color> obsrv1SpecularColor;
    private javafx.beans.property.Property<javafx.scene.paint.Color> obsrv2SpecularColor;

    private boolean bound1SpecularMap;
    private boolean bound2SpecularMap;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.image.Image> obsrv1SpecularMap;
    private javafx.beans.property.Property<javafx.scene.image.Image> obsrv2SpecularMap;

    private boolean bound1SpecularPower;
    private boolean bound2SpecularPower;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1SpecularPower;
    private javafx.beans.property.Property<Number> obsrv2SpecularPower;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasBumpMap)
            instance.setBumpMap(this.valBumpMap);
        if (this.hasDiffuseColor)
            instance.setDiffuseColor(this.valDiffuseColor);
        if (this.hasDiffuseMap)
            instance.setDiffuseMap(this.valDiffuseMap);
        if (this.hasSelfIlluminationMap)
            instance.setSelfIlluminationMap(this.valSelfIlluminationMap);
        if (this.hasSpecularColor)
            instance.setSpecularColor(this.valSpecularColor);
        if (this.hasSpecularMap)
            instance.setSpecularMap(this.valSpecularMap);
        if (this.hasSpecularPower)
            instance.setSpecularPower(this.valSpecularPower);
        if (this.bound1BumpMap)
            instance.bumpMapProperty().bind(this.obsrv1BumpMap);
        if (this.bound2BumpMap)
            instance.bumpMapProperty().bindBidirectional(this.obsrv2BumpMap);
        if (this.bound1DiffuseColor)
            instance.diffuseColorProperty().bind(this.obsrv1DiffuseColor);
        if (this.bound2DiffuseColor)
            instance.diffuseColorProperty().bindBidirectional(this.obsrv2DiffuseColor);
        if (this.bound1DiffuseMap)
            instance.diffuseMapProperty().bind(this.obsrv1DiffuseMap);
        if (this.bound2DiffuseMap)
            instance.diffuseMapProperty().bindBidirectional(this.obsrv2DiffuseMap);
        if (this.bound1SelfIlluminationMap)
            instance.selfIlluminationMapProperty().bind(this.obsrv1SelfIlluminationMap);
        if (this.bound2SelfIlluminationMap)
            instance.selfIlluminationMapProperty().bindBidirectional(this.obsrv2SelfIlluminationMap);
        if (this.bound1SpecularColor)
            instance.specularColorProperty().bind(this.obsrv1SpecularColor);
        if (this.bound2SpecularColor)
            instance.specularColorProperty().bindBidirectional(this.obsrv2SpecularColor);
        if (this.bound1SpecularMap)
            instance.specularMapProperty().bind(this.obsrv1SpecularMap);
        if (this.bound2SpecularMap)
            instance.specularMapProperty().bindBidirectional(this.obsrv2SpecularMap);
        if (this.bound1SpecularPower)
            instance.specularPowerProperty().bind(this.obsrv1SpecularPower);
        if (this.bound2SpecularPower)
            instance.specularPowerProperty().bindBidirectional(this.obsrv2SpecularPower);
    }

    /**
     * 設定屬性{@link PhongMaterial#setBumpMap(javafx.scene.image.Image)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bumpMap(javafx.scene.image.Image value)
    {
        this.hasBumpMap = true;
        this.valBumpMap = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link PhongMaterial#setDiffuseColor(javafx.scene.paint.Color)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B diffuseColor(javafx.scene.paint.Color value)
    {
        this.hasDiffuseColor = true;
        this.valDiffuseColor = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link PhongMaterial#setDiffuseMap(javafx.scene.image.Image)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B diffuseMap(javafx.scene.image.Image value)
    {
        this.hasDiffuseMap = true;
        this.valDiffuseMap = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link PhongMaterial#setSelfIlluminationMap(javafx.scene.image.Image)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B selfIlluminationMap(javafx.scene.image.Image value)
    {
        this.hasSelfIlluminationMap = true;
        this.valSelfIlluminationMap = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link PhongMaterial#setSpecularColor(javafx.scene.paint.Color)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B specularColor(javafx.scene.paint.Color value)
    {
        this.hasSpecularColor = true;
        this.valSpecularColor = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link PhongMaterial#setSpecularMap(javafx.scene.image.Image)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B specularMap(javafx.scene.image.Image value)
    {
        this.hasSpecularMap = true;
        this.valSpecularMap = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link PhongMaterial#setSpecularPower(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B specularPower(double value)
    {
        this.hasSpecularPower = true;
        this.valSpecularPower = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link PhongMaterial#bumpMapProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBumpMap(javafx.beans.value.ObservableValue<? extends javafx.scene.image.Image> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1BumpMap = true;
        this.obsrv1BumpMap = source;
        this.bound2BumpMap = false;
        this.obsrv2BumpMap = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link PhongMaterial#bumpMapProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalBumpMap(javafx.beans.property.Property<javafx.scene.image.Image> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1BumpMap = false;
        this.obsrv1BumpMap = null;
        this.bound2BumpMap = true;
        this.obsrv2BumpMap = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link PhongMaterial#diffuseColorProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindDiffuseColor(javafx.beans.value.ObservableValue<? extends javafx.scene.paint.Color> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1DiffuseColor = true;
        this.obsrv1DiffuseColor = source;
        this.bound2DiffuseColor = false;
        this.obsrv2DiffuseColor = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link PhongMaterial#diffuseColorProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalDiffuseColor(javafx.beans.property.Property<javafx.scene.paint.Color> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1DiffuseColor = false;
        this.obsrv1DiffuseColor = null;
        this.bound2DiffuseColor = true;
        this.obsrv2DiffuseColor = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link PhongMaterial#diffuseMapProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindDiffuseMap(javafx.beans.value.ObservableValue<? extends javafx.scene.image.Image> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1DiffuseMap = true;
        this.obsrv1DiffuseMap = source;
        this.bound2DiffuseMap = false;
        this.obsrv2DiffuseMap = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link PhongMaterial#diffuseMapProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalDiffuseMap(javafx.beans.property.Property<javafx.scene.image.Image> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1DiffuseMap = false;
        this.obsrv1DiffuseMap = null;
        this.bound2DiffuseMap = true;
        this.obsrv2DiffuseMap = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link PhongMaterial#selfIlluminationMapProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindSelfIlluminationMap(javafx.beans.value.ObservableValue<? extends javafx.scene.image.Image> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1SelfIlluminationMap = true;
        this.obsrv1SelfIlluminationMap = source;
        this.bound2SelfIlluminationMap = false;
        this.obsrv2SelfIlluminationMap = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link PhongMaterial#selfIlluminationMapProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalSelfIlluminationMap(javafx.beans.property.Property<javafx.scene.image.Image> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1SelfIlluminationMap = false;
        this.obsrv1SelfIlluminationMap = null;
        this.bound2SelfIlluminationMap = true;
        this.obsrv2SelfIlluminationMap = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link PhongMaterial#specularColorProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindSpecularColor(javafx.beans.value.ObservableValue<? extends javafx.scene.paint.Color> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1SpecularColor = true;
        this.obsrv1SpecularColor = source;
        this.bound2SpecularColor = false;
        this.obsrv2SpecularColor = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link PhongMaterial#specularColorProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalSpecularColor(javafx.beans.property.Property<javafx.scene.paint.Color> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1SpecularColor = false;
        this.obsrv1SpecularColor = null;
        this.bound2SpecularColor = true;
        this.obsrv2SpecularColor = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link PhongMaterial#specularMapProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindSpecularMap(javafx.beans.value.ObservableValue<? extends javafx.scene.image.Image> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1SpecularMap = true;
        this.obsrv1SpecularMap = source;
        this.bound2SpecularMap = false;
        this.obsrv2SpecularMap = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link PhongMaterial#specularMapProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalSpecularMap(javafx.beans.property.Property<javafx.scene.image.Image> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1SpecularMap = false;
        this.obsrv1SpecularMap = null;
        this.bound2SpecularMap = true;
        this.obsrv2SpecularMap = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link PhongMaterial#specularPowerProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindSpecularPower(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1SpecularPower = true;
        this.obsrv1SpecularPower = source;
        this.bound2SpecularPower = false;
        this.obsrv2SpecularPower = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link PhongMaterial#specularPowerProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalSpecularPower(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1SpecularPower = false;
        this.obsrv1SpecularPower = null;
        this.bound2SpecularPower = true;
        this.obsrv2SpecularPower = source;
        return (B) this;
    }

    /**
     * 建構{@link PhongMaterial}物件
     *
     * @return 新的{@link PhongMaterial}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public PhongMaterial build()
    {
        PhongMaterial instance = new PhongMaterial();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

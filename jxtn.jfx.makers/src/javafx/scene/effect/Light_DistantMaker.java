// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.effect;

/**
 * {@link Light.Distant}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link Light.Distant})
 * @param <B> 建構器本身的型態(需繼承{@link Light.DistantMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class Light_DistantMaker<Z extends Light.Distant, B extends Light_DistantMaker<Z, B>>
        extends javafx.scene.effect.LightMaker<Z, B>
        implements Light_DistantMakerExt<Z, B>
{

    private boolean hasAzimuth;
    private double valAzimuth;

    private boolean hasElevation;
    private double valElevation;

    private boolean bound1Azimuth;
    private boolean bound2Azimuth;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Azimuth;
    private javafx.beans.property.Property<Number> obsrv2Azimuth;

    private boolean bound1Elevation;
    private boolean bound2Elevation;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Elevation;
    private javafx.beans.property.Property<Number> obsrv2Elevation;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasAzimuth)
            instance.setAzimuth(this.valAzimuth);
        if (this.hasElevation)
            instance.setElevation(this.valElevation);
        if (this.bound1Azimuth)
            instance.azimuthProperty().bind(this.obsrv1Azimuth);
        if (this.bound2Azimuth)
            instance.azimuthProperty().bindBidirectional(this.obsrv2Azimuth);
        if (this.bound1Elevation)
            instance.elevationProperty().bind(this.obsrv1Elevation);
        if (this.bound2Elevation)
            instance.elevationProperty().bindBidirectional(this.obsrv2Elevation);
    }

    /**
     * 設定屬性{@link Light.Distant#setAzimuth(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B azimuth(double value)
    {
        this.hasAzimuth = true;
        this.valAzimuth = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Light.Distant#setElevation(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B elevation(double value)
    {
        this.hasElevation = true;
        this.valElevation = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Light.Distant#azimuthProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindAzimuth(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Azimuth = true;
        this.obsrv1Azimuth = source;
        this.bound2Azimuth = false;
        this.obsrv2Azimuth = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Light.Distant#azimuthProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalAzimuth(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Azimuth = false;
        this.obsrv1Azimuth = null;
        this.bound2Azimuth = true;
        this.obsrv2Azimuth = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Light.Distant#elevationProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindElevation(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Elevation = true;
        this.obsrv1Elevation = source;
        this.bound2Elevation = false;
        this.obsrv2Elevation = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Light.Distant#elevationProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalElevation(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Elevation = false;
        this.obsrv1Elevation = null;
        this.bound2Elevation = true;
        this.obsrv2Elevation = source;
        return (B) this;
    }

    /**
     * 建構{@link Light.Distant}物件。
     *
     * @return 新的{@link Light.Distant}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Light.Distant build()
    {
        Light.Distant instance = new Light.Distant();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link Light.Distant}物件。
     *
     * @return 新的{@link Light.Distant}物件實體
     */
    @SuppressWarnings("unchecked")
    public Light.Distant build(double arg0, double arg1, javafx.scene.paint.Color arg2)
    {
        Light.Distant instance = new Light.Distant(arg0, arg1, arg2);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

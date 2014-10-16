// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene;

/**
 * {@link PerspectiveCamera}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link PerspectiveCamera})
 * @param <B> 建構器本身的型態(需繼承{@link PerspectiveCameraBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class PerspectiveCameraBuilder<Z extends PerspectiveCamera, B extends PerspectiveCameraBuilder<Z, B>>
        extends javafx.scene.CameraBuilder<Z, B>
        implements PerspectiveCameraBuilderExt<Z, B>
{

    private boolean hasFieldOfView;
    private double valFieldOfView;

    private boolean hasVerticalFieldOfView;
    private boolean valVerticalFieldOfView;

    private boolean bound1FieldOfView;
    private boolean bound2FieldOfView;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1FieldOfView;
    private javafx.beans.property.Property<Number> obsrv2FieldOfView;

    private boolean bound1VerticalFieldOfView;
    private boolean bound2VerticalFieldOfView;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1VerticalFieldOfView;
    private javafx.beans.property.Property<Boolean> obsrv2VerticalFieldOfView;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasFieldOfView)
            instance.setFieldOfView(this.valFieldOfView);
        if (this.hasVerticalFieldOfView)
            instance.setVerticalFieldOfView(this.valVerticalFieldOfView);
        if (this.bound1FieldOfView)
            instance.fieldOfViewProperty().bind(this.obsrv1FieldOfView);
        if (this.bound2FieldOfView)
            instance.fieldOfViewProperty().bindBidirectional(this.obsrv2FieldOfView);
        if (this.bound1VerticalFieldOfView)
            instance.verticalFieldOfViewProperty().bind(this.obsrv1VerticalFieldOfView);
        if (this.bound2VerticalFieldOfView)
            instance.verticalFieldOfViewProperty().bindBidirectional(this.obsrv2VerticalFieldOfView);
    }

    /**
     * 設定屬性{@link PerspectiveCamera#setFieldOfView(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B fieldOfView(double value)
    {
        this.hasFieldOfView = true;
        this.valFieldOfView = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link PerspectiveCamera#setVerticalFieldOfView(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B verticalFieldOfView(boolean value)
    {
        this.hasVerticalFieldOfView = true;
        this.valVerticalFieldOfView = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link PerspectiveCamera#fieldOfViewProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindFieldOfView(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1FieldOfView = true;
        this.obsrv1FieldOfView = source;
        this.bound2FieldOfView = false;
        this.obsrv2FieldOfView = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link PerspectiveCamera#fieldOfViewProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalFieldOfView(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1FieldOfView = false;
        this.obsrv1FieldOfView = null;
        this.bound2FieldOfView = true;
        this.obsrv2FieldOfView = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link PerspectiveCamera#verticalFieldOfViewProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindVerticalFieldOfView(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1VerticalFieldOfView = true;
        this.obsrv1VerticalFieldOfView = source;
        this.bound2VerticalFieldOfView = false;
        this.obsrv2VerticalFieldOfView = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link PerspectiveCamera#verticalFieldOfViewProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalVerticalFieldOfView(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1VerticalFieldOfView = false;
        this.obsrv1VerticalFieldOfView = null;
        this.bound2VerticalFieldOfView = true;
        this.obsrv2VerticalFieldOfView = source;
        return (B) this;
    }

    /**
     * 建構{@link PerspectiveCamera}物件
     *
     * @return 新的{@link PerspectiveCamera}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public PerspectiveCamera build()
    {
        PerspectiveCamera instance = new PerspectiveCamera();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link PerspectiveCamera}物件
     *
     * @return 新的{@link PerspectiveCamera}物件實體
     */
    @SuppressWarnings("unchecked")
    public PerspectiveCamera build(boolean arg0)
    {
        PerspectiveCamera instance = new PerspectiveCamera(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

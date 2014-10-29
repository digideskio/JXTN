// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene;

/**
 * {@link SubScene}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link SubScene})
 * @param <B> 建構器本身的型態(需繼承{@link SubSceneBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class SubSceneBuilder<Z extends SubScene, B extends SubSceneBuilder<Z, B>>
        extends javafx.scene.NodeBuilder<Z, B>
        implements SubSceneBuilderExt<Z, B>
{

    private boolean hasCamera;
    private javafx.scene.Camera valCamera;

    private boolean hasFill;
    private javafx.scene.paint.Paint valFill;

    private boolean hasHeight;
    private double valHeight;

    private boolean hasRoot;
    private javafx.scene.Parent valRoot;

    private boolean hasUserAgentStylesheet;
    private java.lang.String valUserAgentStylesheet;

    private boolean hasWidth;
    private double valWidth;

    private boolean bound1Camera;
    private boolean bound2Camera;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.Camera> obsrv1Camera;
    private javafx.beans.property.Property<javafx.scene.Camera> obsrv2Camera;

    private boolean bound1Fill;
    private boolean bound2Fill;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.paint.Paint> obsrv1Fill;
    private javafx.beans.property.Property<javafx.scene.paint.Paint> obsrv2Fill;

    private boolean bound1Height;
    private boolean bound2Height;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Height;
    private javafx.beans.property.Property<Number> obsrv2Height;

    private boolean bound1Root;
    private boolean bound2Root;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.Parent> obsrv1Root;
    private javafx.beans.property.Property<javafx.scene.Parent> obsrv2Root;

    private boolean bound1UserAgentStylesheet;
    private boolean bound2UserAgentStylesheet;
    private javafx.beans.value.ObservableValue<? extends java.lang.String> obsrv1UserAgentStylesheet;
    private javafx.beans.property.Property<java.lang.String> obsrv2UserAgentStylesheet;

    private boolean bound1Width;
    private boolean bound2Width;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Width;
    private javafx.beans.property.Property<Number> obsrv2Width;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasCamera)
            instance.setCamera(this.valCamera);
        if (this.hasFill)
            instance.setFill(this.valFill);
        if (this.hasHeight)
            instance.setHeight(this.valHeight);
        if (this.hasRoot)
            instance.setRoot(this.valRoot);
        if (this.hasUserAgentStylesheet)
            instance.setUserAgentStylesheet(this.valUserAgentStylesheet);
        if (this.hasWidth)
            instance.setWidth(this.valWidth);
        if (this.bound1Camera)
            instance.cameraProperty().bind(this.obsrv1Camera);
        if (this.bound2Camera)
            instance.cameraProperty().bindBidirectional(this.obsrv2Camera);
        if (this.bound1Fill)
            instance.fillProperty().bind(this.obsrv1Fill);
        if (this.bound2Fill)
            instance.fillProperty().bindBidirectional(this.obsrv2Fill);
        if (this.bound1Height)
            instance.heightProperty().bind(this.obsrv1Height);
        if (this.bound2Height)
            instance.heightProperty().bindBidirectional(this.obsrv2Height);
        if (this.bound1Root)
            instance.rootProperty().bind(this.obsrv1Root);
        if (this.bound2Root)
            instance.rootProperty().bindBidirectional(this.obsrv2Root);
        if (this.bound1UserAgentStylesheet)
            instance.userAgentStylesheetProperty().bind(this.obsrv1UserAgentStylesheet);
        if (this.bound2UserAgentStylesheet)
            instance.userAgentStylesheetProperty().bindBidirectional(this.obsrv2UserAgentStylesheet);
        if (this.bound1Width)
            instance.widthProperty().bind(this.obsrv1Width);
        if (this.bound2Width)
            instance.widthProperty().bindBidirectional(this.obsrv2Width);
    }

    /**
     * 設定屬性{@link SubScene#setCamera(javafx.scene.Camera)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B camera(javafx.scene.Camera value)
    {
        this.hasCamera = true;
        this.valCamera = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SubScene#setFill(javafx.scene.paint.Paint)}。
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
     * 設定屬性{@link SubScene#setHeight(double)}。
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
     * 設定屬性{@link SubScene#setRoot(javafx.scene.Parent)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B root(javafx.scene.Parent value)
    {
        this.hasRoot = true;
        this.valRoot = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SubScene#setUserAgentStylesheet(java.lang.String)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B userAgentStylesheet(java.lang.String value)
    {
        this.hasUserAgentStylesheet = true;
        this.valUserAgentStylesheet = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SubScene#setWidth(double)}。
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
     * 設定屬性{@link SubScene#cameraProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindCamera(javafx.beans.value.ObservableValue<? extends javafx.scene.Camera> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Camera = true;
        this.obsrv1Camera = source;
        this.bound2Camera = false;
        this.obsrv2Camera = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link SubScene#cameraProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalCamera(javafx.beans.property.Property<javafx.scene.Camera> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Camera = false;
        this.obsrv1Camera = null;
        this.bound2Camera = true;
        this.obsrv2Camera = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link SubScene#fillProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindFill(javafx.beans.value.ObservableValue<? extends javafx.scene.paint.Paint> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Fill = true;
        this.obsrv1Fill = source;
        this.bound2Fill = false;
        this.obsrv2Fill = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link SubScene#fillProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalFill(javafx.beans.property.Property<javafx.scene.paint.Paint> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Fill = false;
        this.obsrv1Fill = null;
        this.bound2Fill = true;
        this.obsrv2Fill = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link SubScene#heightProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindHeight(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Height = true;
        this.obsrv1Height = source;
        this.bound2Height = false;
        this.obsrv2Height = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link SubScene#heightProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalHeight(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Height = false;
        this.obsrv1Height = null;
        this.bound2Height = true;
        this.obsrv2Height = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link SubScene#rootProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindRoot(javafx.beans.value.ObservableValue<? extends javafx.scene.Parent> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Root = true;
        this.obsrv1Root = source;
        this.bound2Root = false;
        this.obsrv2Root = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link SubScene#rootProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalRoot(javafx.beans.property.Property<javafx.scene.Parent> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Root = false;
        this.obsrv1Root = null;
        this.bound2Root = true;
        this.obsrv2Root = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link SubScene#userAgentStylesheetProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindUserAgentStylesheet(javafx.beans.value.ObservableValue<? extends java.lang.String> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1UserAgentStylesheet = true;
        this.obsrv1UserAgentStylesheet = source;
        this.bound2UserAgentStylesheet = false;
        this.obsrv2UserAgentStylesheet = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link SubScene#userAgentStylesheetProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalUserAgentStylesheet(javafx.beans.property.Property<java.lang.String> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1UserAgentStylesheet = false;
        this.obsrv1UserAgentStylesheet = null;
        this.bound2UserAgentStylesheet = true;
        this.obsrv2UserAgentStylesheet = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link SubScene#widthProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindWidth(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Width = true;
        this.obsrv1Width = source;
        this.bound2Width = false;
        this.obsrv2Width = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link SubScene#widthProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalWidth(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Width = false;
        this.obsrv1Width = null;
        this.bound2Width = true;
        this.obsrv2Width = source;
        return (B) this;
    }

    /**
     * 建構{@link SubScene}物件。
     *
     * @return 新的{@link SubScene}物件實體
     */
    @SuppressWarnings("unchecked")
    public SubScene build(javafx.scene.Parent arg0, double arg1, double arg2)
    {
        SubScene instance = new SubScene(arg0, arg1, arg2);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link SubScene}物件。
     *
     * @return 新的{@link SubScene}物件實體
     */
    @SuppressWarnings("unchecked")
    public SubScene build(javafx.scene.Parent arg0, double arg1, double arg2, boolean arg3, javafx.scene.SceneAntialiasing arg4)
    {
        SubScene instance = new SubScene(arg0, arg1, arg2, arg3, arg4);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

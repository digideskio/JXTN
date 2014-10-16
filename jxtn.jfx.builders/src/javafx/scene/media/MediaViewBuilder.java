// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.media;

/**
 * {@link MediaView}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link MediaView})
 * @param <B> 建構器本身的型態(需繼承{@link MediaViewBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class MediaViewBuilder<Z extends MediaView, B extends MediaViewBuilder<Z, B>>
        extends javafx.scene.NodeBuilder<Z, B>
        implements MediaViewBuilderExt<Z, B>
{

    private boolean hasFitHeight;
    private double valFitHeight;

    private boolean hasFitWidth;
    private double valFitWidth;

    private boolean hasMediaPlayer;
    private javafx.scene.media.MediaPlayer valMediaPlayer;

    private boolean hasOnError;
    private javafx.event.EventHandler<javafx.scene.media.MediaErrorEvent> valOnError;

    private boolean hasPreserveRatio;
    private boolean valPreserveRatio;

    private boolean hasSmooth;
    private boolean valSmooth;

    private boolean hasViewport;
    private javafx.geometry.Rectangle2D valViewport;

    private boolean hasX;
    private double valX;

    private boolean hasY;
    private double valY;

    private boolean bound1FitHeight;
    private boolean bound2FitHeight;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1FitHeight;
    private javafx.beans.property.Property<Number> obsrv2FitHeight;

    private boolean bound1FitWidth;
    private boolean bound2FitWidth;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1FitWidth;
    private javafx.beans.property.Property<Number> obsrv2FitWidth;

    private boolean bound1MediaPlayer;
    private boolean bound2MediaPlayer;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.media.MediaPlayer> obsrv1MediaPlayer;
    private javafx.beans.property.Property<javafx.scene.media.MediaPlayer> obsrv2MediaPlayer;

    private boolean bound1OnError;
    private boolean bound2OnError;
    private javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.scene.media.MediaErrorEvent>> obsrv1OnError;
    private javafx.beans.property.Property<javafx.event.EventHandler<javafx.scene.media.MediaErrorEvent>> obsrv2OnError;

    private boolean bound1PreserveRatio;
    private boolean bound2PreserveRatio;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1PreserveRatio;
    private javafx.beans.property.Property<Boolean> obsrv2PreserveRatio;

    private boolean bound1Smooth;
    private boolean bound2Smooth;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1Smooth;
    private javafx.beans.property.Property<Boolean> obsrv2Smooth;

    private boolean bound1Viewport;
    private boolean bound2Viewport;
    private javafx.beans.value.ObservableValue<? extends javafx.geometry.Rectangle2D> obsrv1Viewport;
    private javafx.beans.property.Property<javafx.geometry.Rectangle2D> obsrv2Viewport;

    private boolean bound1X;
    private boolean bound2X;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1X;
    private javafx.beans.property.Property<Number> obsrv2X;

    private boolean bound1Y;
    private boolean bound2Y;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Y;
    private javafx.beans.property.Property<Number> obsrv2Y;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasFitHeight)
            instance.setFitHeight(this.valFitHeight);
        if (this.hasFitWidth)
            instance.setFitWidth(this.valFitWidth);
        if (this.hasMediaPlayer)
            instance.setMediaPlayer(this.valMediaPlayer);
        if (this.hasOnError)
            instance.setOnError(this.valOnError);
        if (this.hasPreserveRatio)
            instance.setPreserveRatio(this.valPreserveRatio);
        if (this.hasSmooth)
            instance.setSmooth(this.valSmooth);
        if (this.hasViewport)
            instance.setViewport(this.valViewport);
        if (this.hasX)
            instance.setX(this.valX);
        if (this.hasY)
            instance.setY(this.valY);
        if (this.bound1FitHeight)
            instance.fitHeightProperty().bind(this.obsrv1FitHeight);
        if (this.bound2FitHeight)
            instance.fitHeightProperty().bindBidirectional(this.obsrv2FitHeight);
        if (this.bound1FitWidth)
            instance.fitWidthProperty().bind(this.obsrv1FitWidth);
        if (this.bound2FitWidth)
            instance.fitWidthProperty().bindBidirectional(this.obsrv2FitWidth);
        if (this.bound1MediaPlayer)
            instance.mediaPlayerProperty().bind(this.obsrv1MediaPlayer);
        if (this.bound2MediaPlayer)
            instance.mediaPlayerProperty().bindBidirectional(this.obsrv2MediaPlayer);
        if (this.bound1OnError)
            instance.onErrorProperty().bind(this.obsrv1OnError);
        if (this.bound2OnError)
            instance.onErrorProperty().bindBidirectional(this.obsrv2OnError);
        if (this.bound1PreserveRatio)
            instance.preserveRatioProperty().bind(this.obsrv1PreserveRatio);
        if (this.bound2PreserveRatio)
            instance.preserveRatioProperty().bindBidirectional(this.obsrv2PreserveRatio);
        if (this.bound1Smooth)
            instance.smoothProperty().bind(this.obsrv1Smooth);
        if (this.bound2Smooth)
            instance.smoothProperty().bindBidirectional(this.obsrv2Smooth);
        if (this.bound1Viewport)
            instance.viewportProperty().bind(this.obsrv1Viewport);
        if (this.bound2Viewport)
            instance.viewportProperty().bindBidirectional(this.obsrv2Viewport);
        if (this.bound1X)
            instance.xProperty().bind(this.obsrv1X);
        if (this.bound2X)
            instance.xProperty().bindBidirectional(this.obsrv2X);
        if (this.bound1Y)
            instance.yProperty().bind(this.obsrv1Y);
        if (this.bound2Y)
            instance.yProperty().bindBidirectional(this.obsrv2Y);
    }

    /**
     * 設定屬性{@link MediaView#setFitHeight(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B fitHeight(double value)
    {
        this.hasFitHeight = true;
        this.valFitHeight = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#setFitWidth(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B fitWidth(double value)
    {
        this.hasFitWidth = true;
        this.valFitWidth = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#setMediaPlayer(javafx.scene.media.MediaPlayer)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B mediaPlayer(javafx.scene.media.MediaPlayer value)
    {
        this.hasMediaPlayer = true;
        this.valMediaPlayer = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#setOnError(javafx.event.EventHandler)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onError(javafx.event.EventHandler<javafx.scene.media.MediaErrorEvent> value)
    {
        this.hasOnError = true;
        this.valOnError = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#setPreserveRatio(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B preserveRatio(boolean value)
    {
        this.hasPreserveRatio = true;
        this.valPreserveRatio = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#setSmooth(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B smooth(boolean value)
    {
        this.hasSmooth = true;
        this.valSmooth = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#setViewport(javafx.geometry.Rectangle2D)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B viewport(javafx.geometry.Rectangle2D value)
    {
        this.hasViewport = true;
        this.valViewport = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#setX(double)}
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
     * 設定屬性{@link MediaView#setY(double)}
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
     * 設定屬性{@link MediaView#fitHeightProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindFitHeight(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1FitHeight = true;
        this.obsrv1FitHeight = source;
        this.bound2FitHeight = false;
        this.obsrv2FitHeight = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#fitHeightProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalFitHeight(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1FitHeight = false;
        this.obsrv1FitHeight = null;
        this.bound2FitHeight = true;
        this.obsrv2FitHeight = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#fitWidthProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindFitWidth(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1FitWidth = true;
        this.obsrv1FitWidth = source;
        this.bound2FitWidth = false;
        this.obsrv2FitWidth = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#fitWidthProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalFitWidth(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1FitWidth = false;
        this.obsrv1FitWidth = null;
        this.bound2FitWidth = true;
        this.obsrv2FitWidth = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#mediaPlayerProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindMediaPlayer(javafx.beans.value.ObservableValue<? extends javafx.scene.media.MediaPlayer> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1MediaPlayer = true;
        this.obsrv1MediaPlayer = source;
        this.bound2MediaPlayer = false;
        this.obsrv2MediaPlayer = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#mediaPlayerProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalMediaPlayer(javafx.beans.property.Property<javafx.scene.media.MediaPlayer> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1MediaPlayer = false;
        this.obsrv1MediaPlayer = null;
        this.bound2MediaPlayer = true;
        this.obsrv2MediaPlayer = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#onErrorProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOnError(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.scene.media.MediaErrorEvent>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnError = true;
        this.obsrv1OnError = source;
        this.bound2OnError = false;
        this.obsrv2OnError = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#onErrorProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalOnError(javafx.beans.property.Property<javafx.event.EventHandler<javafx.scene.media.MediaErrorEvent>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnError = false;
        this.obsrv1OnError = null;
        this.bound2OnError = true;
        this.obsrv2OnError = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#preserveRatioProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindPreserveRatio(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1PreserveRatio = true;
        this.obsrv1PreserveRatio = source;
        this.bound2PreserveRatio = false;
        this.obsrv2PreserveRatio = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#preserveRatioProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalPreserveRatio(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1PreserveRatio = false;
        this.obsrv1PreserveRatio = null;
        this.bound2PreserveRatio = true;
        this.obsrv2PreserveRatio = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#smoothProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindSmooth(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Smooth = true;
        this.obsrv1Smooth = source;
        this.bound2Smooth = false;
        this.obsrv2Smooth = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#smoothProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalSmooth(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Smooth = false;
        this.obsrv1Smooth = null;
        this.bound2Smooth = true;
        this.obsrv2Smooth = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#viewportProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindViewport(javafx.beans.value.ObservableValue<? extends javafx.geometry.Rectangle2D> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Viewport = true;
        this.obsrv1Viewport = source;
        this.bound2Viewport = false;
        this.obsrv2Viewport = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#viewportProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalViewport(javafx.beans.property.Property<javafx.geometry.Rectangle2D> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Viewport = false;
        this.obsrv1Viewport = null;
        this.bound2Viewport = true;
        this.obsrv2Viewport = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#xProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindX(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1X = true;
        this.obsrv1X = source;
        this.bound2X = false;
        this.obsrv2X = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#xProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalX(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1X = false;
        this.obsrv1X = null;
        this.bound2X = true;
        this.obsrv2X = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#yProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindY(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Y = true;
        this.obsrv1Y = source;
        this.bound2Y = false;
        this.obsrv2Y = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#yProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalY(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Y = false;
        this.obsrv1Y = null;
        this.bound2Y = true;
        this.obsrv2Y = source;
        return (B) this;
    }

    /**
     * 建構{@link MediaView}物件
     *
     * @return 新的{@link MediaView}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public MediaView build()
    {
        MediaView instance = new MediaView();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link MediaView}物件
     *
     * @return 新的{@link MediaView}物件實體
     */
    @SuppressWarnings("unchecked")
    public MediaView build(javafx.scene.media.MediaPlayer arg0)
    {
        MediaView instance = new MediaView(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

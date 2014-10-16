// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.stage;

/**
 * {@link Stage}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link Stage})
 * @param <B> 建構器本身的型態(需繼承{@link StageBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class StageBuilder<Z extends Stage, B extends StageBuilder<Z, B>>
        extends javafx.stage.WindowBuilder<Z, B>
        implements StageBuilderExt<Z, B>
{

    private boolean hasAlwaysOnTop;
    private boolean valAlwaysOnTop;

    private boolean hasFullScreen;
    private boolean valFullScreen;

    private boolean hasFullScreenExitHint;
    private java.lang.String valFullScreenExitHint;

    private boolean hasFullScreenExitKeyCombination;
    private javafx.scene.input.KeyCombination valFullScreenExitKeyCombination;

    private boolean hasIconified;
    private boolean valIconified;

    private boolean hasIcons;
    private java.util.Collection<javafx.scene.image.Image> valIcons;

    private boolean hasMaxHeight;
    private double valMaxHeight;

    private boolean hasMaxWidth;
    private double valMaxWidth;

    private boolean hasMaximized;
    private boolean valMaximized;

    private boolean hasMinHeight;
    private double valMinHeight;

    private boolean hasMinWidth;
    private double valMinWidth;

    private boolean hasResizable;
    private boolean valResizable;

    private boolean hasScene;
    private javafx.scene.Scene valScene;

    private boolean hasTitle;
    private java.lang.String valTitle;

    private boolean bound1FullScreenExitHint;
    private boolean bound2FullScreenExitHint;
    private javafx.beans.value.ObservableValue<? extends java.lang.String> obsrv1FullScreenExitHint;
    private javafx.beans.property.Property<java.lang.String> obsrv2FullScreenExitHint;

    private boolean bound1FullScreenExitKey;
    private boolean bound2FullScreenExitKey;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.input.KeyCombination> obsrv1FullScreenExitKey;
    private javafx.beans.property.Property<javafx.scene.input.KeyCombination> obsrv2FullScreenExitKey;

    private boolean bound1MaxHeight;
    private boolean bound2MaxHeight;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1MaxHeight;
    private javafx.beans.property.Property<Number> obsrv2MaxHeight;

    private boolean bound1MaxWidth;
    private boolean bound2MaxWidth;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1MaxWidth;
    private javafx.beans.property.Property<Number> obsrv2MaxWidth;

    private boolean bound1MinHeight;
    private boolean bound2MinHeight;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1MinHeight;
    private javafx.beans.property.Property<Number> obsrv2MinHeight;

    private boolean bound1MinWidth;
    private boolean bound2MinWidth;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1MinWidth;
    private javafx.beans.property.Property<Number> obsrv2MinWidth;

    private boolean bound1Resizable;
    private boolean bound2Resizable;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1Resizable;
    private javafx.beans.property.Property<Boolean> obsrv2Resizable;

    private boolean bound1Title;
    private boolean bound2Title;
    private javafx.beans.value.ObservableValue<? extends String> obsrv1Title;
    private javafx.beans.property.Property<String> obsrv2Title;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasAlwaysOnTop)
            instance.setAlwaysOnTop(this.valAlwaysOnTop);
        if (this.hasFullScreen)
            instance.setFullScreen(this.valFullScreen);
        if (this.hasFullScreenExitHint)
            instance.setFullScreenExitHint(this.valFullScreenExitHint);
        if (this.hasFullScreenExitKeyCombination)
            instance.setFullScreenExitKeyCombination(this.valFullScreenExitKeyCombination);
        if (this.hasIconified)
            instance.setIconified(this.valIconified);
        if (this.hasIcons)
            instance.getIcons().addAll(this.valIcons);
        if (this.hasMaxHeight)
            instance.setMaxHeight(this.valMaxHeight);
        if (this.hasMaxWidth)
            instance.setMaxWidth(this.valMaxWidth);
        if (this.hasMaximized)
            instance.setMaximized(this.valMaximized);
        if (this.hasMinHeight)
            instance.setMinHeight(this.valMinHeight);
        if (this.hasMinWidth)
            instance.setMinWidth(this.valMinWidth);
        if (this.hasResizable)
            instance.setResizable(this.valResizable);
        if (this.hasScene)
            instance.setScene(this.valScene);
        if (this.hasTitle)
            instance.setTitle(this.valTitle);
        if (this.bound1FullScreenExitHint)
            instance.fullScreenExitHintProperty().bind(this.obsrv1FullScreenExitHint);
        if (this.bound2FullScreenExitHint)
            instance.fullScreenExitHintProperty().bindBidirectional(this.obsrv2FullScreenExitHint);
        if (this.bound1FullScreenExitKey)
            instance.fullScreenExitKeyProperty().bind(this.obsrv1FullScreenExitKey);
        if (this.bound2FullScreenExitKey)
            instance.fullScreenExitKeyProperty().bindBidirectional(this.obsrv2FullScreenExitKey);
        if (this.bound1MaxHeight)
            instance.maxHeightProperty().bind(this.obsrv1MaxHeight);
        if (this.bound2MaxHeight)
            instance.maxHeightProperty().bindBidirectional(this.obsrv2MaxHeight);
        if (this.bound1MaxWidth)
            instance.maxWidthProperty().bind(this.obsrv1MaxWidth);
        if (this.bound2MaxWidth)
            instance.maxWidthProperty().bindBidirectional(this.obsrv2MaxWidth);
        if (this.bound1MinHeight)
            instance.minHeightProperty().bind(this.obsrv1MinHeight);
        if (this.bound2MinHeight)
            instance.minHeightProperty().bindBidirectional(this.obsrv2MinHeight);
        if (this.bound1MinWidth)
            instance.minWidthProperty().bind(this.obsrv1MinWidth);
        if (this.bound2MinWidth)
            instance.minWidthProperty().bindBidirectional(this.obsrv2MinWidth);
        if (this.bound1Resizable)
            instance.resizableProperty().bind(this.obsrv1Resizable);
        if (this.bound2Resizable)
            instance.resizableProperty().bindBidirectional(this.obsrv2Resizable);
        if (this.bound1Title)
            instance.titleProperty().bind(this.obsrv1Title);
        if (this.bound2Title)
            instance.titleProperty().bindBidirectional(this.obsrv2Title);
    }

    /**
     * 設定屬性{@link Stage#setAlwaysOnTop(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B alwaysOnTop(boolean value)
    {
        this.hasAlwaysOnTop = true;
        this.valAlwaysOnTop = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Stage#setFullScreen(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B fullScreen(boolean value)
    {
        this.hasFullScreen = true;
        this.valFullScreen = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Stage#setFullScreenExitHint(java.lang.String)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B fullScreenExitHint(java.lang.String value)
    {
        this.hasFullScreenExitHint = true;
        this.valFullScreenExitHint = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Stage#setFullScreenExitKeyCombination(javafx.scene.input.KeyCombination)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B fullScreenExitKeyCombination(javafx.scene.input.KeyCombination value)
    {
        this.hasFullScreenExitKeyCombination = true;
        this.valFullScreenExitKeyCombination = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Stage#setIconified(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B iconified(boolean value)
    {
        this.hasIconified = true;
        this.valIconified = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link Stage#getIcons}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B icons(java.util.Collection<javafx.scene.image.Image> value)
    {
        this.hasIcons = true;
        this.valIcons = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link Stage#getIcons}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B icons(javafx.scene.image.Image... value)
    {
        this.hasIcons = true;
        this.valIcons = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link Stage#getIcons}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B iconsAdd(java.util.Collection<javafx.scene.image.Image> value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasIcons = true;
        if (this.valIcons == null)
            this.valIcons = new java.util.ArrayList<>(value.size());
        this.valIcons.addAll(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link Stage#getIcons}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B iconsAdd(javafx.scene.image.Image... value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasIcons = true;
        if (this.valIcons == null)
            this.valIcons = new java.util.ArrayList<>(value.length);
        this.valIcons.addAll(java.util.Arrays.asList(value));
        return (B) this;
    }

    /**
     * 設定屬性{@link Stage#setMaxHeight(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B maxHeight(double value)
    {
        this.hasMaxHeight = true;
        this.valMaxHeight = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Stage#setMaxWidth(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B maxWidth(double value)
    {
        this.hasMaxWidth = true;
        this.valMaxWidth = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Stage#setMaximized(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B maximized(boolean value)
    {
        this.hasMaximized = true;
        this.valMaximized = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Stage#setMinHeight(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B minHeight(double value)
    {
        this.hasMinHeight = true;
        this.valMinHeight = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Stage#setMinWidth(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B minWidth(double value)
    {
        this.hasMinWidth = true;
        this.valMinWidth = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Stage#setResizable(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B resizable(boolean value)
    {
        this.hasResizable = true;
        this.valResizable = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Stage#setScene(javafx.scene.Scene)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B scene(javafx.scene.Scene value)
    {
        this.hasScene = true;
        this.valScene = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Stage#setTitle(java.lang.String)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B title(java.lang.String value)
    {
        this.hasTitle = true;
        this.valTitle = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Stage#fullScreenExitHintProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindFullScreenExitHint(javafx.beans.value.ObservableValue<? extends java.lang.String> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1FullScreenExitHint = true;
        this.obsrv1FullScreenExitHint = source;
        this.bound2FullScreenExitHint = false;
        this.obsrv2FullScreenExitHint = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Stage#fullScreenExitHintProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalFullScreenExitHint(javafx.beans.property.Property<java.lang.String> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1FullScreenExitHint = false;
        this.obsrv1FullScreenExitHint = null;
        this.bound2FullScreenExitHint = true;
        this.obsrv2FullScreenExitHint = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Stage#fullScreenExitKeyProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindFullScreenExitKey(javafx.beans.value.ObservableValue<? extends javafx.scene.input.KeyCombination> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1FullScreenExitKey = true;
        this.obsrv1FullScreenExitKey = source;
        this.bound2FullScreenExitKey = false;
        this.obsrv2FullScreenExitKey = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Stage#fullScreenExitKeyProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalFullScreenExitKey(javafx.beans.property.Property<javafx.scene.input.KeyCombination> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1FullScreenExitKey = false;
        this.obsrv1FullScreenExitKey = null;
        this.bound2FullScreenExitKey = true;
        this.obsrv2FullScreenExitKey = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Stage#maxHeightProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindMaxHeight(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1MaxHeight = true;
        this.obsrv1MaxHeight = source;
        this.bound2MaxHeight = false;
        this.obsrv2MaxHeight = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Stage#maxHeightProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalMaxHeight(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1MaxHeight = false;
        this.obsrv1MaxHeight = null;
        this.bound2MaxHeight = true;
        this.obsrv2MaxHeight = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Stage#maxWidthProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindMaxWidth(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1MaxWidth = true;
        this.obsrv1MaxWidth = source;
        this.bound2MaxWidth = false;
        this.obsrv2MaxWidth = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Stage#maxWidthProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalMaxWidth(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1MaxWidth = false;
        this.obsrv1MaxWidth = null;
        this.bound2MaxWidth = true;
        this.obsrv2MaxWidth = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Stage#minHeightProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindMinHeight(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1MinHeight = true;
        this.obsrv1MinHeight = source;
        this.bound2MinHeight = false;
        this.obsrv2MinHeight = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Stage#minHeightProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalMinHeight(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1MinHeight = false;
        this.obsrv1MinHeight = null;
        this.bound2MinHeight = true;
        this.obsrv2MinHeight = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Stage#minWidthProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindMinWidth(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1MinWidth = true;
        this.obsrv1MinWidth = source;
        this.bound2MinWidth = false;
        this.obsrv2MinWidth = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Stage#minWidthProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalMinWidth(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1MinWidth = false;
        this.obsrv1MinWidth = null;
        this.bound2MinWidth = true;
        this.obsrv2MinWidth = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Stage#resizableProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindResizable(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Resizable = true;
        this.obsrv1Resizable = source;
        this.bound2Resizable = false;
        this.obsrv2Resizable = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Stage#resizableProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalResizable(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Resizable = false;
        this.obsrv1Resizable = null;
        this.bound2Resizable = true;
        this.obsrv2Resizable = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Stage#titleProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindTitle(javafx.beans.value.ObservableValue<? extends String> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Title = true;
        this.obsrv1Title = source;
        this.bound2Title = false;
        this.obsrv2Title = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Stage#titleProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalTitle(javafx.beans.property.Property<String> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Title = false;
        this.obsrv1Title = null;
        this.bound2Title = true;
        this.obsrv2Title = source;
        return (B) this;
    }

    /**
     * 建構{@link Stage}物件
     *
     * @return 新的{@link Stage}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Stage build()
    {
        Stage instance = new Stage();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link Stage}物件
     *
     * @return 新的{@link Stage}物件實體
     */
    @SuppressWarnings("unchecked")
    public Stage build(javafx.stage.StageStyle arg0)
    {
        Stage instance = new Stage(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

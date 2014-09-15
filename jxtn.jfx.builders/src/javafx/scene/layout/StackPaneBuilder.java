// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.layout;

/**
 * {@link StackPane}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link StackPane})
 * @param <B> 建構器本身的型態(需繼承{@link StackPaneBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class StackPaneBuilder<Z extends StackPane, B extends StackPaneBuilder<Z, B>>
        extends javafx.scene.layout.PaneBuilder<Z, B>
        implements StackPaneBuilderExt<Z, B>
{

    private boolean hasAlignment;
    private javafx.geometry.Pos valAlignment;

    private boolean bound1Alignment;
    private boolean bound2Alignment;
    private javafx.beans.value.ObservableValue<? extends javafx.geometry.Pos> obsrv1Alignment;
    private javafx.beans.property.Property<javafx.geometry.Pos> obsrv2Alignment;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasAlignment)
            instance.setAlignment(this.valAlignment);
        if (this.bound1Alignment)
            instance.alignmentProperty().bind(this.obsrv1Alignment);
        if (this.bound2Alignment)
            instance.alignmentProperty().bindBidirectional(this.obsrv2Alignment);
    }

    /**
     * 設定屬性{@link StackPane#setAlignment(javafx.geometry.Pos)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B alignment(javafx.geometry.Pos value)
    {
        this.hasAlignment = true;
        this.valAlignment = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link StackPane#alignmentProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindAlignment(javafx.beans.value.ObservableValue<? extends javafx.geometry.Pos> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Alignment = true;
        this.obsrv1Alignment = source;
        this.bound2Alignment = false;
        this.obsrv2Alignment = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link StackPane#alignmentProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalAlignment(javafx.beans.property.Property<javafx.geometry.Pos> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Alignment = false;
        this.obsrv1Alignment = null;
        this.bound2Alignment = true;
        this.obsrv2Alignment = source;
        return (B) this;
    }

    /**
     * 建構{@link StackPane}物件
     *
     * @return 新的{@link StackPane}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public StackPane build()
    {
        StackPane instance = new StackPane();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

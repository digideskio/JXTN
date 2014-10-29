// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link Label}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link Label})
 * @param <B> 建構器本身的型態(需繼承{@link LabelBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class LabelBuilder<Z extends Label, B extends LabelBuilder<Z, B>>
        extends javafx.scene.control.LabeledBuilder<Z, B>
        implements LabelBuilderExt<Z, B>
{

    private boolean hasLabelFor;
    private javafx.scene.Node valLabelFor;

    private boolean bound1LabelFor;
    private boolean bound2LabelFor;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrv1LabelFor;
    private javafx.beans.property.Property<javafx.scene.Node> obsrv2LabelFor;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasLabelFor)
            instance.setLabelFor(this.valLabelFor);
        if (this.bound1LabelFor)
            instance.labelForProperty().bind(this.obsrv1LabelFor);
        if (this.bound2LabelFor)
            instance.labelForProperty().bindBidirectional(this.obsrv2LabelFor);
    }

    /**
     * 設定屬性{@link Label#setLabelFor(javafx.scene.Node)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B labelFor(javafx.scene.Node value)
    {
        this.hasLabelFor = true;
        this.valLabelFor = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Label#labelForProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindLabelFor(javafx.beans.value.ObservableValue<? extends javafx.scene.Node> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1LabelFor = true;
        this.obsrv1LabelFor = source;
        this.bound2LabelFor = false;
        this.obsrv2LabelFor = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Label#labelForProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalLabelFor(javafx.beans.property.Property<javafx.scene.Node> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1LabelFor = false;
        this.obsrv1LabelFor = null;
        this.bound2LabelFor = true;
        this.obsrv2LabelFor = source;
        return (B) this;
    }

    /**
     * 建構{@link Label}物件。
     *
     * @return 新的{@link Label}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Label build()
    {
        Label instance = new Label();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link Label}物件。
     *
     * @return 新的{@link Label}物件實體
     */
    @SuppressWarnings("unchecked")
    public Label build(java.lang.String arg0)
    {
        Label instance = new Label(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link Label}物件。
     *
     * @return 新的{@link Label}物件實體
     */
    @SuppressWarnings("unchecked")
    public Label build(java.lang.String arg0, javafx.scene.Node arg1)
    {
        Label instance = new Label(arg0, arg1);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

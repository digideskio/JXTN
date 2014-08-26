// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link Accordion}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class AccordionBuilder<Z extends Accordion, B extends AccordionBuilder<Z, B>>
        extends javafx.scene.control.ControlBuilder<Z, B>
{

    protected boolean hasExpandedPane;
    protected javafx.scene.control.TitledPane valExpandedPane;

    protected boolean hasPanes;
    protected java.util.Collection<javafx.scene.control.TitledPane> valPanes;

    protected boolean boundExpandedPane;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.control.TitledPane> obsrvExpandedPane;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasExpandedPane)
            instance.setExpandedPane(this.valExpandedPane);
        if (this.hasPanes)
            instance.getPanes().setAll(this.valPanes);
        if (this.boundExpandedPane)
            instance.expandedPaneProperty().bind(this.obsrvExpandedPane);
    }

    /**
     * 設定屬性{@link Accordion#setExpandedPane}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B expandedPane(javafx.scene.control.TitledPane value)
    {
        this.hasExpandedPane = true;
        this.valExpandedPane = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link Accordion#getPanes}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B panes(java.util.Collection<javafx.scene.control.TitledPane> value)
    {
        this.hasPanes = true;
        this.valPanes = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link Accordion#getPanes}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B panes(javafx.scene.control.TitledPane... value)
    {
        this.hasPanes = true;
        this.valPanes = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 設定屬性{@link Accordion#expandedPaneProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindExpandedPane(javafx.beans.value.ObservableValue<? extends javafx.scene.control.TitledPane> source)
    {
        assert (source != null);
        this.boundExpandedPane = true;
        this.obsrvExpandedPane = source;
        return (B) this;
    }

    /**
     * 建構{@link Accordion}物件
     *
     * @return 新的{@link Accordion}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Accordion build()
    {
        Accordion instance = new Accordion();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control;

/**
 * {@link CheckTreeView}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.0.6_20.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class CheckTreeViewBuilder<T extends java.lang.Object, Z extends CheckTreeView<T>, B extends CheckTreeViewBuilder<T, Z, B>>
        extends javafx.scene.control.TreeViewBuilder<T, Z, B>
{

    protected boolean hasCheckModel;
    protected javafx.scene.control.MultipleSelectionModel<javafx.scene.control.TreeItem<T>> valCheckModel;

    protected boolean boundCheckModel;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.control.MultipleSelectionModel<javafx.scene.control.TreeItem<T>>> obsrvCheckModel;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasCheckModel)
            instance.setCheckModel(this.valCheckModel);
        if (this.boundCheckModel)
            instance.checkModelProperty().bind(this.obsrvCheckModel);
    }

    /**
     * 設定屬性{@link CheckTreeView#setCheckModel}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B checkModel(javafx.scene.control.MultipleSelectionModel<javafx.scene.control.TreeItem<T>> value)
    {
        this.hasCheckModel = true;
        this.valCheckModel = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link CheckTreeView#checkModelProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindCheckModel(javafx.beans.value.ObservableValue<? extends javafx.scene.control.MultipleSelectionModel<javafx.scene.control.TreeItem<T>>> source)
    {
        assert (source != null);
        this.boundCheckModel = true;
        this.obsrvCheckModel = source;
        return (B) this;
    }

    /**
     * 建構{@link CheckTreeView}物件
     *
     * @return 新的{@link CheckTreeView}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public CheckTreeView<T> build()
    {
        CheckTreeView<T> instance = new CheckTreeView<T>();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
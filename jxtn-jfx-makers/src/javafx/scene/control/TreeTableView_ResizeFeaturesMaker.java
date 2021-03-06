// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link TreeTableView.ResizeFeatures}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link TreeTableView.ResizeFeatures})
 * @param <B> 建構器本身的型態(需繼承{@link TreeTableView.ResizeFeaturesMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class TreeTableView_ResizeFeaturesMaker<S extends java.lang.Object, Z extends TreeTableView.ResizeFeatures<S>, B extends TreeTableView_ResizeFeaturesMaker<S, Z, B>>
        extends javafx.scene.control.ResizeFeaturesBaseMaker<javafx.scene.control.TreeItem<S>, Z, B>
        implements TreeTableView_ResizeFeaturesMakerExt<S, Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link TreeTableView.ResizeFeatures}物件。
     *
     * @return 新的{@link TreeTableView.ResizeFeatures}物件實體
     */
    @SuppressWarnings("unchecked")
    public TreeTableView.ResizeFeatures<S> build(javafx.scene.control.TreeTableView<S> arg0, javafx.scene.control.TreeTableColumn<S, ?> arg1, java.lang.Double arg2)
    {
        TreeTableView.ResizeFeatures<S> instance = new TreeTableView.ResizeFeatures<S>(arg0, arg1, arg2);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

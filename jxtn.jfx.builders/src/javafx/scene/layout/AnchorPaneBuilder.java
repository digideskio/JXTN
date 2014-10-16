// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.layout;

/**
 * {@link AnchorPane}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link AnchorPane})
 * @param <B> 建構器本身的型態(需繼承{@link AnchorPaneBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class AnchorPaneBuilder<Z extends AnchorPane, B extends AnchorPaneBuilder<Z, B>>
        extends javafx.scene.layout.PaneBuilder<Z, B>
        implements AnchorPaneBuilderExt<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link AnchorPane}物件
     *
     * @return 新的{@link AnchorPane}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public AnchorPane build()
    {
        AnchorPane instance = new AnchorPane();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link AnchorPane}物件
     *
     * @return 新的{@link AnchorPane}物件實體
     */
    @SuppressWarnings("unchecked")
    public AnchorPane build(javafx.scene.Node[] arg0)
    {
        AnchorPane instance = new AnchorPane(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

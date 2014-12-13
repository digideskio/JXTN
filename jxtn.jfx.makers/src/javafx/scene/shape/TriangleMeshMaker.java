// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.shape;

/**
 * {@link TriangleMesh}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link TriangleMesh})
 * @param <B> 建構器本身的型態(需繼承{@link TriangleMeshMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class TriangleMeshMaker<Z extends TriangleMesh, B extends TriangleMeshMaker<Z, B>>
        extends javafx.scene.shape.MeshMaker<Z, B>
        implements TriangleMeshMakerExt<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link TriangleMesh}物件。
     *
     * @return 新的{@link TriangleMesh}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public TriangleMesh build()
    {
        TriangleMesh instance = new TriangleMesh();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link TreeTableCell}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class TreeTableCellBuilder<S extends java.lang.Object, T extends java.lang.Object, Z extends TreeTableCell<S, T>, B extends TreeTableCellBuilder<S, T, Z, B>>
        extends javafx.scene.control.IndexedCellBuilder<T, Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link TreeTableCell}物件
     *
     * @return 新的{@link TreeTableCell}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public TreeTableCell<S, T> build()
    {
        TreeTableCell<S, T> instance = new TreeTableCell<S, T>();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
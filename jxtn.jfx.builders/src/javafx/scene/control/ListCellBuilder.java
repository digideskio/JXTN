// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link ListCell}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ListCellBuilder<T extends java.lang.Object, Z extends ListCell<T>, B extends ListCellBuilder<T, Z, B>>
        extends javafx.scene.control.IndexedCellBuilder<T, Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link ListCell}物件
     *
     * @return 新的{@link ListCell}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public ListCell<T> build()
    {
        ListCell<T> instance = new ListCell<T>();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
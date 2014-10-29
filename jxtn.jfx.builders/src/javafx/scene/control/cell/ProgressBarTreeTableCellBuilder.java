// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control.cell;

/**
 * {@link ProgressBarTreeTableCell}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link ProgressBarTreeTableCell})
 * @param <B> 建構器本身的型態(需繼承{@link ProgressBarTreeTableCellBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ProgressBarTreeTableCellBuilder<S extends java.lang.Object, Z extends ProgressBarTreeTableCell<S>, B extends ProgressBarTreeTableCellBuilder<S, Z, B>>
        extends javafx.scene.control.TreeTableCellBuilder<S, java.lang.Double, Z, B>
        implements ProgressBarTreeTableCellBuilderExt<S, Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link ProgressBarTreeTableCell}物件。
     *
     * @return 新的{@link ProgressBarTreeTableCell}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public ProgressBarTreeTableCell<S> build()
    {
        ProgressBarTreeTableCell<S> instance = new ProgressBarTreeTableCell<S>();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

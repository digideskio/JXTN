// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control.spreadsheet;

/**
 * {@link SpreadsheetCellEditor.IntegerEditor}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.40.11-20151113.010656-84.jar
 * @param <Z> 要建構的物件型態(需繼承{@link SpreadsheetCellEditor.IntegerEditor})
 * @param <B> 建構器本身的型態(需繼承{@link SpreadsheetCellEditor.IntegerEditorMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class SpreadsheetCellEditor_IntegerEditorMaker<Z extends SpreadsheetCellEditor.IntegerEditor, B extends SpreadsheetCellEditor_IntegerEditorMaker<Z, B>>
        extends org.controlsfx.control.spreadsheet.SpreadsheetCellEditorMaker<Z, B>
        implements SpreadsheetCellEditor_IntegerEditorMakerExt<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link SpreadsheetCellEditor.IntegerEditor}物件。
     *
     * @return 新的{@link SpreadsheetCellEditor.IntegerEditor}物件實體
     */
    @SuppressWarnings("unchecked")
    public SpreadsheetCellEditor.IntegerEditor build(org.controlsfx.control.spreadsheet.SpreadsheetView arg0)
    {
        SpreadsheetCellEditor.IntegerEditor instance = new SpreadsheetCellEditor.IntegerEditor(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

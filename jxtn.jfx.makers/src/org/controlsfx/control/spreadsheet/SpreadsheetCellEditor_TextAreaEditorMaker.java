// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control.spreadsheet;

/**
 * {@link SpreadsheetCellEditor.TextAreaEditor}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.40.11-20151113.010656-84.jar
 * @param <Z> 要建構的物件型態(需繼承{@link SpreadsheetCellEditor.TextAreaEditor})
 * @param <B> 建構器本身的型態(需繼承{@link SpreadsheetCellEditor.TextAreaEditorMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class SpreadsheetCellEditor_TextAreaEditorMaker<Z extends SpreadsheetCellEditor.TextAreaEditor, B extends SpreadsheetCellEditor_TextAreaEditorMaker<Z, B>>
        extends org.controlsfx.control.spreadsheet.SpreadsheetCellEditorMaker<Z, B>
        implements SpreadsheetCellEditor_TextAreaEditorMakerExt<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link SpreadsheetCellEditor.TextAreaEditor}物件。
     *
     * @return 新的{@link SpreadsheetCellEditor.TextAreaEditor}物件實體
     */
    @SuppressWarnings("unchecked")
    public SpreadsheetCellEditor.TextAreaEditor build(org.controlsfx.control.spreadsheet.SpreadsheetView arg0)
    {
        SpreadsheetCellEditor.TextAreaEditor instance = new SpreadsheetCellEditor.TextAreaEditor(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

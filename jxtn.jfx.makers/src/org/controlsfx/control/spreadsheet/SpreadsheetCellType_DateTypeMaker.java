// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control.spreadsheet;

/**
 * {@link SpreadsheetCellType.DateType}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.40.10.jar
 * @param <Z> 要建構的物件型態(需繼承{@link SpreadsheetCellType.DateType})
 * @param <B> 建構器本身的型態(需繼承{@link SpreadsheetCellType.DateTypeMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class SpreadsheetCellType_DateTypeMaker<Z extends SpreadsheetCellType.DateType, B extends SpreadsheetCellType_DateTypeMaker<Z, B>>
        extends org.controlsfx.control.spreadsheet.SpreadsheetCellTypeMaker<java.time.LocalDate, Z, B>
        implements SpreadsheetCellType_DateTypeMakerExt<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link SpreadsheetCellType.DateType}物件。
     *
     * @return 新的{@link SpreadsheetCellType.DateType}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public SpreadsheetCellType.DateType build()
    {
        SpreadsheetCellType.DateType instance = new SpreadsheetCellType.DateType();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link SpreadsheetCellType.DateType}物件。
     *
     * @return 新的{@link SpreadsheetCellType.DateType}物件實體
     */
    @SuppressWarnings("unchecked")
    public SpreadsheetCellType.DateType build(javafx.util.StringConverter<java.time.LocalDate> arg0)
    {
        SpreadsheetCellType.DateType instance = new SpreadsheetCellType.DateType(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

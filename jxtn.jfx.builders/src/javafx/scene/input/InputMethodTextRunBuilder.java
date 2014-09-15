// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.input;

/**
 * {@link InputMethodTextRun}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link InputMethodTextRun})
 * @param <B> 建構器本身的型態(需繼承{@link InputMethodTextRunBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class InputMethodTextRunBuilder<Z extends InputMethodTextRun, B extends InputMethodTextRunBuilder<Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
        implements jxtn.jfx.builders.AbstractBuilderExt<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link InputMethodTextRun}物件
     *
     * @return 新的{@link InputMethodTextRun}物件實體
     */
    @SuppressWarnings("unchecked")
    public InputMethodTextRun build(java.lang.String arg0, javafx.scene.input.InputMethodHighlight arg1)
    {
        InputMethodTextRun instance = new InputMethodTextRun(arg0, arg1);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

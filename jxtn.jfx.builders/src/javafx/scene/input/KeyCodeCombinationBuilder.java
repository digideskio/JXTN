// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.input;

/**
 * {@link KeyCodeCombination}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link KeyCodeCombination})
 * @param <B> 建構器本身的型態(需繼承{@link KeyCodeCombinationBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class KeyCodeCombinationBuilder<Z extends KeyCodeCombination, B extends KeyCodeCombinationBuilder<Z, B>>
        extends javafx.scene.input.KeyCombinationBuilder<Z, B>
        implements KeyCodeCombinationBuilderExt<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link KeyCodeCombination}物件。
     *
     * @return 新的{@link KeyCodeCombination}物件實體
     */
    @SuppressWarnings("unchecked")
    public KeyCodeCombination build(javafx.scene.input.KeyCode arg0, javafx.scene.input.KeyCombination.Modifier[] arg1)
    {
        KeyCodeCombination instance = new KeyCodeCombination(arg0, arg1);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link KeyCodeCombination}物件。
     *
     * @return 新的{@link KeyCodeCombination}物件實體
     */
    @SuppressWarnings("unchecked")
    public KeyCodeCombination build(javafx.scene.input.KeyCode arg0, javafx.scene.input.KeyCombination.ModifierValue arg1, javafx.scene.input.KeyCombination.ModifierValue arg2, javafx.scene.input.KeyCombination.ModifierValue arg3, javafx.scene.input.KeyCombination.ModifierValue arg4, javafx.scene.input.KeyCombination.ModifierValue arg5)
    {
        KeyCodeCombination instance = new KeyCodeCombination(arg0, arg1, arg2, arg3, arg4, arg5);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

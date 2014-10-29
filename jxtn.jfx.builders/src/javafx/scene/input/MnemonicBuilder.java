// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.input;

/**
 * {@link Mnemonic}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link Mnemonic})
 * @param <B> 建構器本身的型態(需繼承{@link MnemonicBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class MnemonicBuilder<Z extends Mnemonic, B extends MnemonicBuilder<Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
        implements MnemonicBuilderExt<Z, B>
{

    private boolean hasKeyCombination;
    private javafx.scene.input.KeyCombination valKeyCombination;

    private boolean hasNode;
    private javafx.scene.Node valNode;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasKeyCombination)
            instance.setKeyCombination(this.valKeyCombination);
        if (this.hasNode)
            instance.setNode(this.valNode);
    }

    /**
     * 設定屬性{@link Mnemonic#setKeyCombination(javafx.scene.input.KeyCombination)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B keyCombination(javafx.scene.input.KeyCombination value)
    {
        this.hasKeyCombination = true;
        this.valKeyCombination = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Mnemonic#setNode(javafx.scene.Node)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B node(javafx.scene.Node value)
    {
        this.hasNode = true;
        this.valNode = value;
        return (B) this;
    }

    /**
     * 建構{@link Mnemonic}物件。
     *
     * @return 新的{@link Mnemonic}物件實體
     */
    @SuppressWarnings("unchecked")
    public Mnemonic build(javafx.scene.Node arg0, javafx.scene.input.KeyCombination arg1)
    {
        Mnemonic instance = new Mnemonic(arg0, arg1);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

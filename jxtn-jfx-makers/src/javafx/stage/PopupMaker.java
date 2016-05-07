// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.stage;

/**
 * {@link Popup}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link Popup})
 * @param <B> 建構器本身的型態(需繼承{@link PopupMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class PopupMaker<Z extends Popup, B extends PopupMaker<Z, B>>
        extends javafx.stage.PopupWindowMaker<Z, B>
        implements PopupMakerExt<Z, B>
{

    private boolean hasContent;
    private java.util.Collection<javafx.scene.Node> valContent;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasContent)
            instance.getContent().addAll(this.valContent);
    }

    /**
     * 設定集合屬性{@link Popup#getContent}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     * @deprecated 屬性值並非{@link javafx.collections.ObservableList}
     */
    @Deprecated
    @SuppressWarnings("unchecked")
    public final B content(java.util.Collection<? extends javafx.scene.Node> value)
    {
        this.hasContent = true;
        this.valContent = (java.util.Collection<javafx.scene.Node>) value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link Popup#getContent}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B content(javafx.scene.Node... value)
    {
        this.hasContent = true;
        this.valContent = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link Popup#getContent}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B contentAdd(java.util.Collection<? extends javafx.scene.Node> value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasContent = true;
        if (this.valContent == null)
            this.valContent = new java.util.ArrayList<>(value.size());
        this.valContent.addAll(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link Popup#getContent}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B contentAdd(javafx.scene.Node... value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasContent = true;
        if (this.valContent == null)
            this.valContent = new java.util.ArrayList<>(value.length);
        this.valContent.addAll(java.util.Arrays.asList(value));
        return (B) this;
    }

    /**
     * 增加集合屬性{@link Popup#getContent}的內容，排除null項目。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B contentAddNonNull(java.util.Collection<? extends javafx.scene.Node> value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasContent = true;
        if (this.valContent == null)
            this.valContent = new java.util.ArrayList<>(value.size());
        for (javafx.scene.Node i : value)
            if (i != null)
                this.valContent.add(i);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link Popup#getContent}的內容，排除null項目。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B contentAddNonNull(javafx.scene.Node... value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasContent = true;
        if (this.valContent == null)
            this.valContent = new java.util.ArrayList<>(value.length);
        for (javafx.scene.Node i : value)
            if (i != null)
                this.valContent.add(i);
        return (B) this;
    }

    /**
     * 建構{@link Popup}物件。
     *
     * @return 新的{@link Popup}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Popup build()
    {
        Popup instance = new Popup();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
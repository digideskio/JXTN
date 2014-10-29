// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link Menu}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link Menu})
 * @param <B> 建構器本身的型態(需繼承{@link MenuBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class MenuBuilder<Z extends Menu, B extends MenuBuilder<Z, B>>
        extends javafx.scene.control.MenuItemBuilder<Z, B>
        implements MenuBuilderExt<Z, B>
{

    private boolean hasItems;
    private java.util.Collection<javafx.scene.control.MenuItem> valItems;

    private boolean hasOnHidden;
    private javafx.event.EventHandler<javafx.event.Event> valOnHidden;

    private boolean hasOnHiding;
    private javafx.event.EventHandler<javafx.event.Event> valOnHiding;

    private boolean hasOnShowing;
    private javafx.event.EventHandler<javafx.event.Event> valOnShowing;

    private boolean hasOnShown;
    private javafx.event.EventHandler<javafx.event.Event> valOnShown;

    private boolean bound1OnHidden;
    private boolean bound2OnHidden;
    private javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> obsrv1OnHidden;
    private javafx.beans.property.Property<javafx.event.EventHandler<javafx.event.Event>> obsrv2OnHidden;

    private boolean bound1OnHiding;
    private boolean bound2OnHiding;
    private javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> obsrv1OnHiding;
    private javafx.beans.property.Property<javafx.event.EventHandler<javafx.event.Event>> obsrv2OnHiding;

    private boolean bound1OnShowing;
    private boolean bound2OnShowing;
    private javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> obsrv1OnShowing;
    private javafx.beans.property.Property<javafx.event.EventHandler<javafx.event.Event>> obsrv2OnShowing;

    private boolean bound1OnShown;
    private boolean bound2OnShown;
    private javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> obsrv1OnShown;
    private javafx.beans.property.Property<javafx.event.EventHandler<javafx.event.Event>> obsrv2OnShown;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasItems)
            instance.getItems().addAll(this.valItems);
        if (this.hasOnHidden)
            instance.setOnHidden(this.valOnHidden);
        if (this.hasOnHiding)
            instance.setOnHiding(this.valOnHiding);
        if (this.hasOnShowing)
            instance.setOnShowing(this.valOnShowing);
        if (this.hasOnShown)
            instance.setOnShown(this.valOnShown);
        if (this.bound1OnHidden)
            instance.onHiddenProperty().bind(this.obsrv1OnHidden);
        if (this.bound2OnHidden)
            instance.onHiddenProperty().bindBidirectional(this.obsrv2OnHidden);
        if (this.bound1OnHiding)
            instance.onHidingProperty().bind(this.obsrv1OnHiding);
        if (this.bound2OnHiding)
            instance.onHidingProperty().bindBidirectional(this.obsrv2OnHiding);
        if (this.bound1OnShowing)
            instance.onShowingProperty().bind(this.obsrv1OnShowing);
        if (this.bound2OnShowing)
            instance.onShowingProperty().bindBidirectional(this.obsrv2OnShowing);
        if (this.bound1OnShown)
            instance.onShownProperty().bind(this.obsrv1OnShown);
        if (this.bound2OnShown)
            instance.onShownProperty().bindBidirectional(this.obsrv2OnShown);
    }

    /**
     * 設定集合屬性{@link Menu#getItems}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     * @deprecated 屬性值並非{@link javafx.collections.ObservableList}
     */
    @Deprecated
    @SuppressWarnings("unchecked")
    public final B items(java.util.Collection<javafx.scene.control.MenuItem> value)
    {
        this.hasItems = true;
        this.valItems = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link Menu#getItems}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B items(javafx.scene.control.MenuItem... value)
    {
        this.hasItems = true;
        this.valItems = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link Menu#getItems}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B itemsAdd(java.util.Collection<javafx.scene.control.MenuItem> value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasItems = true;
        if (this.valItems == null)
            this.valItems = new java.util.ArrayList<>(value.size());
        this.valItems.addAll(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link Menu#getItems}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B itemsAdd(javafx.scene.control.MenuItem... value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasItems = true;
        if (this.valItems == null)
            this.valItems = new java.util.ArrayList<>(value.length);
        this.valItems.addAll(java.util.Arrays.asList(value));
        return (B) this;
    }

    /**
     * 設定屬性{@link Menu#setOnHidden(javafx.event.EventHandler)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onHidden(javafx.event.EventHandler<javafx.event.Event> value)
    {
        this.hasOnHidden = true;
        this.valOnHidden = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Menu#setOnHiding(javafx.event.EventHandler)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onHiding(javafx.event.EventHandler<javafx.event.Event> value)
    {
        this.hasOnHiding = true;
        this.valOnHiding = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Menu#setOnShowing(javafx.event.EventHandler)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onShowing(javafx.event.EventHandler<javafx.event.Event> value)
    {
        this.hasOnShowing = true;
        this.valOnShowing = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Menu#setOnShown(javafx.event.EventHandler)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onShown(javafx.event.EventHandler<javafx.event.Event> value)
    {
        this.hasOnShown = true;
        this.valOnShown = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Menu#onHiddenProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOnHidden(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnHidden = true;
        this.obsrv1OnHidden = source;
        this.bound2OnHidden = false;
        this.obsrv2OnHidden = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Menu#onHiddenProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalOnHidden(javafx.beans.property.Property<javafx.event.EventHandler<javafx.event.Event>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnHidden = false;
        this.obsrv1OnHidden = null;
        this.bound2OnHidden = true;
        this.obsrv2OnHidden = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Menu#onHidingProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOnHiding(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnHiding = true;
        this.obsrv1OnHiding = source;
        this.bound2OnHiding = false;
        this.obsrv2OnHiding = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Menu#onHidingProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalOnHiding(javafx.beans.property.Property<javafx.event.EventHandler<javafx.event.Event>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnHiding = false;
        this.obsrv1OnHiding = null;
        this.bound2OnHiding = true;
        this.obsrv2OnHiding = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Menu#onShowingProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOnShowing(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnShowing = true;
        this.obsrv1OnShowing = source;
        this.bound2OnShowing = false;
        this.obsrv2OnShowing = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Menu#onShowingProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalOnShowing(javafx.beans.property.Property<javafx.event.EventHandler<javafx.event.Event>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnShowing = false;
        this.obsrv1OnShowing = null;
        this.bound2OnShowing = true;
        this.obsrv2OnShowing = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Menu#onShownProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOnShown(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnShown = true;
        this.obsrv1OnShown = source;
        this.bound2OnShown = false;
        this.obsrv2OnShown = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Menu#onShownProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalOnShown(javafx.beans.property.Property<javafx.event.EventHandler<javafx.event.Event>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnShown = false;
        this.obsrv1OnShown = null;
        this.bound2OnShown = true;
        this.obsrv2OnShown = source;
        return (B) this;
    }

    /**
     * 建構{@link Menu}物件。
     *
     * @return 新的{@link Menu}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Menu build()
    {
        Menu instance = new Menu();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link Menu}物件。
     *
     * @return 新的{@link Menu}物件實體
     */
    @SuppressWarnings("unchecked")
    public Menu build(java.lang.String arg0)
    {
        Menu instance = new Menu(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link Menu}物件。
     *
     * @return 新的{@link Menu}物件實體
     */
    @SuppressWarnings("unchecked")
    public Menu build(java.lang.String arg0, javafx.scene.Node arg1)
    {
        Menu instance = new Menu(arg0, arg1);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

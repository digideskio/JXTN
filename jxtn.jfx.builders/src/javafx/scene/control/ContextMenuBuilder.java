// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link ContextMenu}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link ContextMenu})
 * @param <B> 建構器本身的型態(需繼承{@link ContextMenuBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ContextMenuBuilder<Z extends ContextMenu, B extends ContextMenuBuilder<Z, B>>
        extends javafx.scene.control.PopupControlBuilder<Z, B>
        implements ContextMenuBuilderExt<Z, B>
{

    private boolean hasImpl_showRelativeToWindow;
    private boolean valImpl_showRelativeToWindow;

    private boolean hasItems;
    private java.util.Collection<javafx.scene.control.MenuItem> valItems;

    private boolean hasOnAction;
    private javafx.event.EventHandler<javafx.event.ActionEvent> valOnAction;

    private boolean bound1Impl_showRelativeToWindow;
    private boolean bound2Impl_showRelativeToWindow;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1Impl_showRelativeToWindow;
    private javafx.beans.property.Property<Boolean> obsrv2Impl_showRelativeToWindow;

    private boolean bound1OnAction;
    private boolean bound2OnAction;
    private javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.ActionEvent>> obsrv1OnAction;
    private javafx.beans.property.Property<javafx.event.EventHandler<javafx.event.ActionEvent>> obsrv2OnAction;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasImpl_showRelativeToWindow)
            instance.setImpl_showRelativeToWindow(this.valImpl_showRelativeToWindow);
        if (this.hasItems)
            instance.getItems().addAll(this.valItems);
        if (this.hasOnAction)
            instance.setOnAction(this.valOnAction);
        if (this.bound1Impl_showRelativeToWindow)
            instance.impl_showRelativeToWindowProperty().bind(this.obsrv1Impl_showRelativeToWindow);
        if (this.bound2Impl_showRelativeToWindow)
            instance.impl_showRelativeToWindowProperty().bindBidirectional(this.obsrv2Impl_showRelativeToWindow);
        if (this.bound1OnAction)
            instance.onActionProperty().bind(this.obsrv1OnAction);
        if (this.bound2OnAction)
            instance.onActionProperty().bindBidirectional(this.obsrv2OnAction);
    }

    /**
     * 設定屬性{@link ContextMenu#setImpl_showRelativeToWindow(boolean)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B impl_showRelativeToWindow(boolean value)
    {
        this.hasImpl_showRelativeToWindow = true;
        this.valImpl_showRelativeToWindow = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link ContextMenu#getItems}的內容。
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
     * 設定集合屬性{@link ContextMenu#getItems}的內容。
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
     * 增加集合屬性{@link ContextMenu#getItems}的內容。
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
     * 增加集合屬性{@link ContextMenu#getItems}的內容。
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
     * 設定屬性{@link ContextMenu#setOnAction(javafx.event.EventHandler)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onAction(javafx.event.EventHandler<javafx.event.ActionEvent> value)
    {
        this.hasOnAction = true;
        this.valOnAction = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ContextMenu#impl_showRelativeToWindowProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindImpl_showRelativeToWindow(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Impl_showRelativeToWindow = true;
        this.obsrv1Impl_showRelativeToWindow = source;
        this.bound2Impl_showRelativeToWindow = false;
        this.obsrv2Impl_showRelativeToWindow = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ContextMenu#impl_showRelativeToWindowProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalImpl_showRelativeToWindow(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Impl_showRelativeToWindow = false;
        this.obsrv1Impl_showRelativeToWindow = null;
        this.bound2Impl_showRelativeToWindow = true;
        this.obsrv2Impl_showRelativeToWindow = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ContextMenu#onActionProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOnAction(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.ActionEvent>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnAction = true;
        this.obsrv1OnAction = source;
        this.bound2OnAction = false;
        this.obsrv2OnAction = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ContextMenu#onActionProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalOnAction(javafx.beans.property.Property<javafx.event.EventHandler<javafx.event.ActionEvent>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnAction = false;
        this.obsrv1OnAction = null;
        this.bound2OnAction = true;
        this.obsrv2OnAction = source;
        return (B) this;
    }

    /**
     * 建構{@link ContextMenu}物件。
     *
     * @return 新的{@link ContextMenu}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public ContextMenu build()
    {
        ContextMenu instance = new ContextMenu();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link ContextMenu}物件。
     *
     * @return 新的{@link ContextMenu}物件實體
     */
    @SuppressWarnings("unchecked")
    public ContextMenu build(javafx.scene.control.MenuItem[] arg0)
    {
        ContextMenu instance = new ContextMenu(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

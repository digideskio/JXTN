// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link Alert}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version openjfx-dialogs-1.0.2.jar
 * @param <Z> 要建構的物件型態(需繼承{@link Alert})
 * @param <B> 建構器本身的型態(需繼承{@link AlertBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class AlertBuilder<Z extends Alert, B extends AlertBuilder<Z, B>>
        extends javafx.scene.control.DialogBuilder<javafx.scene.control.ButtonType, Z, B>
        implements AlertBuilderExt<Z, B>
{

    private boolean hasAlertType;
    private javafx.scene.control.Alert.AlertType valAlertType;

    private boolean hasButtonTypes;
    private java.util.Collection<javafx.scene.control.ButtonType> valButtonTypes;

    private boolean bound1AlertType;
    private boolean bound2AlertType;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.control.Alert.AlertType> obsrv1AlertType;
    private javafx.beans.property.Property<javafx.scene.control.Alert.AlertType> obsrv2AlertType;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasAlertType)
            instance.setAlertType(this.valAlertType);
        if (this.hasButtonTypes)
            instance.getButtonTypes().addAll(this.valButtonTypes);
        if (this.bound1AlertType)
            instance.alertTypeProperty().bind(this.obsrv1AlertType);
        if (this.bound2AlertType)
            instance.alertTypeProperty().bindBidirectional(this.obsrv2AlertType);
    }

    /**
     * 設定屬性{@link Alert#setAlertType(javafx.scene.control.Alert.AlertType)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B alertType(javafx.scene.control.Alert.AlertType value)
    {
        this.hasAlertType = true;
        this.valAlertType = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link Alert#getButtonTypes}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B buttonTypes(java.util.Collection<javafx.scene.control.ButtonType> value)
    {
        this.hasButtonTypes = true;
        this.valButtonTypes = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link Alert#getButtonTypes}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B buttonTypes(javafx.scene.control.ButtonType... value)
    {
        this.hasButtonTypes = true;
        this.valButtonTypes = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link Alert#getButtonTypes}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B buttonTypesAdd(java.util.Collection<javafx.scene.control.ButtonType> value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasButtonTypes = true;
        if (this.valButtonTypes == null)
            this.valButtonTypes = new java.util.ArrayList<>(value.size());
        this.valButtonTypes.addAll(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link Alert#getButtonTypes}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B buttonTypesAdd(javafx.scene.control.ButtonType... value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasButtonTypes = true;
        if (this.valButtonTypes == null)
            this.valButtonTypes = new java.util.ArrayList<>(value.length);
        this.valButtonTypes.addAll(java.util.Arrays.asList(value));
        return (B) this;
    }

    /**
     * 設定屬性{@link Alert#alertTypeProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindAlertType(javafx.beans.value.ObservableValue<? extends javafx.scene.control.Alert.AlertType> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1AlertType = true;
        this.obsrv1AlertType = source;
        this.bound2AlertType = false;
        this.obsrv2AlertType = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Alert#alertTypeProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalAlertType(javafx.beans.property.Property<javafx.scene.control.Alert.AlertType> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1AlertType = false;
        this.obsrv1AlertType = null;
        this.bound2AlertType = true;
        this.obsrv2AlertType = source;
        return (B) this;
    }

    /**
     * 建構{@link Alert}物件
     *
     * @return 新的{@link Alert}物件實體
     */
    @SuppressWarnings("unchecked")
    public Alert build(javafx.scene.control.Alert.AlertType arg0)
    {
        Alert instance = new Alert(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link Alert}物件
     *
     * @return 新的{@link Alert}物件實體
     */
    @SuppressWarnings("unchecked")
    public Alert build(javafx.scene.control.Alert.AlertType arg0, java.lang.String arg1, javafx.scene.control.ButtonType[] arg2)
    {
        Alert instance = new Alert(arg0, arg1, arg2);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}

package io.github.itzispyder.clickcrystals.modules.settings;

import io.github.itzispyder.clickcrystals.gui.GuiElement;
import io.github.itzispyder.clickcrystals.util.StringUtils;

import java.io.Serializable;
import java.util.function.Consumer;

public abstract class ModuleSetting<T> implements Serializable {

    private Consumer<ModuleSetting<T>> changeAction;
    private final String name, id, description;
    private T def, val;

    protected ModuleSetting(String name, String description, T def, T val) {
        this.id = name;
        this.name = StringUtils.capitalizeWords(name);
        this.description = description;
        this.def = def;
        this.val = val;
        this.changeAction = setting -> {};
    }

    public abstract <E extends GuiElement> E toGuiElement(int x, int y, int width, int height);

    protected ModuleSetting(String name, String description, T val) {
        this(name, description, val, val);
    }

    public Class<T> getType() {
        return (Class<T>)val.getClass();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public T getDef() {
        return def;
    }

    public void setDef(T def) {
        this.def = def;
    }

    public T getVal() {
        return val;
    }

    public void setVal(Object val) {
        this.val = (T)val;
        this.changeAction.accept(this);
    }

    public String getId() {
        return id;
    }

    public Consumer<ModuleSetting<T>> getChangeAction() {
        return changeAction;
    }

    public void setChangeAction(Consumer<ModuleSetting<T>> changeAction) {
        this.changeAction = changeAction;
    }

    public class Builder extends SettingBuilder<T> {
        @Override
        public ModuleSetting<T> build() {
            return null;
        }
    }
}

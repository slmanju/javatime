package com.manjula.java.java8.factorymethod;

import java.util.List;

import static java.util.stream.Collectors.toList;

public abstract class MenuFactory<T> {

    public List<Menu> getMenus(T param) {
        List<MenuPlugin> plugins = getPlugins(param);
        return plugins.stream().map(menuPlugin -> new Menu(menuPlugin.text())).collect(toList());
    }

    protected abstract List<MenuPlugin> getPlugins(T param);

}

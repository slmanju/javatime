package com.manjula.java.java8.factorymethod;

import java.util.Arrays;
import java.util.List;

public class MenuFactoryA extends MenuFactory<Param> {

    @Override
    protected List<MenuPlugin> getPlugins(Param param) {
        return Arrays.asList(new MenuPluginA(param), new MenuPluginB(param));
    }

}

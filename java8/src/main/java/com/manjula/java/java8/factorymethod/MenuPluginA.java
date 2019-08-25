package com.manjula.java.java8.factorymethod;

public class MenuPluginA extends MenuPlugin<Param> {

    public MenuPluginA(Param param) {
        super(param);
    }

    @Override
    public String text() {
        return "Plugin-A " + param.getValue();
    }
}

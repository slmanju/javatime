package com.manjula.java.java8.factorymethod;

public class MenuPluginB extends MenuPlugin<Param> {

    public MenuPluginB(Param param) {
        super(param);
    }

    @Override
    public String text() {
        return "Plugin-B " + param.getValue();
    }

}

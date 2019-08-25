package com.manjula.java.java8.factorymethod;

public abstract class MenuPlugin<T> {

    protected T param;

    public MenuPlugin(T param) {
        this.param = param;
    }

    public abstract String text();

}

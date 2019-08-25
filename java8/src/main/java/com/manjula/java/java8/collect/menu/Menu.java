package com.manjula.java.java8.collect.menu;

import com.manjula.java.java8.collect.Result;

public abstract class Menu<T> {

    protected final T param;

    protected Menu(T param) {
        this.param = param;
    }

    public abstract Result getName();

}

package com.manjula.java.java8.collect.factory;

import com.manjula.java.java8.collect.Result;

public abstract class MenuFactory<T> {

    public static MenuFactory instance(int type) {
        if (type > 0) {
            return new IntegerMenuFactory();
        }
        return new StringMenuFactory();
    }

    public abstract Result getMenu(T t);

}

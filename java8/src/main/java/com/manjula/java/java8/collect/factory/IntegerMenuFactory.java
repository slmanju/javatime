package com.manjula.java.java8.collect.factory;

import com.manjula.java.java8.collect.Param;
import com.manjula.java.java8.collect.Result;
import com.manjula.java.java8.collect.menu.IntegerMenu;

public class IntegerMenuFactory extends MenuFactory<Param> {

    @Override
    public Result getMenu(Param param) {
        IntegerMenu menu = new IntegerMenu(param);
        return menu.getName();
    }

}

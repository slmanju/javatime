package com.manjula.java.java8.collect.factory;

import com.manjula.java.java8.collect.Param;
import com.manjula.java.java8.collect.Result;
import com.manjula.java.java8.collect.menu.StringMenu;

public class StringMenuFactory extends MenuFactory<Param> {

    @Override
    public Result getMenu(Param param) {
        StringMenu menu = new StringMenu(param);
        return menu.getName();
    }

}

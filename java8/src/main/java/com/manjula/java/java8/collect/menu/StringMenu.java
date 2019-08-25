package com.manjula.java.java8.collect.menu;

import com.manjula.java.java8.collect.Param;
import com.manjula.java.java8.collect.Result;

public class StringMenu extends Menu<Param> {

    public StringMenu(Param param) {
        super(param);
    }

    @Override
    public Result getName() {
        Result result = new Result();
        result.text = "Hello IntegerMenu " + param.value;
        return result;
    }

}

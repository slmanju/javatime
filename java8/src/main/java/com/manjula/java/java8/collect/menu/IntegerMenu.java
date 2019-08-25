package com.manjula.java.java8.collect.menu;

import com.manjula.java.java8.collect.Param;
import com.manjula.java.java8.collect.Result;

public class IntegerMenu extends Menu<Param> {

    public IntegerMenu(Param param) {
        super(param);
    }

    @Override
    public Result getName() {
        Result result = new Result();
        result.text = "Hello IntegerMenu " + param.value;
        return result;
    }
}

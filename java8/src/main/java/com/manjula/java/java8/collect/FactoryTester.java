package com.manjula.java.java8.collect;

import com.manjula.java.java8.factorymethod.Menu;
import com.manjula.java.java8.factorymethod.MenuFactory;
import com.manjula.java.java8.factorymethod.MenuFactoryA;
import com.manjula.java.java8.factorymethod.Param;

import java.util.List;

public class FactoryTester {

    public static void main(String[] args) {
        Param param = new Param(2);
        MenuFactory<Param> menuFactory  = new MenuFactoryA();
        List<Menu> menus = menuFactory.getMenus(param);
        menus.forEach(System.out::println);


        new MenuFactoryA().getMenus(param).forEach(System.out::println);
    }
}

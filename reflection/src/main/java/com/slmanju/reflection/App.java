package com.slmanju.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        Person jon = Person.newInstance("Jon", 30);

        System.out.println("Getting class ....");
        Class<? extends Person> cls = jon.getClass();
        System.out.println(cls);

        System.out.println("\n Getting fields ....\n");
        Field[] fields = cls.getFields();
        Arrays.stream(fields).forEach(System.out::println);

        System.out.println("\n Getting declared fields ....\n");
        Field[] declaredFields = cls.getDeclaredFields();
        Arrays.stream(declaredFields).forEach(System.out::println);

        System.out.println("\n Getting methods ....\n");
        Method[] methods = cls.getMethods();
        Arrays.stream(methods).forEach(System.out::println);

        System.out.println("\n Getting declared methods ....\n");
        Method[] declaredMethods = cls.getDeclaredMethods();
        Arrays.stream(declaredMethods).forEach(System.out::println);

        System.out.println("\n Getting static methods ....\n");
        Arrays.stream(declaredMethods).filter(method -> Modifier.isStatic(method.getModifiers())).forEach(System.out::println);
    }

}

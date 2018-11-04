package com.manjula.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8FirstApp {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Java Plums", "Mango", "Banana");

        test(fruits, new Testable() {
            @Override
            public boolean test(String name) {
                return name.length() == 5;
            }
        });

        test(fruits, new Testable() {
            @Override
            public boolean test(String name) {
                return name.length() > 5;
            }
        });
        
        // Java 8
        test(fruits, (name) -> name.length() == 5);
        test(fruits, (name) -> name.length() > 5);
        
        // Java 8 full
        testJava8(fruits, (name) -> name.length() == 5);
        testJava8(fruits, (name) -> name.length() > 5);
        
        fruits.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
        fruits.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    private static void test(List<String> fruits, Testable testable) {
        for (String name : fruits) {
            if (testable.test(name)) {
                System.out.printf("%s - test passed %n", name);
            }
        }
    }
    
    private static void testJava8(List<String> fruits, Predicate<String> predicate) {
        for (String name : fruits) {
            if (predicate.test(name)) {
                System.out.printf("%s - test passed %n", name);
            }
        }
    }

}

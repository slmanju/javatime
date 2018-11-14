package com.manjula.java.java8.stream.reduce;

import java.util.Arrays;
import java.util.List;

public class ReduceApp {

    public static void main(String[] args) {
        // Java 7
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int result = 0;
        for (Integer number : numbers) {
            result = result + number;
        }
        System.out.println(result);
        
        // Java 8
        int result8 = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(result8);
        
        int multiplication = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(multiplication);
        
        int evenPow = numbers.stream().filter(i -> i % 2 == 0).reduce(0, (a, b) -> a + b * b);
        System.out.println(evenPow);
        
        List<String> target = Arrays.asList("H", "e", "l", "l", "o");
        String reversed = target.stream().reduce("", (a, b) -> b + a);
        System.out.println(reversed);
    }

}

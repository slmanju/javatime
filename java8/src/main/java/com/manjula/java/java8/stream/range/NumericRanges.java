package com.manjula.java.java8.stream.range;

import java.util.stream.IntStream;

public class NumericRanges {

    public static void main(String[] args) {
        // Java 7
        for (int i = 1; i <= 100; i++) {
            // do something
        }

        // Java 8
        IntStream intStream = IntStream.rangeClosed(1, 100);

        // Inclusive. Up to 100
        IntStream.rangeClosed(1, 100).forEach(System.out::println);

        // Exclusive. Up to 99
        IntStream.range(1, 100).forEach(System.out::println);

        // With Steps
        IntStream.iterate(0, i -> i + 2).limit(50).forEach(System.out::println);
    }

}

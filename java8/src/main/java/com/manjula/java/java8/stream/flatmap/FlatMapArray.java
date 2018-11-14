package com.manjula.java.java8.stream.flatmap;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapArray {

    public static void main(String[] args) {
        Integer[][] array = { { 1, 2, 3 }, { 4, 5 } };
        Stream<Integer[]> stream = Arrays.stream(array);

//        stream.flatMap(subarray -> Arrays.stream(subarray)).map(x -> x * x).forEach(System.out::println);
        stream.flatMap(Arrays::stream).map(x -> x * x).forEach(System.out::println);
    }

}

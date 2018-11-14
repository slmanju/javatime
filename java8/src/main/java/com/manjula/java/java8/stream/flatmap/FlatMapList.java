package com.manjula.java.java8.stream.flatmap;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapList {

    public static void main(String[] args) {
        List<List<Integer>> lists = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(2, 5));
        Stream<List<Integer>> stream = lists.stream();

//        stream.flatMap(list -> list.stream()).distinct().map(x -> x * x).forEach(System.out::println);
        stream.flatMap(Collection::stream).distinct().map(x -> x * x).forEach(System.out::println);
    }

}

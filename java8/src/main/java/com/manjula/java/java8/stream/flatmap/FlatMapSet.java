package com.manjula.java.java8.stream.flatmap;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class FlatMapSet {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        
        Stream<Set<String>> streamSet = Stream.of(set);
        
        streamSet.flatMap(Collection::stream).map(String::toUpperCase).forEach(System.out::println);
    }

}

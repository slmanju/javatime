package com.manjula.java.java8.stream.flatmap;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class FlatMapMap {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        
        Stream<Map<Integer, String>> streamMap = Stream.of(map);
        
        streamMap.flatMap(m -> m.values().stream()).map(String::toUpperCase).forEach(System.out::println);
    }

}

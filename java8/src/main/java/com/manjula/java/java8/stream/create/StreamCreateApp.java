package com.manjula.java.java8.stream.create;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreateApp {

    public static void main(String[] args) {
        // from a collection
//        Stream<Employee> stream = employees.stream();
        
        // from values
        Stream<String> countryStream = Stream.of("Sri Lanka", "India", "Pakistan");
        Stream<Integer> integerStream = Stream.of(1, 2, 3);
//        Stream<Employee> employeeStream = Stream.of(new Employee());

        // from an array
        int[] intArray = { 1, 2, 3, 4, 5 };
        IntStream intStream = Arrays.stream(intArray);
        String[] stringArray = { "Hello", "World" };
        Stream<String> stringStream = Arrays.stream(stringArray);
        
        // from a file
        try (Stream<String> linesStream = Files.lines(Paths.get("pom.xml"))) {
           linesStream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // print files in current working directory
        try (Stream<Path> paths = Files.list(Paths.get(""))) {
            paths.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

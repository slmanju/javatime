package com.manjula.java.java8;

import java.util.Arrays;
import java.util.List;

public class IntermediateOperations {

    public static void main(String[] args) {
        mapOperation();
        filterOperation();
        limitOperation();
        skipOperation();
        sortedOperation();
    }

    private static void mapOperation() {
        List<String> countries = Arrays.asList("Sri Lanka", "India", "Pakistan", "England", "Australia");
        countries.stream().map(String::toUpperCase).forEach(System.out::println);
        countries.stream().map(country -> {
            // create any object and return
            int length = country.length();
            return "Length of ".concat(country).concat(" string is ").concat(String.valueOf(length));
        }).forEach(System.out::println);
    }
    
    private static void filterOperation() {
        List<String> countries = Arrays.asList(
                "Sri Lanka", "India", 
                "Pakistan", "England", 
                "Australia", "South Africa");
        // filter country names started with S
        countries.stream().filter(country -> country.startsWith("S")).forEach(System.out::println);
        
        // filter country names length greater than 5
        countries.stream().filter(country -> country.length() > 5).forEach(System.out::println);
    }
    
    private static void limitOperation() {
        List<String> countries = Arrays.asList(
                "Sri Lanka", "India", 
                "Pakistan", "England",
                "Australia", "South Africa");

        // select only first 3 countries
        countries.stream().limit(3).forEach(System.out::println);
    }
    
    private static void skipOperation() {
        List<String> countries = Arrays.asList(
                "Sri Lanka", "India", 
                "Pakistan", "England",
                "Australia", "South Africa");

        // skip first 3 countries
        countries.stream().skip(3).forEach(System.out::println);
    }
    
    private static void sortedOperation() {
        List<String> countries = Arrays.asList(
                "Sri Lanka", "India", 
                "Pakistan", "England",
                "Australia", "South Africa");

        // sort by natural order
        countries.stream().sorted().forEach(System.out::println);
        
        // sort by string length
        countries.stream().sorted((first, second) -> Integer.compare(first.length(), second.length()))
                            .forEach(System.out::println);
    }

}

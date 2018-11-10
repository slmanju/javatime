package com.manjula.java.java8.stream;

import java.util.Arrays;
import java.util.List;

public class StreamIntroduction {

    public static void main(String[] args) {
        List<String> countries = Arrays.asList("Sri Lanka", "India", "Pakistan", "England", "Australia");
        
        // Java 7
        for (String country : countries) {
            if (country.length() > 7) {
                String upperCase = country.toUpperCase();
                System.out.println(upperCase);   
            }
        }
        
        // Java 8
        countries.stream()
                    .filter(country -> country.length() > 7)
                    .map(country -> country.toUpperCase())
                    .forEach(System.out::println);
    }

}

package com.manjula.java.java8.stream.numeric;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class NumericApp {

    public static void main(String[] args) {
        List<Subject> subjects = Arrays.asList(
                Subject.newInstance("Maths", 95), Subject.newInstance("Enlighs", 98),
                Subject.newInstance("Music", 70), Subject.newInstance("Science", 84),
                Subject.newInstance("History", 92));
        
        int total = subjects.stream().mapToInt(Subject::getMarks).sum();
        OptionalInt min = subjects.stream().mapToInt(Subject::getMarks).min();
        OptionalInt max = subjects.stream().mapToInt(Subject::getMarks).max();
        OptionalDouble average = subjects.stream()
                .mapToInt(Subject::getMarks)
                .average();
        
        System.out.println("total: " + total);
        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("average: " + average);
    }

}

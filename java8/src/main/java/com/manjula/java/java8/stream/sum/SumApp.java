package com.manjula.java.java8.stream.sum;

import java.util.Arrays;
import java.util.List;

public class SumApp {

    public static void main(String[] args) {
        List<Subject> subjects = Arrays.asList(
                Subject.newInstance("Maths", 95), Subject.newInstance("Enlighs", 98),
                Subject.newInstance("Music", 70), Subject.newInstance("Science", 84),
                Subject.newInstance("History", 92)
                );
        
//        int totalMarks = subjects.stream().map(Subject::getMarks).sum();
        
        int totalMarks = subjects.stream().mapToInt(Subject::getMarks).sum();
        System.out.println(totalMarks);
    }

}

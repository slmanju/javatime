package com.manjula.java.java8.stream.numeric;

public class Subject {

    private String name;
    private Integer marks;

    private Subject(String name, Integer marks) {
        this.name = name;
        this.marks = marks;
    }
    
    public static Subject newInstance(String name, Integer marks) {
        return new Subject(name, marks);
    }

    public String getName() {
        return name;
    }

    public Integer getMarks() {
        return marks;
    }

}

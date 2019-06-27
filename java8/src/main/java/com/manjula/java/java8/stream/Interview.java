package com.manjula.java.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Interview {

    public static void main(String[] args) {
        Interview interview = new Interview();
        interview.findSumOfEvenNumbersPowerOfTwo();
//        interview.findAllDivisibleByThree();
//        interview.findYoungestMaleStudent();
    }

    private void findYoungestMaleStudent() {
        List<Student> students = Arrays.asList(
                new Student(10, "male"),
                new Student(12, "female"),
                new Student(7, "male"),
                new Student(10, "female"),
                new Student(8, "male")
        );

        Student youngestmale = students.stream()
                .filter(student -> student.gender.equals("male"))
                .min((s1, s2) -> s1.age - s2.age) //.min(Comparator.comparingInt(s -> s.age))
                .get();
        System.out.println(youngestmale.age);
    }

    private void findAllDivisibleByThree() {
        List<Integer> result = IntStream.rangeClosed(0, 25)
                .filter(number -> number % 3 == 0)
                .boxed()
                .collect(Collectors.toList());
//                .forEach(System.out::println);
    }

    private void findSumOfEvenNumbersPowerOfTwo() {
        int sum = IntStream.rangeClosed(0, 5)
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .sum();
        System.out.println(sum);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum2 = numbers.stream()
                .filter(number -> number % 2 == 0)
                .mapToInt(number -> number * number)
                .sum();
        System.out.println(sum2);

        int sum3 = numbers.stream()
                .filter(i -> i % 2 == 0)
                .reduce(0, (result, number) -> result + number * number);
        System.out.println(sum3);
    }

    private class Student {
        private int age;
        private String gender;

        public Student(int age, String gender) {
            this.age = age;
            this.gender = gender;
        }
    }

}

package com.manjula.java.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//
//        int sum = numbers.stream()
//                .filter(number -> number % 2 == 0)
//                .mapToInt(number -> number * number)
//                .sum();
//        System.out.println(sum);
        List<Person> people = Arrays.asList(
                new Person(10, "male"),
                new Person(5, "male"),
                new Person(10, "female"),
                new Person(6, "female"),
                new Person(16, "male")
        );

        Optional<Person> youngest = people.stream()
                .filter(person -> person.gender.equals("male"))
                .min(Comparator.comparingInt(Person::getAge));
        System.out.println(youngest.get().age);
    }

    static class Person {
        int age;
        String gender;
        Person(int age, String gender) {
            this.age = age;
            this.gender = gender;
        }
        int getAge() {
            return this.age;
        }
    }
}

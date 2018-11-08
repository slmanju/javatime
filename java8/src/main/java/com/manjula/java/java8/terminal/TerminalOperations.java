package com.manjula.java.java8.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.manjula.java.java8.terminal.Employee.Gender;

public class TerminalOperations {
    
    private static List<Employee> employees = Arrays.asList(
            Employee.newInstance("Jon", 22, Gender.MALE),
            Employee.newInstance("Arya", 16, Gender.FEMALE),
            Employee.newInstance("Tyrion", 30, Gender.MALE),
            Employee.newInstance("Ghost", 5, Gender.MALE),
            Employee.newInstance("Joffery", 20, Gender.MALE),
            Employee.newInstance("Hound", 35, Gender.MALE),
            Employee.newInstance("Danny", 23, Gender.FEMALE)
            );

    public static void main(String[] args) {
        forEach();
        collect();
        count();
        min();
        max();
        allMatch();
        anyMatch();
        nonMatch();
        findAny();
        findFirst();
    }
    
    private static void forEach() {
        employees.stream()
                    .filter(employee -> employee.getAge() > 20)
                    .forEach(System.out::println);
    }
    
    private static void collect() {
        employees.stream()
                    .filter(employee -> employee.getAge() > 20)
                    .collect(Collectors.toList());
    }
    
    private static void count() {
        long count = employees.stream().count();
        
        System.out.println(count);
        
        long femaleCount = employees.stream()
                                     .filter(employee -> Gender.FEMALE.equals(employee.getGender()))
                                     .count();
        
        System.out.println(femaleCount);
    }
    
    private static void min() {
        Optional<Employee> min = employees.stream()
                  .min((e1, e2) -> e1.getAge() - e2.getAge());
        
        System.out.println(min);
    }

    private static void max() {
        Optional<Employee> max = employees.stream()
                  .max((e1, e2) -> e1.getAge() - e2.getAge());
        
        System.out.println(max);
    }

    private static void allMatch() {
        boolean allMatch = employees.stream()
                                    .allMatch(employee -> Gender.MALE.equals(employee.getGender()));
        System.out.println("Are all employees male ? " + allMatch);
    }
    
    private static void anyMatch() {
        boolean anyMatch = employees.stream()
                                    .anyMatch(employee -> Gender.FEMALE.equals(employee.getGender()));
        System.out.println("Is there any female ? " + anyMatch);
    }
    
    private static void nonMatch() {
        boolean noneMatch = employees.stream()
                                    .noneMatch(employee -> employee.getAge() > 50);
        System.out.println("Is there no one above 50 ? " + noneMatch);
    }
    
    private static void findAny() {
        Optional<Employee> any = employees.stream().findAny();
        System.out.println(any);
        
        Optional<Employee> anyFemale = employees.stream()
                .filter(employee -> Gender.FEMALE.equals(employee.getGender()))
                .findAny();
        System.out.println(anyFemale);
    }
    
    private static void findFirst() {
        Optional<Employee> first = employees.stream().findFirst();
        System.out.println(first);
        
        Optional<Employee> firstFemale = employees.stream()
                                                .filter(employee -> Gender.FEMALE.equals(employee.getGender()))
                                                .findFirst();
        System.out.println(firstFemale);        
    }
    
}

package com.manjula.java.java8.terminal;

public class Employee {
    
    enum Gender { MALE, FEMALE };
    
    private String name;
    private int age;
    private Gender gender;
    
    private Employee(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    public static Employee newInstance(String name, int age, Gender gender) {
        return new Employee(name, age, gender);
    }

    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public Gender getGender() {
        return gender;
    }
    
    public String toString() {
        return name.concat(" is a ").concat(age + "").concat(" years old ").concat(gender.name());
    }

}

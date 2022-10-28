package com.soojong.functional.stream;

import java.util.List;
import java.util.stream.Collectors;

import com.soojong.functional.SimpleCaseMain;


public class _Stream {

    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("John", Gender.MALE),
            new Person("Maria", Gender.FEMALE),
            new Person("Aisha", Gender.FEMALE),
            new Person("Alex", Gender.MALE),
            new Person("Alice", Gender.FEMALE)
        );

        people.stream()
            .map(person -> person.gender)
            .collect(Collectors.toSet())
            .forEach(System.out::println);
        System.out.println("====");
        people.stream()
            .map(person -> person.name)
            .collect(Collectors.toSet())
            .forEach(System.out::println);
        System.out.println("====");
        people.stream()
            .map(person -> person.name)
            .mapToInt(String::length)
            .forEach(System.out::println);

        System.out.println("====");
        boolean containsOnlyFemales = people.stream()
            .allMatch(person -> Gender.FEMALE == person.gender); // 모든 개체가 조건을 만족해야 true


        System.out.println(containsOnlyFemales);


    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
    
}

package com.soojong.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SimpleCaseMain {

    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("John", Gender.MALE),
            new Person("Maria", Gender.FEMALE),
            new Person("Aisha", Gender.FEMALE),
            new Person("Alex", Gender.MALE),
            new Person("Alice", Gender.FEMALE)
        );

        // Imperative approach
        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if(Gender.FEMALE == person.gender) {
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }
        System.out.println("=====");

        Predicate<Person> personPredicate = person -> Gender.FEMALE == person.gender;

        // Declarative approach
        people.stream()
            .filter(personPredicate)
            .forEach(System.out::println);



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

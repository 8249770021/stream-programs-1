package com.ip.stream.programs;

import com.ip.stream.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * This class is used to calculate,
 * age using match, findFirst, allMatch.
 */
public class PersonCalculation {

    public Stream<Integer> getAges(List<Person> people, int ageInput) {
        return people.stream()
                     .map(p -> p.getAge())
                     .filter(age -> age > ageInput);
    }

    public Stream<Person> getPeopleThemSelves(List<Person> people, int age) {
        return people.stream()
                     .filter(p -> p.getAge() > age);
    }

    public boolean isPresent(List<Person> people, int age) {
        return people.stream()
                .anyMatch(p -> p.getAge() > age);
    }

    public boolean isAllPresent(List<Person> people, int age) {
        return people.stream()
                .allMatch(p -> p.getAge() > age);
    }

    public boolean isNotPresent(List<Person> people, int age) {
        return people.stream()
                .noneMatch(p -> p.getAge() > age);
    }

    public Optional<Person> findFirstPerson(List<Person> people, int age) {
        return people.stream()
                .filter(p -> p.getAge() > age)
                .findFirst();
    }

    public Optional<Person> findAnyPerson(List<Person> people, int age) {
        return people.stream()
                .filter(p -> p.getAge() > age)
                .findAny();
    }
}

package com.ip.stream.model;

/**
 * This is a pojo class.
 */
public class Person {

    private transient String firstName;
    private transient String lastName;
    private transient int age;

    public Person() {
        // This constructor is intentionally empty. Nothing special is needed here.
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("FirstName :%s LastName :%s Age :%s", firstName, lastName, age);
    }
}

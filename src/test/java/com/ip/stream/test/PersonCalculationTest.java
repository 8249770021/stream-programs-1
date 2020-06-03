package com.ip.stream.test;

import com.ip.stream.model.Person;
import com.ip.stream.programs.PersonCalculation;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This class is used to test,
 * PersonCalculation class.
 */
public class PersonCalculationTest {

    private static PersonCalculation calculation;

    private static final Person p1 = new Person("James", "Smith", 20);
    private static final Person p2 = new Person("Michael", "Smith", 30);
    private static final Person p3 = new Person("Maria", "Rodriguez", 35);
    private static final Person p4 = new Person("Linda", "Thomas", 40);

    private static final int age = 20;

    @BeforeTest
    public void init() {
        calculation = new PersonCalculation();
    }

    @Test
    public void testPeopleAge() {
        List<Person> personList = Arrays.asList(p1, p2, p3, p4);
        assertThat(calculation.getAges(personList, age)).containsExactly(30, 35, 40);
    }

    @Test
    public void testPeopleDetailsByAge() {
        List<Person> personList = Arrays.asList(p1, p2, p3, p4);
        assertThat(calculation.getPeopleThemSelves(personList, age)).containsExactly(p2, p3, p4);
    }

    @Test
    public void testPersonByAge() {
        List<Person> personList = Arrays.asList(p1, p2, p3, p4);
        assertThat(calculation.isPresent(personList, age)).isTrue();
    }

    @Test
    public void testPersonByAllAge() {
        List<Person> personList = Arrays.asList(p1, p2, p3, p4);
        assertThat(calculation.isAllPresent(personList, age)).isFalse();
    }

    @Test
    public void testPersonByNoAge() {
        List<Person> personList = Arrays.asList(p1, p2, p3, p4);
        int age = 10;
        assertThat(calculation.isNotPresent(personList, age)).isFalse();
    }

    @Test
    public void testFirstPersonByAge() {
        List<Person> personList = Arrays.asList(p1, p2, p3, p4);
        assertThat(calculation.findFirstPerson(personList, age)).contains(p2);
    }

    @Test
    public void testFirstPersonNotAvableAge() {
        List<Person> personList = Arrays.asList(p1, p2, p3, p4);
        int age = 90;
        assertThat(calculation.findFirstPerson(personList, age)).isEmpty();
    }

    @Test
    public void testAnyPersonByAge() {
        List<Person> personList = Arrays.asList(p1, p2, p3, p4);
        int age = 30;
        assertThat(calculation.findAnyPerson(personList, age)).contains(p3);
    }
}

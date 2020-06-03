package com.ip.stream.test;

import com.ip.stream.programs.ConvertUpperCase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This test class is used to test,
 * convertuppercase class.
 */
public class ConvertUpperCaseTest {

    private static ConvertUpperCase upperCase;
    private static final String ONE = "ONE";
    private static final String TWO = "TWO";
    private static final String THREE = "THREE";
    private static final String FOUR = "FOUR";
    private static final String FIVE = "FIVE";
    private static final String SIX = "SIX";
    private static final String SEVEN = "SEVEN";
    private static final String EIGHT = "EIGHT";
    private static final String NINE = "NINE";
    private static final String TEN = "TEN";

    @BeforeTest
    public void init() {
        upperCase = new ConvertUpperCase();
    }

    @Test
    public void testAllLowerCase() {
        List<String> input = Arrays.asList(
                "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");
        List<String> result = upperCase.convertToUpperCase(input);
        assertThat(result)
                .containsExactly(ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN);
    }

    @Test
    public void testAllUpperCase() {
        List<String> input = Arrays.asList(
                "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN");
        List<String> result = upperCase.convertToUpperCase(input);
        assertThat(result)
                .containsExactly(ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN);
    }

    @Test
    public void testAllUpperLowerCase() {
        List<String> input = Arrays.asList(
                "ONE", "TWO", "THREE", "FOUR", "FIVE", "six", "seven", "eight", "nine", "ten");
        List<String> result = upperCase.convertToUpperCase(input);
        assertThat(result)
                .containsExactly(ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN);
    }

    @Test
    public void testAllLowerUpperCase() {
        List<String> input = Arrays.asList(
                "one", "two", "three", "four", "five", "SIX", "SEVEN", "EIGHT", "NINE", "TEN");
        List<String> result = upperCase.convertToUpperCase(input);
        assertThat(result)
                .containsExactly(ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN);
    }

    @Test
    public void testLowerCaseOneWord() {
        List<String> input = Arrays.asList("ten");
        List<String> result = upperCase.convertToUpperCase(input);
        assertThat(result)
                .containsExactly(TEN);
    }

    @Test
    public void testLowerUpperCaseOneWord() {
        List<String> input = Arrays.asList("tEN");
        List<String> result = upperCase.convertToUpperCase(input);
        assertThat(result)
                .containsExactly(TEN);
    }

    @Test
    public void testUpperLowerCaseOneWord() {
        List<String> input = Arrays.asList("Ten");
        List<String> result = upperCase.convertToUpperCase(input);
        assertThat(result)
                .containsExactly(TEN);
    }

    @Test
    public void testWithEmpty() {
        List<String> input = new ArrayList<String>();
        List<String> result = upperCase.convertToUpperCase(input);
        assertThat(result)
                .isEmpty();
    }

    @Test
    public void testWithNull() {
        List<String> input = null;
        List<String> result = upperCase.convertToUpperCase(input);
        assertThat(result)
               .isNull();
    }

    @Test
    public void testUpperCaseOneWord() {
        List<String> input = Arrays.asList(TEN);
        List<String> result = upperCase.convertToUpperCase(input);
        assertThat(result)
                .containsExactly(TEN);
    }
}

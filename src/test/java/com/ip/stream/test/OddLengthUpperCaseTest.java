package com.ip.stream.test;

import com.ip.stream.programs.OddLengthUpperCase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This test class is used to test,
 * OddLengthUpperCase class.
 */
public class OddLengthUpperCaseTest {

    private static OddLengthUpperCase oddLength;

    @BeforeTest
    public void init() {
        oddLength = new OddLengthUpperCase();
    }

    @Test
    public void testOddLengthWords() {
        List<String> input = Arrays.asList(
                "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");
        assertThat(oddLength.getOddLengthUpperCase(input))
                .containsExactly("ONE", "TWO", "THREE", "SIX", "SEVEN", "EIGHT", "TEN");
    }

    @Test
    public void testOddLengthWithNull() {
        List<String> input = null;
        assertThat(oddLength.getOddLengthUpperCase(input))
                .isNull();
    }

    @Test
    public void testOddLengthWithEmpty() {
        List<String> input = new ArrayList<>();
        assertThat(oddLength.getOddLengthUpperCase(input))
                .isEmpty();
    }

    @Test
    public void testOddLengthWordWithOneWord() {
        List<String> input = Arrays.asList("mom");
        assertThat(oddLength.getOddLengthUpperCase(input))
                .containsExactly("MOM");
    }

    @Test
    public void testEvenLengthWordWithOneWord() {
        List<String> input = Arrays.asList("noon");
        assertThat(oddLength.getOddLengthUpperCase(input))
                .isEmpty();
    }

    @Test
    public void testEvenLengthWordWithOneWordUpperCase() {
        List<String> input = Arrays.asList("NOON");
        assertThat(oddLength.getOddLengthUpperCase(input))
                .isEmpty();
    }

    @Test
    public void testOddLengthWordWithOneWordUpperCase() {
        List<String> input = Arrays.asList("MOM");
        assertThat(oddLength.getOddLengthUpperCase(input))
                .containsExactly("MOM");
    }
}

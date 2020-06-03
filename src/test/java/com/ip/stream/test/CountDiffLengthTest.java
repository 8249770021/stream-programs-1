package com.ip.stream.test;

import com.ip.stream.programs.CountDiffLength;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This test class is used to test,
 * countdifflength class.
 */
public class CountDiffLengthTest {

    private static CountDiffLength diffLength;

    @BeforeTest
    public void init() {
        diffLength = new CountDiffLength();
    }

    @Test
    public void testDiffLength() {
        List<String> input = Arrays.asList(
                "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");
        long result = diffLength.countDiffLength(input);
        assertThat(result).isEqualTo(3L);
    }

    @Test
    public void testLengthWithEmpty() {
        List<String> input = new ArrayList<>();
        long result = diffLength.countDiffLength(input);
        assertThat(result).isEqualTo(0L);
    }

    @Test
    public void testLengthNull() {
        List<String> input = null;
        long result = diffLength.countDiffLength(input);
        assertThat(result).isEqualTo(0L);
    }

    @Test
    public void testLengthWithOneWord() {
        List<String> input = Arrays.asList("ten");
        long result = diffLength.countDiffLength(input);
        assertThat(result).isEqualTo(1L);
    }

    @Test
    public void testSameLengthWithTwoWords() {
        List<String> input = Arrays.asList("six", "two");
        long result = diffLength.countDiffLength(input);
        assertThat(result).isEqualTo(1L);
    }

    @Test
    public void testDiffLengthWithTwoWords() {
        List<String> input = Arrays.asList("java", "python");
        long result = diffLength.countDiffLength(input);
        assertThat(result).isEqualTo(2L);
    }
}

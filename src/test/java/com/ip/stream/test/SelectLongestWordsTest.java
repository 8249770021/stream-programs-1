package com.ip.stream.test;

import com.ip.stream.programs.SelectLongestWords;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This test class is used to test,
 * SelectLongestWords class.
 */
public class SelectLongestWordsTest {

    private static SelectLongestWords longestWords;

    @BeforeTest
    public void init() {
        longestWords = new SelectLongestWords();
    }

    @Test
    public void testLongestWords() {
        List<String> input = Arrays.asList(
                "alfa", "bravo", "charlie", "delta", "echo", "golf", "hotel");
        assertThat(longestWords.getLongestWords(input)).isIn("charlie");
    }

    @Test
    public void testLongestWordsWithNull() {
        List<String> input = null;
        assertThat(longestWords.getLongestWords(input)).isNull();
    }

    @Test
    public void testLongestWordsWithEmpty() {
        List<String> input = new ArrayList<>();
        assertThat(longestWords.getLongestWords(input)).isNull();
    }

    @Test
    public void testLongestWordsWithOneWord() {
        List<String> input = Arrays.asList("programing");
        assertThat(longestWords.getLongestWords(input)).isIn("programing");
    }

    @Test
    public void testLongestWordsWithOneWordUpperCase() {
        List<String> input = Arrays.asList("PROGRAMING");
        assertThat(longestWords.getLongestWords(input)).isIn("PROGRAMING");
    }

    @Test
    public void testLongestWordsWithTwoWordsUpperCase() {
        List<String> input = Arrays.asList("JAVA", "PYTHON");
        assertThat(longestWords.getLongestWords(input)).isIn("PYTHON");
    }

    @Test
    public void testLongestWordsWithTwoWordsLowerCase() {
        List<String> input = Arrays.asList("java", "python");
        assertThat(longestWords.getLongestWords(input)).isIn("python");
    }

    @Test
    public void testLongestWordsWithTwoWordsLowerUpperCase() {
        List<String> input = Arrays.asList("mac", "WINDOWS");
        assertThat(longestWords.getLongestWords(input)).isIn("WINDOWS");
    }

    @Test
    public void testLongestWordsWithTwoWordsUpperLowerCase() {
        List<String> input = Arrays.asList("MAC", "windows");
        assertThat(longestWords.getLongestWords(input)).isIn("windows");
    }
}

package com.ip.stream.test;

import com.ip.stream.programs.FirstLetterSortWords;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This test  class is used to test,
 * FirstLetterSortWords class.
 */
public class FirstLetterSortWordsTest {

    private static FirstLetterSortWords sortWords;

    @BeforeTest
    public void init() {
        sortWords = new FirstLetterSortWords();
    }

    @Test
    public void testSortedLetters() {
        List<String> input = Arrays.asList(
                "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");
        assertThat(sortWords.getSortedLetters(input))
                .containsExactly("e", "f", "n", "o", "s", "t");
    }

    @Test
    public void testSortedLettersWithEmpty() {
        List<String> input = new ArrayList<>();
        assertThat(sortWords.getSortedLetters(input))
                .isEmpty();
    }

    @Test
    public void testSortedLettersWithNull() {
        List<String> input = null;
        assertThat(sortWords.getSortedLetters(input))
                .isNull();
    }

    @Test
    public void testSortedLettersWithOneWord() {
        List<String> input = Arrays.asList("java");
        assertThat(sortWords.getSortedLetters(input))
                .containsExactly("j");
    }

    @Test
    public void testSortedLettersWithTwoWords() {
        List<String> input = Arrays.asList("docker", "ruby");
        assertThat(sortWords.getSortedLetters(input))
                .containsExactly("d", "r");
    }

    @Test
    public void testSortedLettersWithOneWordUpperCase() {
        List<String> input = Arrays.asList("PROGRAM");
        assertThat(sortWords.getSortedLetters(input))
                .containsExactly("P");
    }

    @Test
    public void testSortedLettersWithTwoWordsUpperLowerCase() {
        List<String> input = Arrays.asList("GITHUB", "jenkins");
        assertThat(sortWords.getSortedLetters(input))
                .containsExactly("G", "j");
    }

    @Test
    public void testSortedLettersWithTwoWordsLowerUpperCase() {
        List<String> input = Arrays.asList("windows", "MAC");
        assertThat(sortWords.getSortedLetters(input))
                .containsExactly("M", "w");
    }
}

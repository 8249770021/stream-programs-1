package com.ip.stream.test;

import com.ip.stream.programs.FirstLetterWords;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This test class is used to test,
 * FirstLetterWords class.
 */
public class FirstLetterWordsTest {

    private static FirstLetterWords words;

    @BeforeTest
    public void init() {
        words = new FirstLetterWords();
    }

    @Test
    public void testFirstLetter() {
        List<String> input = Arrays.asList(
                "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");
        assertThat(words.getFirstLetters(input))
                .containsExactly("o", "t", "f", "s", "e", "n");
    }

    @Test
    public void testFirstLetterWithEmpty() {
        List<String> input = new ArrayList<>();
        assertThat(words.getFirstLetters(input))
                .isEmpty();
    }

    @Test
    public void testFirstLetterWithNull() {
        List<String> input = null;
        assertThat(words.getFirstLetters(input))
                .isNull();
    }

    @Test
    public void testFirstLetterWithOneWord() {
        List<String> input = Arrays.asList("devops");
        assertThat(words.getFirstLetters(input))
                .containsExactly("d");
    }

    @Test
    public void testFirstLetterWithOneWordUpperCase() {
        List<String> input = Arrays.asList("LAPTOP");
        assertThat(words.getFirstLetters(input))
                .containsExactly("L");
    }

    @Test
    public void testFirstLetterWithTwoWordsUpperCase() {
        List<String> input = Arrays.asList("SAMSUNG", "ASUS");
        assertThat(words.getFirstLetters(input))
                .containsExactly("S", "A");
    }

    @Test
    public void testFirstLetterWithTwoWordsLowerCase() {
        List<String> input = Arrays.asList("samsung", "asus");
        assertThat(words.getFirstLetters(input))
                .containsExactly("s", "a");
    }

    @Test
    public void testFirstLetterWithTwoWordsLowerUpperCase() {
        List<String> input = Arrays.asList("java", "PYTHON");
        assertThat(words.getFirstLetters(input))
                .containsExactly("j", "P");
    }

    @Test
    public void testFirstLetterWithTwoWordsUpperLowerCase() {
        List<String> input = Arrays.asList("JAVA", "python");
        assertThat(words.getFirstLetters(input))
                .containsExactly("J", "p");
    }
}

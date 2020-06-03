package com.ip.stream.test;

import com.ip.stream.programs.CreateLettersFromList;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This test class is used to test,
 * CreateLettersFromList class.
 */
public class CreateLettersFromListTest {

    private static CreateLettersFromList fromList;

    @BeforeTest
    public void init() {
        fromList = new CreateLettersFromList();
    }

    @Test
    public void testLetterFromList() {
        List<String> input = Arrays.asList(
                "alfa", "bravo", "charlie", "delta", "echo", "foxtrot", "golf", "hotel");
        List<String> result = fromList.getAlphLetters(input);
        assertThat(result).containsExactly("a", "b", "c", "d", "e", "f", "g", "h", "i", "l", "o", "r", "t", "v", "x");
    }

    @Test
    public void testLetterWithEmpty() {
        List<String> input = new ArrayList<>();
        List<String> result = fromList.getAlphLetters(input);
        assertThat(result).isEmpty();
    }

    @Test
    public void testLetterWithNull() {
        List<String> input = null;
        List<String> result = fromList.getAlphLetters(input);
        assertThat(result).isNull();
    }

    @Test
    public void testLetterFromListOneWord() {
        List<String> input = Arrays.asList("charlie");
        List<String> result = fromList.getAlphLetters(input);
        assertThat(result).containsExactly("a", "c", "e", "h", "i", "l", "r");
    }

    @Test
    public void testLetterFromListOneWordUpperCase() {
        List<String> input = Arrays.asList("CHARLIE");
        List<String> result = fromList.getAlphLetters(input);
        assertThat(result).containsExactly("A", "C", "E", "H", "I", "L", "R");
    }

    @Test
    public void testLetterCombUpperLowerCase() {
        List<String> input = Arrays.asList("CHArlie");
        List<String> result = fromList.getAlphLetters(input);
        assertThat(result).containsExactly("A", "C", "H", "e", "i", "l", "r");
    }

    @Test
    public void testLetterCombLowerUpperCase() {
        List<String> input = Arrays.asList("chaRLIE");
        List<String> result = fromList.getAlphLetters(input);
        assertThat(result).containsExactly("E", "I", "L", "R", "a", "c", "h");
    }
}

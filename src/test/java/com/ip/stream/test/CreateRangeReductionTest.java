package com.ip.stream.test;

import com.ip.stream.programs.CreateRangeReduction;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

/**
 * This test class is used to test,
 * CreateRangeReduction class.
 */
public class CreateRangeReductionTest {

    private static CreateRangeReduction rangeReduction;

    @BeforeTest
    public void init() {
        rangeReduction = new CreateRangeReduction();
    }

    @Test
    public void testRangeWords() {
        List<String> input = Arrays.asList(
                "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");
        long skip = 2;
        long limit = 8;
        assertThat(rangeReduction.getWordsInRange(input, skip, limit)).
                containsExactly("three", "four", "five", "six", "seven", "eight", "nine", "ten");
    }

    @Test
    public void testRangeWordsWithEmpty() {
        List<String> input = new ArrayList<>();
        long skip = 2;
        long limit = 8;
        assertThat(rangeReduction.getWordsInRange(input, skip, limit)).isEmpty();
    }

    @Test
    public void testRangeWordsWithNull() {
        List<String> input = null;
        long skip = 2;
        long limit = 8;
        assertThatIllegalArgumentException().isThrownBy(() -> rangeReduction.getWordsInRange(input, skip, limit));
    }

}

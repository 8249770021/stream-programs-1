package com.ip.stream.test;

import com.ip.stream.programs.CreateIntegerStream;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This test class is used to test,
 * CreateIntegerStream class.
 */
public class CreateIntegerStreamTest {

    private static CreateIntegerStream integerStream;

    @BeforeTest
    public void init() {
        integerStream = new CreateIntegerStream();
    }

    @Test
    public void testIntStream() {
        List<Integer> ints = Arrays.asList(0, 1, 2, 3, 4);
        Stream<Integer> actual = integerStream.getIntegerStream(ints);
        assertThat(actual).containsExactly(0, 1, 2, 3, 4);
    }

    @Test
    public void testNegativeIntStream() {
        List<Integer> ints = Arrays.asList(-0, -1, -2, -3, -4);
        Stream<Integer> actual = integerStream.getIntegerStream(ints);
        assertThat(actual).containsExactly(-0, -1, -2, -3, -4);
    }

    @Test
    public void testNegativeAndPositiveStream() {
        List<Integer> ints = Arrays.asList(-0, -1, 2, 3, 4);
        Stream<Integer> actual = integerStream.getIntegerStream(ints);
        assertThat(actual).containsExactly(-0, -1, 2, 3, 4);
    }

    @Test
    public void testPositiveAndNegativeStream() {
        List<Integer> ints = Arrays.asList(0, 1, 2, -3, -4);
        Stream<Integer> actual = integerStream.getIntegerStream(ints);
        assertThat(actual).containsExactly(0, 1, 2, -3, -4);
    }

    @Test
    public void testSinglePositiveStream() {
        List<Integer> ints = Arrays.asList(1);
        Stream<Integer> actual = integerStream.getIntegerStream(ints);
        assertThat(actual).containsExactly(1);
    }

    @Test
    public void testSingleNegativeStream() {
        List<Integer> ints = Arrays.asList(-1);
        Stream<Integer> actual = integerStream.getIntegerStream(ints);
        assertThat(actual).containsExactly(-1);
    }
}

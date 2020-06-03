package com.ip.stream.test;

import com.ip.stream.programs.CreateIntStream;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This test class is used to test,
 * CreateIntStream class.
 */
public class CreateIntStreamTest {

    private static CreateIntStream intStream;

    @BeforeTest
    public void init() {
        intStream =  new CreateIntStream();
    }

    @Test
    public void testIntStream() {
        int start = 1;
        int end = 6;
        List<Integer> result = intStream.getIntStream(start, end);
        assertThat(result).containsExactly(1, 2, 3, 4, 5);
    }

    @Test
    public void testStreamStartAndEndZero() {
        int start = 0;
        int end = 0;
        List<Integer> result = intStream.getIntStream(start, end);
        assertThat(result).isEmpty();
    }

    @Test
    public void testStreamStartZeroEndSix() {
        int start = 0;
        int end = 6;
        List<Integer> result = intStream.getIntStream(start, end);
        assertThat(result).containsExactly(0, 1, 2, 3, 4, 5);
    }

    @Test
    public void testStreamStartSixEndZero() {
        int start = 6;
        int end = 0;
        List<Integer> result = intStream.getIntStream(start, end);
        assertThat(result).isEmpty();
    }

    @Test
    public void testStreamStartEndNegative() {
        int start = -1;
        int end = -6;
        List<Integer> result = intStream.getIntStream(start, end);
        assertThat(result).isEmpty();
    }

    @Test
    public void testStreamStartNegativeEndPositive() {
        int start = -1;
        int end = 6;
        List<Integer> result = intStream.getIntStream(start, end);
        assertThat(result).containsExactly(-1, 0, 1, 2, 3, 4, 5);
    }

    @Test
    public void testStreamStartPositiveEndNegative() {
        int start = 1;
        int end = -6;
        List<Integer> result = intStream.getIntStream(start, end);
        assertThat(result).isEmpty();
    }
}

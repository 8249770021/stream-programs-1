package com.ip.stream.test;

import com.ip.stream.programs.StreamGenerate;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This test class is used to test,
 * StreamGenerate class.
 */
public class StreamGenerateTest {

    private static StreamGenerate generate;
    private static final String VALUE = "one";

    @BeforeTest
    public void init() {
        generate = new StreamGenerate();
    }

    @Test
    public void testStreamWithString() {
        String data = VALUE;
        long size = 5;
        Stream<String> actual = generate.getMultipleStreams(data, size);
        assertThat(actual).containsExactly(VALUE, VALUE, VALUE, VALUE, VALUE);
    }

    @Test
    public void testStreamWithNull() {
        String data = null;
        long size = 5;
        Stream<String> actual = generate.getMultipleStreams(data, size);
        assertThat(actual).isEmpty();
    }

    @Test
    public void testStreamWithEmpty() {
        String data = "";
        long size = 5;
        Stream<String> actual = generate.getMultipleStreams(data, size);
        assertThat(actual).isEmpty();
    }

    @Test
    public void testStreamWithSpace() {
        String data = " ";
        long size = 5;
        Stream<String> actual = generate.getMultipleStreams(data, size);
        assertThat(actual).isEmpty();
    }

    @Test
    public void testStreamWithTabSpace() {
        String data = " ";
        long size = 5;
        Stream<String> actual = generate.getMultipleStreams(data, size);
        assertThat(actual).isEmpty();
    }
}

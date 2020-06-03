package com.ip.stream.programs;

import java.util.List;
import java.util.stream.Stream;

/**
 * This class is used how to create integer stream.
 */
public class CreateIntegerStream {

    public Stream<Integer> getIntegerStream(List<Integer> input) {
        return input.stream();
    }
}

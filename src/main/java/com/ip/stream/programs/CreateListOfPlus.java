package com.ip.stream.programs;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This set of exercises covers simple simpleStream pipelines,
 * including intermediate operations and basic collectors.
 */
public class CreateListOfPlus {

    /**
     * Create the following list: {"+", "+", "+", "+", "+"}.
     * Try to use a factory method from Stream.
     */
    public List<String> getListOfPlus(long size) {
        if (size < 0) {
            throw new IllegalArgumentException("Please enter positive number!!");
        }
        return Stream.generate(() -> "+").limit(size).collect(Collectors.toList());
    }
}

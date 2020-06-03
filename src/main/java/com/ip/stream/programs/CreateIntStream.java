package com.ip.stream.programs;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * This set of exercises covers simple simpleStream pipelines,
 * including intermediate operations and basic collectors.
 */
public class CreateIntStream {

    /**
     * Create the following list: {1, 2, 3, 4, 5}.
     * Try to avoid the boxing of integers until the list is created.
     */
    public List<Integer> getIntStream(int start, int end) {
        return IntStream.range(start, end).boxed().collect(Collectors.toList());
    }
}

package com.ip.stream.programs;

import java.util.List;

/**
 * This set of exercises covers simple simpleStream pipelines,
 * including intermediate operations and basic collectors.
 */
public class CountDiffLength {

    /**
     * Given a list of words, count the number of different lengths of those words.
     * Try not to create any list.
     */
    public long countDiffLength(List<String> words) {
        if (words == null) {
            return 0;
        }
        return words.stream().map(String::length).distinct().count();
    }
}

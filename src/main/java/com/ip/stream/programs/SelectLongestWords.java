package com.ip.stream.programs;

import java.util.Comparator;
import java.util.List;

/**
 * This set of exercises covers harder stream pipelines,
 * including intermediate operations and collectors.
 */
public class SelectLongestWords {

    /**
     * Select one of the longest words from the input list.
     */
    public String getLongestWords(List<String> words) {
        if (words == null || words.isEmpty()) {
            return null;
        }
        return words.stream().max(Comparator.comparing(String::length)).get();
    }
}

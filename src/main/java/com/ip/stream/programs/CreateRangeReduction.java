package com.ip.stream.programs;

import java.util.List;
import java.util.stream.Collectors;

/**
 * This set of exercises covers simple simpleStream pipelines,
 * including intermediate operations and basic collectors.
 */
public class CreateRangeReduction {

    /**
     * Given a list of words, create an output list that contains
     * only words from 3 to 8.
     * Use the collect(Collectors.toList()) pattern to create the output list.
     */
    public List<String> getWordsInRange(List<String> words, long sk, long lm) {
        if (words == null) {
            throw new IllegalArgumentException("List Should not be empty");
        }
        return words.stream().skip(sk).limit(lm).collect(Collectors.toList());
    }
}

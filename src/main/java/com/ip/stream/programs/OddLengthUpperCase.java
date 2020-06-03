package com.ip.stream.programs;

import java.util.List;
import java.util.stream.Collectors;

/**
 * This set of exercises covers simple simpleStream pipelines,
 * including intermediate operations and basic collectors.
 */
public class OddLengthUpperCase {

    /**
     * Given a list of words, create an output list that contains
     * only the odd-length words, converted to upper case.
     * Use the collect(Collectors.toList()) pattern to create the output list.
     */
    public List<String> getOddLengthUpperCase(List<String> words) {
        if (words == null) {
            return words;
        }
        return words.stream().filter(s -> s.length() % 2 == 1).map(String::toUpperCase).collect(Collectors.toList());
    }
}

package com.ip.stream.programs;

import java.util.List;
import java.util.stream.Collectors;

/**
 * This set of exercises covers simple simpleStream pipelines,
 * including intermediate operations and basic collectors.
 */
public class FirstLetterWords {

    /**
     * Given a list of words, create an output list that contains
     * only the first letters of all the words, without any double.
     * Use the collect(Collectors.toList()) pattern to create the output list.
     */
    public List<String> getFirstLetters(List<String> words) {
        if (words == null) {
            return words;
        }
        return words.stream().map(s -> s.substring(0 , 1)).distinct().collect(Collectors.toList());
    }
}

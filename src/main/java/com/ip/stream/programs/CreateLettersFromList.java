package com.ip.stream.programs;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This set of exercises covers harder stream pipelines,
 * including intermediate operations and collectors.
 */
public class CreateLettersFromList {

    /**
     * Create a list of all the letters used in the following list, ordered in the alphabetical order
     * and with no doubles.
     * @return
     */
    public List<String> getAlphLetters(List<String> input) {
        if (input == null) {
            return input;
        }
        Function<String, Stream<String>> wordToLetters =
                word -> word.chars().filter(Character::isLetter).mapToObj(letter -> (char) letter).map(String::valueOf);
        return input.stream().flatMap(wordToLetters).distinct().sorted().collect(Collectors.toList());
    }
}

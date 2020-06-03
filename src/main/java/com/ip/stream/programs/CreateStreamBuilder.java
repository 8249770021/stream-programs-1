package com.ip.stream.programs;

import java.util.stream.Stream;

/**
 * This class is for build stream.
 */
public class CreateStreamBuilder {

    private static final int LENGTH = 3;
    /**
     * @param numbers
     * @return
     */
    public Stream<String> addNumbers(String... numbers) {
        if (numbers == null || numbers.length != LENGTH) {
            throw new IllegalArgumentException("There should be exactly four arguments provided");
        }

        for (String str : numbers) {
            if (str == null || checkTrimEmpty(str)) {
                throw new IllegalArgumentException("You have provided the following argument, but it cannot be null or empty:" + str);
            }
        }
        Stream.Builder<String> builder = Stream.builder();
        return builder.add(numbers[0]).add(numbers[1]).add(numbers[2]).build();
    }

    private boolean checkTrimEmpty(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isWhitespace(input.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}

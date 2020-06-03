package com.ip.stream.programs;

import java.util.stream.Stream;

/**
 * This class is used to generate a stream,
 * by using limit size.
 */
public class StreamGenerate {

    public Stream<String> getMultipleStreams(String input, long size) {
        if (input == null || checkTrimEmpty(input)) {
            return Stream.empty();
        }
        return Stream.generate(() -> input).limit(size);
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

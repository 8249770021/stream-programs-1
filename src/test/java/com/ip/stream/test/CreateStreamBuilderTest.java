package com.ip.stream.test;

import com.ip.stream.programs.CreateStreamBuilder;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

/**
 * This test class is used to test,
 * CreateStreamBuilder class.
 */
public class CreateStreamBuilderTest {

    private static CreateStreamBuilder streamBuilder;

    @BeforeTest
    public void init() {
        streamBuilder = new CreateStreamBuilder();
    }

    @Test
    public void addThreeStrings() {
        String[] input = {"one", "two", "three"};
        assertThat(streamBuilder.addNumbers(input)).containsExactly("one", "two", "three");
    }

    @Test
    public void addWithNull() {
        String[] input = null;
        assertThatIllegalArgumentException().isThrownBy(() -> streamBuilder.addNumbers(input));
    }

    @Test
    public void addWithEmpty() {
        String[] input = {};
        assertThatIllegalArgumentException().isThrownBy(() -> streamBuilder.addNumbers(input));
    }

    @Test
    public void addTwoElements() {
        String[] input = {"java", "python"};
        assertThatIllegalArgumentException().isThrownBy(() -> streamBuilder.addNumbers(input));
    }

    @Test
    public void testWithOneSpace() {
        String[] input = {" "};
        assertThatIllegalArgumentException().isThrownBy(() -> streamBuilder.addNumbers(input));
    }

    @Test
    public void testWithTwoSpace() {
        String[] input = {" ", " "};
        assertThatIllegalArgumentException().isThrownBy(() -> streamBuilder.addNumbers(input));
    }

    @Test
    public void testElementsMoreThanThree() {
        String[] input = {"win", "loss", "break", "continue"};
        assertThatIllegalArgumentException().isThrownBy(() -> streamBuilder.addNumbers(input));
    }
}

package com.ip.stream.test;

import com.ip.stream.programs.CreateListOfPlus;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

/**
 * This test class is used to test,
 * CreateListOfPlus class.
 */
public class CreateListOfPlusTest {

    private static CreateListOfPlus listOfPlus;

    @BeforeTest
    public void init() {
        listOfPlus = new CreateListOfPlus();
    }

    @Test
    public void testPlusList() {
        long maxSize = 5;
        List<String> result = listOfPlus.getListOfPlus(maxSize);
        assertThat(result).containsExactly("+", "+", "+", "+", "+");
    }

    @Test
    public void testPlusListWithZero() {
        long maxSize = 0;
        List<String> result = listOfPlus.getListOfPlus(maxSize);
        assertThat(result).isEmpty();
    }

    @Test
    public void testPlusListWithNegative() {
        long maxSize = -5;
        assertThatIllegalArgumentException().isThrownBy(() -> listOfPlus.getListOfPlus(maxSize));
    }
}

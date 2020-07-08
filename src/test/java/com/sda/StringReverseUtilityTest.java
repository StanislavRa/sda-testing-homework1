package com.sda;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static com.sda.StringReverseUtilityRefactored.reverse;
import static org.junit.jupiter.api.Assertions.*;


/**
 * @author StanislavR
 */

public class StringReverseUtilityTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    public void shouldReverseString(String input, String expected) {
        String modifiedString = reverse(input);
        assertEquals(expected, modifiedString);
    }

    @Test
    public void shouldThrowNullPointerException() {
        Exception exception = assertThrows(
                NullPointerException.class,
                () -> reverse(null)
        );
       assertEquals("java.lang.NullPointerException",exception.toString());
    }
}

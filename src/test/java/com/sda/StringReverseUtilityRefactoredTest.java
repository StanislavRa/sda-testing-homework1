package com.sda;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;

import static com.sda.StringReverseUtilityRefactored.reverse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author StanislavR
 */
public class StringReverseUtilityRefactoredTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/dataWithNull.csv") // try another source with null value
    public void shouldReverseString(@ConvertWith(NullableConverter.class)
                                                String input,   // "null" string can be converted to null
                                    @ConvertWith(NullableConverter.class)
                                                String expected // "null" string can be converted to null
    ) {
        String modifiedString = reverse(input);
        assertEquals(expected, modifiedString);
    }
}

package com.junit.junit_practice;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.junit.junit_practice.NumberUtils;

class NumberUtilsTest {

	NumberUtils numberUtils = new NumberUtils();

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    void testIsEvenTrue(int number) {
        assertTrue(numberUtils.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {7, 9})
    void testIsEvenFalse(int number) {
        assertFalse(numberUtils.isEven(number));
    }

}

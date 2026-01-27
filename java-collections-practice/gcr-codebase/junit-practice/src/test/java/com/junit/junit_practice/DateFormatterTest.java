package com.junit.junit_practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.junit.junit_practice.DateFormatter;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class DateFormatterTest {

	DateFormatter formatter = new DateFormatter();

    @Test
    void testValidDate() {
        assertEquals("26-01-2026", formatter.formatDate("2026-01-26"));
        assertEquals("01-12-2025", formatter.formatDate("2025-12-01"));
    }

    @Test
    void testInvalidDateFormat() {
        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("26/01/2026");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("2026-13-01"); // invalid month
        });

        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("abcd-ef-gh"); // random string
        });
    }

    @Test
    void testNullDate() {
        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate(null);
        });
    }

}

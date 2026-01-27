package com.junit.junit_practice;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.junit.junit_practice.UserRegistration;

class UserRegistrationTest {

	UserRegistration userReg = new UserRegistration();

    @Test
    void testValidRegistration() {
        assertDoesNotThrow(() -> {
            userReg.registerUser("Tanisha", "tanisha@example.com", "Password123");
        });
    }

    @Test
    void testEmptyUsername() {
        assertThrows(IllegalArgumentException.class, () -> {
            userReg.registerUser("", "user@example.com", "Password123");
        });
    }

    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            userReg.registerUser("User", "userexample.com", "Password123");
        });
    }

    @Test
    void testShortPassword() {
        assertThrows(IllegalArgumentException.class, () -> {
            userReg.registerUser("User", "user@example.com", "pass");
        });
    }

    @Test
    void testNullValues() {
        assertThrows(IllegalArgumentException.class, () -> {
            userReg.registerUser(null, null, null);
        });
    }

}

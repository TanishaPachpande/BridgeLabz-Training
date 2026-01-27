package com.junit.junit_practice;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.junit.junit_practice.DatabaseConnection;

class DatabaseConnectionTest {

	DatabaseConnection dbConnection;

    @BeforeEach
    void setUp() {
        dbConnection = new DatabaseConnection();
        dbConnection.connect();
    }

    @Test
    void testConnectionIsEstablished() {
        assertTrue(dbConnection.isConnected());
    }

    @AfterEach
    void tearDown() {
        dbConnection.disconnect();
        assertFalse(dbConnection.isConnected());
    }

}

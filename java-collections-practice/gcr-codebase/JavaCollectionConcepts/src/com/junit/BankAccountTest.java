package com.junit;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.testng.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
	BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount();
    }

    @Test
    void testDepositIncreasesBalance() {
        account.deposit(1000);

        assertEquals(1000, account.getBalance());
    }

    @Test
    void testWithdrawReducesBalance() {
        account.deposit(1000);
        account.withdraw(400);

        assertEquals(600, account.getBalance());
    }

    @Test
    void testWithdrawInsufficientFunds() {
        account.deposit(500);

        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(1000);
        });
    }
}

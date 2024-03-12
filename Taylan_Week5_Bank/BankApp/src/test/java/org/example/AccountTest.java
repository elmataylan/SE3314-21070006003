package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    /**
     * tests deposit method
     */

    @Test
    void depositTest() {
        Account a1 = new Account(1000);
        a1.deposit(1000);
        assertEquals(2000,a1.checkBalance());

    }

    /**
     * tests withdraw method
     */
    @Test
    void withdrawTest() {
        Account a2= new Account (1000);
        a2.withdraw(500);
        assertEquals(500,a2.checkBalance());
    }

    /**
     * test checkbalance method
     */

    @Test
    void checkBalanceTest() {
        Account a3 = new Account(1000);
        assertEquals(1000,a3.checkBalance());
    }
}
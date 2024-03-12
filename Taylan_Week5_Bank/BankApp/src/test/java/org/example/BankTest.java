package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    /**
     * tests createAccount method
     */

    @Test
    void createAccountTest() {
        Customer customer = new Customer("Taylan", 1000);
        Bank.createAccount(customer, 1000);
        assertNotNull(customer);
    }

    /**
     * test retrive account method
     */
    @Test
    void retrieveAccountTest() {
        Customer customer1 = new Customer("Taylan2", 2000);
        assertNotNull(Bank.retrieveAccount(customer1));
    }
}
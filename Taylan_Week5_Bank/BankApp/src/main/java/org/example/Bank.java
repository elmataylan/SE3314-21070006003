package org.example;
public class Bank {
    /**
     * Method for creating account
     * @param customer customer for creating account
     * @param initialDeposit deposit amount
     */
    public static void createAccount(Customer customer, double initialDeposit) {
        customer.getAccount().deposit(initialDeposit);
    }

    /**
     * Method to get account for customer
     * @param customer customer who's account is called
     * @return account object
     */
    public static Account retrieveAccount(Customer customer) {
        return customer.getAccount();
    }


}
package org.example;
/**
 * Class representing a Bank Customer
 */
class Customer {
    private String name;
    private Account account;

    /**
     * Constructor creates new customer with name and an initial deposit
     * @param name name of the customer
     * @param initialDeposit initial deposit amount
     */
    public Customer(String name, double initialDeposit) {
        this.name = name;
        this.account = new Account(initialDeposit);
    }

    /**
     * Retrieves name of customer
     * @return name of customer
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves account of the customer
     * @return account object
     */
    public Account getAccount() {
        return account;
    }
}

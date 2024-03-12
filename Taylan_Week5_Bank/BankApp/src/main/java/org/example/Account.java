package org.example;
    /**
     * * Class of bank account
     */
class Account {
    private double balance;

    /**
     * Constructor creates new account
     * @param initialDeposit deposit amount
     */
    public Account(double initialDeposit) {
        this.balance = initialDeposit;
    }

    /**
     * for depositing money
     * @param amount amount of deposit
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * method for withdrawing money
     * @param amount withdrawal value
     * @return true if withdrawal  successful
     */
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Method for checking balance of account
     * @return current balance of account
     */
    public double checkBalance() {
        return balance;
    }
}

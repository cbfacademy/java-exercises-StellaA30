package com.cbfacademy.accounts;

public class Account {
    private double balance;
    private int accountNumber;


    public Account( int accountNumber){
        this.balance = 0.0;
        this.accountNumber = accountNumber;
    }

    // withdrawal method
    public void withdraw(double amount){
        if((amount > 0) && (amount <= this.balance)){
            this.balance -= amount;
        }
    }

    // deposit method
    public void deposit(double amount){
        if (amount > 0) {
            this.balance += amount;
        }
    }


    // getters and setters
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}

package com.cbfacademy.accounts;

public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount( int accountNumber, double interestRate){
        super(accountNumber);
        this.interestRate = interestRate;
    }


    // without overriding the deposit method
    public void addInterest(double amount){
        double interest = amount * this.interestRate;
        deposit(interest);
    }

// adding interest and amount to deposit using override deposit method
    @Override
    public void deposit(double amount){
        if (amount > 0) {
            double amountAndInterest = amount + (amount * this.interestRate);
            setBalance(getBalance() + amountAndInterest);
        }
    }


    // getters and setters
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}

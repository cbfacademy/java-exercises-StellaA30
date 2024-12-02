package com.cbfacademy.accounts;

public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount( int accountNumber){
        super(accountNumber);
        this.interestRate = 0.04;
    }


    // without overriding the deposit method
    public double addInterest(double amount){
        double interest = amount * this.interestRate;
        return interest;
    }


// adding interest and amount to deposit using override deposit method
    @Override
    public void deposit(double amount){
        if (amount > 0) {
            double updatedBalance = getBalance() + amount;
            double accountInterest = addInterest(updatedBalance);
            setBalance(updatedBalance + accountInterest);
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

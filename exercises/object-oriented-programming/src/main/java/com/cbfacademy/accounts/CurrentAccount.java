package com.cbfacademy.accounts;

public class CurrentAccount extends Account {

    private double interestRate;

    public CurrentAccount( int accountNumber, double interestRate){
        super(accountNumber);
        this.interestRate = interestRate;
    }

    public void addInterest(){
        double interest = getBalance()*interestRate;
        deposit(interest);
    }

    // getters and setters
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}

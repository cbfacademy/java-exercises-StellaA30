package com.cbfacademy.accounts;

public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount( int accountNumber, double interestRate){
        super(accountNumber);
        this.interestRate = interestRate;
    }

    // without overriding the deposit method
    public void addInterest(){
        double interest = getBalance() * this.interestRate;
        deposit(interest);
    }

//
    @Override
    public void deposit(double amount){
        if (amount > 0) {
            double amountAndInterest = (amount * this.interestRate);
            setBalance(getBalance() + amountAndInterest);

        }
    }



    public double getBalance() {
        return super.getBalance();
    }

    // getters and setters
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}

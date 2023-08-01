package com.cbfacademy.accounts;

public class CurrentAccount extends Account{

    private double overdraftAmount;

    public CurrentAccount(int accountNumber, double overdraftAmount){
        super(accountNumber);
        this.overdraftAmount = overdraftAmount;
    }

    //withdrawal
    @Override
    public void withdraw(double amount){
        if((amount > 0) && (getBalance() - amount >= this.overdraftAmount)){
            double newBalance = getBalance() - amount;
            setBalance(newBalance);
        }
    }


    //getters and setters
    public double getOverdraftAmount() {
        return overdraftAmount;
    }

    public void setOverdraftAmount(double overdraftAmount) {
        this.overdraftAmount = overdraftAmount;
    }
}

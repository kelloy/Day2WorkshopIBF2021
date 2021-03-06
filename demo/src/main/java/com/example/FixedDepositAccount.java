package com.example;

public class FixedDepositAccount extends BankAccount {
    private float interest = 3.0f;
    private int durationInMonths = 6;
    private boolean isInterestChanged = false;
    private boolean isDurationChanged = false;

    public FixedDepositAccount(String name) {
        super(name);
    }

    public FixedDepositAccount(String name, float balance){
        super(name,balance);

    }

    public FixedDepositAccount(String name, float balance, float interest){
        super(name,balance);
        // TODO


    }

    public FixedDepositAccount(String name, float balance, float interest, Integer duration){
        super(name,balance);
        //TODO

    }

    @Override
    public void deposit(float amount){

    }
    
    @Override
    public void withdrawal(float amount){}

    public void setInterest(float interest){
        if (isInterestChanged == true)
            throw new IllegalArgumentException();
        
        this.interest = interest;
        isInterestChanged = true;

    }

    public void setDurationInMonths(int durationInMonths){
        if (isDurationChanged == true)
            throw new IllegalArgumentException();

        this.durationInMonths = durationInMonths;
        isDurationChanged = true;
    }
}

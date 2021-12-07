package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FixedDepositAccountTest {

    @Test
    public void testFDgetName(){
        FixedDepositAccount account = new FixedDepositAccount("Peter",100.00f);
        assertTrue(account.getName() == "Peter");

    }

    @Test
    public void testFDgetBalance(){
        FixedDepositAccount account = new FixedDepositAccount("John",123.45f, 4.0f, 6);
        assertTrue(account.getAccountBalance()==123.45f);
    }

    @Test
    public void testFDwithdrawal() {
        FixedDepositAccount account = new FixedDepositAccount("Alex",150.00f);
        account.deposit(50.00f);
        assertTrue(((account.getAccountBalance())-150.00f) < 0.01);
        
    }

    
}

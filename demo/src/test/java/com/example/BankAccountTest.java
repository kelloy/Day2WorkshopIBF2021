package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BankAccountTest {
    @Test
    public void testgetBalance(){
        BankAccount account = new BankAccount("John Smith",123.45f);
        assertTrue(account.getAccountBalance()==123.45f);
        System.out.println("test balance successful");
    }

    @Test
    public void testDeposit(){
        BankAccount account = new BankAccount("john smith",12.34f);
        account.deposit(2.47f);
        assertTrue(account.getAccountBalance()==14.81f);
    }

}
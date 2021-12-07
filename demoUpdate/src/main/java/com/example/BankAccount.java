package com.example;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class BankAccount {
    
    private String name;
    private String accountNumber;
    private float accountBalance;
    private List<String> transactions;
    private boolean closed;
    private String accountCreateDate;
    private String accountCloseDate;


    public BankAccount() {}

    public BankAccount(String name){
        this.name = name;
        this.accountBalance = 0f;
        this.accountNumber =
            Integer.toString((int) (Math.random()*1000000000));
        transactions = new ArrayList<>();

    }

    public BankAccount(String name, float accountBalance){
        this.name = name;
        this.accountBalance = accountBalance;
        transactions = new ArrayList<>();
        // TODO with this.accountBalance = 0;
    }
  
    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @return String return the accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }
    /**
     * @return float return the accountBalance
     */
    public float getAccountBalance() {
        return accountBalance;
    }

    /**
     * @param accountBalance the accountBalance to set
     */
    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    /**
     * @return List<String> return the transactions
     */
    public List<String> getTransactions() {
        return transactions;
    }

    /**
     * @param transactions the transactions to set
     */
    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }

    /**
     * @return boolean return the isClosed
     */
    public boolean isClosed() {
        return closed;
    }

    /**
     * @param Closed the isClosed to set
     */
    public void setIsClosed(boolean isClosed) {
        this.closed = isClosed;
    }

    /**
     * @return String return the accountCreateDate
     */
    public String getAccountCreateDate() {
        return accountCreateDate;
    }

    /**
     * @param accountCreateDate the accountCreateDate to set
     */
    public void setAccountCreateDate(String accountCreateDate) {
        this.accountCreateDate = accountCreateDate;
    }

    /**
     * @return String return the accountCloseDate
     */
    public String getAccountCloseDate() {
        return accountCloseDate;
    }

    /**
     * @param accountCloseDate the accountCloseDate to set
     */
    public void setAccountCloseDate(String accountCloseDate) {
        this.accountCloseDate = accountCloseDate;
    }

    public void deposit(float amount){
        if (amount < 0)
            throw new IllegalArgumentException();

        String transaction = "deposit" + amount + " at " + 
            Calendar.getInstance().getTimeInMillis();
        transactions.add(transaction);
        this.accountBalance = this.accountBalance + amount;
    }

    public void withdrawal(float amount){
        if (amount < 0 || amount > this.accountBalance || closed)
            throw new IllegalArgumentException();

        String transaction = "Withdraw" + amount + " at " + 
            Calendar.getInstance().getTimeInMillis();
        transactions.add(transaction);
        this.accountBalance = this.accountBalance - amount;
    }


}
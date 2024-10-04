package src;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class BankAccount{

    private final String accountName; 

    private String accountNumber;

    private float balance;
    
    private List<String> transactions;

    private boolean isClosed;

    private Date accountCreation;

    private Date accountClosure;

    public BankAccount(String accountName)
     {
        this.accountName = accountName;
        this.accountNumber = generateAccountNumber;
        this.balance = 0;
        this.transactions = new ArrayList<>();
        this.isClosed = false;
        this.accountCreation = new Date();
        this.accountClosure = accountClosure;
    }

    public BankAccount(String accountName, float initialBalance)
     {
        this.accountName = accountName;
        this.accountNumber = generateAccountNumber;
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();
        this.isClosed = false;
        this.accountCreation = new Date();
        this.accountClosure = accountClosure;
    }


      // Getter for account holder's name (read-only)
      public String getAccountHolderName() {
        return getAccountHolderName();
    }

    // Getter for account number (read-only)
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public float getBalance() {
        return balance;
    }
    // Method to deposit money
    public void deposit(float amount) {
        if (amount <= 0 || closed) {
            throw new IllegalArgumentException("Invalid amount or account is closed.");
        }
        this.balance += amount;
        this.transactions.add("Deposited $" + amount + " at " + new Date());
    }

    // Method to withdraw money
    public void withdraw(float amount) {
        if (amount <= 0 || amount > balance || closed) {
            throw new IllegalArgumentException("Invalid amount, insufficient funds, or account is closed.");
        }
        this.balance -= amount;
        this.transactions.add("Withdrew $" + amount + " at " + new Date());
    }

    // Method to close the account
    public void closeAccount() {
        this.closed = true;
        this.accountClosedDate = new Date();
    }

    // Generate a random account number (dummy method)
    private String generateAccountNumber() {
        return "ACC" + (int)(Math.random() * 10000);
    }

    // Getter for account closed status
    public boolean isClosed() {
        return closed;
    }

    // Display transactions
    public void displayTransactions() {
        System.out.println("Transaction History:");
        for (String transaction : transactions) {
            System.out.println(transaction);
        }
    }
}
    



    
    

    }

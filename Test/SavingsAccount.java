package Test;

import java.util.Scanner;
/*
AMAOEd MIS6232 Computer Programming 2 (Java)

Author: J. E. Cunanan
Student No: 2022-0072254


*/

class SavingsAccount extends BankAccount {
    private int accountNo;
    private double balance;
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountName, String address, String birthday, String contactNumber,
                          int accountNo, double balance, double interestRate) {
        super(accountName, address, birthday, contactNumber);
        this.accountNo = accountNo;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    // Setter methods
    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Getter methods
    public int getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }

    // Method to validate account number
    public boolean validateAcctNumber(int acctNo) {
        return acctNo == accountNo;
    }

    // Method to check balance
    public void balanceInquiry() {
        System.out.println("Client Name: " + getAccountName());
        System.out.println("Current Balance: Php " + balance);
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Deposit successful. Current Balance: Php " + balance);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (balance - amount >= 5000) { // Checking maintaining balance
            balance -= amount;
            System.out.println("Withdrawal successful. Current Balance: Php " + balance);
        } else {
            System.out.println("Insufficient funds. Maintaining balance of Php 5,000 should be maintained.");
        }
    }

    // Method to close account
    public void closeAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Are you sure you want to close the account? (yes/no): ");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            balance = 0;
            System.out.println("Account closed successfully.");
        } else {
            System.out.println("Account closure canceled.");
        }
        scanner.close();
    }
}
package MachineProblem3;

/*
AMAOEd MIS6232 Computer Programming 2 (Java)

Author: J. E. Cunanan
Student No: 2022-0072254

Machine Problem 3 (Course Project)
*/

import java.time.LocalDate;

public class SavingsAccount extends BankAccount{

    // Attributes
    private int accountNo;
    private double balance;
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountName, String address, LocalDate birthday,
                          String contactNumber, int accountNo, double balance,
                          double interestRate) {
        super(accountName, address, birthday, contactNumber);
        this.accountNo = accountNo;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    // Getters
    public int getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    // Setters
    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Balance Inquiry
    public void balanceInquiry() {
        System.out.println("Current Balance: " + balance);
    }

    // Deposit
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New Balance: " + balance);
    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    // Validate Account Number
    public void validateAcct(String accountNo) {
        // body
    }

    // Close Account
    public void closeAccount(String accountNo) {
        // body
    }

}

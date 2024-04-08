package MachineProblem3;

import java.util.Scanner;

/*
AMAOEd MIS6232 Computer Programming 2 (Java)

Author: J. E. Cunanan
Student No: 2022-0072254

Machine Problem 3 (Course Project)
*/


public class SavingsAccount extends BankAccount{

    // Attributes
    private int accountNo;
    private double balance;
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountName, String address, String birthday,
                          String contactNumber, int accountNo, double balance,
                          double interestRate) {
        super(accountName, address, birthday, contactNumber);
        this.accountNo = accountNo;
        this.balance = balance;
        this.interestRate = 0.05;
    }

    // Getters
    public int getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
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

    // METHODS
    // Balance Inquiry
    public void balanceInquiry() {
        System.out.println("Current Balance: PHP" + balance);
    }

    // Deposit
    public void deposit(double amount) {
        balance += amount;
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Deposit successful. New Balance: PHP" + balance);
    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount < 100) {
            System.out.println("Minimum withdrawal amount of PHP 100.00");
        } else if (amount >=100 && balance - amount >= 5000) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: PHP " + balance);
        } else if (balance - amount < 5000) {
            System.out.println("Insufficient funds. Minimum maintaining balance of PHP 5000.00 is required.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    // Validate Account Number
    public boolean validateAcct(int acctNo) {
        return acctNo == accountNo;
    }

    // Close Account
    public void closeAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you sure you want to close the account? (Y/N)");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("Y")) {
            balance = 0;
            System.out.println("Account closed successfully.");
        } else {
            System.out.println("Account closure canceled.");
        }

    }

}

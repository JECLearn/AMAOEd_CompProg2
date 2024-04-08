package Test;

import java.util.Scanner;
import java.util.Random;

/*
AMAOEd MIS6232 Computer Programming 2 (Java)

Author: J. E. Cunanan
Student No: 2022-0072254


*/

public class Client {

    private static final int MAX_ACCOUNTS = 100;
    private static final int MIN_INITIAL_DEPOSIT = 5000;
    private static SavingsAccount[] accounts = new SavingsAccount[MAX_ACCOUNTS];
    private static int accountCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            displayMainMenu();
            System.out.print("Enter your choice: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    createNewAccount(scanner);
                    break;
                case 2:
                    if (accountCount > 0) {
                        balanceInquiry(scanner);
                    } else {
                        System.out.println("No accounts created yet.");
                    }
                    break;
                case 3:
                    if (accountCount > 0) {
                        deposit(scanner);
                    } else {
                        System.out.println("No accounts created yet.");
                    }
                    break;
                case 4:
                    if (accountCount > 0) {
                        withdraw(scanner);
                    } else {
                        System.out.println("No accounts created yet.");
                    }
                    break;
                case 5:
                    if (accountCount > 0) {
                        clientProfile(scanner);
                    } else {
                        System.out.println("No accounts created yet.");
                    }
                    break;
                case 6:
                    if (accountCount > 0) {
                        closeAccount(scanner);
                    } else {
                        System.out.println("No accounts created yet.");
                    }
                    break;
                case 7:
                    System.out.println("Thank you for using JBank. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 7);

        scanner.close();
    }

    public static void displayMainMenu() {
        System.out.println("\nJBank Main Menu");
        System.out.println("[1] New Account");
        System.out.println("[2] Balance Inquiry");
        System.out.println("[3] Deposit");
        System.out.println("[4] Withdraw");
        System.out.println("[5] Client Profile");
        System.out.println("[6] Close Account");
        System.out.println("[7] Exit");
    }

    public static void createNewAccount(Scanner scanner) {
        SavingsAccount account = new SavingsAccount();
        System.out.print("Enter client name: ");
        account.setAccountName(scanner.nextLine());
        System.out.print("Enter address: ");
        account.setAddress(scanner.nextLine());
        System.out.print("Enter birthday: ");
        account.setBirthday(scanner.nextLine());
        System.out.print("Enter contact number: ");
        account.setContactNumber(scanner.nextLine());
        System.out.print("Enter initial deposit (minimum Php 5,000): ");
        double initialDeposit = scanner.nextDouble();

        if (initialDeposit >= MIN_INITIAL_DEPOSIT) {
            Random rand = new Random();
            int accountNo = rand.nextInt(9000) + 1000; // Generate 4-digit account number

            account.setAccountNo(accountNo);
            account.setBalance(initialDeposit);
            accounts[accountCount] = account;
            accountCount++;
            System.out.println("Account created successfully. Account number: " + accountNo);
        } else {
            System.out.println("Initial deposit must be at least Php 5,000.");
        }
    }

    public static void balanceInquiry(Scanner scanner) {
        System.out.print("Enter account number: ");
        int accountNo = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].validateAcctNumber(accountNo)) {
                accounts[i].balanceInquiry();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Invalid account number.");
        }
    }

    public static void deposit(Scanner scanner) {
        System.out.print("Enter account number: ");
        int accountNo = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].validateAcctNumber(accountNo)) {
                System.out.print("Enter amount to deposit: ");
                double amount = scanner.nextDouble();
                accounts[i].deposit(amount);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Invalid account number.");
        }
    }

    public static void withdraw(Scanner scanner) {
        System.out.print("Enter account number: ");
        int accountNo = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].validateAcctNumber(accountNo)) {
                System.out.print("Enter amount to withdraw: ");
                double amount = scanner.nextDouble();
                accounts[i].withdraw(amount);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Invalid account number.");
        }
    }

    public static void clientProfile(Scanner scanner) {
        System.out.print("Enter account number: ");
        int accountNo = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].validateAcctNumber(accountNo)) {
                accounts[i].getClientDetails();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Invalid account number.");
        }
    }

    public static void closeAccount(Scanner scanner) {
        System.out.print("Enter account number: ");
        int accountNo = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].validateAcctNumber(accountNo)) {
                accounts[i].closeAccount();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Invalid account number.");
        }
    }

}

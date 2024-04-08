package MachineProblem3;

import java.util.Random;
import java.util.Scanner;

/*
AMAOEd MIS6232 Computer Programming 2 (Java)

Author: J. E. Cunanan
Student No: 2022-0072254

Machine Problem 3 (Course Project)
*/

public class Client {

    private static final int MAX_ACCOUNTS = 100;
    private static final int MIN_INITIAL_DEPOSIT = 5000;
    private static SavingsAccount[] sa = new SavingsAccount[MAX_ACCOUNTS];
    private static int accountCount = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            displayMainMenu();
            System.out.print("Enter selection: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    createNewAccount(scanner);
                    break;
                case 2:
                    if (accountCount > 0) {
                        balanceInquiry(scanner);
                    } else {
                        System.out.println("No accounts present.");
                    }
                    break;
                case 3:
                    if (accountCount > 0) {
                        deposit(scanner);
                    } else {
                        System.out.println("No accounts present.");
                    }
                    break;
                case 4:
                    if (accountCount > 0) {
                        withdraw(scanner);
                    } else {
                        System.out.println("No accounts present.");
                    }
                    break;
                case 5:
                    if (accountCount > 0) {
                        clientProfile(scanner);
                    } else {
                        System.out.println("No accounts present.");
                    }
                    break;
                case 6:
                    if (accountCount > 0) {
                        closeAccount(scanner);
                    } else {
                        System.out.println("No accounts present.");
                    }
                    break;
                case 7:
                    System.out.println("Thank you for using AMA Bank!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

        } while (option != 7);

        scanner.close();

    }

    // METHODS
    // Main Menu Display
    public static void displayMainMenu() {

        // Main Menu Display
        System.out.println("                 Welcome to AMA Bank                 ");
        System.out.println("--------------------- MAIN MENU ---------------------");
        System.out.println("\nPlease Select Option\n");
        System.out.println("[1] New Account");
        System.out.println("[2] Balance Inquiry");
        System.out.println("[3] Deposit");
        System.out.println("[4] Withdraw");
        System.out.println("[5] Client Profile");
        System.out.println("[6] Close Account");
        System.out.println("[7] Exit");
        System.out.println("-----------------------------------------------------");

    }

    // Create New Account
    public static void createNewAccount(Scanner scanner) {

        System.out.print("Enter client name: ");
        String name = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter birthday: ");
        String birthday = scanner.nextLine();
        System.out.print("Enter contact number: ");
        String contactNumber = scanner.nextLine();
        System.out.print("Enter initial deposit (minimum PHP 5,000.00): ");
        double initialDeposit = scanner.nextDouble();

        // Initial deposit check
        if (initialDeposit >= MIN_INITIAL_DEPOSIT) {
            Random rand = new Random();
            int accountNo = rand.nextInt(9000) + 1000;

            SavingsAccount account = new SavingsAccount(name, address,birthday, contactNumber,
                                                        accountNo, initialDeposit, 0.05);
            account.setAccountNo(accountNo);
            account.setBalance(initialDeposit);
            sa[accountCount] = account;
            accountCount++;
            System.out.println("Account created successfully. Your account number is " + accountNo);
        } else {
            System.out.println("Initial deposit must be at least PHP 5000.00");
        }

    }

    // Balance Inquiry
    public static void balanceInquiry(Scanner scanner) {

        System.out.println("Enter account number: ");
        int accountNo = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i <accountCount; i++) {

            if (sa[i].validateAcct(accountNo)) {
                sa[i].balanceInquiry();
                found = true;
                break;
            }

        }

        if (!found) {
            System.out.println("Invalid account number.");
        }

    }

    // Deposit
    public static void deposit(Scanner scanner) {

        System.out.println("Enter account number: ");
        int accountNo = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < accountCount; i++) {

            if (sa[i].validateAcct(accountNo)) {
                System.out.println("Enter amount to deposit: ");
                double amount = scanner.nextDouble();
                sa[i].deposit(amount);
                found = true;
                break;
            }

        }

        if (!found) {
            System.out.println("Invalid account number.");
        }

    }

    // Withdraw
    public static void withdraw(Scanner scanner) {

        System.out.println("Enter account number: ");
        int accountNo = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i <accountCount; i++) {

            if (sa[i].validateAcct(accountNo)) {
                System.out.println("Enter amount to withdraw: ");
                double amount = scanner.nextDouble();
                sa[i].withdraw(amount);
                found = true;
                break;
            }

        }

        if (!found) {
            System.out.println("Invalid account number.");
        }

    }

    // View Client Profile
    public static void clientProfile(Scanner scanner) {
        System.out.println("Enter account number: ");
        int accountNo = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < accountCount; i++) {

            if (sa[i].validateAcct(accountNo)) {
                sa[i].getClientDetails();
                found = true;
                break;
            }

        }

        if (!found) {
            System.out.println("Invalid account number.");
        }

    }

    // Close Account
    public static void closeAccount(Scanner scanner) {
        System.out.println("Enter account number.");
        int accountNo = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < accountCount; i++) {

            if (sa[i].validateAcct(accountNo)) {
                sa[i].closeAccount();
                found = true;
                break;
            }

        }

        if (!found) {
            System.out.println("Invalid account number.");
        }

    }

}

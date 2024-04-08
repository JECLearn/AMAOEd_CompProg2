package MachineProblem3;

import java.util.Scanner;

/*
AMAOEd MIS6232 Computer Programming 2 (Java)

Author: J. E. Cunanan
Student No: 2022-0072254

Machine Problem 3 (Course Project)
*/

public class Client {

    public static void main(String[] args) {

        SavingsAccount[] sa = new SavingsAccount[100];
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        mainMenu();

        while (true) {

            switch (userInput) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Wrong input. Try again.");
                    continue;
            }
            break;

        }

    }

    public static void mainMenu() {

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

}

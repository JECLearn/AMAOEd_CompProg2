/*
AMAOEd MIS6232 Computer Programming 2 (Java)

Author: J. E. Cunanan
Student No: 2022-0072254

Laboratory Exercise 004 Temperature Converter
*/
package Lab004;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        // variable init
        Scanner scanner = new Scanner(System.in);
        int userInput;

        do {
            // Main Menu
            System.out.println("TEMPERATURE CONVERTER MAIN MENU");
            System.out.println("[1] Conversion from Celsius to Fahrenheit");
            System.out.println("[2] Conversion from Fahrenheit to Celsius");
            System.out.println("[3] Exit");
            System.out.print("Choose an option -> ");
            userInput = scanner.nextInt();

            // userInput switch
            switch (userInput) {
                case 1:
                    convCtoF(scanner);
                    break;
                case 2:
                    convFtoC(scanner);
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid input. Please select between 1, 2, and 3.\n");
            }
        } while (userInput != 3);

    }
    // Celsius to Fahrenheit function
    public static void convCtoF(Scanner scanner) {
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit +"°F\n");
    }

    // Fahrenheit to Celsius function
    public static void convFtoC(Scanner scanner) {
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: " + celsius +"°C\n");
    }
}

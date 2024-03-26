/*
AMAOEd MIS6232 Computer Programming 2 (Java)

Author: J. E. Cunanan
Student No: 2022-0072254

GitHub repo: https://github.com/JECLearn/AMAOEd_CompProg2/tree/main/MachineProblem1

Machine Problem 1
*/
package MachineProblem1;
import java.util.Scanner;

public class SeatReservation {

    // seat grid function
    static final int rows = 5;
    static final int columns = 7;
    public static void seatGrid(int[][] seats) {
        System.out.println();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (seats[i][j] == 0) {
                    System.out.printf("%5s", "X");
                } else {
                    System.out.printf("%5d", seats[i][j]);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // grid numbering
        int[][] seats = new int[rows][columns];
        int seatNumber = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                seats[i][j] = seatNumber++;
            }
        }

        // handling user input, reserving seat
        Scanner scanner = new Scanner(System.in);

        while (true) {
            seatGrid(seats);

            System.out.println("\nPlease enter seat number to reserve.");
            System.out.print("Seat number: ");
            int userSeat = scanner.nextInt();

            if (userSeat < 1 || userSeat > rows * columns) {
                System.out.println("\nInvalid seat number. Please try again.");
                continue;
            }

            boolean seatReserved = false;

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    if (seats[i][j] == userSeat) {
                        seats[i][j] = 0;
                        seatReserved = true;
                        System.out.println("\nSeat successfully reserved.");
                        break;
                    }
                }
                if (seatReserved) {
                    break;
                }
            }
            if (!seatReserved) {
                System.out.println("\nSeat is taken. Please try again.");
            }
        }
    }
}

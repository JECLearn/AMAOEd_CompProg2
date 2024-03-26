/*
AMAOEd MIS6232 Computer Programming 2 (Java)

Author: J. E. Cunanan
Student No: 2022-0072254

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
                    System.out.printf("%5s", "0");
                } else {
                    System.out.printf("%5d", seats[i][j]);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] seats = new int[rows][columns];
        seatGrid(seats);
    }
}

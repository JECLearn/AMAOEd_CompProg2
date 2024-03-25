/*
AMAOEd MIS6232 Computer Programming 2 (Java)

Author: J. E. Cunanan
Student No: 2022-0072254

Laboratory Exercise 003_MaxAndMin
*/

package Lab003;

public class MaxAndMin {
    public static void main(String[] args) {
        int first = 420;
        int second = 69;

        int sum = first + second;
        int diff = first - second;
        int prod = first * second;
        double quo = ((double)first / second);
        int avg = first + second / 2;
        int max = (first > second) ? first : second;
        int min = (first < second) ? first : second;

        System.out.println("First integer: " + first);
        System.out.println("Second integer: " + second);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + prod);
        System.out.printf("Quotient: %.8f%n", quo);
        System.out.println("Average: " + avg);
        System.out.println("Max integer: " + max);
        System.out.println("Min integer: " + min);
    }
}

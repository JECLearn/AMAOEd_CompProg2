package Lab009;

/*
AMAOEd MIS6232 Computer Programming 2 (Java)

Author: J. E. Cunanan
Student No: 2022-0072254

Laboratory Exercise 009
*/

public class ExceptionLabExercise {
    public static void main(String[] args) {
        try {
            System.out.println(args[0]);
        } finally {
            System.out.println("FINALLY");
        }
    }
}

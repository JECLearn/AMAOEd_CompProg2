package Lab009;

/*
AMAOEd MIS6232 Computer Programming 2 (Java)

Author: J. E. Cunanan
Student No: 2022-0072254

Laboratory Exercise 009
*/

public class MyClass {

    public static void main(String[] args) {

        int k = 0;

        try {
            int i = 5 / k;
        } catch (Exception e) {
            System.out.println("3");
        } catch (ArithmeticException e) {
            System.out.println("1");
        } catch (RuntimeException e) {
            System.out.println("2");
            return;
        } finally {
            System.out.println("4");
        }
        System.out.println("5");

    }

}

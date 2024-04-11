package Lab012;

/*
AMAOEd MIS6232 Computer Programming 2 (Java)

Author: J. E. Cunanan
Student No: 2022-0072254

Laboratory Exercise 012
*/

public class TestThread2 implements Runnable{
    public static void main(String[] args) {
        TestThread2 t = new TestThread2();
    }

    public void run() {
        System.out.println("Running.");
    }
}

package Lab012;

/*
AMAOEd MIS6232 Computer Programming 2 (Java)

Author: J. E. Cunanan
Student No: 2022-0072254

Laboratory Exercise 012
*/

public class TestThread1 extends Thread {
    public static void main(String[] args) {
        TestThread1 thread = new TestThread1();
    }

    @Override
    public void run() {
        printMyName();
    }

    private void printMyName() {
        System.out.println("Thread is running.");
    }
}

package Lab012;

/*
AMAOEd MIS6232 Computer Programming 2 (Java)

Author: J. E. Cunanan
Student No: 2022-0072254

Laboratory Exercise 012
*/

public class TestExample extends Thread {
    public static void main(String argv[]) {
        TestExample t = new TestExample();
        t.run();
    }

    public void start() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Count: " + i);
        }
    }
}

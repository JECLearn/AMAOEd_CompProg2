package Lab012;

/*
AMAOEd MIS6232 Computer Programming 2 (Java)

Author: J. E. Cunanan
Student No: 2022-0072254

Laboratory Exercise 012
*/

public class TestExample2  implements Runnable{
    public static void main(String[] args) throws InterruptedException{
        Thread a = new Thread(new TestExample2());
        a.start();

        System.out.println("Starting...");
        a.join();
        System.out.println("Ending...");
    }

    public void run(){
        System.out.println("Running...");
    }
}

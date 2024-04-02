package Lab008;

/*
AMAOEd MIS6232 Computer Programming 2 (Java)

Author: J. E. Cunanan
Student No: 2022-0072254


*/
public class Lab008 {

    public static void main(String[] args) {
        // NewClass instance
        NewClass person = new NewClass("J. E. Cunanan", "69 Ligaya Street");

        // hasCode() method
        int hashCode = person.hashCode();

        // Print hashCode
        System.out.println("Hash: " + hashCode);
    }

}

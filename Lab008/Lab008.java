package Lab008;

/*
AMAOEd MIS6232 Computer Programming 2 (Java)

Author: J. E. Cunanan
Student No: 2022-0072254

Laboratory Exercise 008
*/
public class Lab008 {

    public static void main(String[] args) {
        // NewClass instance
        NewClass person = new NewClass("J. E. Cunanan", "69 Ligaya Street");

        // hasCode() method
        int hashCode = person.hashCode();

        // Print hashCode
        System.out.println("Hash: " + hashCode);

        // Question 4
        NewClass person1 = new NewClass("J. E. Cunanan", "69 Ligaya Street");
        System.out.println(person1.getName() + ", " + person1.getAddress());

        // Question 7
        String spaces = " This has a space in the beginning and end. ";
        String trimmedSpaces = spaces.trim();
        System.out.println("Original: " + spaces);
        System.out.println("Trimmed: " + trimmedSpaces);

        // Question 8
        StringBuffer sb = new StringBuffer("hello");

        // Question 9
        sb.setLength(2);
        System.out.println("StringBuffer: " + sb.toString());
    }

}

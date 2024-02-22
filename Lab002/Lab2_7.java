/*
AMAOEd MIS6232 Computer Programming 2 (Java)

Author: J. E. Cunanan
Student No: 2022-0072254

Laboratory Exercise 002_7
*/

package Lab002;

public class Lab2_7 {
    public static void main(String[] args) {
        // variable initialization
        float Gross_Sales = 0.0F;
        int Age = 1;
        boolean Final = false;
        String Location = "0x11";
        String Old_File = "067";
        char Default = 'a';
        String Name = "noname";

        // convert hex to decimal for String Location
        int decimalLocation = Integer.parseInt(Location.substring(2),16);

        // convert octal to decimal for String Old_File
        int octalOld_File = Integer.parseInt(Old_File, 8);

        // print variables
        System.out.println("Gross sales = " + Gross_Sales);
        System.out.println("Age = " + Age);
        System.out.println("Final = " + Final);
        System.out.println("Location = " + decimalLocation);
        System.out.println("Old File = " + octalOld_File);
        System.out.println("Default = " + Default);
        System.out.println("Name = " + Name);
    }
}

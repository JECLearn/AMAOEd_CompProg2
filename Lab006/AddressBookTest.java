/*
AMAOEd MIS6232 Computer Programming 2 (Java)

Author: J. E. Cunanan
Student No: 2022-0072254

Laboratory Exercise 006
*/
package Lab006;

public class AddressBookTest {
    public static void main(String[] args) {

        AddressBook addressBook1 = new AddressBook();
        addressBook1.setName("John");
        System.out.println(addressBook1.getName());

        AddressBook addressBook2 = new AddressBook();
        addressBook2.setName("Mary");
        System.out.println(addressBook1.getName());

    }
}

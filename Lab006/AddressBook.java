/*
AMAOEd MIS6232 Computer Programming 2 (Java)

Author: J. E. Cunanan
Student No: 2022-0072254

Laboratory Exercise 006
*/
package Lab006;

public class AddressBook {
    // Attributes
    private String name;
    private String address;
    private String mobileNumber;
    private String emailAddress;

    // Constructor
    public AddressBook() {
        this.name = name;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.emailAddress = emailAddress;
    }

    // Accessors
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    // Mutators
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}

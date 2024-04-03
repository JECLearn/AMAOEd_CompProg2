package MachineProblem3;

import java.time.LocalDate;

/*
AMAOEd MIS6232 Computer Programming 2 (Java)

Author: J. E. Cunanan
Student No: 2022-0072254

Machine Problem 3 (Course Project)
*/

public class BankAccount {

    // Attributes
    private String accountName;
    private String address;
    private LocalDate birthday;
    private String contactNumber;

    // Constructor
    public BankAccount(String accountName, String address,
                       LocalDate birthday, String contactNumber) {
        this.accountName = accountName;
        this.address = address;
        this.birthday = birthday;
        this.contactNumber = contactNumber;
    }

    // Getters
    public String getAccountName() {
        return accountName;
    }

    public String getAddress() {
        return address;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    // Setters

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    // Get Client Details Method
    public String getClientDetails() {
        return "Account Name: " + accountName +
                "\nAddress: " + address +
                "\nBirthday: " + birthday +
                "\nContact Number: " + contactNumber;
    }

}

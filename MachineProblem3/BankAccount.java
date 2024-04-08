package MachineProblem3;

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
    private String birthday;
    private String contactNumber;

    // Constructor
    public BankAccount(String accountName, String address,
                       String birthday, String contactNumber) {
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

    public String getBirthday() {
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

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    // METHODS
    // Get Client Details
    public void getClientDetails() {

        System.out.println("Account Name: " + accountName);
        System.out.println("Address: " + address);
        System.out.println("Birthday: " + birthday);
        System.out.println("Contact Number: " + contactNumber + "\n");

    }

}

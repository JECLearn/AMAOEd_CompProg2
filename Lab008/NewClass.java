package Lab008;

/*
AMAOEd MIS6232 Computer Programming 2 (Java)

Author: J. E. Cunanan
Student No: 2022-0072254


*/
public class NewClass {

    private String name;
    private String address;

    // Constructor
    public NewClass(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}

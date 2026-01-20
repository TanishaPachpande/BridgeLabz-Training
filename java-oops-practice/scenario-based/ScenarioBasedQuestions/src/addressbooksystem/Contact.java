package addressbooksystem;

public class Contact implements Comparable<Contact> {

    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private Address address;

    // Constructor
    public Contact(String firstName, String lastName,
                   String phone, String email, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    // Used for duplicate check
    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public int compareTo(Contact c) {
        return this.getFullName().compareToIgnoreCase(c.getFullName());
    }

    @Override
    public String toString() {
        return "Name: " + getFullName() +
               ", Phone: " + phone +
               ", Email: " + email +
               ", Address: " + address;
    }
}


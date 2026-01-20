package addressbooksystem;


import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        int choice;

        do {
            System.out.println("\n--- Address Book Menu ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Search by City");
            System.out.println("5. Search by State");
            System.out.println("6. Display All Contacts");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    Contact contact = createContact(sc);
                    if (addressBook.addContact(contact)) {
                        System.out.println("Contact added successfully.");
                    } else {
                        System.out.println("Duplicate contact not allowed.");
                    }
                    break;

                case 2:
                    System.out.print("Enter full name to edit: ");
                    String editName = sc.nextLine();
                    Contact updated = createContact(sc);
                    if (addressBook.editContact(editName, updated)) {
                        System.out.println("Contact updated.");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter full name to delete: ");
                    String delName = sc.nextLine();
                    if (addressBook.deleteContact(delName)) {
                        System.out.println("Contact deleted.");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter city: ");
                    addressBook.searchByCity(sc.nextLine())
                            .forEach(System.out::println);
                    break;

                case 5:
                    System.out.print("Enter state: ");
                    addressBook.searchByState(sc.nextLine())
                            .forEach(System.out::println);
                    break;

                case 6:
                    addressBook.displayContacts();
                    break;
            }
        } while (choice != 0);

        sc.close();
        System.out.println("Address Book Closed.");
    }

    private static Contact createContact(Scanner sc) {
        System.out.print("First Name: ");
        String fn = sc.nextLine();
        System.out.print("Last Name: ");
        String ln = sc.nextLine();
        System.out.print("Phone: ");
        String phone = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("City: ");
        String city = sc.nextLine();
        System.out.print("State: ");
        String state = sc.nextLine();
        System.out.print("Zip: ");
        String zip = sc.nextLine();

        Address address = new Address(city, state, zip);
        return new Contact(fn, ln, phone, email, address);
    }
}


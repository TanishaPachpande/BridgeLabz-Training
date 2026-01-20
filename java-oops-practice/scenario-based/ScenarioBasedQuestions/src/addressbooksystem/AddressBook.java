package addressbooksystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AddressBook {

    private List<Contact> contacts = new ArrayList<>();

    // Add contact with duplicate validation
    public boolean addContact(Contact contact) {
        boolean exists = contacts.stream()
                .anyMatch(c -> c.getFullName().equalsIgnoreCase(contact.getFullName()));

        if (exists) return false;

        contacts.add(contact);
        return true;
    }

    // Edit contact by name
    public boolean editContact(String name, Contact updatedContact) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getFullName().equalsIgnoreCase(name)) {
                contacts.set(i, updatedContact);
                return true;
            }
        }
        return false;
    }

    // Delete contact
    public boolean deleteContact(String name) {
        return contacts.removeIf(c ->
                c.getFullName().equalsIgnoreCase(name));
    }

    // Search by city
    public List<Contact> searchByCity(String city) {
        return contacts.stream()
                .filter(c -> c.getAddress().getCity().equalsIgnoreCase(city))
                .collect(Collectors.toList());
    }

    // Search by state
    public List<Contact> searchByState(String state) {
        return contacts.stream()
                .filter(c -> c.getAddress().getState().equalsIgnoreCase(state))
                .collect(Collectors.toList());
    }

    // Display sorted contacts
    public void displayContacts() {
        Collections.sort(contacts);
        contacts.forEach(System.out::println);
    }
}


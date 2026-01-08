package eventease;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User details
        System.out.println("Enter Organizer Name:");
        String name = sc.nextLine();

        System.out.println("Enter Organizer Email:");
        String email = sc.nextLine();

        User organizer = new User(name, email);

        // Event choice
        System.out.println("Choose Event Type:");
        System.out.println("1. Birthday Event");
        System.out.println("2. Conference Event");
        int choice = sc.nextInt();
        sc.nextLine(); // clear buffer

        // Common event inputs
        System.out.println("Enter Event ID:");
        int eventId = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Location:");
        String location = sc.nextLine();

        System.out.println("Enter Date:");
        String date = sc.nextLine();

        System.out.println("Enter Number of Attendees:");
        int attendees = sc.nextInt();

        Event event;

        // Creating object based on user choice
        if (choice == 1) {
            event = new BirthdayEvent(eventId, location, date, attendees, organizer);
        } else {
            event = new ConferenceEvent(eventId, location, date, attendees, organizer);
        }

        // Actions
        System.out.println("\n--- Event Actions ---");
        event.schedule();
        event.showDetails();

        System.out.println("\nDo you want to reschedule? (yes/no)");
        sc.nextLine();
        String res = sc.nextLine();

        if (res.equalsIgnoreCase("yes")) {
            System.out.println("Enter New Date:");
            String newDate = sc.nextLine();
            event.reschedule(newDate);
        }

        sc.close();
    }
}


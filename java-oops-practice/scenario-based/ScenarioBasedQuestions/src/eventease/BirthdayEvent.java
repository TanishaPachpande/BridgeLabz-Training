package eventease;

public class BirthdayEvent extends Event {

    public BirthdayEvent(int eventId, String location, String date,
                         int attendees, User organizer) {

        super(eventId, "Birthday Party", location, date, attendees,
              10000, 5000, 1000, organizer);
    }

    // Polymorphism
    @Override
    public void schedule() {
        System.out.println("Birthday party scheduled with decorations and cake!");
    }
}


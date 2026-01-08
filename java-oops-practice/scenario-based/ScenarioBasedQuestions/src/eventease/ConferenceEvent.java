package eventease;

public class ConferenceEvent extends Event {

    public ConferenceEvent(int eventId, String location, String date,
                           int attendees, User organizer) {

        super(eventId, "Conference", location, date, attendees,
              30000, 15000, 5000, organizer);
    }

    // Polymorphism
    @Override
    public void schedule() {
        System.out.println("Conference scheduled with projector and seating setup!");
    }
}


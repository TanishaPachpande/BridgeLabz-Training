package eventease;

public class Event implements ISchedulable {

    private final int eventId;        // cannot be modified once assigned
    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    private double venueCost;
    private double serviceCost;
    private double discount;

    protected User organizer;

    // Constructor without services
    public Event(int eventId, String eventName, String location, String date,
                 int attendees, double venueCost, User organizer) {

        this.eventId = eventId;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.venueCost = venueCost;
        this.organizer = organizer;
        this.serviceCost = 0;
        this.discount = 0;
    }

    // Constructor with services
    public Event(int eventId, String eventName, String location, String date,
                 int attendees, double venueCost, double serviceCost,
                 double discount, User organizer) {

        this(eventId, eventName, location, date, attendees, venueCost, organizer);
        this.serviceCost = serviceCost;
        this.discount = discount;
    }

    // Cost calculation using operators
    public double calculateTotalCost() {
        return venueCost + serviceCost - discount;
    }

    public void schedule() {
        System.out.println("Event scheduled on " + date);
    }

    public void reschedule(String newDate) {
        date = newDate;
        System.out.println("Event rescheduled to " + date);
    }

    public void cancel() {
        System.out.println("Event cancelled.");
    }

    public void showDetails() {
        System.out.println("Event: " + eventName);
        System.out.println("Organizer: " + organizer.getName());
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}


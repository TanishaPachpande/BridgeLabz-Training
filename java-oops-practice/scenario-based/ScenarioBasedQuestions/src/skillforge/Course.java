package skillforge;

public class Course {

    private String title;
    private Instructor instructor;
    private double rating;             // encapsulated
    private String[] modules;
    private final String[] reviews;     // read-only internal reviews

    // Default modules constructor
    public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = new String[]{"Introduction", "Basics", "Advanced"};
        this.reviews = new String[]{"Good course", "Well structured"};
        this.rating = 4.0;
    }

    // Custom modules constructor
    public Course(String title, Instructor instructor, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.reviews = new String[]{"Excellent content"};
        this.rating = 4.5;
    }

    // protected logic for rating
    protected void updateRating(double newRating) {
        if (newRating >= 0 && newRating <= 5) {
            rating = newRating;
        }
    }

    public double getRating() {
        return rating;
    }

    public String[] getReviews() {
        return reviews; // read-only access
    }

    public void displayCourse() {
        System.out.println("\nCourse: " + title);
        System.out.println("Instructor: " + instructor.name);
        System.out.println("Rating: " + rating);
        System.out.println("Modules:");
        for (String m : modules) {
            System.out.println("- " + m);
        }
    }


}

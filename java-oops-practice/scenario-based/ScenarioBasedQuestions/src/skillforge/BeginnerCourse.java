package skillforge;

public class BeginnerCourse extends Course {

    public BeginnerCourse(String title, Instructor instructor) {
        super(title, instructor);
    }

    public void generateCertificateFormat() {
        System.out.println("Beginner Level Certificate: Basic Completion");
    }
}



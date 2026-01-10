package skillforge;

public class AdvancedCourse extends Course {

    public AdvancedCourse(String title, Instructor instructor) {
        super(title, instructor);
    }

    public void generateCertificateFormat() {
        System.out.println("Advanced Level Certificate: Professional Expertise");
    }
}



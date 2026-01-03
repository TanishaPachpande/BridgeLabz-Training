package UniversityCourseEnrollmentSystem;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Undergraduate(101, "Tanisha");
        Student s2 = new Postgraduate(102, "Rahul", 3.2);

        Course c1 = new Course("CS101", "Data Structures");

        Faculty faculty = new Faculty("Dr. Mehta");

        // Polymorphic grading
        faculty.gradeStudent((Graded) s1, 55);
        faculty.gradeStudent((Graded) s2, 88);

        Enrollment e1 = new Enrollment(s1, c1);
        Enrollment e2 = new Enrollment(s2, c1);

        e1.showEnrollment();
        e2.showEnrollment();
    }
}

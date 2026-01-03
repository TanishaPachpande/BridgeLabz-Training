package UniversityCourseEnrollmentSystem;

abstract class Student {
    private int studentId;
    private String name;
    private double gpa;   // internal GPA (private)

    // Constructor without electives
    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = 0.0;
    }

    // Constructor with elective preference
    public Student(int studentId, String name, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
    }

    protected void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Public method to access transcript
    public String getTranscript() {
        return "Student: " + name + " | GPA: " + gpa;
    }

    public abstract void displayInfo();
}


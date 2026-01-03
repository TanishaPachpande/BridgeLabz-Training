package UniversityCourseEnrollmentSystem;

class Course {
    private String courseCode;
    private String courseName;

    public Course(String code, String name) {
        this.courseCode = code;
        this.courseName = name;
    }

    public void displayCourse() {
        System.out.println(courseCode + " - " + courseName);
    }
}

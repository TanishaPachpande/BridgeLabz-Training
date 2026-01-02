package com.objectmodeling.SchoolAndStudents;

public class Main {
    public static void main(String[] args) {

        School school = new School("Green Valley School");

        Student s1 = new Student(1, "Tanisha");
        Student s2 = new Student(2, "Amit");

        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enrollCourse(math);
        s1.enrollCourse(science);

        s2.enrollCourse(science);

        s1.viewCourses();
        s2.viewCourses();

        math.showEnrolledStudents();
        science.showEnrolledStudents();
    }
}


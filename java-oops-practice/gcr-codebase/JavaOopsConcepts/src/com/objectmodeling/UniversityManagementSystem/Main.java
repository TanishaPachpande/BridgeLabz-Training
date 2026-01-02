package com.objectmodeling.UniversityManagementSystem;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Tanisha");
        Student s2 = new Student(2, "Amit");

        Professor p1 = new Professor(101, "Dr. Sharma");

        Course java = new Course("Java Programming");
        Course dsa = new Course("Data Structures");

        s1.enrollCourse(java);
        s2.enrollCourse(java);
        s1.enrollCourse(dsa);

        p1.assignCourse(java);
        p1.assignCourse(dsa);

        java.showCourseDetails();
        dsa.showCourseDetails();

        s1.showCourses();
    }
}

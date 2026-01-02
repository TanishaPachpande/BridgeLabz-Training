package com.objectmodeling.UniversityManagementSystem;

import java.util.ArrayList;

class Student {
    private int studentId;
    private String studentName;
    private ArrayList<Course> courses;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.courses = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    // Association + Communication
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
        System.out.println(studentName + " enrolled in " + course.getCourseName());
    }

    public void showCourses() {
        System.out.println("\nStudent: " + studentName + " enrolled courses:");
        for (Course c : courses) {
            System.out.println(c.getCourseName());
        }
    }
}

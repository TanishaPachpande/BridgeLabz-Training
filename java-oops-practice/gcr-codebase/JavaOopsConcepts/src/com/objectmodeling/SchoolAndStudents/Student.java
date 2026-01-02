package com.objectmodeling.SchoolAndStudents;

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

    // Association method
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    public void viewCourses() {
        System.out.println("\nStudent: " + studentName);
        for (Course c : courses) {
            System.out.println("Enrolled in: " + c.getCourseName());
        }
    }
}


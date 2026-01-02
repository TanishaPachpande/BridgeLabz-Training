package com.objectmodeling.SchoolAndStudents;

import java.util.ArrayList;

class Course {
    private String courseName;
    private ArrayList<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showEnrolledStudents() {
        System.out.println("\nCourse: " + courseName);
        for (Student s : students) {
            System.out.println("Student: " + s.getStudentName());
        }
    }
}


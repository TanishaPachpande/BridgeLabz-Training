package com.objectmodeling.SchoolAndStudents;

import java.util.ArrayList;

class School {
    private String schoolName;
    private ArrayList<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        System.out.println("\nSchool: " + schoolName);
        for (Student s : students) {
            System.out.println("Student: " + s.getStudentName());
        }
    }
}


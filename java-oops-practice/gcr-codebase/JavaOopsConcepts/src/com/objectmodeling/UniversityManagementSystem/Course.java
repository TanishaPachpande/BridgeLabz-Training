package com.objectmodeling.UniversityManagementSystem;

import java.util.ArrayList;

class Course {
    private String courseName;
    private Professor professor;
    private ArrayList<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    // Aggregation: Student added
    public void addStudent(Student student) {
        students.add(student);
    }

    // Aggregation: Professor assigned
    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void showCourseDetails() {
        System.out.println("\nCourse: " + courseName);
        System.out.println("Professor: " +
                (professor != null ? professor.getProfessorName() : "Not Assigned"));

        System.out.println("Students Enrolled:");
        for (Student s : students) {
            System.out.println(s.getStudentName());
        }
    }
}


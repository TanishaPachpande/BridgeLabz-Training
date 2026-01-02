package com.objectmodeling.UniversityManagementSystem;

import java.util.ArrayList;

class Professor {
    private int professorId;
    private String professorName;
    private ArrayList<Course> courses;

    public Professor(int professorId, String professorName) {
        this.professorId = professorId;
        this.professorName = professorName;
        this.courses = new ArrayList<>();
    }

    public String getProfessorName() {
        return professorName;
    }

    // Association + Communication
    public void assignCourse(Course course) {
        courses.add(course);
        course.assignProfessor(this);
        System.out.println("Prof. " + professorName + " assigned to " + course.getCourseName());
    }
}


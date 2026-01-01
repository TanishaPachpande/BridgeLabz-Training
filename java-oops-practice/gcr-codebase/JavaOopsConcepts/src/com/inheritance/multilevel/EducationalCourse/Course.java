package com.inheritance.multilevel.EducationalCourse;

public class Course {
	protected String courseName;
	protected int duration;
	
	public Course(String courseName, int duration) {
		this.courseName = courseName;
		this.duration = duration;
	}
	
	void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}

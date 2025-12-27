package com.constructors.level1;

public class Course {
	// Instance variables
    String courseName;
    int duration;
    int fee;

    // Class variable (shared among all objects)
    static String instituteName = "";

    // Parameterized constructor
    public Course(String courseName, int duration, int fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee=fee;
    }

    // Instance method
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
    }

    // Class method
    public static void updateInstituteName(String updatedName) {
    	String instituteName=updatedName;
        System.out.println("The updated institute name is " + instituteName);
    }
    
    public static void main(String[] args) {
        Course c1 = new Course("Btech", 10, 5000);
        c1.displayCourseDetails();
        System.out.println();

        // Calling class method using class name
        Course.updateInstituteName("TIT Main");
    }
}

package com.inheritance.multilevel.EducationalCourse;

public class Main {

	public static void main(String[] args) {
		Course course = new Course("Java Basics", 40);
        Course onlineCourse = new OnlineCourse("Advanced Java", 60, "Udemy", true);
        Course paidCourse = new PaidOnlineCourse(
                "Full Stack Java",
                120,
                "Coursera",
                true,
                10000,
                20
        );

        course.displayCourseDetails();
        System.out.println("--------------------------");

        onlineCourse.displayCourseDetails();
        System.out.println("--------------------------");

        paidCourse.displayCourseDetails();
	}

}

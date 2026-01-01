package com.inheritance.multilevel.EducationalCourse;

public class PaidOnlineCourse extends OnlineCourse{
	private int fee;
	private int discount;
	
	public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, int fee,
			int discount) {
		super(courseName, duration, platform, isRecorded);
		this.fee = fee;
		this.discount = discount;
	}
	
	void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Course Fee: ₹" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: ₹" + (fee - (fee * discount / 100)));
        System.out.println("--------------------------");
    }
}

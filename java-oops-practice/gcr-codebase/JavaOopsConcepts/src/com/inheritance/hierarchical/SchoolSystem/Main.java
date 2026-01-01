package com.inheritance.hierarchical.SchoolSystem;

public class Main {

	public static void main(String[] args) {
		Teacher teacher = new Teacher("Mr. Sharma", 40, "Mathematics");
        Student student = new Student("Aarav", 16, "10th Grade");
        Staff staff = new Staff("Mrs. Patel", 35, "Administration");

        teacher.displayRole();
        student.displayRole();
        staff.displayRole();
	}

}

package com.constructors.level1;

public class Manager extends Employee {
	    String managerLevel;

	    public Manager(int employeeID, String department, double salary, String managerLevel) {
	        super(employeeID, department, salary);
	        this.managerLevel = managerLevel;
	    }

	    // Demonstrating access to public & protected members
	    public void displayManagerDetails() {
	        System.out.println("Employee ID: " + employeeID);     // public
	        System.out.println("Department: " + department);      // protected
	        System.out.println("Salary: ₹" + getSalary());        // private via getter
	        System.out.println("Manager Level: " + managerLevel);
	    }

	    // MAIN METHOD
	    public static void main(String[] args) {

	        Manager mgr = new Manager(
	                501,
	                "IT",
	                75000.0,
	                "Senior Manager"
	        );

	        mgr.displayManagerDetails();

	        // Modifying salary using public method
	        mgr.setSalary(85000.0);

	        System.out.println("\nAfter Salary Increment:");
	        mgr.displayManagerDetails();
	    }
}

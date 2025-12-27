package com.constructors.level1;

public class Vehicle {
	// Instance variable
	String ownerName;
    String vehicleType;

    // Class variable (shared among all objects)
    static int registrationFee = 0;

    // Parameterized constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    public void displayVehicleDetails(){
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
    }

    // Class method
    public static void updateRegistrationFee(int updatedRegistrationFee) {
    	registrationFee=updatedRegistrationFee;
        System.out.println("The updated registration fee is " + registrationFee);
    }
    
    public static void main(String[] args) {
    	Vehicle v1 = new Vehicle("Ashish", "two-wheeler");
        v1.displayVehicleDetails();
        System.out.println();

        // Calling class method using class name
        Vehicle.updateRegistrationFee(2000);
    }
}

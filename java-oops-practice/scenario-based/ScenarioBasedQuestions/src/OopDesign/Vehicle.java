package OopDesign;

public class Vehicle {

	private int vehicleNumber;
	public String model;
	
	public int getVehicleNumber() {
		return vehicleNumber;
	}
	
	public Vehicle(int vehicleNumber, String model) {
		this.vehicleNumber = vehicleNumber;
		this.model = model;
	}
	
	public void displayDetails() {
		System.out.println("Vehicle No: "+ getVehicleNumber());
		System.out.println("Model: "+model);
	}
}

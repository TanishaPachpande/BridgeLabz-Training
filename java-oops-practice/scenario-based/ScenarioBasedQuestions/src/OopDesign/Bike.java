package OopDesign;

public class Bike extends Vehicle {
	
	public boolean onGear;

	public Bike(int vehicleNumber, String model, boolean onGear) {
		super(vehicleNumber, model);
		this.onGear = onGear;
	}
	
}

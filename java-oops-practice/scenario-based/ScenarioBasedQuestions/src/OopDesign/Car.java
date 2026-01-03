package OopDesign;

public class Car extends Vehicle{

	public boolean isDiesel;
	
	public Car(int vehicleNumber, String model, boolean isDiesel) {
		super(vehicleNumber, model);
		this.isDiesel=isDiesel;	
    }
	
}
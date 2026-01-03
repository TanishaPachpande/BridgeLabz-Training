package cabbyGo;

public class Vehicle implements IRideService {
	private int vehicleNumber;
	private int capacity;
	public String type;
	
	public int getVehicleNumber() {
		return vehicleNumber;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public Vehicle(int vehicleNumber, int capacity, String type) {
		this.vehicleNumber = vehicleNumber;
		this.capacity = capacity;
		this.type = type;
	}

	@Override
	public void bookRide() {
		System.out.println("Your ride with "+ type + " is booked");
	}

	@Override
	public void endRide() {
		System.out.println("Your ride with "+ type + " has ended");
	}
	
	public void displayVehicleDetails() {
		System.out.println("Vehicle Number: "+ vehicleNumber);
		System.out.println("Capacity: "+ capacity);
		System.out.println("Type: "+ type);
	}
}

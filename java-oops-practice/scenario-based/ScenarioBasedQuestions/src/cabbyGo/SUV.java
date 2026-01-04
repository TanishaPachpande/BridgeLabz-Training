package cabbyGo;

public class Main {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle(1, 120, "SUV");
		Vehicle v2 = new Vehicle(2, 100, "Sedan");
		
		Driver d = new Driver("amit", 123, 5);
		
		Fare f = new Fare(50, 100);
		
		System.out.println("--------------------------------");
		v1.displayVehicleDetails();
		System.out.println("--------------------------------");
		v2.displayVehicleDetails();
		System.out.println("--------------------------------");
		d.displayDriverDetails();
		System.out.println("--------------------------------");
		f.calculateFare();
	}
}

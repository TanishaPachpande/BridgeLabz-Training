package OopDesign;

public class Main {
	public static void main(String[] args) {
		
		Vehicle b = new Bike(1, "model_xyz", true);
		Vehicle c = new Car(2, "model_abc", false);
		
		b.displayDetails();
		c.displayDetails();
	}
}

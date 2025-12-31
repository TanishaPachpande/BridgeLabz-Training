import java.util.Scanner;

public class BusRouteDistanceTracker{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("------------------------------------------------------------");
	System.out.println("          Welcome to Bus Route Distance Tracker             ");
	System.out.println("------------------------------------------------------------");

	String destination="Bhopal";
	int distance=0;
	boolean moving=true;
	while(moving){
		System.out.println("Destinations :");
		System.out.println("1. Indore");
		System.out.println("2. Dewas");
		System.out.println("3. Sehore");
		System.out.println("4. Stop the Bus");

		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();

		switch(choice){
			case 1:
				distance+=100;
				break;
			case 2:
				distance+=80;
				break;
			case 3:
				distance+=50;
				break;
			case 4:
				moving=false;
				break;
			default:
				System.out.println("Invalid input");
		}
		System.out.println("Current Distance: "+ distance);
		System.out.println("------------------------------------------------------------");
	}
	System.out.println("Total Distance travelled: "+distance);
}
}
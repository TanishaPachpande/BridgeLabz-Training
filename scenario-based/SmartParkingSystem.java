import java.util.Scanner;

public class SmartParkingSystem{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	// Options available to input
	System.out.println("1. Park the vehicle");
	System.out.println("2. Show Occupancy");
	System.out.println("3. Exit");
	System.out.println("Enter your choice: ");

	// Input the choice value
	int choice = input.nextInt();

	// Initially lets assume the total and vacant areas
	int total = 10;
	int vacantPlaces=4;

	// Run the loop until use enter choice 3 of exiting
	while(true){
		switch(choice){
			case 3: {
				System.out.println("Thanks, Please visit again!");
				break;
			}
			case 2:{
				if(vacantPlaces>0){
					System.out.println("Number of Occupancies available: "+ vacantPlaces);
				}else{
					System.out.println("Sorry! No Vacant Area available");
				}
				break;
			}
			case 1:{
				// Reducing vacancies count on parking
				vacantPlaces--;
				System.out.println("Thanks for parking!");
				break;
			}
			default:{
				System.out.println("Invalid Input, Please enter a valid option");
				break;
			}
		}

		// If entered 3 option then exit the program
		if(choice==3){
			break;
		}
		System.out.println("--------------------------------------------");

		// Input the next choice value
		System.out.println("Enter your choice: ");
		choice = input.nextInt();
	}
}
}
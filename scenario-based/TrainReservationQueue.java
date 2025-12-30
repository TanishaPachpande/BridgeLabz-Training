import java.util.Scanner;

public class TrainReservationQueue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalSeats = 5;   // available seats
        int choice;

        System.out.println(" Welcome to Train Reservation System ");

        while (true) {
            System.out.println("\n Available Seats: " + totalSeats);
            System.out.println("1. Book Ticket");
            System.out.println("2. Exit");

            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (totalSeats > 0){
                        totalSeats--;
                        System.out.println("1. AC");
             	    System.out.println("2. Non-AC");

		    System.out.print("Enter AC or Non-AC choice/option: ");
		    int choice2 = sc.nextInt();
		    switch(choice2){
             		case 1: 
				System.out.println("Successfully booked AC seat");
				break;
			case 2: 
				System.out.println("Successfully booked Non-AC seat");
				break;
			default: 
				System.out.println("Invalid input");
		    }
                    } else{
                        System.out.println(" No seats available. Booking closed.");
                        break;   // stop booking when seats are zero
                    }
                    break;

                case 2:
                    System.out.println(" Thank you for using Train Reservation System!");
                    return;

                default:
                    System.out.println(" Invalid choice. Please try again.");
            }

            if (totalSeats == 0) {
                System.out.println(" All seats are booked!");
                break;
            }
	    System.out.println("=================================================================");
        }
    }
}

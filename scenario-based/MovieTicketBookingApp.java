import java.util.Scanner;

public class MovieTicketBookingApp{

public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Welcome to Movie Ticket Booking App....");
	System.out.println("-------------------------------------------");

	while(true){
	System.out.println("1. Romantic");
	System.out.println("2. Thriller");
	System.out.println("3. Action");
	System.out.println("4. Exit");

	// Enter Movie Type
	System.out.println("Enter Movie Type: ");
	String movieType=sc.next().toLowerCase();
      
	int ticket=0;
	switch(movieType){
		case "romantic":
			ticket=110;
			break;

		case "thriller":
			ticket=150;
			break;

		case "action":
			ticket=130;
			break;

		case "exit":
			System.out.println("Thanks for using our app");
			return;
		default:
			System.out.println("Invalid Input");
	}

	// Taking seat type as input
	System.out.print("Enter Seat Type (gold/silver): ");
	String seatType=sc.next().toLowerCase();
	if(seatType.equals("gold")){
		ticket+=100;
	}else if(seatType.equals("silver")){
		ticket+=50;
	}
	else{
		System.out.println("invalid input");
	}

	// Taking seat type as input
	System.out.print("Enter snacks (drink/popcorn): ");
	String snacks=sc.next();
	if(snacks.equals("drink")){
		ticket+=20;
	}else if(snacks.equals("popcorn")){
		ticket+=40;
	}
	else{
		System.out.println("invalid input");
	}

	// Displaying result
	System.out.println("Total Ticket Price: "+ ticket);
	System.out.println("---------------------------------------------------");
	}	
}
}
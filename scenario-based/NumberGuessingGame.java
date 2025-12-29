import java.util.Scanner;

public class NumberGuessingGame{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	// Input a number for guess
	System.out.println("Guess a number between 1 and 100");
	int guess=input.nextInt();

	// Generating a random number
	int randomNumber= (int) (Math.random()*90)+10;

	int chances=5;

	// Running while loop until the chances get over
	do{
		if(guess<1 || guess>100){
			chances--;
			System.out.println("Invalid input, Please enter a valid input");
		}
		else if(guess==randomNumber){
			System.out.println("You Won!! ");
			break;
		}
		else if(guess>randomNumber){
			chances--;
			System.out.println("Guess is too high!");
		}
		else if(guess<randomNumber){
			chances--;
			System.out.println("Guess is too low!");
		}

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

		if(chances>0){
			// If chances are left, then enter a number again
			System.out.println("Guess a number between 1 and 100:");
			guess=input.nextInt();
		}else{
			// Break the loop if chances are over
			System.out.println("5 wrong attempts. GAME ENDED!");
			break;
		}
	}while(true);
}
}
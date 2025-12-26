import java.util.Scanner;

public class NumberGuessing{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	// Generate the number
	int generatedNumber = generateNumber();

	// Entering guess number
	System.out.println("Guess the number:");
	int guess = sc.nextInt();

	// Execute the loop until the guess is not reached
        while(!checkGuess(generatedNumber, guess)){
		guess = sc.nextInt();
	}

	// Displaying result after guessing
	System.out.println("You won");
}

// Function to generate a random number
public static int generateNumber(){
	int randomNumber = (int)(Math.random()*90)+10;
	return randomNumber;
}

// Function to check generated number
public static boolean checkGuess(int generatedNumber, int guess){
	if(generatedNumber==guess){
		return true;
	}else if(generatedNumber>guess){
		System.out.println("your guess is low");
		return false;
	}else{
		System.out.println("your guess is high");
		return false;
	}
}
}
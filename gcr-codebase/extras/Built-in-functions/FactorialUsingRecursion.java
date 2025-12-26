import java.util.Scanner;

public class FactorialUsingRecursion{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	// Input a number
	int number = sc.nextInt();

	// Displaying result
	System.out.println("The factorial of number "+number+" is "+findFactorial(number));
}

// Find the factorial of a number
public static int findFactorial(int number){
	if(number==0){
		return 1;
	}
	return number*findFactorial(number-1);
}

}
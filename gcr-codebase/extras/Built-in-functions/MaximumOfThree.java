import java.util.Scanner;

public class MaximumOfThree{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	// Input three integer values
	int number1 = sc.nextInt();
	int number2 = sc.nextInt();
	int number3 = sc.nextInt();

	// Displaying result
	System.out.println("The maximum of three numbers is "+findMaximum(number1, number2, number3));
	}

// Funtion to find the maximum number out of three
public static int findMaximum(int number1, int number2, int number3){
	int max=Math.max(number1, Math.max(number2, number3));
	return max;
}

}
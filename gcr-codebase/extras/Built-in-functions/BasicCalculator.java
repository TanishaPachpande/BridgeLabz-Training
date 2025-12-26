import java.util.Scanner;

public class BasicCalculator{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	// Input two values and a operator
	System.out.println("Enter two values as operands");
	double number1 = sc.nextDouble();
	double number2 = sc.nextDouble();
	System.out.println("Enter a operator for operation");
	char operator = sc.next().charAt(0);

	// Performing operation based on the operator entered and displaying result
	if(operator == '+'){
		System.out.println(findingSum(number1, number2));
	}else if(operator == '-'){
		System.out.println(findingDifference(number1, number2));
	}else if(operator == '*'){
		System.out.println(findingProduct(number1, number2));
	}else if(operator == '/'){
		System.out.println(findingQuotient(number1, number2));
	}else{
		System.out.println("INVALID INPUT");
	}
}

// Function to find sum of two numbers
public static double findingSum(double number1, double number2){
	return (number1+number2);
}

// Function to find difference between two numbers
public static double findingDifference(double number1, double number2){
	return (number1-number2);
}

// Function to find product of two numbers
public static double findingProduct(double number1, double number2){
	return (number1*number2);
}

// Function to divide two numbers
public static double findingQuotient(double number1, double number2){
	return (number1/number2);
}
}
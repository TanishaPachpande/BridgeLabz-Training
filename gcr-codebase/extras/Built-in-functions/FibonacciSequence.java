import java.util.Scanner;

public class FibonacciSequence{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	// Input an integer value
	int number = sc.nextInt();

	// Displaying result
	printFibonacci(number);
}

// Function to print the Fibonacci series
public static void printFibonacci(int number){
	int a=0;
        int b=1;
        System.out.print(a+" "+b+" ");
	number=number-2;
	while(number>0){
		int c=a+b;
		System.out.print(c+" ");
		a=b;
		b=c;
		number--;
	}
}

}
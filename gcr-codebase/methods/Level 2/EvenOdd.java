import java.util.Scanner;

public class EvenOdd{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	// Create an array 5 numbers.
 	int[] numbers = new int[5];

	// Check for positives, negatives, evens, and odds
	for(int i=0;i<numbers.length;i++){
	   numbers[i]=input.nextInt();
	   if(isPositive(numbers[i])){
		System.out.println("The number "+numbers[i]+" is positive");
	   }else{
	        System.out.println("The number "+numbers[i]+" is negative");
	   }

	   if(isEven(numbers[i])){
		System.out.println("The number "+numbers[i]+" is even");
	   }else{
	        System.out.println("The number "+numbers[i]+" is odd");
	   }

	}
	
	// Compare the first and last element.
	compare(numbers[0], numbers[numbers.length-1]);
}

// Find the positive number.
public static boolean isPositive(int number){
	if(number>0){
	     return true;
        }else{
	     return false;
	}
}

// Find the even number.
public static boolean isEven(int number){
	if(number%2==0){
		return true;
	}else{
		return false;
	}
}

// Function to compare the first and last element.
public static void compare(int first, int last){
	if(first==last){
		System.out.println("First element is equal to the last element");
	}else if(first>last){
		System.out.println("First element is greater than last element");
	}else{
		System.out.println("Last element is greater than first element");
	}
}
}
import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Input the number.
        int number = input.nextInt();


        // Check for a natural number.
        if(number<=0){
            System.out.println("The number is not a natural number");
        }else{

        	// Find the sum of natural numbers.
        	int sumOfNaturalNumbers = findSum(number);

        	// Display the result.
        	System.out.println("The Sum of Natural Numbers is " + sumOfNaturalNumbers);
        }
    }

    // Method to find the sum of natural numbers.
    public static int findSum(int number){
        int sum=0;
        for(int i=1;i<=number;i++){
             sum+=i;
        }
        return sum;
    }
}

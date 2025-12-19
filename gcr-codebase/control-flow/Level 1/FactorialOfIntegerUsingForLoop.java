import java.util.Scanner;

public class FactorialOfIntegerUsingForLoop{
    public static void main(String[] args) {

        // Create a scanner object.
        Scanner input = new Scanner(System.in);

        // Input a integer value.
        int number=input.nextInt();
        int factorial=1;
        
        // Find the factorial of a natural number using for loop.
        if(number>0){
             for(int i=number;i>=1;i--){
                   factorial*=i;

             }

             // Display the result.
             System.out.println("The factorial is "+ factorial);
        }
        else{
             System.out.println("The entered number is negative. Cannot find factorial");

        }
}
}

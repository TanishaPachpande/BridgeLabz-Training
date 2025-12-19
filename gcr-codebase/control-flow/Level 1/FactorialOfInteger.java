import java.util.Scanner;

public class FactorialOfInteger{
    public static void main(String[] args) {

        // Create a scanner object.
        Scanner input = new Scanner(System.in);
        
        // Input a integer value.
        int number=input.nextInt();
        int factorial=1;
        
        // Find the factorial of a natural number using while loop.
        if(number>0){
             while(number>=1){
                   factorial*=number;
                   number--;
             }

             // Display the result.
             System.out.println("The factorial is "+ factorial);
        }
        else{
             System.out.println("The entered number is negative. Cannot find factorial");

        }
}
}

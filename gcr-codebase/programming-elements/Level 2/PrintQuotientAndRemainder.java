import java.util.Scanner;

public class PrintQuotientAndRemainder{
  public static void main(String[] args){

        Scanner input= new Scanner(System.in);

        // Taking two numbers in input.
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        // Calculating the quotient and remainder.
        int quotient = number1/number2;
        int remainder = number1%number2;

        // Display the result.
        System.out.println("The Quotient is "+ quotient+ " and Remainder is "+remainder+" of two numbers "+number1+" and "+number2);
        
  }
}
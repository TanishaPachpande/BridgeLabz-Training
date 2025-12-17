import java.util.Scanner;

public class BasicCalculator{
  public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        // Taking two numbers as user input.
        int number1 = input.nextInt();
        int number2 = input.nextInt(); 

        // Performing all arithmetic operations.
        int addition = number1+number2;
        int subtraction = number2-number1;
        int multiplication= number1*number2;
        double division = number1/number2;

        // Display the result
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+ number1 +" and "+number2+" is "+ addition+ ", "+ subtraction+", "+ multiplication+",and "+ division);

        
  }
}
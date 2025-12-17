import java.util.Scanner;

public class OperationsOnDouble{
  public static void main(String[] args){

        Scanner input= new Scanner(System.in);

        // Taking three double values in user input.
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // Calculating the values of Double Operations.
        double operation1 = a+b*c;
        double operation2 = a*b+c;
        double operation3 = c+a/b;
        double operation4 = a%b+c;

        // Display the result.
        System.out.println("The results of Double Operations are "+ operation1 +", "+ operation2 +", "+ operation3+",and "+ operation4);
        
  }
}
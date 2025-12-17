import java.util.Scanner;

public class OperationsOnIntegers{
  public static void main(String[] args){

        Scanner input= new Scanner(System.in);

        // Taking three integers in user input.
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // Calculating the values of Integer Operations.
        int operation1 = a+b*c;
        int operation2 = a*b+c;
        int operation3 = c+a/b;
        int operation4 = a%b+c;

        // Display the result.
        System.out.println("The results of Int Operations are "+ operation1 +", "+ operation2 +", "+ operation3+",and "+ operation4);
        
  }
}
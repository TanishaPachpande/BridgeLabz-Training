import java.util.Scanner;

public class SumOfNaturalNumbers{
public static void main(String[] args){

     // Create a scanner object.
     Scanner input = new Scanner(System.in);

     // input an integer value.
     int number = input.nextInt();
     int sumOfNumbers=0;

     // Find sum of natural numbers through formulae and display the result.
     if(number>=0){
         sumOfNumbers=number*(number+1)/2;
         System.out.println("The sum of "+number+" natural numbers is "+sumOfNumbers);
     }else{
         System.out.println("The number "+number+" is not a natural number");
     }
}
}
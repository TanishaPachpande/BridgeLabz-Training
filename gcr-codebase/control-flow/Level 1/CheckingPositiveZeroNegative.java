import java.util.Scanner;

public class CheckingPositiveZeroNegative{
public static void main(String[] args){
     
     // Create a scanner object.
     Scanner sc = new Scanner(System.in);

     // Input a number value 
     int number = sc.nextInt();


     // Check if a number is positive, negative, or zero.
     if(number==0){
         System.out.println("ZERO");
     }else if(number>0){
         System.out.println("POSITIVE");
     }else{
         System.out.println("NEGATIVE");
     }
}
}
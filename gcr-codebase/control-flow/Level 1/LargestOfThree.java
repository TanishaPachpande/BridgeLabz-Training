import java.util.Scanner;

public class LargestOfThree{
public static void main(String[] args){

     // Create a scanner object.
     Scanner sc = new Scanner(System.in);

     // Input three integer values.
     int number1 = sc.nextInt();
     int number2 = sc.nextInt();
     int number3 = sc.nextInt();

     // Check the largest number out of three input numbers and display the result.
     if(number1>number2 && number1>number3){
          System.out.println("Is the first number the largest? YES");
     }
     else{
          System.out.println("Is the first number the largest? NO");

     }

     if(number2>number1 && number2>number3){
          System.out.println("Is the second number the largest? YES");
     }
     else{
          System.out.println("Is the socond number the largest? NO");

     }

     if(number3>number1 && number3>number2){
          System.out.println("Is the third number the largest? YES");
     }
     else{
          System.out.println("Is the third number the largest? NO");
     }
}
}
import java.util.Scanner;

public class CheckFirstSmallest{
public static void main(String[] args){
     
     // Create a scanner object.
     Scanner sc = new Scanner(System.in);

     // Input three integer values. 
     int number1 = sc.nextInt();
     int number2 = sc.nextInt();
     int number3 = sc.nextInt();

     // Check if the first number is the smallest or not and display the result.
     if(number1<number2 && number1<number3){
          System.out.println("Is the first number the smallest? YES");
     }else{
          System.out.println("Is the first number the smallest? NO");
     }
}
}
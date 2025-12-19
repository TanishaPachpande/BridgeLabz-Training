import java.util.Scanner;

public class DivisibilityByFive{
public static void main(String[] args){

     // Create a scanner object.
     Scanner sc = new Scanner(System.in);

     // Input a integer value.
     int number = sc.nextInt();

     // Check if the number is divisible by 5 or not and display the result.
     if(number%5==0){
          System.out.println("Is the number "+ number+" divisible by 5? YES");
     }else{
          System.out.println("Is the number "+ number+" divisible by 5? NO");
     }
}
}
import java.util.Scanner;

public class ConvertHeight{
  public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        // Taking user input of height in centimeters.
        double heightInCm = input.nextDouble();

        // Calculating height in inches and feets.
        double inches= heightInCm/2.54;
        double feets = inches/12;

        // Display the result.
        System.out.println("Your Height in cm is "+heightInCm + " while in feet is " + feets + " and inches is " + inches);
  }
}
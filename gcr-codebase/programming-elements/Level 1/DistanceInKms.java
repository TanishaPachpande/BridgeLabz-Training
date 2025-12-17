import java.util.Scanner;
public class DistanceInKms{
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      // Taking user input of distance in kilometers.
      double distanceInKms = input.nextDouble();

      // converting Kilometers into miles.
      double distanceInMiles = distanceInKms * 0.6;


      // Display the result
      System.out.println("The total miles is "+ distanceInMiles +" mile for the given "+ distanceInKms +" km");
  }
}
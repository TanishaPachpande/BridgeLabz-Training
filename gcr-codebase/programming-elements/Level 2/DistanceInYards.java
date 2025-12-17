import java.util.Scanner;

public class DistanceInYards{
  public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        // Taking user input of distance in feets.
        int distanceInFeets = input.nextInt();

        // Converting distance in feets into distance in yards and miles.
        double distanceInYards= distanceInFeets/3;
        double distanceInMiles= distanceInYards/1760;

        // Display the result.
        System.out.println("The distance is "+distanceInYards+" yards and "+distanceInMiles+" miles");
        
  }
}
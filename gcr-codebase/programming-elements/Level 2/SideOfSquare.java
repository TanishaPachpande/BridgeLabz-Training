import java.util.Scanner;

public class SideOfSquare{
  public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        // Taking perimeter of square as user input.
        int perimeterOfSquare = input.nextInt();

        // Finding the side-length of a square from given perimeter.
        int sideOfSquare= perimeterOfSquare/4;

        // Display the result.
        System.out.println("The Length of side is "+ sideOfSquare+ " whose perimeter is "+ perimeterOfSquare);

        
  }
}
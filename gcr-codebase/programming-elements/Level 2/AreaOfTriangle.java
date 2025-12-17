import java.util.Scanner;

public class AreaOfTriangle{
  public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        // Taking user input of base and height.
        int base = input.nextInt();
        int height = input.nextInt();

        // Calculating area in cms and inches.
        double areaInCm= 0.5 * base * height;
        double areaInInches= areaInCm / (2.54*2.54);

        // Display the result
        System.out.println("The Area of Triangle in sq in is "+ areaInInches+" and sq cm is "+ areaInCm);
        
  }
}
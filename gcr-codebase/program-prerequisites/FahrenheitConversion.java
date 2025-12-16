import java.util.Scanner;
public class FahrenheitConversion{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter temperature in celsius:");
      int tempC=sc.nextInt();
      System.out.println("Temp in Fahrenheit:" + fahrenheit(tempC));
   }
   public static double fahrenheit(int tempC){
      double ans= (1.8*tempC) + 32;
      return ans;
   }
}
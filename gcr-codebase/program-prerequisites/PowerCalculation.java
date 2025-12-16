import java.util.Scanner;

public class PowerCalculation{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter base and exponent:");
     int base=sc.nextInt();
     int exp=sc.nextInt();
     System.out.println((int)Math.pow(base,exp));
  }
}
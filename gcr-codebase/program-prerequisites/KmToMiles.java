import java.util.Scanner;
public class KmToMiles{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter distance in Km:");
     int distKm=sc.nextInt();
     System.out.println("Distance in miles: "+ convertKmToMiles(distKm));
  }
  public static double convertKmToMiles(int distKm){
     return (distKm*0.621371);
  }
}
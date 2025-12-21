import java.util.Scanner;

public class UnitConvertor{
   public static void main(String[] args){
        Scanner input = new Scanner(System.in);
	
        // Input the distance values
        System.out.println("Enter in km");
        int km = input.nextInt();

	System.out.println("Enter in miles");
        int miles = input.nextInt();

	System.out.println("Enter in meters");
        int meters = input.nextInt();

	System.out.println("Enter in feets");
        int feets = input.nextInt();

        // Display the results.
        System.out.println("Km in Miles is: "+convertKmToMiles(km));
	System.out.println("Miles in Km is: "+convertMilesToKm(miles));
	System.out.println("Meters in Feets is: "+convertMetersToFeet(meters));
	System.out.println("Feets in Meters is: "+convertFeetToMeters(feets)); 

   }

   // Method to convert Km to miles.
   public static double convertKmToMiles(double km){
           return km*0.621371;
   }

   // Method to convert miles to Km.
   public static double convertMilesToKm(double miles){
	   return miles*1.60934;
   }

   // Method to convert Meters to Feets.
   public static double convertMetersToFeet(double meters){
	   return meters*3.28084;
   }

   // Method to convert Feets to Meters.
   public static double convertFeetToMeters(double feets){
	   return feets*0.3048;
   }
}







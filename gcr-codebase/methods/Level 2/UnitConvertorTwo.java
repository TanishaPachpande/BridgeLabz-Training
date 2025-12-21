import java.util.Scanner;

public class UnitConvertorTwo{
   public static void main(String[] args){
        Scanner input = new Scanner(System.in);
	
        // Input the distance values
        System.out.println("Enter in yards");
        int yards = input.nextInt();

	System.out.println("Enter in feets");
        int feets = input.nextInt();

	System.out.println("Enter in meters");
        int meters = input.nextInt();

	System.out.println("Enter in inches");
        int inches = input.nextInt();

        // Display the results.
        System.out.println("yards in feets is: "+convertYardsToFeets(yards));
	System.out.println("feets in yards is: "+convertFeetsToYards(feets));
	System.out.println("Meters in inches is: "+convertMetersToInches(meters));
	System.out.println("inches in Meters is: "+convertInchesToMeters(inches));
        System.out.println("inches in Cms is: "+convertInchesToCms(inches)); 
   }

   // Method to convert Yards to Feets.
   public static double convertYardsToFeets(double yards){
           return yards*3;
   }

   // Method to convert Feets to Yards.
   public static double convertFeetsToYards(double feets){
	   return feets*0.333333;
   }

   // Method to convert Meters to Inches.
   public static double convertMetersToInches(double meters){
	   return meters*39.3701;
   }

   // Method to convert Inches to Meters.
   public static double convertInchesToMeters(double inches){
	   return inches*0.0254;
   }

   // Method to convert Inches to Cms.
   public static double convertInchesToCms(double inches){
	   return inches*2.54;
   }
}







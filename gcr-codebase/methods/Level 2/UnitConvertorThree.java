import java.util.Scanner;

public class UnitConvertorThree{
   public static void main(String[] args){
        Scanner input = new Scanner(System.in);
	
        // Input the unit values
        System.out.println("Enter in fahrenheit");
        int fahrenheits = input.nextInt();

	System.out.println("Enter in celsius");
        int celsius = input.nextInt();

	System.out.println("Enter in pounds");
        int pounds = input.nextInt();

	System.out.println("Enter in kilograms");
        int kilograms = input.nextInt();

        System.out.println("Enter in gallons");
        int gallons = input.nextInt();

        System.out.println("Enter in liters");
        int liters = input.nextInt();

        // Display the results.
        System.out.println("fahrenheit in celsius is: "+convertFahrenheitToCelsius(fahrenheits));
	System.out.println("celsius in fahrenheit is: "+convertCelsiusToFahrenheit(celsius));
	System.out.println("pounds in kilograms is: "+convertPoundsToKilograms(pounds));
	System.out.println("kilograms in pounds is: "+convertKilogramsToPounds(kilograms));
        System.out.println("gallons in liters is: "+convertGallonsToLiters(gallons));
        System.out.println("liters in gallons is: "+convertLitersToGallons(liters)); 
   }

   // Method to convert Farhenheit to Celsius.
   public static double convertFarhenheitToCelsius(double farhenheit){
           double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
   }

   // Method to convert Celsius to Fahrenheit.
   public static double convertCelsiusToFahrenheit(double celsius){
	   double celsius2farhenheit = (celsius * 9 / 5) + 32;
   }

   // Method to convert Pounds to Kilograms.
   public static double convertPoundsToKilograms(double pounds){
	   double pounds2kilograms = 0.453592;
   }

   // Method to convert Kilograms to Pounds.
   public static double convertKilogramsToPounds(double kilograms){
	   double kilograms2pounds = 2.20462; 
   }

   // Method to convert Gallons to Liters.
   public static double convertGallonsToLiters(double gallons){
	   double gallons2liters = 3.78541;
   }

   // Method to convert Liters to Gallons.
   public static double convertLitersToGallons(double liters){
	   double liters2gallons = 0.264172;
   }

}







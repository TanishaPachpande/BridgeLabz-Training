import java.util.Scanner;

public class WindChill{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        // Input the values of temperature and wind speed.
        int temperature = input.nextInt();
        int windSpeed = input.nextInt();

        // Calculate the wind chill through method.
        double windChill = calculateWindChill(temperature, windSpeed);

        // Display the result.
        System.out.println("The wind chill temperature is "+windChill);
    }

    // Method to find the wind chill.
    public static double calculateWindChill(double temperature, double windSpeed){
        double windChill= 35.74 + 0.6215 * temperature + (0.4275*temperature - 35.75)* Math.pow(windSpeed, 0.16);
        return windChill;
    }
}

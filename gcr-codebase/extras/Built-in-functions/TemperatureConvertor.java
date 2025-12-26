import java.util.Scanner;

public class TemperatureConvertor{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	// Input two double type values of temperature
	double celsiusTemperature = sc.nextDouble();
	double fahrenheitTemperature = sc.nextDouble();

	// Displaying result
	System.out.println("The temperature in Celsius is "+celsiusTemperature+" and in Fahrenheit is "+celsiusToFahrenheit(celsiusTemperature));
	System.out.println("The temperature in Fahrenheit is "+fahrenheitTemperature+" and in Celsius is "+fahrenheitToCelsius(fahrenheitTemperature));
	
}

// Converting temperature in celsius into fahrenheit
public static double celsiusToFahrenheit(double celsius){
	double fahrenheitTemperature=(1.8*celsius)+32;
	return fahrenheitTemperature;
}

// Converting temperature in fahrenheit into celsius
public static double fahrenheitToCelsius(double fahrenheit){
	double celsiusTemperature=(fahrenheit-32)*0.55;
	return celsiusTemperature;
}
}
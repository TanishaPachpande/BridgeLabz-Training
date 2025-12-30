import java.util.Scanner;

public class TemperatureLogger{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	// Number of days in week are 7
	int days = 7;

	// Input the temperatures over 7 days
	double[] temperatures = new double[days];
	for(int i=0;i<days;i++){
		System.out.println("Enter temperature of day in Celsius"+(i+1));
		temperatures[i]=sc.nextDouble();
	}

	System.out.println("**********************************************");
	// Finding sum of temperatures
	double sum=findSum(temperatures);

	// Finding average of temperatures
	double average = sum/days;

	// Finding maximum temperature
	double max=findMax(temperatures);

	displayResult(average, max);

}

// Displaying result
public static void displayResult(double average, double max){
	System.out.print("The Average Temperature is ");
	System.out.printf(" %.2f", average);
	System.out.println();
	System.out.println("The Maximum Temperature is "+ max);
}

// Function to find sum of all temperatures
public static double findSum(double[] temperatures){
	double sum=0;
	for(int i=0; i<temperatures.length; i++){
               sum+=temperatures[i];
	}
	return sum;
}

// Function to find maximum temperature
public static double findMax(double[] temperatures){
	double max=Double.MIN_VALUE;
	for(int i=0; i<temperatures.length; i++){
               if(max<=temperatures[i]){
			max=temperatures[i];
		}
	}
	return max;
}

}
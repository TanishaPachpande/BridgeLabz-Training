import java.util.Scanner;

public class GCDandLCM{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	// Input two numbers
	int number1 = sc.nextInt();
	int number2 = sc.nextInt();

	// Displaying result
	System.out.println("The GCD is "+findGCD(number1, number2));
	System.out.println("The LCM is "+(number1*number2)/findGCD(number1, number2));
}

// Find the GCD of both numbers
public static int findGCD(int number1, int number2){
	int n=number1;
	int gcd=0;
	if(number1>number2){
		n=number2;
	}else{
		n=number1;
	}

	for(int i=1;i<=n;i++){
		if(number1%i==0 && number2%i==0){
			gcd=i;
		}
	}
	return gcd;
}
}
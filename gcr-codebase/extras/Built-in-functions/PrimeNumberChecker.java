import java.util.Scanner;

public class PrimeNumberChecker{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	// Input an integer value
	int number = sc.nextInt();

	// Displaying result
	if(checkPrime(number)){
		System.out.println("The number "+number+" is Prime");
	}else{
		System.out.println("The number "+number+" is Not Prime");
	}
}

// Check for a prime number
public static boolean checkPrime(int number){
	int i=2;
	while(i*i<=number){
		if(number%i==0){
			return false;
		}
		i++;
	}
	return true;
}

}
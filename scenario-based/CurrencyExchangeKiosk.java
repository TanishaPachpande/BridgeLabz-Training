import java.util.Scanner;

public class CurrencyExchangeKiosk{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("------------------------------------------------------------");
	System.out.println("            Welcome to Currency Exchange Kiosk             ");
	System.out.println("------------------------------------------------------------");

	
	System.out.print("Enter amount in INR: ");
	int amountINR= sc.nextInt();


	char choice;
	do{
	System.out.print("\nEnter Target currency (USD, EUR, JPY, AUD): ");
	String targetCurrency= sc.next().toUpperCase();


	switch(targetCurrency){
		case "USD":
			System.out.printf("%d INR in USD are %.4f \n",amountINR, (amountINR*0.011));
			break;
		case "EUR":
			System.out.printf("%d INR in EUR are %.4f \n",amountINR, (amountINR*0.0095));
			break;
		case "JPY":
			System.out.printf("%d INR in JPY are %.4f \n",amountINR, (amountINR*1.74));
			break;
		case "AUD":
			System.out.printf("%d INR in AUD are %.4f \n",amountINR, (amountINR*0.017));
			break;
		default:
			System.out.println("Invalid input");	
	}
	System.out.println("------------------------------------------------------------");
	System.out.println("Do you want to convert INR to another currency? (y/n): ");
	choice = sc.next().charAt(0);
	}while(choice=='y' || choice=='Y');
}
}
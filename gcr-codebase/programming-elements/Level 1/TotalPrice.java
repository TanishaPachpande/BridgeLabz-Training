import java.util.Scanner;

public class TotalPrice{
  public static void main(String[] args){

        Scanner input= new Scanner(System.in);

        // Taking user input of unit price and quantity.
        int unitPrice = input.nextInt();
        int quantity= input.nextInt();

        // Calculating the total price.
        int totalPurchase = unitPrice*quantity;

        // Display the result.
        System.out.println("The total purchase price is INR "+ totalPurchase +" if the quantity is "+quantity+" and unit price is INR "+ unitPrice);
        
  }
}
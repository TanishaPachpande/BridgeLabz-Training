import java.util.Scanner;

public class FinalDiscountedFee{
  public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        // Taking user input of student fee and discount percent.
        int studentFee = input.nextInt();
        int discountPercent= input.nextInt();

        // Calculating discount amount and fee to pay after subtracting discount.
        int discount = discountPercent*studentFee/100;
        int discountedFee = studentFee - discount;

        // Display the result
        System.out.println("The discount amount is INR "+ discount + " and final discounted fee is INR "+ discountedFee);
        
  }
}
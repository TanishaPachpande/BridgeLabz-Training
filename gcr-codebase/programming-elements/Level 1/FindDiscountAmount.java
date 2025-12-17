public class FindDiscountAmount{
  public static void main(String[] args){

     // Taking fee and discount percent in input.
     int fee = 125000;
     int discountPercent= 10;

     // Calculating the discount and fee to pay after discount.
     int discount = discountPercent*fee/100;
     int discountedFee = fee - discount;


     // Display the result.
     System.out.println("The discount amount is INR "+ discount + " and final discounted fee is INR "+ discountedFee);
  }
}
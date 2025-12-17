public class CalculateProfitLossPercentage{
 public static void main(String[] args){

    // Assigned inputs.
    int costPrice = 129;
    int sellingPrice = 191;

    // Calculating profit and profitPercentage.
    int profit = sellingPrice-costPrice;
    double profitPercentage = (double)profit/costPrice*100;


    // Display the result.
    System.out.println("The Cost Price is INR "+ costPrice + " and Selling Price is INR "+ sellingPrice + "\nThe Profit is INR " +  profit + " and the Profit Percentage is "+ profitPercentage);
 }
}
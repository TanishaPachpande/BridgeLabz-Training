import java.util.Scanner;

public class SumOfNaturalNumbers{
public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         
         // Input an integer value.
         int number=input.nextInt();

	 // Check for a Natural Number.
         if(number<=0){
              System.out.println("Not a Natural Number");
         }else{
               // Finding the sum through formula.
               int sumThroughFormula= findThroughFormula(number);

               // Finding the sum through recursion.
               int sumThroughRecursion= findThroughRecursion(number);

               // Comparing the sums and Display the result.
               if(sumThroughRecursion==sumThroughFormula){
                         System.out.println("The result is same");
               }else{
                         System.out.println("The result is not same");
               }
         }  
}

// Function to find sum through formula.
public static int findThroughFormula(int number){
      return (number*(number+1))/2;
}

// Function to find sum through recursion.
public static int findThroughRecursion(int number){
      if(number==0){
         return 0;
      }
      return number+findThroughRecursion(number-1);
}
}
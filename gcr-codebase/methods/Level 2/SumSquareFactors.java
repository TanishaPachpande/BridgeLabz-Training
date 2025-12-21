import java.util.Scanner;

public class SumSquareFactors{
public static void main(String[] args){
   Scanner input = new Scanner(System.in);

   // Input the integer value.
   int number = input.nextInt();
 
   // Find factors.
   int[] factorsArray=findFactors(number);

   // Find the sum of all factors.
   int sum = sumOfFactors(factorsArray);

   // Find the product of all factors.
   int product = productOfFactors(factorsArray);

   // Find the sum of square of all factors.
   int sumOfSquares = sumOfSquares(factorsArray);

   // Display the result.
   System.out.println("The sum of factors is "+ sum);
   System.out.println("The product of factors is "+ product);
   System.out.println("The sum of square of factors is "+ sumOfSquares);
}

// Function to find factors of a number.
public static int[] findFactors(int number){
      int c=0;
      for(int i=1;i<=number;i++){
            if(number%i==0){
                 c++;
            }
      }
 
      int[] factors= new int[c];
      int index=0;
      for(int i=1;i<=number;i++){
            if(index<c){
            if(number%i==0){
                 factors[index++]=i;
            }
            }
      }
      return factors;
}

// Function to find sum of all factors.
public static int sumOfFactors(int[] factors){
     int sum=0;
     for(int i=0;i<factors.length;i++){
         sum+=factors[i];
     }
     return sum;
}

// Function to find product of all factors.
public static int productOfFactors(int[] factors){
     int product=1;
     for(int i=0;i<factors.length;i++){
         product*=factors[i];
     }
     return product;
}

// Function to find sum of square of all factors.
public static int sumOfSquares(int[] factors){
     int sum=0;
     for(int i=0;i<factors.length;i++){
         sum+=Math.pow(factors[i],2);
     }
     return sum;
}
}
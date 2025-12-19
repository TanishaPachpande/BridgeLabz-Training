import java.util.Scanner;

public class PositiveNegativeZero{
public static void main(String[] args){

  // Create a scanner object.
  Scanner input = new Scanner(System.in);

  // Create an array of 5 numbers.
  int[] numbers = new int[5];

  // Input the five numbers, and check for the positive, negative and zeroes.
  for(int i=0;i<numbers.length;i++){
     numbers[i]=input.nextInt();
     if(numbers[i]>0){
        if(numbers[i]%2==0){
            System.out.println("Even Positive Number");
        }else{
            System.out.println("Odd Positive Number");
        }
     }else if(numbers[i]==0){
         System.out.println("Zero");
     }
     else{
         System.out.println("Negative");
     }
  }

  // Compare the first and last numbers and display the result.
  if(numbers[0]==numbers[numbers.length-1]){
         System.out.println("The first and last numbers are equal");
  }else if(numbers[0]>numbers[numbers.length-1]){
         System.out.println("The first number is greater than last number");
  }else{
         System.out.println("The first number is less than last number");
   }
}
}
import java.util.Scanner;

public class SumNaturalNumbersUsingForLoop{
    public static void main(String[] args) {

        // Create a scanner object.
        Scanner input = new Scanner(System.in);

        // Input an integer value.
        int number=input.nextInt();
        int sum=0;
        int copyNumber = number;

        // Find the sum of n natural numbers using for loop.
        if(number>=1){
             for(int i=number;i>=1;i--){
                 sum+=i;
             }
        }

        // Find the sum through formulae, that is n*(n+1)/2.
        int sumThroughFormulae = copyNumber*(copyNumber+1)/2;

        // Compare and display the result.
        if(sum==sumThroughFormulae){
            System.out.println("Same results, that is "+sum);
        }else{
            System.out.println("Not Same results. Formula based sum is "+sumThroughFormulae+" and the sum using while loop is "+ sum);
         }
    }
}

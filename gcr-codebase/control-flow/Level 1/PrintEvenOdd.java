import java.util.Scanner;

public class PrintEvenOdd{
    public static void main(String[] args) {

        // Create a scanner object.
        Scanner input = new Scanner(System.in);

        // Input a integer value.
        int number=input.nextInt();
        
        // Print the even and odd numbers. 
        if(number>0){
             for(int i=1;i<=number;i++){
                   if(i%2==0){
                        System.out.println("The number "+i+" is even");
                   }else{
                        System.out.println("The number "+i+" is odd");
                   }
             }
        }else{
             System.out.println("The entered number is not a natural number.");

        }
}
}

import java.util.Scanner;

public class MultiplicationTable{
    public static void main(String[] args) {

        // Create a scanner object.
        Scanner input = new Scanner(System.in);
        
        // Input a integer value.
        int number = input.nextInt();

        // Check if the number is between 6 and 9, if yes then print the table as output.
        if(number>=6 && number<=9){
             for(int i=1;i<=10;i++){
                      System.out.println(number+ " * " + i + " = "+ number*i);
             }
        }else{
               System.out.println("Enter number in range of 6 to 9");
        }
    }
}

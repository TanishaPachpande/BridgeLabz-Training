import java.util.Scanner;

public class MaximumHandShakes{
  public static void main(String[] args){

        Scanner input= new Scanner(System.in);

        // Taking user input of number of students.
        int numberOfStudents = input.nextInt();

        // Calculating the maximum number of hand shakes possible.
        int maximumHandShakes = ((numberOfStudents-1)*numberOfStudents)/2;


        // Display the result.
        System.out.println("The maximum number of possible handshakes is "+ maximumHandShakes);
        
  }
}
import java.util.Scanner;

public class MultiplicationTable{
public static void main(String[] args){

  // Create a scanner object.
  Scanner input = new Scanner(System.in);

  // Input an integer value and an array of 10 size.
  int number = input.nextInt();
  int[] table = new int[10];

  // Take the results of multiplication in table array.
  for(int i=1;i<=10;i++){
     table[i-1]=number*i;
  }

  // Display the multiplication table.
  for(int i=1;i<=10;i++){
     System.out.println(number+" * "+ i + " = "+table[i-1]);
  }
}
}
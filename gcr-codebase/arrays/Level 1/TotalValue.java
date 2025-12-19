import java.util.Scanner;

public class TotalValue{
public static void main(String[] args){

  // Create a scanner object.
  Scanner input = new Scanner(System.in);

  // Input an double-type value, an array of 10 size, and index variable.
  double[] array = new int[10];
  double totalValue = 0.0;
  int index=0;

  // Take user input until 0 or negative number is entered and add positive element into array.
  while(true){
    int userInput = input.nextInt();
    if(userInput<=0 || index==10){
       break;
    }
    array[index++]=userInput;
  }

  // Sum the elements of an array.
  for(int i=0;i<array.length;i++){
     totalValue+=array[i];
  }

  // Display the total value as a result.
  System.out.println("The total value is "+totalValue);
}
}
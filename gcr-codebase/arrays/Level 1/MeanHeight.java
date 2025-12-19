import java.util.Scanner;

public class MeanHeight{
public static void main(String[] args){

  // Create a scanner object.
  Scanner input = new Scanner(System.in);

  // Input an array of 10 size.
  double[] heights= new double[11];
  double sumOfHeights=0.0;

  // Find sum of all heights
  for(int i=0;i<heights.length;i++){
       heights[i]=input.nextDouble();
       sumOfHeights+=heights[i];
  }
  
  // Display the result.
  System.out.println("Print the mean height of the football team is "+ sumOfHeights/11);
  
}
}
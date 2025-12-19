import java.util.Scanner;

public class MultiDimensionalArray{
public static void main(String[] args){

  // Create a scanner object.
  Scanner input = new Scanner(System.in);

  // Input the number of rows and columns.
  int rows = input.nextInt();
  int columns = input.nextInt();

  // Create an empty one-dimensional array.
  int[] array = new int[rows*columns];
  int index=0;

  // Create a two-dimensional array.
  int[][] arrayTwoD = new int[rows][columns];
  for(int i=0;i<rows;i++){
     for(int j=0;j<columns;j++){
        arrayTwoD[i][j]=input.nextInt();
        array[index++]=arrayTwoD[i][j];
     }
  }

 
  // Display the factors.
  for(int i=0;i<index;i++){
       System.out.println(array[i]);
  }
}
}
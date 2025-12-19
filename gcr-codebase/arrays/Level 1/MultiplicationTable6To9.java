import java.util.Scanner;

public class MultiplicationTable6To9{
public static void main(String[] args){

  // Create a scanner object.
  Scanner input = new Scanner(System.in);

  // Input an integer value and an array of 10 size.
  int number= input.nextInt();
  int[] multiplicationResult= new int[10];

  // Display the multiplication table.
  if(number>=6 && number<=9){
      for(int i=1;i<=10;i++){
            multiplicationResult[i-1]=number*i;
      }

      for(int i=1;i<=10;i++){
            System.out.println(number+" * "+i+" = "+ multiplicationResult[i-1]);
      }
  }
  else{
      System.out.println("Number should be entered from 6 to 9");
  }
}
}
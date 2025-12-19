import java.util.Scanner;

public class FactorsArray{
public static void main(String[] args){

  // Create a scanner object.
  Scanner input = new Scanner(System.in);

  // Input an integer value and an arrays for max factors.
  int number=input.nextInt();
  int maxSize=10;
  int[] factorsArray = new int[maxSize];
  int index=0;

  // Add factors into the array.
  for(int i=1; i<=number; i++){
      if(number%i==0){
           if(index==maxSize){
                maxSize*=2;
                int[] temp= new int[maxSize];
                for(int j=0;j<index;j++){
                    temp[j]=factorsArray[j];
                }
                factorsArray=temp;
           } 
           factorsArray[index++]=i;
      }
  }

  // Display the factors.
  for(int i=0;i<index;i++){
       System.out.println(factorsArray[i]+" ");
  }
}
}
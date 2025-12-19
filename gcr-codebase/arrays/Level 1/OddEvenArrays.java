import java.util.Scanner;

public class OddEvenArrays{
public static void main(String[] args){

  // Create a scanner object.
  Scanner input = new Scanner(System.in);

  // Input an integer value and two arrays for even and odd values.
  int number=input.nextInt();
  int[] evenArray = new int[number/2 + 1];
  int[] oddArray = new int[number/2 + 1];
   
  int evenIndex=0;
  int oddIndex=0;

  if(number<1){
     System.out.println("An Error Occurred");
  }else{
     for(int i=1;i<=number;i++){
         if(i%2==0){
            evenArray[evenIndex++]=i;
         }else{
            oddArray[oddIndex++]=i;
         }
     }

     System.out.println("The odd elements are: ");
     for(int i=0;i<oddIndex;i++){
         System.out.println(oddArray[i]);
     }

     System.out.println("The even elements are: ");
     for(int i=0;i<evenIndex;i++){
         System.out.println(evenArray[i]);
     }

  }
}
}
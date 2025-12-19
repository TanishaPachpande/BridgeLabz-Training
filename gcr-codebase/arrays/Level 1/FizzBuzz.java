import java.util.Scanner;

public class FizzBuzz{
public static void main(String[] args){

  // Create a scanner object.
  Scanner input = new Scanner(System.in);

  // Input an integer value.
  int number=input.nextInt();

  // Create a string array to store the result.
  String[] str= new String[number+1];
  int index=0;

  // Input the elements into String array according to the conditions.
  if(number>0){
      for(int i=0;i<=number;i++){
       if(i%3==0 && i%5==0){
          str[index++]="FizzBuzz";
       }else if(i%3==0){
          str[index++]="Fizz";
       }else if(i%5==0){
          str[index++]="Buzz";
       }else{
          str[index++]=""+i+"";
       }
      }

      // Display the result.
      for(int i=0;i<index;i++){
          if(i==(index-1)){
           System.out.print("Position " + (i+1) + " = " + str[i] +".");
          }
          else{
          System.out.print("Position " + (i+1) + " = " + str[i] +", ");
          }
      }
  }
  else{
      System.out.println("Invalid input");
  }
}
}
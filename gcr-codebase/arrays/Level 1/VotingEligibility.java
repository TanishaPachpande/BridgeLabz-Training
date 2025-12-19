import java.util.Scanner;

public class VotingEligibility{
public static void main(String[] args){

  // Create a scanner object.
  Scanner input = new Scanner(System.in);

  // Create an array of 10 size.
  int[] studentAges = new int[10];

  // Input the student's ages, check their eligibility, and display the result.
  for(int i=0;i<studentAges.length;i++){
     studentAges[i]=input.nextInt();

     if(studentAges[i]<0){
        System.out.println(studentAges[i]+ " is an Invalid Age.");
     }else if(studentAges[i]<18){
        System.out.println("The student with the age "+studentAges[i]+" cannot vote.");
     }else{
        System.out.println("The student with the age "+studentAges[i]+" can vote.");
     }
  }

}
}
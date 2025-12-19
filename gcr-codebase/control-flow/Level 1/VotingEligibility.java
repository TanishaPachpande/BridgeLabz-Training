import java.util.Scanner;

public class VotingEligibility{
public static void main(String[] args){

     // Create a scanner object.
     Scanner input = new Scanner(System.in);

     // Input the age of a person.
     int ageOfPerson = input.nextInt();

     // Check age for eligibilty in voting and display the result. 
     if(ageOfPerson>=18){
         System.out.println("The person's age is "+ageOfPerson+" and can vote.");
     }else{
         System.out.println("The person's age is "+ageOfPerson+" and cannot vote.");
     }
}
}
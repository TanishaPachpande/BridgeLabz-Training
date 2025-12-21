import java.util.Scanner;

public class StudentVoteChecker{
public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Create array of size 10.
        int[] ages = new int[10];
	boolean result;

        // Input ages of 10 students and check their eligibility.
	for(int i=0;i<ages.length;i++){
	   ages[i]=input.nextInt();
	   result = canStudentVote(ages[i]);
	   System.out.println("The student "+(i+1)+" of age "+ages[i]+" can vote: "+result);
	}
}

// Function to check eligibility for voting.
public static boolean canStudentVote(int age){
	if(age<0){
	   return false;
	}else if(age>=18){
	   return true;
	}else{
	   return false;
	}
}
}
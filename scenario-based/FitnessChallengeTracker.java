import java.util.Scanner;

public class FitnessChallengeTracker{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int total=0, average=0;

	int[] weeklyPushUps = new int[7];
	
	for(int i=1; i<=weeklyPushUps.length; i++){
		if(i%7==0){
			continue;
		}
		System.out.println("Enter the push up counts for day "+ i +": ");
		weeklyPushUps[i-1]=sc.nextInt();
	}
	for(int day: weeklyPushUps){
		if(day%7==0){
			continue;
		}
		total+=day;
	}	
	average=total/7;
	System.out.println("==================================");
	System.out.println("The Total is "+ total);
	System.out.println("The Average is "+ average);
	
	
}
}
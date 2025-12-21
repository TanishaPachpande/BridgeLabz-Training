import java.util.Scanner;

public class LeapYear{
public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         
         // Input a value for year.
         int year=input.nextInt();

         Boolean leapYear = checkLeapYear(year);

         // Check for a leap year and display the result.
	 if(leapYear){
              System.out.println("The Year "+year+" is a Leap Year");
         }else{
	      System.out.println("The Year "+year+" is a not a Leap Year");
         }
}

public static boolean checkLeapYear(int year){
         if(year<1582){
         	return false;
	 }else if((year%400==0) || (year%4==0 && year%100!=0)){
                return true;
	 }
         return false;
}
}
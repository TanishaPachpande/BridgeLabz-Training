import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {

        // Input the values of month and day.
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check the Spring Season.
        boolean result = checkSeason(month, day);

        // Display the result.
        System.out.println("The Result is " + result);
    }

    // Method to Check the season.
    public static boolean checkSeason(int month, int day){
        if((month==3 && day>=20) || month==4 || month==5 || (month==6 && day<=20)){
             return true;
        }else{
             return false;
        }
    }
}

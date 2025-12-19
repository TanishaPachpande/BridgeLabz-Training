import java.util.Scanner;

public class BonusToEmployees{
    public static void main(String[] args) {

        // Create a scanner object.
        Scanner input = new Scanner(System.in);

        // Input values for salary and yaer of service.
        int salary=input.nextInt();
        int yearOfService=input.nextInt();

        // Check if years of service is more than 5, then calculate bonus amount.
        if(yearOfService>5){
             int bonusAmount = (int)(0.05*salary);
             System.out.println("The Bonus Amount is "+bonusAmount);
        }else{
              System.out.println("No Bonus due to less year of services.");
        }
    }
}

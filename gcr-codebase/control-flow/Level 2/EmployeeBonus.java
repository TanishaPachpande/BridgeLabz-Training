import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Input values of salary and years of service. 
        int salary = input.nextInt();
        int yearsOfService = input.nextInt();


        // Check if years of service is more than 5, display the bonus amount of 5%.
        if (years > 5) {
            int bonus = (int)(0.05 * salary);
            System.out.println("Bonus Amount: " + bonus);
        } else {
            System.out.println("No Bonus");
        }
    }
}

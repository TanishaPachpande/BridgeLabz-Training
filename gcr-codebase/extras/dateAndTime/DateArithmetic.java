import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

	// Taking date in input and parsing it into date format
        System.out.print("Enter a date (yyyy-mm-dd): ");
        LocalDate date = LocalDate.parse(sc.nextLine());

	// finding resultDate by performing some operations
        LocalDate resultDate = date.plusDays(7)
                                   .plusMonths(1)
                                   .plusYears(2)
                                   .minusWeeks(3);

	// Displaying result
        System.out.println("Final Date after calculations: " + resultDate);
    }
}

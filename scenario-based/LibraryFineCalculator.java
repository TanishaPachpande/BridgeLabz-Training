import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int finePerDay = 5;

	// Run loop for 5 books
        for (int i = 1; i <= 5; i++) {
            System.out.println("\n => Book " + i);

            System.out.print("Enter due date (day number): ");
            int dueDate = sc.nextInt();

            System.out.print("Enter return date (day number): ");
            int returnDate = sc.nextInt();

	    // Displaying result
	    System.out.println("----------------------------------------");
            if (returnDate > dueDate) {
                int lateDays = returnDate - dueDate;
                int fine = lateDays * finePerDay;
                System.out.println("Late by " + lateDays + " days");
                System.out.println("Fine: " + fine);
            } else {
                System.out.println("Returned on time. No fine ");
            }
	    System.out.println("----------------------------------------");
        }

    }
}

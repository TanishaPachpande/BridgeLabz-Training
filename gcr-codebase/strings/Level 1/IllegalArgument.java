import java.util.Scanner;

public class IllegalArgument {

    public static void main(String[] args) {

        // Input
        Scanner input = new Scanner(System.in);
        String text = input.next();

        // generate the exception
        System.out.println("Generating Exception:");
        try {
            generateException(text);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException generated: Invalid substring range");
        }

        // Handle the exception
        System.out.println("\nHandling Exception:");
        handleException(text);
    }

    // Method to generate the exception
    public static void generateException(String text) {
        // start index greater than end index
        System.out.println(text.substring(4, 1));
    }

    // Method to handle the exception
    public static void handleException(String text) {
        try {
            System.out.println(text.substring(4, 1));
        }
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException handled: Invalid substring range");
        }
    }
}

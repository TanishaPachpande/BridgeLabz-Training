import java.util.Scanner;

public class RemoveSpecificCharacter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

	// Input a string
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

	// Input a character to remove from string
        System.out.print("Enter character to remove: ");
        char removeChar = sc.next().charAt(0);

        String result = "";

	// Creating string by removing that character
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != removeChar) {
                result = result + str.charAt(i);
            }
        }

	// Displaying result
        System.out.println("Modified String: \"" + result + "\"");
    }
}

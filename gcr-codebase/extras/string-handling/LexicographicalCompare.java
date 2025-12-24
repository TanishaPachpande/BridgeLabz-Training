import java.util.Scanner;

public class LexicographicalCompare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

	// Input two strings
        System.out.print("Enter String 1: ");
        String str1 = sc.nextLine();

        System.out.print("Enter String 2: ");
        String str2 = sc.nextLine();

	// Find minimum length
        int minLength = Math.min(str1.length(), str2.length());
        boolean isCompared = false;

	// Compare the characters
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) < str2.charAt(i)) {
                System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
                isCompared = true;
                break;
            } else if (str1.charAt(i) > str2.charAt(i)) {
                System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order");
                isCompared = true;
                break;
            }
        }

        // If all characters are same till min length
        if (!isCompared) {
            if (str1.length() < str2.length()) {
                System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
            } else if (str1.length() > str2.length()) {
                System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order");
            } else {
                System.out.println("Both strings are equal");
            }
        }
    }
}

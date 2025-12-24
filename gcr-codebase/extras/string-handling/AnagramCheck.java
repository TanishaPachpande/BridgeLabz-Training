import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

	// Input two strings
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

	// Checking for equal lengths
        if (str1.length() != str2.length()) {
            System.out.println("Strings are NOT anagrams");
            return;
        }

        int[] freq = new int[256];

	// Creating frequency array
        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i)]++;
            freq[str2.charAt(i)]--;
        }

        boolean isAnagram = true;
        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("Strings are Anagrams");
        } else {
            System.out.println("Strings are NOT Anagrams");
        }
    }
}

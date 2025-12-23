import java.util.Scanner;

public class PalindromeCheck {
 
    // Check for palindrome using while loop
    public static boolean palindromeLogic1(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    // Check for palindrome using start and end indices
    public static boolean palindromeLogic2(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return palindromeLogic2(text, start + 1, end - 1);
    }

    // Reversing the string
    public static char[] reverseString(String text) {
        char[] rev = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            rev[i] = text.charAt(text.length() - 1 - i);
        }
        return rev;
    }

    // Check for palindrome by reversing the string
    public static boolean palindromeLogic3(String text) {
        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

	// Displaying result
        System.out.println(palindromeLogic1(text));
        System.out.println(palindromeLogic2(text, 0, text.length() - 1));
        System.out.println(palindromeLogic3(text));
    }
}

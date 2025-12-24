import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

	// Input a string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] freq = new int[256];
        char mostFrequentChar = str.charAt(0);
        int maxCount = 0;

	// Finding frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;

            if (freq[ch] > maxCount) {
                maxCount = freq[ch];
                mostFrequentChar = ch;
            }
        }

	// Displaying result
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
    }
}

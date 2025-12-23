import java.util.Scanner;

public class UniqueCharFrequency {

    // Finding unique characters from a string
    public static char[] uniqueCharacters(String text) {
        char[] temp = new char[text.length()];
        int k = 0;

        for (int i = 0; i < text.length(); i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                temp[k++] = text.charAt(i);
            }
        }

        // Creating array of unique characters
        char[] unique = new char[k];
        for (int i = 0; i < k; i++) {
            unique[i] = temp[i];
        }
        return unique;
    }

    // Function to find uniques
    public static String[][] frequencyUsingUnique(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        char[] unique = uniqueCharacters(text);
        String[][] result = new String[unique.length][2];

        // Fill the result array with character and it's frequency
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = Character.toString(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[][] freq = frequencyUsingUnique(text);

	// Displaying result
        for (String[] row : freq) {
            System.out.println(row[0] + " : " + row[1]);
        }
    }
}

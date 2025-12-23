import java.util.Scanner;

public class CharFrequencyASCII {

    // Method to find the frequency of characters
    public static String[][] charFrequency(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) count++;
        }
 
        String[][] result = new String[count][2];
        int index = 0;
        
	// Add values in result array
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = Character.toString((char) i);
                result[index][1] = String.valueOf(freq[i]);
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[][] freq = charFrequency(text);

	// Displaying result
        System.out.println("Character Frequency:");
        for (String[] row : freq) {
            System.out.println(row[0] + " : " + row[1]);
        }
    }
}

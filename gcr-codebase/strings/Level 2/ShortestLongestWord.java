import java.util.Scanner;

public class ShortestLongestWord {

    // find string length without length()
    static int findLength(String s) {
        int i = 0;
        try {
            while (true) { s.charAt(i); i++; }
        } catch (Exception e) {}
        return i;
    }

    // split text into words without split()
    static String[] splitWords(String text) {
        int count = 1;
        for (int i = 0; i < findLength(text); i++)
            if (text.charAt(i) == ' ') count++;

        String[] words = new String[count];
        String word = "";
        int index = 0;

        for (int i = 0; i < findLength(text); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') word += ch;
            else {
                words[index++] = word;
                word = "";
            }
        }
        words[index] = word;
        return words;
    }

    // word-length 2D array
    static String[][] wordLengthTable(String[] words) {
        String[][] arr = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(findLength(words[i]));
        }
        return arr;
    }

    // find shortest & longest
    static int[] shortestLongest(String[][] data) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < data.length; i++) {
            int len = Integer.parseInt(data[i][1]);
            if (len < min) min = len;
            if (len > max) max = len;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] table = wordLengthTable(words);
        int[] result = shortestLongest(table);

        // Displaying Result
        System.out.println("Shortest Length: " + result[0]);
        System.out.println("Longest Length: " + result[1]);
    }
}

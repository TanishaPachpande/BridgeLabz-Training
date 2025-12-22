import java.util.Scanner;

public class VowelConsonantCount {

    // check character type
    static String checkChar(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);

        if (ch >= 'a' && ch <= 'z') {
            if ("aeiou".indexOf(ch) != -1) return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    // count vowels and consonants
    static int[] countVC(String s) {
        int v = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            String type = checkChar(s.charAt(i));
            if (type.equals("Vowel")) v++;
            if (type.equals("Consonant")) c++;
        }
        return new int[]{v, c};
    }

    public static void main(String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] result = countVC(s);

        // Displaying result
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }
}

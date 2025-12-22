import java.util.Scanner;

public class CharacterTypeTable {

    // analyze the character's type
    static String checkChar(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);
        if (ch >= 'a' && ch <= 'z')
            return "aeiou".indexOf(ch) != -1 ? "Vowel" : "Consonant";
        return "Not a Letter";
    }
    // analyze the character and it's type
    static String[][] analyze(String s) {
        String[][] arr = new String[s.length()][2];
        for (int i = 0; i < s.length(); i++) {
            arr[i][0] = String.valueOf(s.charAt(i));
            arr[i][1] = checkChar(s.charAt(i));
        }
        return arr;
    }
   
    // display the array
    static void display(String[][] arr) {
        System.out.println("Char\tType");
        for (String[] row : arr)
            System.out.println(row[0] + "\t" + row[1]);
    }

    public static void main(String[] args) {

        // Input a string
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // Displaying result
        display(analyze(s));
    }
}

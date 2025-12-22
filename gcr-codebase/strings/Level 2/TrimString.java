import java.util.Scanner;

public class TrimString {

    // function to find the trim indices
    static int[] findTrimIndex(String s) {
        int start = 0, end = s.length() - 1;
        while (s.charAt(start) == ' ') start++;
        while (s.charAt(end) == ' ') end--;
        return new int[]{start, end};
    }

    // function to find substring
    static String substring(String s, int start, int end) {
        String res = "";
        for (int i = start; i <= end; i++)
            res += s.charAt(i);
        return res;
    }

    // function to compare strings
    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {

        // Input a string
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] idx = findTrimIndex(s);
        String custom = substring(s, idx[0], idx[1]);
        String builtin = s.trim();

        // Displaying result
        System.out.println("Equal: " + compare(custom, builtin));
    }
}

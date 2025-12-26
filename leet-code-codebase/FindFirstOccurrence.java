import java.util.Scanner;
public class FindFirstOccurrence {

    // Function to find occurrence of substring
    public static int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
		return haystack.indexOf(needle);
	}
	return -1;
    }
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	// Input two strings
	String haystack=sc.next();
	String needle=sc.next();

	// Displaying result
	System.out.println("The first occurrence is at index "+strStr(haystack, needle));
    }
}
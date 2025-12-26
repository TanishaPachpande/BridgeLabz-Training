import java.util.Scanner;

public class PalindromeChecker{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	// Input a string
	String string = sc.next();

	// Displaying result
	if(checkPalindrome(string)){
		System.out.println("The string "+string+" is Palindrome");
	}else{
		System.out.println("The string "+string+" is Not Palindrome");
	}
}

// Check for a palindrome string
public static boolean checkPalindrome(String string){
	String reverse="";
	for(int i=string.length()-1;i>=0;i--){
		reverse+=string.charAt(i);
	}
	return string.equals(reverse);
}

}
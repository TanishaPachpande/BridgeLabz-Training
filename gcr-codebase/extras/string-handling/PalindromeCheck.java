import java.util.Scanner;

public class PalindromeCheck{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	// Input a string
	String string= input.nextLine();

	String reversedString="";

	// Reverse the string
	for(int i=string.length()-1;i>=0;i--){
		char ch=string.charAt(i);
		reversedString+=ch;
	}

	// Displaying result
	if(string.equals(reversedString)){
		System.out.println("Palindrome");
	}else{
		System.out.println("Non-Palindrome");
	}
}
}
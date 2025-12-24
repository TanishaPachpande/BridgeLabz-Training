import java.util.Scanner;

public class ReverseString{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	// Input a string
	String string= input.nextLine();

	String reversedString="";

	// Reverse the string through reverse loop
	for(int i=string.length()-1;i>=0;i--){
		char ch=string.charAt(i);
		reversedString+=ch;
	}

	// Displaying result
	System.out.println("The Reversed String is " + reversedString);
}
}
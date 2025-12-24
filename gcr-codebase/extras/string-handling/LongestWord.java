import java.util.Scanner;


public class LongestWord{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	// Input a string
	String string= input.nextLine();

	// Find the index of longest word by splitting the string by spaces
	int maxLength=Integer.MIN_VALUE;
	int longestWordIndex=-1;
	String[] splittedString = string.split(" ");
	for(int i=0;i<splittedString.length;i++){
		String word = splittedString[i];
		if(maxLength<=word.length()){
			maxLength=word.length();
			longestWordIndex=i;
		}
	}

	// Displaying result
	System.out.println("The Longest word in given string is " + splittedString[longestWordIndex]);
}
}
import java.util.Scanner;

public class SubstringOccurrences{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	// Input a string and a substring
	String string = input.nextLine();   
	String substring = input.nextLine();   

	int count=0, index=0;

	// Count the occurrence of substring in a string
	while((index=string.indexOf(substring, index))!=-1){
		count++;
		index+=substring.length();
	}
	
	// Displaying result
	System.out.println("The substring " + substring + " in a string "+string+" is "+count+" times");
}
}
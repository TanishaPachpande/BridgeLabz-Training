import java.util.Scanner;
import java.util.LinkedHashSet;

public class RemoveDuplicates{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	// Input a string
	String string= input.nextLine();

	// Convert the string into characters array
	LinkedHashSet<Character> charArray = new LinkedHashSet<>();
	for(char ch: string.toCharArray()){
		charArray.add(ch);
	}

	StringBuilder stringWithoutDuplicates=new StringBuilder();

	// Remove the duplicates
	for(char c : charArray){
		stringWithoutDuplicates.append(c);
	}

	// Displaying result
	System.out.println("The String without duplicates is " + stringWithoutDuplicates);
}
}
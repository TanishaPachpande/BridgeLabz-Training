import java.util.Scanner;

public class Equals{
public static void main(String[] args){

	// Input two strings
	Scanner input = new Scanner(System.in);
	String string1 = input.next();
	String string2 = input.next();

        // Store the results in variables
	boolean isEqual = findThroughEquals(string1, string2);
        boolean isEqualThroughCharAt = findThroughCharAt(string1, string2);

	// Display the result
	System.out.println("The result by using equals() method is "+isEqual);
	System.out.println("The result by using charAt() method is "+isEqualThroughCharAt);
}

// Function to check equal strings by using equals() method
public static boolean findThroughEquals(String string1, String string2){
	if(string1.length()!=string2.length()){
		return false;
	}
	if(string1.equals(string2)){
		return true;
	}else{
		return false;
        }
}

// Function to check equal strings by using charAt() method
public static boolean findThroughCharAt(String string1, String string2){
	if(string1.length()!=string2.length()){
		return false;
	}
	for(int i=0;i<string1.length();i++){
		if(string1.charAt(i)!=string1.charAt(i)){
			return false;
		}
	}
	return true;
}
}
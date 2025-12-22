import java.util.Scanner;

public class Substring{
public static void main(String[] args){

	// Input a string value, starting index, and ending index.
	Scanner input = new Scanner(System.in);
	String string = input.next();
	int startIndex=input.nextInt();
	int endIndex=input.nextInt();

        // Store the results in variables
	String subStringThroughCharAt = findSubstringCharAt(string, startIndex, endIndex);
        String subStringThroughmethod = findThroughSubstring(string, startIndex, endIndex);

	// Display the result

	if(subStringThroughCharAt.equals(subStringThroughmethod)){
		System.out.println("The both substrings are equal that is "+subStringThroughmethod);
	}else{
		System.out.println("The substrings "+subStringThroughmethod+" and "+ subStringThroughCharAt+ " are not equal");
	}
}

// Function to find substring using substring() method
public static String findThroughSubstring(String string, int startIndex, int endIndex){
	String substring = string.substring(startIndex, endIndex+1);
	return substring;
}

// Function to find substring using charAt() method
public static String findSubstringCharAt(String string, int startIndex, int endIndex){
        String subString="";
	for(int i=startIndex;i<=endIndex;i++){
		subString+=string.charAt(i);
	}
	return subString;
}
}
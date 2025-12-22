import java.util.Scanner;

public class UpperCase{
public static void main(String[] args){

	// Input a string value.
	Scanner input = new Scanner(System.in);
	String string = input.nextLine();
	String changedStringThroughCharAt = uppercaseWithoutMethod(string);
	String changedStringThroughMethod = uppercaseThroughMethod(string);
	
	// Displaying result
	if(changedStringThroughCharAt.equals(changedStringThroughMethod)){
		System.out.println("Both are equal");
	}else{
		System.out.println("Both are not equal");
	}
}

// Function to upper case the string without using any method
public static String uppercaseWithoutMethod(String string){
	String changedString = "";
	for(int i=0;i<string.length();i++){
		if(string.charAt(i) >= 'a' && string.charAt(i) <= 'z'){
			changedString+=(char)(string.charAt(i)-32);
		}else{
			changedString+=string.charAt(i);
		}
	}
	return changedString;
}

public static String uppercaseThroughMethod(String string){
	return string.toUpperCase();
}
}
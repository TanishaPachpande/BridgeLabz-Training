import java.util.Scanner;
import java.util.Arrays;

public class CharArray{
public static void main(String[] args){

	// Input a string value.
	Scanner input = new Scanner(System.in);
	String string = input.next();

        // Store the results in arrays
	char[] arrayWithoutMethod = findArrayWithoutMethod(string);
        char[] arrayThroughMethod = findArrayThroughMethod(string);


	// Display the result
	if(Arrays.equals(arrayWithoutMethod, arrayThroughMethod)){
		System.out.println("Character arrays are equal.");
	}else{
		System.out.println("Character arrays are not equal.");
	}
}

// Function to find string array without using any method
public static char[] findArrayWithoutMethod(String string){
	char[] charArray=new char[string.length()];
	for(int i=0;i<string.length();i++){
		charArray[i]=string.charAt(i);
	}
	return charArray;
}

// Function to find string array by using toCharArray() method
public static char[] findArrayThroughMethod(String string){
	return string.toCharArray();
}
}
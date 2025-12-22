import java.util.Scanner;

public class Length{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	String string = input.next();
	
	// Finding length of a string without using in built method
	int lengthUsingCharAt = findLengthByCharAt(string);
	int lengthUsingMethod = findLengthByMethod(string);

	// Displaying result
	if(lengthUsingCharAt==lengthUsingMethod){
		System.out.println("Equal result that is "+lengthUsingCharAt);
	}else{
		System.out.println("Not Equal result");
	}
}

// Function to find length of a string by using charAt() method
public static int findLengthByCharAt(String string){
	int count=0;
	while(true){
	try{
		string.charAt(count);
		count++;
	}catch(StringIndexOutOfBoundsException e){
		System.out.println("Index out of bounds");
		break;
	}
	}
	return count;
}

// Function to find length of a string by using length() method
public static int findLengthByMethod(String string){
	return string.length();
}
}
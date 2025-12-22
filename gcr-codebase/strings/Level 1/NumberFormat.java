import java.util.Scanner;

public class NumberFormat{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	String text=input.next();

	// Generate the Exception
	try{
		generateException(text);
	}catch(NumberFormatException e){
		System.out.println("NumberFormatException raised: Cannot parse");
	}

	// Handle The Exception
	handleException(text);
	
	
}

//Function to generate the exception
public static void generateException(String text){
	System.out.println(Integer.parseInt(text));
}

//Function to handle the exception
public static void handleException(String text){
        try{
		System.out.println(Integer.parseInt(text));
	}catch(NumberFormatException e){
		System.out.println("NumberFormatException raised: Cannot parse");
	}
}

}
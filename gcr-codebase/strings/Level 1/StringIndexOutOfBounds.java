import java.util.Scanner;

public class StringIndexOutOfBounds{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	String string = input.next();;

	// Generate the Exception
	try{
		generateException(string);
	}catch(StringIndexOutOfBoundsException e){
		System.out.println("StringIndexOutOfBounds generated: Index out of bound");
	}

	// Handle The Exception
	handleException(string);
}

//Function to generate the exception
public static void generateException(String string){
	System.out.println(string.charAt(string.length()));
}

//Function to handle the exception
public static void handleException(String string){
        try{
		System.out.println(string.charAt(string.length()));
	}catch(StringIndexOutOfBoundsException e){
		System.out.println("StringIndexOutOfBounds handled: Index out of bound");
	}
}

}
import java.util.Scanner;

public class NullPointer{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	String text=null;

	// Generate the Exception
	try{
		generateException();
	}catch(NullPointerException e){
		System.out.println("NullpointerException raised: Cannot find length of null value");
	}

	// Handle The Exception
	handleException(text);
	
	
}

//Function to generate the exception
public static void generateException(){
	String text=null;
	System.out.println(text.length());
}

//Function to handle the exception
public static void handleException(String text){
        try{
		System.out.println(text.length());
	}catch(NullPointerException e){
		System.out.println("NullpointerException raised: Cannot find length of null value");
	}
}

}
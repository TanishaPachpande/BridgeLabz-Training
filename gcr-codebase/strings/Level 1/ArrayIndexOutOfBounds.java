import java.util.Scanner;

public class ArrayIndexOutOfBounds{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int[] array = new int[5];

        for(int i=0;i<array.length;i++){
		array[i]=input.nextInt();
	}

	// Generate the Exception
	try{
		generateException(array);
	}catch(ArrayIndexOutOfBoundsException e){
		System.out.println("ArrayIndexOutOfBoundsException generated: Index out of bound");
	}

	// Handle The Exception
	handleException(array);
}

//Function to generate the exception
public static void generateException(int[] array){
	System.out.println(array[array.length]);
}

//Function to handle the exception
public static void handleException(int[] array){
        try{
		System.out.println(array[array.length]);
	}catch(ArrayIndexOutOfBoundsException e){
		System.out.println("ArrayIndexOutOfBoundsException handled: Index out of bound");
	}
}

}
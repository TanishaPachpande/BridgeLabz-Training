import java.util.Scanner;

public class Split{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	String string = input.nextLine();
	
	// Finding length of a string without using in built method
	int wordsUsingCharAt = findWordsByCharAt(string);
	int wordsUsingMethod = findWordsByMethod(string);

	System.out.println(wordsUsingCharAt);
	System.out.println(wordsUsingMethod);
	// Displaying result
	if(wordsUsingCharAt==wordsUsingMethod){
		System.out.println("Equal result that is "+wordsUsingMethod);
	}else{
		System.out.println("Not Equal result");
	}
}

// Function to find number of words in a string by using charAt() method
public static int findWordsByCharAt(String string){
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
	int words=1;
	for(int i=0;i<count;i++){
		if(string.charAt(i)==' '){
			words++;
		}
	}
	return words;
}

// Function to find number of words in a string by using split() method
public static int findWordsByMethod(String string){
	String[] words = string.split(" ");
	return words.length;
}
}
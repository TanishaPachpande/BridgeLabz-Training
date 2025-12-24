import java.util.Scanner;

public class CountVowelsConsonants{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	// Input a string
	String string= input.nextLine();

	int vowels=0, consonants=0;

	// Count the vowels and consonants
	for(int i=0;i<string.length();i++){
		char ch=string.charAt(i);
		if("aeiou".indexOf(ch)!=-1){
			vowels++;
		}else{
			consonants++;
		}
	}

	// Displaying result
	System.out.println("The String " + string + " has "+vowels+" vowels and "+consonants+" consonants");
}
}
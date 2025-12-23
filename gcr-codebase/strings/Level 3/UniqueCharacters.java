import java.util.Scanner;

public class UniqueCharacters{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	// Input a string
	String string = "ttaanishhaaa";
	int lengthOfString=findLength(string);

	// Displaying result
	char[] uniques = uniqueCharacters(string);
	System.out.print("The unique characters are: ");
	for(int i=0; i<uniques.length; i++){
		System.out.print(uniques[i]+ " " );
	}
}

// Finding unique characters
public static char[] uniqueCharacters(String string){
	char[] unique = new char[findLength(string)];
	int uniqueIndex=0;
        for(int i=0;i<findLength(string);i++){
		char current = string.charAt(i);
		Boolean isUnique=true;
		for(int j=0;j<i;j++){
			if(current==string.charAt(j)){
				isUnique=false;
				break;
			}
		}
		if(isUnique){
			unique[uniqueIndex]=current;
			uniqueIndex++;
		}
	}
	return unique;
}

// Finding length of the string
public static int findLength(String string){
	int count=0;
	try{
		while(true){
			string.charAt(count);
			count++;
		}
	}catch(Exception e){
		// Exception
	}
	return count;
}
}
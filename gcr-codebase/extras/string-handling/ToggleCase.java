import java.util.Scanner;

public class ToggleCase{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	// Input a string
	String string = input.nextLine();
	String result = "";

	// Toggling the uppercase to lowercase and vice-versa
	for(int i=0;i<string.length();i++){
		char ch = string.charAt(i);
		if(ch>='a' && ch<='z'){
			result+=(char)(ch-32);
		}else{
			result+=(char)(ch+32);
		}
	}

        // Displaying result
	System.out.println("The string "+string+" after toggling is "+result);
}
}
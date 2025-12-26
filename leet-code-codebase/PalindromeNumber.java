import java.util.Scanner;

public class PalindromeNumber {
    // Function to chaeck for a palindrome number
    public static boolean isPalindrome(int x) {
        int copy=x;
	int rev=0;
	while(copy>0){
		int temp=copy%10;
		rev=(rev*10)+temp;
		copy/=10;
	}
	return rev==x;
    }
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	// Input an integer value
	int number=sc.nextInt();
	
	// Checking for a palindrome and displaying result
	if(isPalindrome(number)){
		System.out.println("The number "+ number+ " is a palindrome");
	}else{
		System.out.println("The number "+ number+ " is not a palindrome");
	}
    }
}
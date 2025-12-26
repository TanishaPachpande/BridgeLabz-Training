import java.util.Scanner;

public class ReverseInteger {
    public static int reverse(int x) {
	int copy=x;
	int rev=0;
	while(copy>0){
		int temp=copy%10;
		rev=(rev*10)+temp;
		copy/=10;
	}
	return rev;
    }
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	// Input an integer value
	int number=sc.nextInt();

	// Display the result
	System.out.println("The reverse of number "+number+" is "+reverse(number));
    }
}
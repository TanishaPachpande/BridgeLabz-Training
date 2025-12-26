import java.util.Scanner;

public class ElectionBoothManager{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	// Taking age as an input
	int age=sc.nextInt();

	// Count for candidate number
        int count=1;

	// Running loop until the user enters -1 to exit and displaying result
        while(age!=-1){
		if(age>=18){
			System.out.println("Candidate "+count+" is eligible");
		}else{
			System.out.println("Candidate "+count+" is not eligible");
		}
		count++;
		age=sc.nextInt();
	}
}
}
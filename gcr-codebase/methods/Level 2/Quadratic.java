import java.util.Scanner;

public class Quadratic{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	// Input three numbers
	int a=input.nextInt();
	int b=input.nextInt();
	int c=input.nextInt();

	double delta = Math.pow(b,2) + (4*a*c);

	// Find the roots.
	int[] result = findRoots(a, b, c, delta);
	for(int i=0;i<result.length;i++){
		System.out.println(result[i]);
	}
}

// Method to find the roots.
public static int[] findRoots(int a, int b, int c, double delta){
	if(delta<0){
		return new int[]{};
	}else if(delta==0){
		return new int[]{-b/(2*a)};
	}else{
		int root1 = (int)((-b + Math.sqrt(delta))/(2*a));
		int root2 = (int)((-b - Math.sqrt(delta))/(2*a));
		return new int[]{root1, root2};
	}
}
}
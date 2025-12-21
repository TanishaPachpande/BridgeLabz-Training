import java.util.Scanner;

public class YoungestAndTallest{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	// Create array for names, ages, and heights.
	String[] names={"Amar", "Akbar", "Anthony"};
 	int[] ages = new int[3];
	int[] heights = new int[3];

	for(int i=0;i<ages.length;i++){
	   ages[i]=input.nextInt();
	}
	for(int i=0;i<heights.length;i++){
	   heights[i]=input.nextInt();
	}

	
        // Calling the functions to get the index of youngest and tallest person.
	int youngestIndex=findYoungest(ages);
	int tallestIndex=findTallest(heights);

	// Display the Result.
	System.out.println("The Youngest Friend is "+names[youngestIndex]);
	System.out.println("The Tallest Friend is "+names[tallestIndex]);
}

// Find the youngest person index.
public static int findYoungest(int[] ages){
	int min=Integer.MAX_VALUE;
	int index=0;
	for(int i=0;i<ages.length;i++){
	     if(min>=ages[i]){
		min=ages[i];
		index=i;
	     }
	}
	return index;
}

// Find the tallest person index.
public static int findTallest(int[] heights){
	int max=Integer.MIN_VALUE;
	int index=0;
	for(int i=0;i<heights.length;i++){
	     if(max<=heights[i]){
		max=heights[i];
		index=i;
	     }
	}
	return index;
}
}
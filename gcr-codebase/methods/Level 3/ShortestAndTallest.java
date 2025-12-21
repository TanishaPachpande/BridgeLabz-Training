public class ShortestAndTallest{
public static void main(String[] args){

	// Array to store heights of 11 players
	int[] heights = new int[11];

	// Generate random heights between 150 and 250 cm
	for(int i=0;i<heights.length;i++){
		heights[i]=(int)(Math.random()*101)+150;
	}

        // Display the results
	System.out.println("The mean height is "+findMean(sumOfHeights(heights), heights.length));
	System.out.println("The tallest height is "+findShortestHeight(heights));
	System.out.println("The shortest height is "+findTallestHeight(heights));
	
}

// Method to find sum of all heights
public static int sumOfHeights(int[] heights){
	int sum=0;
	for(int i=0;i<heights.length;i++){
		sum+=heights[i];
	}
	return sum;
}


//Method to find mean height
public static double findMean(int sum, int numberOfPlayers){
	double mean=0;
	mean=sum/numberOfPlayers;
	return mean;
}

// Method to find shortest height
public static int findShortestHeight(int[] heights){
	int min=Integer.MAX_VALUE;
	for(int i=0;i<heights.length;i++){
		if(min>=heights[i]){
			min=heights[i];
		}
	}
	return min;
}

// Method to find tallest height
public static int findTallestHeight(int[] heights){
	int max=Integer.MIN_VALUE;
	for(int i=0;i<heights.length;i++){
		if(max<=heights[i]){
			max=heights[i];
		}
	}
	return max;
}
}
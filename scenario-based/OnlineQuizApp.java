import java.util.Scanner;

public  class OnlineQuizApp{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	String[] questions= {"1. What is Java?", 
                             "2. Why Java is simple and secure?", 
			     "3. Why java is not purely object oriented?", 
			     "4. Which statement is true from the following:", 
			     "5. How many keywords are there in java?"};

	String[][] options={
		{"A. HLL", "B. LLL", "C. Machine code"},
		{"A. due to pointer manipulation", "B. due to reference", "C. Both A and B"},
		{"A. java supports primitive datatypes that are not object", "B. Due to static keyword", "C. Both A and B"},
		{"A. Java is platform independent", "B. JVM is platform dependent", "C. Both A and B"},
		{"A. 53", "B. 49", "C. 56"}
	};

	int score=0;
	String[] correctOptions = {"A", "B", "C", "C", "A"};
	String choice=null;
	for(int i=0; i<questions.length; i++){
		System.out.println(questions[i]);
		for(int j=0; j<options[i].length; j++){
			System.out.println(options[i][j]);
		}
		System.out.print("Enter choice: ");
		choice=sc.next().toUpperCase();
		switch(choice){
			case "A":
			case "B":
			case "C":
				if(choice.equals(correctOptions[i])){
					score++;
					System.out.println("You are Correct! ");
				}else{
					System.out.println("Wrong Answer! ");
				}
				break;
			default:
				System.out.println("Invalid option entered");
		}
		System.out.println("----------------------------------------------------");
	}
	System.out.println("Your Score: "+ score);
}
}
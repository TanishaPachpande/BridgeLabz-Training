import java.util.Scanner;

public class FestivalLuckyDraw{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("------------------------------------------------------------");
	System.out.println("          WELCOME TO DIWALI MELA LUCKY DRAW GAME            ");
	System.out.println("------------------------------------------------------------");

	int randomNumber=0;

	System.out.print("Want to play? (y/n):");
	char choice=Character.toLowerCase(sc.next().charAt(0));
	if(choice=='y'){
		while(true){
	randomNumber = (int)(Math.random()*90)+10;
	

	if(randomNumber%3==0 || randomNumber%5==0){
		System.out.println("You Won a Gift!");
	}else{
		System.out.println("You Lose!");
	}
	System.out.println("---------------------------------------------------------------");
	System.out.print("Want to play? (y/n):");
	choice=Character.toLowerCase(sc.next().charAt(0));
	if(choice=='n'){
		break;
	}
	}

	}else{
		System.out.println("GAME STOPPED");
	}

	
	}
}
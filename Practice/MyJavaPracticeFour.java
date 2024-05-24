//import java.util.Random;
import java.util.Scanner;
public class AtmFunctions{

	public static void main(String... args){
	//Random rand = new Random();
	int guessNumber = (int)(Math.random() * 101);
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Welcome to our Guess Game ");

	System.out.println("Guess number from (0 - 100) ");
	int answer = scan.nextInt();

	while(guessNumber != answer){
		 if(guessNumber >= 50){System.out.println("Your guess is too high");}
		else if(guessNumber <= 50){System.out.println("Your guess is too low");}
		System.out.println("Guess number from (0 - 100) ");
		guessNumber = scan.nextInt();
	}
	System.out.println("Yes, the number is " + answer);	
	}

}
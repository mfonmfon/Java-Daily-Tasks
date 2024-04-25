import java.util.Scanner;

public class TaskOne{


	public static void main(String... args){
	Scanner scan = new Scanner(System.in);
	int [] scores = new int[10];


	for(int counter = 0; counter < scores.length; counter++){
	System.out.println("Enter scores");
	int userInput = scan.nextInt();

	scores[counter] = userInput;

	

	}

	for(int counter = 0; counter < scores.length; counter++){

	System.out.print(scores[counter] + " ");

	}

	}

}
import java.util.Scanner;
import java.util.ArrayList;
public class AtmFunctions{

	public static void main(String...args){
	Scanner scan = new Scanner(System.in);
	int firstNumber = (int) (Math.random() * 20);
	int secondNumber = (int) (Math.random() * 20);

	System.out.print("What is " + firstNumber + " + " + secondNumber + " ? ");
	int answer = scan.nextInt();

	while(firstNumber + secondNumber != answer){
		System.out.println("Wrong answer!");
		System.out.print("What is " + firstNumber + " + " + secondNumber + " ? ");
		answer = scan.nextInt();

	}
	System.out.println("You got it!");
	}

}





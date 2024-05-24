import java.util.Scanner;
public class AtmFunctions{

	public static void main(String...args){
	final int numberOfQuestions = 5;
	int correctCount = 0;
	int count = 0;
	long startTime = System.currentTimeMillis();
	String output = " ";
	Scanner scan = new Scanner(System.in);
	while(count < numberOfQuestions){
		int firstNumber = (int)(Math.random() * 10);
		int secondNumber = (int)(Math.random() * 10);

		if(firstNumber < secondNumber){
			int temp = firstNumber;
			firstNumber = secondNumber;
			secondNumber = temp;	
		}
		System.out.println("What is " + firstNumber + " - " + secondNumber + " ? ");
		int answer = scan.nextInt();
		if(firstNumber - secondNumber == answer){
			System.out.println("you are correct!");
			correctCount++;
		}
		else{System.out.println("You answer is wrong.\n" + firstNumber + " - "+ secondNumber + "should be " + (firstNumber - secondNumber));};

		count++;
	
	output += "\n" + firstNumber + " - " + secondNumber + " = " + answer + ((firstNumber - secondNumber == answer) ? " correct " : " wrong ");
	}
	long endTime = System.currentTimeMillis();
	long testTime = endTime - startTime;
	System.out.println("Correct count is"+ correctCount + "\nTest time is "+ testTime / 1000 + "seconds\n"+ output);
	
	}


}
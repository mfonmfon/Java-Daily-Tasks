import java.util.Scanner;
public class Sender{

	public static void main(String... args){
	Scanner scan = new Scanner(System.in);

	

	}

	public static int evenNumbers(int[] numbers){
	numbers = new int[] {12, 32, 344, 55, 3, 2, 9, 6, 22};

	int evenNumber = numbers[0];

	for(int counter = 0; counter < numbers.length; counter++){

	if(numbers[counter] % 2 == 0){
		evenNumber = numbers[counter];
	}
	System.out.println(evenNumber);

	}
	return evenNumber;
	
	
	
	}
	


	public static int oddNumber(int[] numbers){

	numbers = new int[] {22, 33, 22, 4545, 43, 223, 454, 3, 4, 1};

	int oddNumber = numbers[0];


	for(int  counter = 0; counter < numbers.length; counter++){
	if(numbers[counter] % 2 == 1){
		oddNumber = numbers[counter];

	}


	}

	return oddNumber;

	}


	public static int maximumAndMinimum(int maximum, int minimum){

	



	}
	

	

}
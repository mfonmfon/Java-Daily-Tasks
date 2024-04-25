import java.util.Scanner;
public class TaskFour{

	public static void  main(String... agrs){
	
	

	}

	public static int sumArray(int[] arrayNumbers){
	int sumArray = arrayNumbers[0];

	for(int counter = 0; counter < arrayNumbers.length; counter++){

	if(arrayNumbers[counter] % 2 == 0){
		arrayNumbers[counter] = sumArray;

	System.out.print(arrayNumbers[counter]);


	}

	}
	return sumArray;

	}
}
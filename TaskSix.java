import java.util.Scanner;
public class TaskFour{

	public static void  main(String... agrs){
	Scanner scan = new Scanner(System.in);

	int[] evenNumbers = {2, 4, 34, 76, 45, 43, 8, 4, 66, 28};

	int[] result = isEven(evenNumbers);

	System.out.println(result);

	}

	
	public static int[] isEven(int[] evenNumbers){

	int[] isEven
	for(int i = 0; i < evenNumbers.length; i++){
		
		if(i % 2 == 0){
			System.out.printf("%3s%s ", evenNumbers[i], " ,");
		}
		
	}
	return evenNumbers;
	

	}


}
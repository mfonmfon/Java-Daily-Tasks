public class ReplaceEvenNumbers{

	public static int arrayOfOneAndZeros(int[] firstNumbers){
	int firstNumber[] = new int[10];

	int total = 0;

	for(int index = 0; index < firstNumbers.length; index++){
		if(firstNumbers[index] % 2 == 0){
			total = firstNumbers[index];
		}

		else if(firstNumbers[index] % 2 == 1){
			total = firstNumbers[index];

		}


	}
	return total;



	}



}
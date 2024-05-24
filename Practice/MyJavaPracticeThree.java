public class MyJavaPracticeThree{

	public static int largestNumber(int[] arrays,){
	int[] arrays = new int[10];
	int maximumNumber = arrays[10];

	for(int index = 0; index < arrays.length; index++){
		if(arrays[index] > maximumNumber){
			maximumNumber = arrays[index];
		}
	}
	return maximumNumber;
	}
	public static void main(String...args){
		 largestNumber();
	}



}
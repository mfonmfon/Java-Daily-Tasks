//printing even numbers

public class MyJavaPracticeTwo{

	public static void main(String... args){
	firstMultipleOf();

	}
	public static void firstMultipleOf(){
	for(int index = 0; index < 101; index++){
		if(index % 2 == 0){
			System.out.println(index);
		}
	}

	}

	



}
public static void  2dArrays(){
int[][] items = new int[3][3];

	//input

	for(int row = 0; row < items.length; row++){
		for(int col = 0; col < items.length; col++){
			items[row][col] = scan.nextInt();
		}
	}
	//output
	for(int row = 0; row < items.length; row++){
		for(int col = 0; col < items[row].length; col++){
			System.out.print(items[row][col] + " ");
		}
		System.out.println();
	}

}
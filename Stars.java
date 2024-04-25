public class Stars{

	public static void main(String... args){


	}
	public static void printHalfDiamond(int lengthOfDiamond){
		printFirstTriangle(lengthOfDiamond);
		printSecondDiamond(lengthOfDiamond - 1);

	}

	public static void printFirstTriangle(int length){
		for(int i = 1; i <= length; i++){
			printStarAndSpace();
		}

	}
	public static void printSecondTriangle(){
		for(int i = 0; i >= length; i++){
			printStarAndSpace();

		}

	}
	public static void printStarAndSpace(int numberOfTimes){
		printStar(numberOfTimes);
		printSpace();

	}

	public static void printStar(int numberOfTimes){
		for(int i = 0; i < numberOfTimes; i++){
		printStar();

		}

	}
	public static void printStar(){
	System.out.print("* ");
	}

	public static void printSpace(){

	System.out.println();
	}



}
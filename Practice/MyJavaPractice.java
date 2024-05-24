import java.util.Arrays;
public class MyJavaPracticeOne{

	public static void main(String... args){
	counter();

	}
	public static void counter(){
	int sum = 0;
	
	for(int index = 0; index < 20_000; index++){
		if(sum%10==0){
			sum+=10;
			System.out.println("The multiple of 10 is " + sum);
		}
	}

	}


}
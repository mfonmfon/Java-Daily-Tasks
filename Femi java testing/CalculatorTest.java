import org.junit.jupiter.api.Test;
import stati corg.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest{

	public void testThatCalculatorCanAddTwoPossibleNumbers(){
		int sum = Calculator.add(2,2);
		int expectedSum = 4;
		//assertion
		//assertEquals(expectedSum, sum);
		if(sum !=4){
			System.out.printf("Test FAILED\n Expected: %d\n Actual: %d", expectedSum, sum);

		}else{

			System.out.println("Test passed, yay :)");
			}
	}


	public static void main(String... args){
		CalculatorTest calculatorTest = new CalculatorTest();


		calculatorTest.testThatCalculatorCanAddTwoPossibleNumbers();

	}


}
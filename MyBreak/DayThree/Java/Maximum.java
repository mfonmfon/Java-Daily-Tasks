import java.util.*;

public class Maximum {

  public static void main(String... args) {
    // loop();
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a floating point number with  spaces separated");
    double firstNumber = scan.nextDouble();
    double secondNumber = scan.nextDouble();
    double thirdNumber = scan.nextDouble();

    double result = numbers(firstNumber, secondNumber, thirdNumber);
    System.out.println("The result is " + result);

  }

  public static void loop() {

  }

  public static double numbers(double firstNumber, double secondNumber, double thirdNumber) {
    double maximumNumber = firstNumber;

    if (secondNumber > maximumNumber) {
      maximumNumber = secondNumber;
    }

    if (thirdNumber > maximumNumber) {
      maximumNumber = thirdNumber;
    }

    return maximumNumber;
  }

}

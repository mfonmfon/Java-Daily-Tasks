import java.util.Scanner;
import java.util.*;

public class FunctionsExample {
  public static void main(String[] args) {

  }

  public static int generateRandom(int firstNumber, int secondNumber) {
    Scanner scan = new Scanner(System.in);
    firstNumber = (int) (Math.random() * 10);
    secondNumber = (int) (Math.random() * 10);

    System.out.println("Enter a number");
    int randomNumber = scan.nextInt();

    if (firstNumber < secondNumber) {
      int temp = firstNumber;
      firstNumber = secondNumber;
      secondNumber = temp;

    }
  }
}
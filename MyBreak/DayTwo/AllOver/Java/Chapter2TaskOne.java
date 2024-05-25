
import java.util.Scanner;

public class Chapter2TaskOne {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the first number: ");
    int firstNumber = scan.nextInt();

    System.out.println("Enter the secondNumber: ");
    int secondNumber = scan.nextInt();

    int squaresOfTwoNumbers = (int) Math.sqrt((firstNumber * firstNumber) + (secondNumber * secondNumber));
    int sum = firstNumber + secondNumber;
    int differenceOfTwoNumbers = firstNumber - secondNumber;
    System.out.printf("%s the squares of the two numbers is: %d%n", differenceOfTwoNumbers, differenceOfTwoNumbers);
    System.out.printf("%s the sum of two numbers is %d%n", sum);
    System.out.printf("%s the difference of two numbers is %d%n ", differenceOfTwoNumbers);

  }
}
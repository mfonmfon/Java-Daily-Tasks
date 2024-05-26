import java.util.*;

public class Comperator {

  public static void main(String[] args) {
    creatingComperator();
  }

  public static void creatingComperator() {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter first number: ");
    int firstNumber = scan.nextInt();

    System.out.println("Enter second number: ");
    int secondNumber = scan.nextInt();

    if (firstNumber == secondNumber) {
      System.out.println("0");

    } else if (firstNumber > secondNumber) {
      System.out.println("1");
    } else if (secondNumber > firstNumber) {
      System.out.println("-1");
    }

  }
}

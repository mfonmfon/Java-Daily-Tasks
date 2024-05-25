package AllOver.Java;

import java.util.Scanner;

public class Chapter2TaskEight {

  public static void main(String... args) {
    getPositiveAndNegativeNumbers();
  }

  public static void getPositiveAndNegativeNumbers() {
    Scanner scan = new Scanner(System.in);

    int number = 0;
    for (int index = 0; index < 5; index++) {
      System.out.println("Enter a number");
      number = scan.nextInt();
      number += number % 10;

    }
    int negativeNumber = 0;
    int positiveNumber = 0;

    if (number == -1) {
      negativeNumber = number;

    } else if (number == 1) {
      positiveNumber = number;
    }
    System.out.println("the negative" + negativeNumber);
    System.out.println("the positive" + positiveNumber);

  }
}

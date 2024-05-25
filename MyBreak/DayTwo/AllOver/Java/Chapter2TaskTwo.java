package AllOver.Java;

import java.util.Scanner;

public class Chapter2TaskTwo {

  public static void main(String... args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number");
    int number = scan.nextInt();

    if (number > 100) {
      System.out.println("greater than 100");

    } else if (number == 100) {
      System.out.println("is equal to 100");
    } else if (number != 100) {
      System.out.println("not equal to 100");
    } else if (number < 100) {
      System.out.println("number is less than 100");
    }

  }
}
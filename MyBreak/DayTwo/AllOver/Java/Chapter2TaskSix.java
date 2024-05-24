package AllOver.Java;

import java.util.Scanner;

public class Chapter2TaskSix {
  public static void main(String[] args) {
    seperateDigits();
  }

  public static int seperateDigits() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number ");
    int digit = scan.nextInt();

    System.out.println(digit + " ");
  }
}

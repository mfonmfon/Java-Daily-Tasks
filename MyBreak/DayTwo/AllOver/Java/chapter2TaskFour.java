package AllOver.Java;

import java.util.Scanner;

public class chapter2TaskFour {

  public static void main(String[] args) {
    largestAndSmallestNumber();
  }

  public static void largestAndSmallestNumber() {

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the first number");
    int firstNumber = scan.nextInt();

    System.out.println("Enter the second number");
    int secondNumber = scan.nextInt();

    System.out.println("Enter the third number");
    int thirdNumber = scan.nextInt();

    System.out.println("Enter the fourth number");
    int fourthNumber = scan.nextInt();

    System.out.println("Enter the fifth number");
    int fifthNumber = scan.nextInt();

    int largestNumber = firstNumber;
    int smallestNumber = fifthNumber;

    if (smallestNumber < firstNumber) {
      smallestNumber = firstNumber;
    } else if (smallestNumber < secondNumber) {
      smallestNumber = secondNumber;
    } else if (smallestNumber < thirdNumber) {
      smallestNumber = thirdNumber;
    } else if (smallestNumber < fourthNumber) {
      smallestNumber = fourthNumber;
    } else if (largestNumber > secondNumber) {
      largestNumber = secondNumber;
    } else if (largestNumber > thirdNumber) {
      largestNumber = thirdNumber;
    } else if (largestNumber > fourthNumber) {
      largestNumber = fourthNumber;
    } else if (largestNumber > fifthNumber) {
      largestNumber = fifthNumber;
    }

    System.out.println("Then smallest number is " + smallestNumber);
    System.out.println("The largestnumber is  " + largestNumber);
  }
}

package AllOver.Java;

import java.util.Scanner;

public class Chapter2TaskThree {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

  }

  public static int sumNumbers(int firstNumber, int secondNumber, int thirdNumber) {

    int sum = firstNumber + secondNumber + thirdNumber;
    return sum;
  }

  public static int productOfNumbers(int firstNumber, int secondNumber, int thirdNumber) {
    int product = firstNumber * secondNumber * thirdNumber;

    return product;
  }

  public static int largestAndSmallests(int firstNumber, int secondNumber, int thirdNumber) {

    int largest = 0;
    int smallest = 0;
    if (firstNumber > secondNumber || firstNumber > thirdNumber) {
      largest = firstNumber;
      return largest;

    } else if (secondNumber > firstNumber || secondNumber > thirdNumber) {
      largest = secondNumber;
      return largest;
    } else if (thirdNumber > firstNumber || thirdNumber > thirdNumber) {
      largest = thirdNumber;
      return largest;

    } else if (firstNumber < secondNumber || firstNumber < thirdNumber) {
      smallest = firstNumber;
      return smallest;

    } else if (secondNumber < firstNumber || secondNumber < thirdNumber) {
      smallest = secondNumber;
      return smallest;

    } else if (thirdNumber < smallest || thirdNumber < smallest) {
      smallest = thirdNumber;
      return smallest;

    }
  }

  public static int averageNumbers(int firstNumber, int secondNumber, int thirdNumber) {

    int average = 0;
    int sum = firstNumber + secondNumber + thirdNumber;
    average = average / sum;
    return average;

  }
}
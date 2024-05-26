import java.util.*;

public class FindTheTwoLargestNumbers {

  public static void main(String[] args) {
    FindTheTwoLargestNumbers();
  }

  public static void FindTheTwoLargestNumbers() {

    Scanner scan = new Scanner(System.in);
    int[] numbers = new int[10];
    int temp = 0;
    int size = numbers.length;

    for (int index = 0; index < size; index++) {
      System.out.println("Enter  a number: ");
      numbers[index] = scan.nextInt();

      for (int indexTwo = 0; indexTwo < size - 1; indexTwo++) {
        if (numbers[indexTwo] > numbers[indexTwo + 1]) {
          temp = numbers[indexTwo];
          numbers[indexTwo] = numbers[indexTwo + 1];
          numbers[indexTwo + 1] = temp;
        }
      }
      for (int number : numbers) {
        System.out.println(number);
      }
    }

  }
}

import java.util.*;

public class Chapter4TaskSix {

  public static void main(String[] args) {
    findLargestNumber();
  }

  public static void findLargestNumber() {
    Scanner scan = new Scanner(System.in);

    int counter = 0;
    int numbers = 0;
    int largestNumber = 0;
    while (counter < 10) {
      System.out.print("Enter a number: ");
      numbers = scan.nextInt();
      if (largestNumber < numbers) {
        largestNumber = numbers;
      }

      counter += 1;
    }
    System.out.println("The largest number is " + largestNumber);

  }
}

import java.util.*;

public class Chapter4TaskFive {
  public static void main(String[] args) {
    salesCommissionCalculator();
  }

  public static void salesCommissionCalculator() {
    Scanner scan = new Scanner(System.in);

    ArrayList<Integer> items = new ArrayList<Integer>();
    int index = 1;
    int total = 0;

    System.out.println("Enter the amount of items you sold last week:  ");
    int numbersOfItemsSold = scan.nextInt();

    total = numbersOfItemsSold + numbersOfItemsSold;
    System.out.println("ITEMS \tVALUES");
    for (; index < 5; index++) {

      // items.add(numbersOfItemsSold);

      // System.out.println("Do you want to continue ");
      // String response = scan.nextLine();

      System.out.println(index + " \t" + total);
    }

  }
}
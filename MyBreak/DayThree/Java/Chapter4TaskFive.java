import java.util.*;

public class Chapter4TaskFive {
  public static void main(String[] args) {
    salesCommissionCalculator();
  }

  public static void salesCommissionCalculator() {
    Scanner scan = new Scanner(System.in);

    ArrayList<Integer> items = new ArrayList<Integer>();

    System.out.println("Enter the items you sold for last week:  ");
    String soldItems = scan.nextLine();

    System.out.println("How many items did you sell? ");
    int numbersOfItemsSold = scan.nextInt();
    items.add(numbersOfItemsSold);

    System.out.println("Enter the total total amount sold: ");
    int amount = scan.nextInt();
    items.add(amount);

    int total = numbersOfItemsSold * amount / numbersOfItemsSold;
    System.out.println("ITEMS       \tVALUES");
    for (int index = 0; index < items.size(); index++) {

      System.out.println(index + items.get(total));
    }

  }
}

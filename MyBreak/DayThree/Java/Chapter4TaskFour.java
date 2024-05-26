import java.util.*;

public class Chapter4TaskFour {

  public static void main(String[] args) {
    creditLimitCalculator();
  }

  public static void creditLimitCalculator() {
    Scanner scan = new Scanner(System.in);

    // int[] customerBalance = new int[10];

    int accountNumber = 10;

    ArrayList<Integer> customerBalance = new ArrayList<Integer>();
    ArrayList<Integer> customerAccountNumber = new ArrayList<Integer>();

    System.out.println("Enter your account number: ");
    accountNumber = scan.nextInt();
    customerAccountNumber.add(accountNumber);

    if (accountNumber < 10 || accountNumber > 100) {
      System.out.println("Please enter a valid account number");
    } else {
      System.out.println("Enter your balance at the beginning of the month: ");
      int beginningBalance = scan.nextInt();
      customerBalance.add(beginningBalance);

      System.out.println("Enter your charges: ");
      int charges = scan.nextInt();

      System.out.println("Enter your total credit limit applied to your account this month: ");
      int creditLimit = scan.nextInt();

      int newBalance = beginningBalance + charges + creditLimit;

      for (int index = 0; index < customerBalance.size(); index++) {
        System.out.println("your new balance is  " + customerBalance.get(index + newBalance));

      }

      if (newBalance < 0.0) {
        System.out.println("Credit limit exceeded");
      } else {

      }
    }

  }
}

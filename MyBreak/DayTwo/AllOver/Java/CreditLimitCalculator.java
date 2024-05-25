package AllOver.Java;

import java.util.Scanner;

public class CreditLimitCalculator {
  public static void main(String[] args) {
    creditLimit();
  }

  public static void creditLimit() {

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter your account number");
    String accountNumber = scan.nextLine();

    System.out.println("Enter your new balance at the beginning of the month ");
    int beginningBalance = scan.nextInt();

    System.out.println("Enter the total items charges for the month");
    int charges = scan.nextInt();

    System.out.println("Enter the credit limit for the month");
    int creditLimit = scan.nextInt();

    int newBalance = beginningBalance + charges - creditLimit;
    System.out.println(newBalance);

  }
}

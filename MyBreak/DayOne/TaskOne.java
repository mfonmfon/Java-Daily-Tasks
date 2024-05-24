package DayOne;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
//import java.util.UUID;

public class TaskOne {

  private String userPin = "4";
  // private String customerNames;
  // private int customersPin;
  ArrayList<String> customerNames = new ArrayList<String>();
  ArrayList<Integer> customersPin = new ArrayList<Integer>();

  public static void main(String... args) {
    // menue();
    preferences();

  }

  public static void preferences() {
    Scanner scan = new Scanner(System.in);
    System.out.println("""
        1 -> Yoruba
        2 -> Igbo
        3 -> Ibibio
        4 -> Hausa
        5 -> English
        0 -> Exit
          """);
    System.out.println("Select your language of preference: ");
    int languagePreferences = scan.nextInt();

    switch (languagePreferences) {
      case 1:
        System.out.println("Hey there, you language of preference is not up to date on this machine.");
        break;
      case 2:
        System.out.println("Hey there, you language of preference is not up to date on this machine.");
        break;
      case 3:
        System.out.println("Hey there, you language of preference is not up to date on this machine.");
        break;
      case 4:
        System.out.println("Hey there, you language of preference is not up to date on this machine.");
        break;
      case 5:
        menue();

      default:

        break;
    }

  }

  public static void menue() {
    Scanner scan = new Scanner(System.in);
    System.out.println("""
        1 -> Create Account
        2 -> Deposit money
        3 -> Transfer
        4 -> close account
        5 -> withdraw
        """);

    System.out.println("Select ");

    int options = scan.nextInt();

    switch (options) {
      case 1:
        createAccount();
        break;
      case 2:
        transfer();
      case 3:
        deposit();
      case 4:
        closeAccount();
      case 5:
        withdraw();

      default:
        exceptions();
        break;
    }
  }

  public static void createAccount() {
    Scanner scan = new Scanner(System.in);

    Random rand = new Random();

    int userPin = rand.nextInt(100);
    int userAccountNumber = rand.nextInt(1000000000);
    System.out.println("Open an account to enjoy safe, versatile and convenient banking with Banke Bank");
    System.out.println();
    System.out
        .println("Let's get started with your full name\nDial #565*0# to check your Bank Verification Number (BVN)");
    System.out.println();
    System.out.println("Enter your full name");
    String userName = scan.next();
    System.out.print("Enter your BVN ");
    Long bankVeriNumber = scan.nextLong();

    System.out.print("Enter your Date Of Birth");
    String dateOfBirth = scan.next();
    System.out.print("Enter your NIN");
    Long idNumber = scan.nextLong();
    System.out.println();
    System.out.println("Let's get started with your Name and pin");
    System.out.println();

    System.out.println("Enter your 4 digit ATM pin");
    userPin = scan.nextInt();

    while (userPin != 4) {
      System.out.println("please enter a correct pin");
      System.out.println("Enter your 4 digit ATM pin");
      userPin = scan.nextInt();
      {
        // int pinNumber = scan.nextInt();
        System.out.println("your accout number is " + (userAccountNumber + "-"));
        userPin++;
      }
    }

  }

  public static void deposit() {
    Scanner scan = new Scanner(System.in);
    // System.out.println("Enter your 4 digit ATM pin");
    // int userPin = scan.nextInt();
    while (true) {
      System.out.println("Enter your 4 digit ATM pin");
      int userPin = scan.nextInt();
      System.out.println("please enter a correct pin");

      if (userPin == 4) {
        System.out.println("your pin is correct");
      }
      System.out.println("Enter your account number");
      int userAccountNumber = scan.nextInt();
    }

  }

  public static void transfer() {

  }

  public static void withdraw() {

  }

  public static void closeAccount() {

  }

  public static void exceptions() {

  }

}

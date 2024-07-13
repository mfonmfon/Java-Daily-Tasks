import java.util.ArrayList;
import java.util.Scanner;

public class Methods {
  private static int userPin;
  private static String userName;
  private static String userEmail;
  private static ArrayList<String> customerInformations = new ArrayList<String>();

  Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {

  }

  public static void menuBar() {
    Scanner scan = new Scanner(System.in);
    System.out.println("______________________");
    System.out.println("......................");
    System.out.println("Welcome to Banke Bank");

    String languagePreference = """
        1. Yourba
        2. Igbo
        3. Ibibio
        4. Hausa
        5. English
        """;
    System.out.println(languagePreference);
    int userOptions = scan.nextInt();
    switch (userOptions) {
      case 1:

        break;
      case 2:

    }

  }

  public static menuBarTwo(){

    String optionsMenu = """"
      1 -> Create Account
      2 -> Desposit
      3 -> Transfer
      4 -> Withdraw 
      5 -> Close Account

      """;

      //System.out.println(optionsMenu);
      
  }
}
import java.util.Scanner;

public class TaxCalculator {
  public static void main(String... args) {
    TaxCalculator();
  }

  public static void TaxCalculator() {
    Scanner scan = new Scanner(System.in);
    int taxRate = 15;
    String citzenName = "";
    System.out.println(
        "Welcome to the TaxCalculator\nWe know you love you country so much\nand one of the way you can suport your country\nis by paying your tax");

    System.out.println("""
        Select your country...

            1 -> Nigeria
            2 -> United State Of America
            3 -> United Kingdom
            4 -> Canada
            5 -> Mexico
            6 -> South Africa
            7 -> Australia
            8 -> New Zealand
            9 -> Egypt
            10 -> British Columbia
            11 -> England
            12 -> Ghana

            """);

    int countryName = scan.nextInt();

    switch (countryName) {

      case 1:
        System.out.print("Enter your full name: ");
        citzenName = scan.next();

        System.out.println("Enter how much you earn: ");
        int citzenEarnings = scan.nextInt();

        if (citzenEarnings <= 15) {
          citzenEarnings -= taxRate;
          System.out.println("Hello " + citzenName + "Your tax rate is " + taxRate);
        } else if (citzenEarnings >= 20) {
          citzenEarnings -= taxRate;
          System.out.println("Helo" + citzenName + " Your tax rate is " + 20 + " ");
        }

    }

  }
}

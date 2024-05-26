package AllOver.Java;

import java.util.ArrayList;
import java.util.Scanner;

public class GasMillage {
  public static void main(String[] args) {
    checkForGasMillage();
  }

  public static void checkForGasMillage() {
    Scanner scan = new Scanner(System.in);

    ArrayList<Integer> miles = new ArrayList<Integer>();
    ArrayList<Double> gallons = new ArrayList<Double>();
    double milesPerGallon = 0;

    System.out.println("Enter the miles driven");
    int milesDriven = scan.nextInt();
    miles.add(milesDriven);

    System.out.println("Enter the gallon used: ");
    double gallonUsed = scan.nextInt();
    gallons.add(gallonUsed);

    milesPerGallon = milesDriven / gallonUsed;

    System.out.println("The gallons used for each tankful  is " + milesPerGallon);

  }
}
package AllOver.Java;

import java.util.Scanner;

public class BodyMassIndex {
  public static void main(String[] args) {
    findTheBodyMassIndex();
  }

  public static void findTheBodyMassIndex() {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter your weight in kilograms: ");
    int weight = scan.nextInt();

    System.out.println("Enter your height in meters:  ");
    int height = scan.nextInt();

    int totalWeight = 0;
    int totalHeight = 0;

    totalWeight = weight * 703;
    totalHeight = height * height;

    int Bmi = totalWeight / totalHeight;

    System.out.println("Your body mass index is " + Bmi);
  }
}

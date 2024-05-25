package AllOver.Java;

import java.util.Scanner;

public class chapter2TaskFive {

  public static void main(String[] args) {
    areaOfCircle();
  }

  public static void areaOfCircle() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the area of circle");
    int area = scan.nextInt();

    int diameter = 0;
    int circumference = 0;
    int radius = 0;
    // int pi = 3.14159;

    diameter = radius * radius;
    circumference = diameter * 22 / 7;
    area = diameter * 22 / 7;

    System.out.println("The area of circle is " + area);

  }
}

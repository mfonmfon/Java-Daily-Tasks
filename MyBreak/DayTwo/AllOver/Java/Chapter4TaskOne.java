package AllOver.Java;

import java.util.Scanner;

public class Chapter4TaskOne {

  public static void main(String[] args) {
    checkForStudentGrades();
  }

  public static void checkForStudentGrades() {
    Scanner scanner = new Scanner(System.in);
    int counter = 0;
    int total = 0;
    double average = 0;
    int studentGrades = 0;

    while (studentGrades != -1) {
      System.out.println("Enter student grades or -1 to exit");
      studentGrades = scanner.nextInt();

      total = total + studentGrades;
      counter = counter + 1;
    }
    if (counter != 0) {
      average = (double) total / studentGrades;
      System.out.printf("%n total of the %d grades entered is %d%n", counter, total);
      System.out.println("Class average is " + average);
    } else {
      System.out.println("No grades were entered");
    }
  }
}

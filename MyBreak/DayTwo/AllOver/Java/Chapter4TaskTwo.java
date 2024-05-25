package AllOver.Java;

import java.util.Scanner;

public class Chapter4TaskTwo {
  public static void main(String[] args) {
    studentExamScores();
  }

  public static void studentExamScores() {

    Scanner scan = new Scanner(System.in);
    int gradesCounter = 0;
    int grades = 0;
    int passes = 0;
    int failed = 0;

    while (gradesCounter < 10) {
      System.out.println("Enter student grades ");
      grades = scan.nextInt();

      if (grades > 10) {
        passes += 1;
      } else {
        failed += 1;
      }
      gradesCounter += 1;
    }
    System.out.printf("%n Passed: %d%n Failed: %d%n", passes, failed);
  }
}
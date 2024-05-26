package JavaScript;

import java.util.*;

public class StudentGrade2 {

  public static void main(String... args) {
    studentAndSubjectOffered();
  }

  public static void studentAndSubjectOffered() {
    Scanner scan = new Scanner(System.in);
    System.out.println("How many student do you have? ");
    int student = scan.nextInt();
    System.out.println("How many subject do they offer? ");
    int subject = scan.nextInt();
    System.out.printf("Saving>>>>>>>>>>>>>>>>>>%nSaved Successfully%n");

    int[][] grades = new int[student][subject];

    for (int index = 0; index < student; index++) {
      System.out.println("Enter score for student " + (index + 1) + " ");
      for (int indexTwo = 0; indexTwo < subject; indexTwo++) {
        System.out.println("Enter score for subject " + (indexTwo + 1) + " ");
        grades[index][indexTwo] = scan.nextInt();
        System.out.println("Saving>>>>>>>>>>>>>>>>>>>>>>>>\nSaved Successfully\n");
      }
    }
    System.out.println("=============================================================");
    System.out.print("STUDENT ");
    for (int index = 0; index < student; index++) {
      System.out.print("SUB" + (index + 1) + " ");
      for (int indexTwo = 0; indexTwo < subject; indexTwo++) {

      }
      System.out.print("\nStudent" + (index + 1));
    }
    System.out.println();
  }
}

package AllOver.Java;

import java.util.Scanner;

public class Chapter2TaskSeven {

  public static void main(String[] args) {
    squaresInTable();
  }

  public static void squaresInTable() {
    Scanner scan = new Scanner(System.in);

    int squares = 0;
    // int numbers = 0;
    int cubes = 0;

    System.out.println("\tNumbers    \tSquares   \tCubes");
    for (int index = 0; index < 11; index++) {
      squares = index * index;
      cubes = squares * index;
      System.out.println("    \t" + index + "         \t" + squares + "        \t" + cubes);

    }

  }
}

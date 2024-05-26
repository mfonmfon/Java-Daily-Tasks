public class Chapter4TaskSeven {
  public static void main(String[] args) {
    tabularOutPuts();
  }

  public static void tabularOutPuts() {

    int firstNumber = 0;
    int secondNumber = 0;
    int thirdNumber = 0;
    System.out.println("N  \tN2  \tN3  \tN4");
    for (int index = 1; index < 6; index++) {
      firstNumber = index * index;
      secondNumber = index * index * index;
      thirdNumber = index * index * index * index;
      System.out.println(index + "  \t" + firstNumber + " \t" + secondNumber + " \t" + thirdNumber);

    }
  }
}

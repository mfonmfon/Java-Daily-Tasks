public class Chapter4TaskThree {

  public static void main(String[] args) {

    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
    System.out.println(elementInArays(numbers));
  }

  public static int[] elementInArays(int[] array) {
    int[] number = new int[5];
    int maximumNumber = array[5];
    for (int index = 0; index < array.length; index++) {
      if (array[index] > maximumNumber) {
        maximumNumber = array[index];
      }
    }
    return maximumNumber;
  }
}
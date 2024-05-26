public class SwapArrays {
  public static void main(String[] args) {
    swap();
  }

  public static void swap() {
    int[] numbers = new int[10];

    int temp = 0;

    for (int index = 0; index < numbers.length; index++) {

      for (int indexTwo = 0; indexTwo < numbers.length - 1; indexTwo++) {
        if (numbers[indexTwo] > numbers[index])
          temp = numbers[indexTwo];
        numbers[indexTwo] = numbers[index];
        numbers[index] = temp;

      }

    }

  }
}

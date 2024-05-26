import java.util.*;

public class CrytoGraphy {

  public static void main(String... args) {
    privacyWithCrypto();
  }

  public static void privacyWithCrypto() {
    Scanner scan = new Scanner(System.in);

    int temp = 0;
    int[] crypto = new int[4];

    for (int index = 0; index < crypto.length; index++) {

      System.out.println("Enter your encrypted transmitted data: ");
      crypto[index] = scan.nextInt();

      int newData = crypto[index] + 7 % 10;

      for (int indexTwo = 0; indexTwo < crypto.length - 1; indexTwo++) {

        if (crypto[indexTwo] > crypto[index]) {
          temp = crypto[indexTwo];
          crypto[indexTwo] = crypto[index];
          crypto[index] = temp;
        }

      }
      for (int cryptos : crypto) {
        System.out.print(cryptos + " ");
      }

    }

  }
}

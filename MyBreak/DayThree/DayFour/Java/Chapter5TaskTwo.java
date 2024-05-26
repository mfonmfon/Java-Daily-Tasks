public class Chapter5TaskTwo {
  public static void main(String... args) {
    checkNumbers();
  }

  public static void checkNumbers() {
    double principal = 1000.0;
    double rate = 0.05;

    for (int years = 0; years < 10; years++) {

      double amount = principal * Math.pow(1.0 + rate, years);

      System.out.printf("%4d%20.2f%n", years, amount);
    }
  }
}

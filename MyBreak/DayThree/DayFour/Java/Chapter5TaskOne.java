public class Chapter5TaskOne {
  public static void main(String[] args) {
    TaskOne();
  }

  public static void TaskOne() {
    int total = 0;
    for (int index = 2; index <= 20; index += 2) {

      total += index;
    }
    System.out.println(total);
  }
}

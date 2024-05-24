public class solve {
  public static int createAccount() {

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your account: ");
    int account = scan.nextInt();

    System.out.println("Enter your pin: ");
    int pin = scan.nextInt();

    System.out.println("Enter your first name: ");
    String firstName = scan.next();

    System.out.println("Enter your last name: ");
    String lastName = scan.next();

    System.out.println("select options ");
    String line = scan.next();

    switch (line){
      case 1:
        System.out.println("Enter your first name: ");
        String firstName = scan.next();
        System.out.println("Enter your last name: ");
        String lastName = scan.next();
        break;
        
        case 2:
        System.out.println("Enter your first name: ");
        String firstName = scan.next();
        System.out.println("Enter your last name: ");
        String lastName = scan.next();
        break;

    return account;

  }
}
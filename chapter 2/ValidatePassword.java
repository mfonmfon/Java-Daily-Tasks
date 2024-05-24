import java.util.Scanner;
import java.util.ArrayList;
public class ValidatePassword{

	

	public static void main(String... args){
	
	menuBar();
	menuOptions();
	createAccount();

	}
	public static void menuBar(){
	Scanner scan = new Scanner(System.in);
	System.out.println("_______________________________________");
	System.out.println("WELCOME TO BANKE BANK");
	System.out.println("_______________________________________");
	System.out.println( """ 
	1 -> Yoruba
	2 -> Hausa
	3 -> Ibibio
	4 -> Igbo
	5 -> English
	""");
	int languageResponse = scan.nextInt();

	switch(languageResponse){
		case 1:
			System.out.println("this language preference is to up to date on this system please try another one");
			break;
		case 2:
			System.out.println("this language preference is to up to date on this system please try another one");
			break;
		case 3:
			System.out.println("this language preference is to up to date on this system please try another one");
			break;
		case 4:
			System.out.println("this language preference is to up to date on this system please try another one");
			break;
		case 5:
			System.out.println("Welcome to Banke Bank");
	
	System.out.println(languageResponse);
	}
	}

	public static void menuOptions(){
	Scanner scan = new Scanner(System.in);
	String userPin = "4";
	System.out.println("""
_________________________________________________
|________________________________________________|
|................................................|
|                                                |
|	    	BANKE BANK                       |
|________________________________________________|
|						 |
|						 |
|						 |
|	1. Create an account 			 |
|           	                                 |
|	2. Deposit Money	                 |		
|                                                |
|	3. Check Account Balance                 |
|                                                |
|	4. Transfer Money to another account     |
|                                                |
|	5. Withdraw money                        |
|                                                |
|	6. Change Pin	                         |
|	                                         |
|	7. Close account                         |
|________________________________________________|
	""");
	int option = scan.nextInt();



	}

	public static void createAccount(){

	Scanner scan = new Scanner(System.in);

	System.out.println("Enter your full name");
	String userName = scan.nextLine();
	System.out.println("Enter your BVN");
	int bankVerificationNumber = scan.nextInt();
	System.out.println("Enter your NIN");
	int nationalId = scan.nextInt();
	System.out.println("Enter your 4-digit ATM pin);
	String userPin = scan.next();

	if(userPin.length() < 4){
		System.out.println("Please enter the correct pin");
	}
	if(userPin.length() > 4){
		System.out.println("Please enter your correct pin");
	}
	else{
		System.out.println("Hello " + userFirstName);
		System.out.println("Your account number is " + accountNumber);
		System.out.println()
	}
	
	

	
	}

	

}
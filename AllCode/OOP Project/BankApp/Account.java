package BankApp;

public class Account {

    private String pin;
    private String accountName;
    private int accountNumber;
    private  int balance;

    public Account(String accountName, int accountNumber, String pin, int balance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }
    public String getAccountName() {
        return accountName;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public static  int checkBalance(int amount) {
        int balance = 0;
       if(amount > 0){
           amount = balance  ;
       }
       return  amount;
    }
    public static int deposit(int amount) {
        int balance = 0;
        if(amount > 0){
            balance += amount;
        }
        return amount;
    }
    public int withdraw(int amount) {
        if(amount > 0){
            balance -= amount;
        }
        return amount;
    }
}

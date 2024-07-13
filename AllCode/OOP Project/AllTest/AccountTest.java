package AllTest;

import BankApp.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AccountTest {

    @Test
    public void checkThatAccountExist(){
        Account account = new Account("Mfon","122332242");
    }

    @Test
    public void checkToGetAccountName(){
        Account myAccount = new Account("Mfon", "12332323");
        Assertions.assertEquals("Mfon", myAccount.getAccountName());
    }
    @Test
    public  void checkToGetAccountNumber(){
        Account account = new Account("Mfon", "8147995494");
        Assertions.assertEquals("8147995494", account.getAccountNumber());
    }
    @Test
    public void checkForBalance(){
        Account account = new Account("Mfon", "12332323");
        Assertions.assertEquals(0, Account.checkBalance(100));
    }

    //this test does not seem correct but will come back to it

    @Test
    public void checkThatDeposit_working(){
        Account account = new Account("Mfon", "08123115688");
        Assertions.assertEquals(0,Account.deposit(100));
    }
    @Test
    public void checkThatWithdraw_working(){
        Account account = new Account("Mfon", "12332323");
        Assertions.assertEquals(100, account.withdraw(0));
    }
}

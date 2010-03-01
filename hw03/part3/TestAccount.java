//This class has the main function for part3.
import java.util.Calendar;

public class TestAccount
{
    public static void main (String [] args)
    {
        //Instantiating startuptest
        Startup startupTest = new Startup(10000);
        BankAccount testBankAccount = new BankAccount(startupTest);
        Debit chargeOne = new Debit(2000);
        testBankAccount.debit(chargeOne);
        testBankAccount.printBalance();
        Credit chargeTwo = new Credit(4000);
        testBankAccount.credit(chargeTwo);
        testBankAccount.printBalance();
        
        MinMaxAccount minMaxTestBankAccount = new MinMaxAccount(startupTest);
        Debit chargeThree = new Debit(500);
        Credit chargeFour = new Credit(1000);
        
        //Charging and adding credit according to specifications
        for (int counter = 0; counter < 10 ; ++counter)
        {
            minMaxTestBankAccount.credit(chargeFour);
            minMaxTestBankAccount.debit(chargeThree);
        } 
        minMaxTestBankAccount.printBalance();
    }
}
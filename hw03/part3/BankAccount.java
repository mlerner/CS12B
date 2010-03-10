//This class defines behavior for BankAccount objects.

import java.util.Calendar;

public class BankAccount
{
    int balance;
    Calendar mostRecentAction;
    
    //Beginning of constructor method.
    public BankAccount(Startup s)
    {
        balance = s.getAmount();
        mostRecentAction = s.getDate();
    }//end of constructor method
    
    // record the given Debit object
    // it SUBTRACTS the debit amount to the current balance
    public void debit (Debit d)
    {
        this.balance -= d.getAmount();
        mostRecentAction = d.getDate(); 
    }//end of debit method
    
    // record the given Credit object
    // it ADDS the credit amount from the current balance
    public void credit (Credit c)
    {
        this.balance += c.getAmount();
        mostRecentAction = c.getDate();
    }//end of credit method
    
    //getBalance() returns the balance of the account
    public int getBalance(){
        return this.balance;
    }//end of getBalance method
    
    //printBalance() prints the balance of the account
    public void printBalance(){
        System.out.format("Balance: %d\n\n", this.getBalance());
    }//end of printBalance()
    
}
//This class extends functionality from the BankAccount class.

import java.util.Calendar;

public class MinMaxAccount extends BankAccount
{
    private int minBalance;
    private int maxBalance;
    public MinMaxAccount(Startup s)
    {
        super(s);
        minBalance = super.getBalance();
        maxBalance = super.getBalance();
        
    }
    // record the given Debit object
    // it SUBTRACTS the debit amount to the current balance
    public void debit (Debit d)
    {
        //If balance is less than the minimum balance, set minimum balance to current balance.
        if ((super.balance = super.getBalance() - d.getAmount()) < this.getMin()) 
        {
            this.minBalance = super.getBalance();
        }
        //set most recent action to date
        mostRecentAction = d.getDate(); 
    }
    
    // record the given Credit object
    // it ADDS the credit amount from the current balance
    public void credit (Credit c)
    {
        //If balance is greater than the max balance, set max balance to current balance.
        if ((super.balance = super.getBalance() + c.getAmount()) > this.getMax()) 
        {
            this.maxBalance = super.getBalance();
        }
        mostRecentAction = c.getDate();
    }
    
    //getMin() returns minimum balance
    public int getMin()
    {
        return this.minBalance;
    }//end of getMin()
    
    //getMax() returns minimum balance
    public int getMax()
    {
        return this.maxBalance;
    }//end of getMax()
    
    //printBalance() of account
    public void printBalance(){
        System.out.format("Balance: %d\nMaximum Balance: %d\nMinimum Balance: %d\n\n", this.getBalance(), this.getMax(), this.getMin());
    }//end of printBalance
}
//This class initializes data for a bank account.
import java.util.Calendar;

public class Startup 
{
    Calendar dateOfCreation;
    private int transactionValue;
    
    //Beginning of constructor
    public Startup (int transactionValue)
    {
        this.transactionValue = transactionValue;
        this.dateOfCreation = Calendar.getInstance();
    }//end of constructor
      
    //getDate() returns the date of the transaction
    public Calendar getDate()
    {
        return this.dateOfCreation;
    }//end of getDate()
    
    //getAmount() returns
    public int getAmount()
    {
        return this.transactionValue;
    }
}
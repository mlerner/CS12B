//This class defines Credit object attributes. 
//It extends startup.
import java.util.Calendar;

public class Credit extends Startup
{
    Calendar dateofCredit;
    int transactionAmount;
    
    //Beginning of constructor method
    public Credit(int debitValue)
    {
        super(debitValue);
    }//end of constructor method.

}
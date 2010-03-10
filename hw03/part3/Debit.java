//This class defines the Debit object and extends startup so that money can be withdrawn.

import java.util.Calendar;

public class Debit extends Startup
{
    private int debitAmount;
    
    //beginning of constructor method
    public Debit(int debitAmount)
    {
        super(debitAmount);
    }//end of constructor method
    
}
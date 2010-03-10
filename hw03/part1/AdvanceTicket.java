//This class creates AdvanceTicket object definitions. It extends RegularTicket.

public class AdvanceTicket extends RegularTicket{
	private int daysInAdvance;
	private static final int FIRST_DAY_LIMIT = 20;
	private static final int SECOND_DAY_LIMIT = 10;
	
	private static final int EARLIEST_PRICE = 15;
	private static final int MIDDLE_PRICE = 20;
	private static final int LATEST_PRICE = 40;
	
	//This is the constructor for AdvanceTicket
	public AdvanceTicket(int ticketNumber, int daysInAdvance)
	{
	    super(ticketNumber);
	    //This program logic determines the price you get based upon how many 
	    //days in advance your ticket was purchased.
	    
		if (daysInAdvance >= FIRST_DAY_LIMIT )
		{
			super.price = EARLIEST_PRICE;
		} 
		else if (daysInAdvance < FIRST_DAY_LIMIT && daysInAdvance > SECOND_DAY_LIMIT)
		{
			super.price = MIDDLE_PRICE;
		}
		else
		{
			super.price = LATEST_PRICE;
		}
		this.daysInAdvance = daysInAdvance;
		
	}//end of constructor
	
	//toString returns ticket data as a string.
	public String toString()
	{
		return super.toString() + "This ticket was purchased " + this.daysInAdvance + " days in advance.\n";
	}//end of method toString
} 

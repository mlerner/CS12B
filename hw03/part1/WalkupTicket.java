//This class defines behavior for tickets purchased as walkups.
//It extends the regular ticket class.
public class WalkupTicket extends RegularTicket{
	
	//This is the constructor for WalkupTicket, and it sets the price to $50.
	public WalkupTicket(int ticketNumber){
	    super(ticketNumber);
		super.price = 50.0;
	}
	
	//toString returns ticket data as a string.
	public String toString(){
		return super.toString() + "This is a walkup ticket.\n";
	}//end of method toString
	
}
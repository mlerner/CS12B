//This class defines behavior for a ticket purchased by a student in advance and
// extends AdvanceTicket.
public class StudentAdvanceTicket extends AdvanceTicket{
    	
	//This is the constructor for StudentAdvanceTicket
	public StudentAdvanceTicket(int ticketNumber, int daysInAdvance){
		super(ticketNumber, daysInAdvance);
		//All student advance tickets are half price of advance tickets
		super.price = super.getPrice() / 2;		
	}//end of constructor
	
	//toString returns ticket data as a string.
	public String toString(){
		return super.toString() + "This ticket requires ID.\n";
	}//end of method toString
	
}
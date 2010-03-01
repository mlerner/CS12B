//This class creates RegularTicket and is extended by other other classes.
public class RegularTicket{
	double price = 40.00;
	private int ticketNumber;
	
	//This is the constructor for a Regular Ticket object
	public RegularTicket(int ticketNumber){
		this.ticketNumber = ticketNumber;
	}//end of constructor
	
	//getPrice returns price as a double.
	public double getPrice(){
		return this.price;
	}//end of method getPrice
	
	//toString returns ticket data as a string.
	public String toString(){
	    String output = String.format("Ticket ##: %d\nPrice: $%.2f\n", this.ticketNumber, this.getPrice());
		return output;
	}//end of method toString
	
}
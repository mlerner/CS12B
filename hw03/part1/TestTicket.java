//This class has the main function for part1 and calculates the total ticket 
//price as well as assigning tickets to the ticket array.
import java.util.Scanner;

public class TestTicket{
    //The total amount of tickets is 16
    private static int TOTAL_TICKETS = 16;
    
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
           
        //Initializing ticketArray
        RegularTicket [] ticketArray;
        ticketArray = new RegularTicket[TOTAL_TICKETS];
        
        //Initial ticket number is set to 1.
        int ticketNumber = 1;
        
        //While the amount of tickets is less than the maximum, add these tickets to the database.
        while (ticketNumber <= TOTAL_TICKETS){
            //If the ticket is in positions 0-2 or 11-15...
            if (ticketNumber - 1 < 3 || ticketNumber - 1 > 10)
            {
                ticketArray[ticketNumber - 1]= new RegularTicket(ticketNumber);
            }
            //If the ticket is in positions 3 && 4
            else if (ticketNumber - 1 < 5)
            {
                ticketArray[ticketNumber - 1] = new WalkupTicket(ticketNumber);
            }
            //If the ticket is in positions 5, 6, 7...
            else if (ticketNumber - 1 < 8)
            {
                System.out.println("How many days in advance was the Advance Ticket purchased?");
                int daysInAdvance = input.nextInt();
                ticketArray[ticketNumber - 1] = new AdvanceTicket(ticketNumber, daysInAdvance);
            }
            //If the ticket is in positions 8, 9, 10...
            else if (ticketNumber - 1 < 11)
            {
                System.out.println("How many days in advance was the Student Advance Ticket purchased?");
                int daysInAdvance = input.nextInt();
                ticketArray[ticketNumber - 1] = new StudentAdvanceTicket(ticketNumber, daysInAdvance);
            }
            ++ticketNumber;
        }
        //Print the tickets in the array.
        printTickets(ticketArray);
        System.out.format("The total price of the tickets is $%.2f\n", getTotalPrice(ticketArray));
    }
    
    //printTickets goes through the array of objects and calls their toString()
    // methods to print tickets
    public static void printTickets(RegularTicket [] ticketArray)
    {
        for (int index = 0; index < TOTAL_TICKETS; ++index)
        {
            System.out.println(ticketArray[index].toString());
        }
    }//End of printTickets
    
    //getTotalPrice increments through the ticketArray and adds prices together,
    // returning it as a double.
    public static double getTotalPrice(RegularTicket[] ticketArray)
    {
        double totalPrice = 0.00;
        for (int index = 0; index < TOTAL_TICKETS; ++index)
        {
            totalPrice += ticketArray[index].getPrice();
        }
        return totalPrice;
    }//End of getTotalPrice

}//End of class Test Ticket.


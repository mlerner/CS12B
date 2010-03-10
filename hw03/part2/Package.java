//This class defines behaviors and states for a normal package. 
//It also assigns prices based upon user input.

public class Package{
    char shippingMethod;
    int weight;
    double price;
    private static int LOWER_RATE_LIMIT = 8;
    private static int MIDDLE_RATE_LIMIT = 16;
    private static char AIR = 'A';
    private static char TRUCK = 'T';
    private static char MAIL = 'M';
    
    //Constructor class
    public Package(int weight, char shippingMethod)
    {
        this.weight = weight;
        this.shippingMethod = shippingMethod;
        //Assigning prices according to specifications
        if (weight <= LOWER_RATE_LIMIT)
        {
            if (shippingMethod == AIR)
            {
                this.price = 2.00;
            } 
            else if (shippingMethod == TRUCK)
            {
                this.price = 1.5;
            }
            else if (shippingMethod == MAIL)
            {
                this.price = .5;
            }
        }
        else if (weight <= MIDDLE_RATE_LIMIT)
        {
            if (shippingMethod == AIR)
            {
                this.price = 3.00;
            } 
            else if (shippingMethod == TRUCK)
            {
                this.price = 2.35;
            }
            else if (shippingMethod == MAIL)
            {
                this.price = 1.50;
            }
        }  
        else if (weight > MIDDLE_RATE_LIMIT)
        {
            if (shippingMethod == AIR)
            {
                this.price = 4.50;
            } 
            else if (shippingMethod == TRUCK)
            {
                this.price = 3.25;
            }
            else if (shippingMethod == MAIL)
            {
                this.price = 2.15;
            }
        }
    }//end of constructor
    
    //printData prints all applicable information about a package.
    public void printData()
    {
        System.out.format("\nData for Package\nWeight: %d\nShipping Method: %c \nShipping Cost: $%.2f\n", this.weight, this.shippingMethod, this.price);
    }//end of printData
}
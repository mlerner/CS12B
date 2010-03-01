//This class defines behavior for a package that is insured by adding on extra charges.
public class InsuredPackage extends Package{
    
    public InsuredPackage(int weight, char shippingMethod)
    {
        //Inherit behavior from super class
        super(weight, shippingMethod);
        
        //Assigning additional price according to specifications
        if (super.price < 1.00)
        {
            super.price += 2.45;
        } 
        else if (super.price <= 3.00)
        {
            super.price += 3.95;
        }
        else if (super.price >= 3.01)
        {
            super.price += 5.55;
        }
    }
    
    
    
}
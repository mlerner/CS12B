//This class is where the magic happens. It creates packages based upon user input.
import java.util.Scanner;

public class UsePackage{
    public static void main (String [] args)
    {
        int weight;
        char shippingMethod;
        
        Scanner input = new Scanner(System.in);
        
        //Ask user for information about the package and scan data.
        System.out.print("Shipping method: ");
        shippingMethod = input.next().charAt(0);
        System.out.print("Weight: ");
        weight = input.nextInt();
        
        //Creating testPackage
        Package testPackage = new Package(weight, shippingMethod);
        testPackage.printData();
        System.out.println();
        
        System.out.print("Shipping method: ");
        shippingMethod = input.next().charAt(0);
        System.out.print("Weight: ");
        weight = input.nextInt();
        
        //Creating testInsuredPackeage
        InsuredPackage testInsuredPackage = new InsuredPackage(weight, shippingMethod);
        testInsuredPackage.printData();
    }

}
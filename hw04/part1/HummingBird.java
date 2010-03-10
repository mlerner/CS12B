import java.util.Random;
import java.awt.*;

//This class defines the behavior and state of a Hummingbird object
public class Hummingbird extends AbstractBird {
    int timesFlown = 0;
    
    //Constructor method for Hummingbird objects
    public Hummingbird(int x, int y)
    {
        super(x, y);
        super.incrementCreated();
        super.setColor(Color.MAGENTA);
    }//End of constructor method
    
    //fly() moves the bird based upon specified behavior
    public void fly()
    {   
        //generate random coordinates within bounds and fly to them.
        Random randomNumber = new Random();
        int randomX = randomNumber.nextInt(20);
        int randomY = randomNumber.nextInt(20);
        super.setX(randomX);
        super.setY(randomY);
        //add to times flown
        super.incrementFlown();
    }//End of fly()
   
    
    
}
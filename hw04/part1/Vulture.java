import java.awt.*;
public class Vulture extends AbstractBird{
    private int directionFacing = 0;
    
    //Constructor method for Vulture
    public Vulture(int x, int y)
    {
        super(x, y);
        super.incrementCreated();
        super.setColor(Color.BLACK);
    }//End of constructor
    
    //fly() moves the bird based upon specified behavior
    public void fly()
    {
        //this logic determines which way the bird is facing, and flies in that
        //direction. It then increments the direction. If the direction is the 
        //last change in direction, start process over again/
        
        if (directionFacing == 0)
        {
            super.translateUp();
            ++directionFacing;
        } 
        else if (directionFacing == 1)
        {
            super.translateLeft();
            ++directionFacing;
        }
        else if (directionFacing == 2)
        {
            super.translateDown();
            ++directionFacing;
        } 
        else if (directionFacing == 3)
        {
            super.translateRight();
            directionFacing = 0;
        } 
        super.incrementFlown();
    }
}
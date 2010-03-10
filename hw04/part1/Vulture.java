import java.awt.*;
public class Vulture extends AbstractBird{
    private int directionFacing = 0;
    
    public Vulture(int x, int y)
    {
        super(x, y);
        super.incrementCreated();
        super.setColor(Color.BLACK);
    }
    
    public void fly()
    {
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
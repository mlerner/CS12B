import java.awt.*;

public class Cardinal extends AbstractBird implements AviaryConstants{
    //Hmmm..shoud I set the color in hear or in the abstract class.
    
    public static int UP = 0;
    public static int DOWN = 1;
    int flyingDirection = 1;
    
    public Cardinal(int x, int y)
    {
        super(x, y);
        super.incrementCreated();
        super.setColor(Color.RED);
    }
    
    public void fly()
    {
        if (super.getY() == SIZE - 1)
        {
            flyingDirection = DOWN;
        }
        else if (super.getY() == 0 )
        {
            flyingDirection = UP;
        }
        
        if (flyingDirection == UP)
        {
            super.translateDown();
        } 
        else if (flyingDirection == DOWN)
        {
            super.translateUp();
        } 
        super.incrementFlown();
    }
}
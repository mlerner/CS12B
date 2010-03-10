import java.awt.*;

public class Cardinal extends AbstractBird implements AviaryConstants{
    public static int UP = 0;
    public static int DOWN = 1;
    private int flyingDirection = DOWN;
    
    //Constructor method for Cardinal objects
    public Cardinal(int x, int y)
    {
        super(x, y);
        super.incrementCreated();
        super.setColor(Color.RED);
    }//End of constructor method
    
    //fly() moves the bird based upon specified behavior
    public void fly()
    {
        //If the bird is at the edges, change direction
        if (super.getY() == SIZE - 1)
        {
            flyingDirection = DOWN;
        }
        else if (super.getY() == 0 )
        {
            flyingDirection = UP;
        }
        
        //Interpret flying direction, and translate point accordingly
        if (flyingDirection == UP)
        {
            super.translateDown();
        } 
        else if (flyingDirection == DOWN)
        {
            super.translateUp();
        } 
        
        super.incrementFlown();
    }//End of fly()
}
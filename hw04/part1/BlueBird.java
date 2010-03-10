import java.awt.*;

//This class defines the behavior and state of a Bluebird object
public class Bluebird extends AbstractBird implements AviaryConstants{  
    private static int PATTERN_ONE = 1;
    private static int PATTERN_TWO = 2;
    //starting out with PATTERN_ONE
    private int pattern = 1; 
    private int subPattern = 0;
    
    //Constructor for Bluebird
    public Bluebird(int x, int y)
    {
        super(x, y);
        super.incrementCreated();
        super.setColor(Color.BLUE);
    }//End of constructor
    
    //fly() moves the bird based upon specified behavior
    public void fly()
    {
        //If the bird is at the edges, switch direction
        if (super.getX() == 0)
        {
            pattern = PATTERN_ONE;
        }
        else if (super.getX() == 20 )
        {
            pattern = PATTERN_TWO;
        }
        
        //Switch for two different patterns...
        if (pattern == PATTERN_ONE)
        {
            //down-right
            if (subPattern == 0){
                super.translateDown();
                super.translateRight();
                subPattern = 1;
            }
            //up-right
            else if (subPattern == 1)
            {
                super.translateUp(); 
                super.translateRight();         
                subPattern = 0;
            }
            
            
        } 
        else if (pattern == PATTERN_TWO)
        {
            //down-left
            if (subPattern == 0){
                super.translateDown();
                super.translateLeft();
                subPattern = 1;
            }
            //up-left
            else if (subPattern == 1)
            {
                super.translateUp();
                super.translateLeft();
                subPattern = 0;
            }
        } 
        //add to the amount of times this bird has flown
        super.incrementFlown();
    }//End of fly()
}
import java.awt.*;

public class Bluebird extends AbstractBird{  
    private static int PATTERN_ONE = 1;
    private static int PATTERN_TWO = 2;
    private int pattern = 1; 
    private int subPattern = 0;
    
    public Bluebird(int x, int y)
    {
        super(x, y);
        super.incrementCreated();
        super.setColor(Color.BLUE);
    }
    
    public void fly()
    {
        //possibly do switches for this
        if (super.getX() == 0)
        {
            pattern = PATTERN_ONE;
        }
        else if (super.getX() == (20 - 1) )
        {
            pattern = PATTERN_TWO;
        }
        
        if (pattern == PATTERN_ONE)
        {
            //up-right
            if (subPattern == 0){
                super.translateDown();
                super.translateRight();
                subPattern = 1;
            }
            //down-right
            else if (subPattern == 1)
            {
                super.translateUp(); 
                super.translateRight();         
                subPattern = 0;
            }
            
            
        } 
        else if (pattern == PATTERN_TWO)
        {
            //up
            if (subPattern == 0){
                super.translateDown();
                super.translateLeft();
                subPattern = 1;
            }
            //down
            else if (subPattern == 1)
            {
                super.translateUp();
                super.translateLeft();
                subPattern = 0;
            }
            //left
            
        } 
        super.incrementFlown();
    }
}
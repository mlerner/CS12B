import java.util.Random;
import java.awt.*;

public class Hummingbird extends AbstractBird {
    int timesFlown = 0;
    
    public Hummingbird(int x, int y)
    {
        super(x, y);
        super.incrementCreated();
        super.setColor(Color.MAGENTA);
    }
    
    public void fly()
    {   
        Random randomNumber = new Random();
        int randomX = randomNumber.nextInt(20);
        int randomY = randomNumber.nextInt(20);
        super.setX(randomX);
        super.setY(randomY);
        super.incrementFlown();
    }
   
    
    
}
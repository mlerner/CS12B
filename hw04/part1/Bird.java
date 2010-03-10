import java.awt.*;

//This interface shows methods that a bird must have.
public interface Bird {
    public Color getColor();
    public Point getPosition();
    public void fly();
    public int getFlown();
    public int getCreated();
}
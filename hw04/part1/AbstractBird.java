import java.awt.*;

public abstract class AbstractBird implements Bird{
    private Color color;
    public static int UP = 0;
    public static int DOWN = 1;
    public static int RIGHT = 2;
    public static int LEFT = 3;
    protected int timesFlown = 0;
    private static int birdsCreated = 0;
    private int objects;
    private int x;
    private int y;
    
    public AbstractBird(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void incrementFlown(){
        ++this.timesFlown;
    }
    
    public int getFlown(){
        return this.timesFlown;
    }
    
    public void incrementCreated()
    {
        
        this.birdsCreated++;
        objects = this.birdsCreated;
        
    }
    
    public int getCreated(){
        return this.birdsCreated;
    }
    
    public void setColor(Color c)
    {
        this.color = c;
    }
    
    public Color getColor(){
        return this.color;
    }
    
    public abstract void fly();
    
    public Point getPosition(){
        Point getPosition = new Point(this.getX(), getY());
        return getPosition;
    }
    
    public void setX(int x)
    {
        this.x = x;
    }
    
    public void setY(int y)
    {
        this.y = y;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public void translateUp()
    {
        this.setY(this.getY() - 1);
    }
    
    public void translateDown()
    {
        this.setY(this.getY() + 1);
    }
    
    public void translateLeft()
    {
        this.setX(this.getX() - 1);
    }
    
    public void translateRight()
    {
        this.setX(this.getX() + 1);
    }
    
    
    
    
    
}
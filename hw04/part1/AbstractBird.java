import java.awt.*;

//This class contains methods that all Birds will have.
public abstract class AbstractBird implements Bird{
    private Color color;
    protected int timesFlown = 0;
    private static int birdsCreated = 0;
    private int x;
    private int y;
    
    //This is the super constructor for objects that will extend AbstractBird
    public AbstractBird(int x, int y){
        this.x = x;
        this.y = y;
    }//End of AbstractBird
    
    //incrementFlown() adds to the amount of times flown
    public void incrementFlown(){
        ++this.timesFlown;
    }//End of incrementFlown()
    
    //getFlown() returns the amount of times flown per bird
    public int getFlown(){
        return this.timesFlown;
    }//End of getFlown()
    
    //incrementCreated() increments the amount of birds created.
    public void incrementCreated()
    {
        
        AbstractBird.birdsCreated = this.getCreated();
        
    }//End of incrementCreated()
    
    //getCreated returns the amount of objects created
    public int getCreated(){
        return AbstractBird.birdsCreated;
    }//End of getCreated()
    
    //setColor sets the color for each Bird
    public void setColor(Color c)
    {
        this.color = c;
    }//end of setColor
    
    //getColor returns the color of a Bird
    public Color getColor(){
        return this.color;
    }//end of getColor
    
    //This method is abstract because its implementation is different depending
    // on type of bird.
    public abstract void fly();
    
    //getPosition() returns the coordinates of the bird as a point
    public Point getPosition(){
        Point getPosition = new Point(this.getX(), getY());
        return getPosition;
    }//end of getPosition()
    
    //setX is used to set the value of X
    public void setX(int x)
    {
        this.x = x;
    }//end of setX()
    
    //setY is used to set the value of Y
    public void setY(int y)
    {
        this.y = y;
    }//end of setY()
    
    //getX returns the value of X
    public int getX(){
        return this.x;
    }//end of getX
    
    //getX returns the value of X
    public int getY(){
        return this.y;
    }//end of getY()
    
    //This method translates a point upwards
    public void translateUp()
    {
        this.setY(this.getY() - 1);
    }//end of translateUp()
    
    //This method translates a point downwards
    public void translateDown()
    {
        this.setY(this.getY() + 1);
    }//end of translateDown()
    
    //This method translates a point left
    public void translateLeft()
    {
        this.setX(this.getX() - 1);
    }//end of translateLeft()
    
    //This method translates a point right
    public void translateRight()
    {
        this.setX(this.getX() + 1);
    }//end of translateRight()
    
}
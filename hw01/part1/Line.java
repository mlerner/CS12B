import java.awt.Point;

public class Line{	
	Point p1;
	Point p2;
	
	//Creating line with point objects
	public Line (Point p1, Point p2){
	 	this.p1 = p1;
	 	this.p2 = p2;
	} //End of Line 
	
	//Access p1
	public Point getP1(){
		return p1;
	} //end of getP1
	
	//Access p2
	public Point getP2(){
		return p2;
	} //end of getP2
	
	//This method calculates slope of line.
	public int getSlope(){
		//If the x values of the points are equal throw an error message
		if (getP2().x == getP1().x){
			System.out.println("The values of the x-coordinates are equals.");
			return -1;
		}
		else{
			//Return the slope of the line if the x values aren't equal.
			return ( (getP2().y - getP1().y) / (getP2().x -getP1().x) );
		}
	} //end of getSlope
	
	public Boolean isCollinear (Point p3){
	
		//If the area of a triangle created by the three points has 0 area, then
		// the points are collinear and true is returned.
		
		if (0 == (getP1().x * (getP2().y - p3.y)) + (getP2().x * (p3.y - getP1().y)) + (p3.x * (getP1().y - getP2().y)) ){
			return true;
		}
		//If they aren't collinear, return false.
		else{
			return false;
		}		
	} 	//end method isCollinear
	
	//Rounding method provided by 
	public static double round(double value, int x){
		double pow10 = Math.pow(10, x);
		return Math.round(value * pow10) / pow10;
	}	//end method round
}
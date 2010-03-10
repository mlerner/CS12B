public class GroceryItemOrder{
	//Declaring variable
	String name;
	int quantity;
	double pricePerUnit; 
	
	public GroceryItemOrder(String name, int quantity, double pricePerUnit){
		//Storing input into object
		this.name = name;
		this.quantity = quantity;
		this.pricePerUnit = pricePerUnit;
	} //end of GroceryItemOrder
	
	public double getCost(){
		//Multiply quantity times the cost per unit
		return quantity * pricePerUnit;
	} //end of getCost
	
	public void setQuantity( int quantity ){
		//Changing value of object's quantity
		this.quantity = quantity;
	} //end of setQuantity
	
	public String toString() { 
		//Return quantity of the grocery item
		return this.quantity + " of " + this.name;
	} //end of toString
}
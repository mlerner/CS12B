public class GroceryList{
	//Defining variables 
	int totalItems = 0;
	double totalCost = 0.00;
	GroceryItemOrder [] groceryList;
	static final int maxItems = 10; //The max amount of items in the list is 10.
	
	
	public GroceryList(){
		groceryList = new GroceryItemOrder[maxItems]; //Instantiating grocery list
	} //End method GroceryList
	
	public void add(GroceryItemOrder item ){
		//If the totalItems are less than the max amount of items, add the item to the list.
		if (totalItems < maxItems){
			groceryList[this.totalItems] = item;
			++totalItems;
		}
		//If the list is full, say so.
		else{
			System.out.println("Grocery List is full.");
		}
		
	} //End method add
	
	public double getTotalCost(){
		//For every item in the grocery list, compute its cost and add it to the totalCost
		for ( int counter = 0; counter < this.totalItems; ++counter ){
			totalCost = totalCost + groceryList[counter].getCost();  
		}
		
		return totalCost;
	}//End Method getTotalCost
}
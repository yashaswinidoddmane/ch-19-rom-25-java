class UberEatsRunner{
public static void main(String uber[]){
	 
	  String foodName = "French Fries";
	  
	 double price = UberEats.getTakeOrder(foodName);
	 System.out.println("The order price is: "+price);
	 
	 int quantity = 6;
	 double priceWithQuantity = UberEats.search(foodName,quantity);
	 System.out.println("The price of " + foodName + " with quantity " + quantity + " is " + priceWithQuantity);
 }
}
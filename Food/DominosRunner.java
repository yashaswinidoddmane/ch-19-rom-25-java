class DominosRunner{
public static void main(String dominos[]){
	 String foodName = "Cheese Burst Pizza";
	 
	 double price = Dominos.getTakeOrder(foodName);
	 System.out.println("The order price is: "+price);
	 int quantity = 4;
	 double priceWithQuantity = Dominos.search(foodName,quantity);
	 System.out.println("The price of " + foodName + " with quantity " + quantity + " is " + priceWithQuantity);
 }
}
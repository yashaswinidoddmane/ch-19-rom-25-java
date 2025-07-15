class FoodPandaRunner{
public static void main(String Foodpanda[]){
	 String foodName = "Corn Chaat";
	 
	 double price = FoodPanda.getTakeOrder(foodName);
	 System.out.println("The order price is: "+price);
	 
	 int quantity = 5;
     double priceWithQuantity = FoodPanda.search(foodName, quantity);
     System.out.println("The price of " + foodName + " with quantity " + quantity + " is " + priceWithQuantity);
 }
}
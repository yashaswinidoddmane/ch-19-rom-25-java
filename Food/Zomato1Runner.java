class Zomato1Runner{
public static void main(String zomato[]){
	 String dessertsName = "Blueberry icecream";
	  
	 double price = Zomato1.getTakeOrder(dessertsName);
	 System.out.println("The order price is: "+price);
	 
	 int quantity = 2;
	 double priceWithQuantity = Zomato1.search(dessertsName,quantity);
	 System.out.println("The price of "+dessertsName+" with quantity "+ quantity +" is "+ priceWithQuantity );
 }
}
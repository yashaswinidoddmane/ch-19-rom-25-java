class Dominos{
    public static double getTakeOrder(String foodName){
        double price = 0.0;
        if (foodName == "Cheese Burst Pizza") {
            price = 250.00;
			return price;
        }else if (foodName == "Veggie Paradise") {
            price = 239.50;
			return price;
        }else if (foodName == "Farmhouse Pizza") {
            price = 240.00;
			return price;
        }else if (foodName == "Paneer Tikka Pizza") {
            price = 260.00;
			return price;
        }else if (foodName == "Chicken Dominator") {
            price = 289.00;
			return price;
        }else if (foodName == "Pepper Barbecue Chicken") {
            price = 270.00;
			return price;
        }else if (foodName == "Mexican Green Wave") {
            price = 239.00;
			return price;
        }else if (foodName == "Deluxe Veggie") {
            price = 235.0;
			return price;
        }else if (foodName == "Veg Extravaganza") {
            price = 265.0;
			return price;
        }else if (foodName == "Peppy Paneer") {
            price = 240.0;
			return price;
        }else if (foodName == "Cheesy Dip") {
            price = 30.00;
			return price;
        }else if (foodName == "Taco Mexicana Veg") {
            price = 110.00;
			return price;
        }else if (foodName == "Taco Mexicana Chicken") {
            price = 130.0;
			return price;
        }else if (foodName == "Garlic Breadsticks") {
            price = 90.0;
			return price;
        }else if (foodName == "Stuffed Garlic Bread") {
            price = 120.0;
			return  price;
        }else if (foodName == "Paneer Parcel") {
            price = 39.50;
			return price;
        }else if (foodName == "Chicken Parcel") {
            price = 50.00;
			return price;
        }else if (foodName == "Choco Lava Cake") {
            price = 99.00;
			return price;
        }else if (foodName == "Butterscotch Mousse Cake") {
            price = 105.00;
			return price;
        }else if (foodName == "Coke 500ml") {
            price = 60.00;
			return price;
        }else if (foodName == "Sprite 500ml") {
            price = 59.00;
			return price;
        }else if (foodName == "Iced Chocolate") {
            price = 70.00;
			return price;
        }else if (foodName == "Brownie Fantasy") {
            price = 115.50;
			return price;
        }else if (foodName == "Veg Burger Pizza") {
            price = 135.00;
			return price;
        }else if (foodName == "Chicken Burger Pizza") {
            price = 145.50;
			return price;
        }else if (foodName == "Tomato Pasta Veg") {
            price = 120.00;
			return price;
        }else if (foodName == "Tomato Pasta Non-Veg") {
            price = 130.00;
			return price;
        }else if (foodName == "Creamy Tomato Pasta Pizza Veg") {
            price = 240.00;
			return price;
        }else if (foodName == "Cheesy Italiano Pizza") {
            price = 260.00;
			return price;
        }else if (foodName == "Classic Margherita") {
            price = 180.00;
			return price;
        }else {
            System.out.println("Item not found in Dominos menu");
        }
        return price;
    }
	
	public static double search(String foodName , int quantity){
		double price = 0.0;
        if (foodName == "Cheese Burst Pizza") {
            price = 250.00 * quantity;
			return price;
        }else if (foodName == "Veggie Paradise") {
            price = 239.50 * quantity;
			return price;
        }else if (foodName == "Farmhouse Pizza") {
            price = 240.00 * quantity;
			return price;
        }else if (foodName == "Paneer Tikka Pizza") {
            price = 260.00 * quantity;
			return price;
        }else if (foodName == "Chicken Dominator") {
            price = 289.00 * quantity;
			return price;
        }else if (foodName == "Pepper Barbecue Chicken") {
            price = 270.00 * quantity;
			return price;
        }else if (foodName == "Mexican Green Wave") {
            price = 239.00 * quantity;
			return price;
        }else if (foodName == "Deluxe Veggie") {
            price = 235.0 * quantity;
			return price;
        }else if (foodName == "Veg Extravaganza") {
            price = 265.0 * quantity;
			return price;
        }else if (foodName == "Peppy Paneer") {
            price = 240.0 * quantity;
			return price;
        }else if (foodName == "Cheesy Dip") {
            price = 30.00 * quantity;
			return price;
        }else if (foodName == "Taco Mexicana Veg") {
            price = 110.00* quantity;
			return price;
        }else if (foodName == "Taco Mexicana Chicken") {
            price = 130.0 * quantity;
			return price;
        }else if (foodName == "Garlic Breadsticks") {
            price = 90.0 * quantity;
			return price;
        }else if (foodName == "Stuffed Garlic Bread") {
            price = 120.0 * quantity;
			return  price;
        }else if (foodName == "Paneer Parcel") {
            price = 39.50* quantity;
			return price;
        }else if (foodName == "Chicken Parcel") {
            price = 50.00 * quantity;
			return price;
        }else if (foodName == "Choco Lava Cake") {
            price = 99.00 * quantity;
			return price;
        }else if (foodName == "Butterscotch Mousse Cake") {
            price = 105.00 * quantity;
			return price;
        }else if (foodName == "Coke 500ml") {
            price = 60.00* quantity;
			return price;
        }else if (foodName == "Sprite 500ml") {
            price = 59.00 * quantity;
			return price;
        }else if (foodName == "Iced Chocolate") {
            price = 70.00 * quantity;
			return price;
        }else if (foodName == "Brownie Fantasy") {
            price = 115.50* quantity;
			return price;
        }else if (foodName == "Veg Burger Pizza") {
            price = 135.00* quantity;
			return price;
        }else if (foodName == "Chicken Burger Pizza") {
            price = 145.50 * quantity;
			return price;
        }else if (foodName == "Tomato Pasta Veg") {
            price = 120.00 * quantity;
			return price;
        }else if (foodName == "Tomato Pasta Non-Veg") {
            price = 130.00* quantity;
			return price;
        }else if (foodName == "Creamy Tomato Pasta Pizza Veg") {
            price = 240.00 * quantity;
			return price;
        }else if (foodName == "Cheesy Italiano Pizza") {
            price = 260.00* quantity;
			return price;
        }else if (foodName == "Classic Margherita") {
            price = 180.00 * quantity;
			return price;
        }else {
            System.out.println("Item not found in Dominos menu");
        }
        return price;
	}
}

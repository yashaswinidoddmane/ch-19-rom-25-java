class FoodPanda {
    public static double getTakeOrder(String foodName) {
        double price = 0.0;
        if (foodName == "Hakka Noodles") {
            price = 120.0;
			return price;
        }else if (foodName == "Manchurian Gravy") {
            price = 140.0;
			return price;
        }else if (foodName == "Egg Roll") {
            price = 80.0;
			return price;
        }else if (foodName == "Chicken Biryani") {
            price = 180.0;
			return price;
        }else if (foodName == "Veg Fried Rice") {
            price = 110.0;
			return price;
        }else if (foodName == "Momo Platter") {
            price = 100.0;
			return price;
        }else if (foodName == "Paneer Tikka") {
            price = 150.0;
			return price;
        }else if (foodName == "Schezwan Rice") {
            price = 130.0;
			return price;
        }else if (foodName == "Cheese Sandwich") {
            price = 90.0;
			return price;
        }else if (foodName == "Pav Bhaji") {
            price = 85.0;
			return price;
        }else if (foodName == "Vada Pav") {
            price = 30.0;
			return price;
        }else if (foodName == "Idli Sambar") {
            price = 50.0;
			return price;
        }else if (foodName == "Dosa") {
            price = 60.0;
			return price;
        }else if (foodName == "Chicken Shawarma") {
            price = 150.0;
			return price;
        }else if (foodName == "Fish Curry") {
            price = 200.0;
			return price;
        }else if (foodName == "Grilled Chicken Salad") {
            price = 160.0;
			return price;
        }else if (foodName == "Fruit Salad") {
            price = 90.0;
			return price;
        }else if (foodName == "Chilli Paneer") {
            price = 140.0;
			return price;
        }else if (foodName == "Aloo Paratha") {
            price = 50.0;
			return price;
        }else if (foodName == "Cheese Burst Sandwich") {
            price = 100.0;
			return price;
        }else if (foodName == "Veg Cutlet") {
            price = 45.0;
			return price;
        }else if (foodName == "Corn Chaat") {
            price = 40.0;
			return price;
        }else if (foodName == "Rava Dosa") {
            price = 65.0;
			return price;
        }else if (foodName == "Mysore Masala Dosa") {
            price = 80.0;
			return price;
        }else if (foodName == "Tandoori Chicken") {
            price = 220.0;
			return price;
        }else if (foodName == "Curd Rice") {
            price = 70.0;
			return price;
        }else if (foodName == "Samosa") {
            price = 25.0;
			return price;
        }else if (foodName == "Chocolate Ice Cream") {
            price = 60.0;
			return price;
        }else if (foodName == "Mango Lassi") {
            price = 70.0;
			return price;
        }else if (foodName == "Cold Coffee") {
            price = 90.0;
			return price;
        }else {
            System.out.println("Food item not found.");
        }
        return price;
    }

 public static double search(String foodName , int quantity){
	 double price = 0.0;
        if (foodName == "Hakka Noodles") {
            price = 120.0 * quantity;
			return price;
        }else if (foodName == "Manchurian Gravy") {
            price = 140.0 * quantity;
			return price;
        }else if (foodName == "Egg Roll") {
            price = 80.0 * quantity;
			return price;
        }else if (foodName == "Chicken Biryani") {
            price = 180.0 * quantity;
			return price;
        }else if (foodName == "Veg Fried Rice") {
            price = 110.0 * quantity;
			return price;
        }else if (foodName == "Momo Platter") {
            price = 100.0 * quantity;
			return price;
        }else if (foodName == "Paneer Tikka") {
            price = 150.0 * quantity;
			return price;
        }else if (foodName == "Schezwan Rice") {
            price = 130.0 * quantity;
			return price;
        }else if (foodName == "Cheese Sandwich") {
            price = 90.0 * quantity;
			return price;
        }else if (foodName == "Pav Bhaji") {
            price = 85.0 * quantity;
			return price;
        }else if (foodName == "Vada Pav") {
            price = 30.0 * quantity;
			return price;
        }else if (foodName == "Idli Sambar") {
            price = 50.0 * quantity;
			return price;
        }else if (foodName == "Dosa") {
            price = 60.0 * quantity;
			return price;
        }else if (foodName == "Chicken Shawarma") {
            price = 150.0 * quantity;
			return price;
        }else if (foodName == "Fish Curry") {
            price = 200.0 * quantity;
			return price;
        }else if (foodName == "Grilled Chicken Salad") {
            price = 160.0 * quantity;
			return price;
        }else if (foodName == "Fruit Salad") {
            price = 90.0 * quantity;
			return price;
        }else if (foodName == "Chilli Paneer") {
            price = 140.0 * quantity;
			return price;
        }else if (foodName == "Aloo Paratha") {
            price = 50.0 * quantity;
			return price;
        }else if (foodName == "Cheese Burst Sandwich") {
            price = 100.0 * quantity;
			return price;
        }else if (foodName == "Veg Cutlet") {
            price = 45.0 * quantity;
			return price;
        }else if (foodName == "Corn Chaat") {
            price = 40.0 * quantity;
			return price;
        }else if (foodName == "Rava Dosa") {
            price = 65.0 * quantity;
			return price;
        }else if (foodName == "Mysore Masala Dosa") {
            price = 80.0 * quantity;
			return price;
        }else if (foodName == "Tandoori Chicken") {
            price = 220.0 * quantity;
			return price;
        }else if (foodName == "Curd Rice") {
            price = 70.0 * quantity;
			return price;
        }else if (foodName == "Samosa") {
            price = 25.0 * quantity;
			return price;
        }else if (foodName == "Chocolate Ice Cream") {
            price = 60.0 * quantity;
			return price;
        }else if (foodName == "Mango Lassi") {
            price = 70.0 * quantity;
			return price;
        }else if (foodName == "Cold Coffee") {
            price = 90.0 * quantity;
			return price;
        }else {
            System.out.println("Food item not found.");
        }
        return price;
    }
}

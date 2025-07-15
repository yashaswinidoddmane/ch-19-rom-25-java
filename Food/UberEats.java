class UberEats{
 public static double getTakeOrder(String foodName){
  double price = 0.0;
  if(foodName == "French Fries"){
	  price = 60.0;
	  return price;
  }else if(foodName == "Veg Spring Roll"){
	  price = 70.00;
	  return price;
  }else if(foodName == "Chicken Nuggets"){
	  price = 110.00;
	  return price;
  }else if(foodName == "Garlic Bread "){
	  price = 65.00;
	  return price;
  }else if(foodName == "Donut"){
	  price = 45.00;
	  return price;
  }else if(foodName == "Red Velvet Cake Slice"){
	  price = 85.0;
	  return price;
  }else if(foodName == "Gulab Jamun"){
	  price = 45.00;
	  return price;
  }else if(foodName == "Mango Smoothie"){
	  price = 85.00;
	  return price;
  }else if(foodName == "Fresh Lime Soda"){
	  price = 40.00;
	  return price;
  }else if(foodName == "Masala Chai"){
	  price = 25.00;
	  return price;
  }else if(foodName == "Double Patty Burger "){
	  price = 120.00;
	  return price;
  }else if(foodName == "Pepperoni Pizza "){
	  price = 220.00;
	  return price;
  }else if(foodName == "Chole Bhature"){
	  price = 90.00;
	  return price;
  }else if(foodName == "Margherita Pizza"){
	  price = 120.00;
	  return price;
  }else if(foodName == "Butter Naan"){
	  price = 40.00;
	  return price;
  }else if(foodName == "Paneer Butter Masala "){
	  price = 160.00;
	  return price;
  }else if(foodName == "Walnut Brownie"){
	  price = 90.00;
	  return price;
  }else if(foodName == "Caramel Brownie"){
	  price = 85.00;
	  return price;
  }else if(foodName == "Double Chocolate"){
	  price = 110.0;
	  return price;
	  
  }else if(foodName == "Classic Glazed"){
	  price = 50.00;
	  return price;
  }else if(foodName == "Strawberry Frosted"){
	  price = 55.00;
	  return price;
  }else if(foodName == "Chocolate Truffle"){
	  price = 160.00;
	  return price;
  }else if(foodName == "Veg Pulao "){
	  price = 150.00; 
	  return price;
  }else if(foodName == "Mutton Rogan Josh"){
	  price = 250.00;
	  return price;
  }else if(foodName == "Veg Thali"){
	  price = 170.00;
	  return price;
  }else if(foodName == "Dal Makhani"){
	  price = 150.00;
	  return price;
  }else if(foodName == "Rajma Chawal "){
	  price = 110.00;
	  return price;
  }else if(foodName == "Black Forest Cake Slice"){
	  price = 129.00;
	  return price;
  }else if(foodName == "Rasgulla "){
	  price = 45.00;
	  return price;
  }else if(foodName == "Lassi"){
	  price = 60.00;
	  return price;
  }else if(foodName == "Buttermilk"){
	  price = 35.00;
	  return price;
  }else if(foodName == "Iced Tea"){
	  price = 60.00;
	  return price;
  }else if(foodName == "Filter Coffee"){
	  price = 60.00;
	  return price;
  }else if(foodName == "Water Bottle"){
	  price = 20.00;
	  return price;
  }else if(foodName == "Lemonade"){
	  price = 40.00;
	  return price;
  }else{
   System.out.println("not found");
 }
 return price;
 }
 
 public static double search(String foodName ,int quantity){
	 double price = 0.0;
  if(foodName == "French Fries"){
	  price = 60.0 * quantity;
	  return price;
  }else if(foodName == "Veg Spring Roll"){
	  price = 70.00 * quantity;
	  return price;
  }else if(foodName == "Chicken Nuggets"){
	  price = 110.00* quantity;
	  return price;
  }else if(foodName == "Garlic Bread "){
	  price = 65.00 * quantity;
	  return price;
  }else if(foodName == "Donut"){
	  price = 45.00* quantity;
	  return price;
  }else if(foodName == "Red Velvet Cake Slice"){
	  price = 85.0 * quantity ;
	  return price;
  }else if(foodName == "Gulab Jamun"){
	  price = 45.00 * quantity;
	  return price;
  }else if(foodName == "Mango Smoothie"){
	  price = 85.00 * quantity;
	  return price;
  }else if(foodName == "Fresh Lime Soda"){
	  price = 40.00 * quantity;
	  return price;
  }else if(foodName == "Masala Chai"){
	  price = 25.00 * quantity;
	  return price;
  }else if(foodName == "Double Patty Burger "){
	  price = 120.00 * quantity;
	  return price;
  }else if(foodName == "Pepperoni Pizza "){
	  price = 220.00* quantity;
	  return price;
  }else if(foodName == "Chole Bhature"){
	  price = 90.00 * quantity;
	  return price;
  }else if(foodName == "Margherita Pizza"){
	  price = 120.00 * quantity;
	  return price;
  }else if(foodName == "Butter Naan"){
	  price = 40.00 * quantity;
	  return price;
  }else if(foodName == "Paneer Butter Masala "){
	  price = 160.00 * quantity;
	  return price;
  }else if(foodName == "Walnut Brownie"){
	  price = 90.00 * quantity;
	  return price;
  }else if(foodName == "Caramel Brownie"){
	  price = 85.00 * quantity;
	  return price;
  }else if(foodName == "Double Chocolate"){
	  price = 110.0 * quantity;
	  return price;
	  
  }else if(foodName == "Classic Glazed"){
	  price = 50.00 * quantity;
	  return price;
  }else if(foodName == "Strawberry Frosted"){
	  price = 55.00 * quantity;
	  return price;
  }else if(foodName == "Chocolate Truffle"){
	  price = 160.00 * quantity;
	  return price;
  }else if(foodName == "Veg Pulao "){
	  price = 150.00* quantity; 
	  return price;
  }else if(foodName == "Mutton Rogan Josh"){
	  price = 250.00 * quantity;
	  return price;
  }else if(foodName == "Veg Thali"){
	  price = 170.00 * quantity;
	  return price;
  }else if(foodName == "Dal Makhani"){
	  price = 150.00* quantity;
	  return price;
  }else if(foodName == "Rajma Chawal "){
	  price = 110.00 * quantity;
	  return price;
  }else if(foodName == "Black Forest Cake Slice"){
	  price = 129.00 * quantity;
	  return price;
  }else if(foodName == "Rasgulla "){
	  price = 45.00 * quantity;
	  return price;
  }else if(foodName == "Lassi"){
	  price = 60.00 * quantity;
	  return price;
  }else if(foodName == "Buttermilk"){
	  price = 35.00* quantity;
	  return price;
  }else if(foodName == "Iced Tea"){
	  price = 60.00 * quantity;
	  return price;
  }else if(foodName == "Filter Coffee"){
	  price = 60.00 * quantity;
	  return price;
  }else if(foodName == "Water Bottle"){
	  price = 20.00 * quantity;
	  return price;
  }else if(foodName == "Lemonade"){
	  price = 40.00 * quantity;
	  return price;
  }else{
   System.out.println("not found");
 }
 return price;
 }
}
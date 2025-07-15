class Zomato1{
   public static double getTakeOrder(String dessertsName){
  double price = 0.0;
  if(dessertsName == "Blueberry icecream"){
  price = 249.0;
  return price;
  }else if(dessertsName == "Vanilla"){
	 price = 88.0;
	  return price;
  }else if(dessertsName == "chocochip chocolate"){
	  price = 339.00;
	   return price;
  }else if(dessertsName == "tender coconut"){
	  price = 189.50;
	   return price;
  }else if(dessertsName == "Mango Alphonso"){
	  price = 69.50;
	   return price;
  }else if(dessertsName== "Butterscotch"){
	  price = 119.00;
	   return price;
  }else if(dessertsName == "Mixed berries"){
	  price = 249.00;
	   return price;
  }else if(dessertsName == "Golden jackfruit"){
	   price = 74.50;
	    return price;
  }else if(dessertsName == "chocovanilla fudge sundae"){
	  price = 124.50;
	   return price;
  }else if(dessertsName == "death by chocolate"){
	  price = 239.00;
	   return price;
  }else if(dessertsName == "red velvet"){
	  price = 240.50;
	   return price;
  }else if(dessertsName == "Nutty chocolate"){
	  price = 249.0;
	   return price;
  }else if(dessertsName == "Belgian dark chocolate"){
	  price = 259.00;
	   return price;
  }else if(dessertsName == "Rainbow sundae"){
	  price = 239.00;
	   return price;
  }else if(dessertsName == "hazelnut bubble tea"){
	  price = 279.00;
	   return price;
  }else if(dessertsName == "kulsi milkshake"){
	  price = 139.590;
	   return price;
  }else if(dessertsName == "watermelon and berry"){
	  price = 109.50;
	   return price;
  }else if(dessertsName == "strawberry cheesecake"){
	  price = 50.42;
	   return price;
  }else if(dessertsName == "espresso mocha sundae"){
	  price = 50.42;
	   return price;
  }else if(dessertsName == "Kitakat oreo shake"){
	  price = 279.0;
	   return price;
  }else if(dessertsName == "ferroro rocher milkshake"){
	  price = 299.50;
	   return price;
  }else if(dessertsName == "classic cold coffee"){
	  price = 199.50;
	   return price;
  }else if(dessertsName == "Dry fruit gudbud jar"){
	  price = 399.50;
	   return price;
  }else if(dessertsName == "fruit overloaded Jar"){
	  price = 399.00;
	   return price;
  }else if(dessertsName == "boba mocktail"){
	  price = 239.00;
	   return price;
  }else if(dessertsName == "latte bubble tea"){
	  price = 299.00;
	   return price;
  }else if(dessertsName == "falooda"){
	  price = 159.00;
	   return price;
  }else if(dessertsName == "orange biskut sundae"){
	  price = 50.42;
	   return price;
  }else if(dessertsName == "kesar badam milkshake"){
	  price = 219.0;
	   return price;
  }else if(dessertsName == "Caramel bliss milkshake"){
	  price = 249.00;
	   return price;
  }else{
   System.out.println("not found");
 }
 return price;
}

   public static double search(String dessertsName , int quantity){
	   double price = 0.0;
  if(dessertsName == "Blueberry icecream"){
  price = 249.0 * quantity;
  return price;
  }else if(dessertsName == "Vanilla"){
	 price = 88.0  * quantity;
	  return price;
  }else if(dessertsName == "chocochip chocolate"){
	  price = 339.00 * quantity;
	   return price;
  }else if(dessertsName == "tender coconut"){
	  price = 189.50 * quantity;
	   return price;
  }else if(dessertsName == "Mango Alphonso"){
	  price = 69.50 * quantity;
	   return price;
  }else if(dessertsName== "Butterscotch"){
	  price = 119.00 * quantity;
	   return price;
  }else if(dessertsName == "Mixed berries"){
	  price = 249.00 * quantity;
	   return price;
  }else if(dessertsName == "Golden jackfruit"){
	   price = 74.50 * quantity;
	    return price;
  }else if(dessertsName == "chocovanilla fudge sundae"){
	  price = 124.50 * quantity;
	   return price;
  }else if(dessertsName == "death by chocolate"){
	  price = 239.00 * quantity;
	   return price;
  }else if(dessertsName == "red velvet"){
	  price = 240.50 * quantity;
	   return price;
  }else if(dessertsName == "Nutty chocolate"){
	  price = 249.0 * quantity;
	   return price;
  }else if(dessertsName == "Belgian dark chocolate"){
	  price = 259.00 * quantity;
	   return price;
  }else if(dessertsName == "Rainbow sundae"){
	  price = 239.00 * quantity;
	   return price;
  }else if(dessertsName == "hazelnut bubble tea"){
	  price = 279.00 * quantity;
	   return price;
  }else if(dessertsName == "kulsi milkshake"){
	  price = 139.590 * quantity;
	   return price;
  }else if(dessertsName == "watermelon and berry"){
	  price = 109.50 * quantity;
	   return price;
  }else if(dessertsName == "strawberry cheesecake"){
	  price = 50.42 * quantity;
	   return price;
  }else if(dessertsName == "espresso mocha sundae"){
	  price = 50.42 * quantity;
	   return price;
  }else if(dessertsName == "Kitakat oreo shake"){
	  price = 279.0 * quantity;
	   return price;
  }else if(dessertsName == "ferroro rocher milkshake"){
	  price = 299.50 * quantity;
	   return price;
  }else if(dessertsName == "classic cold coffee"){
	  price = 199.50 * quantity;
	   return price;
  }else if(dessertsName == "Dry fruit gudbud jar"){
	  price = 399.50 * quantity;
	   return price;
  }else if(dessertsName == "fruit overloaded Jar"){
	  price = 399.00 * quantity;
	   return price;
  }else if(dessertsName == "boba mocktail"){
	  price = 239.00 * quantity;
	   return price;
  }else if(dessertsName == "latte bubble tea"){
	  price = 299.00 * quantity;
	   return price;
  }else if(dessertsName == "falooda"){
	  price = 159.00 * quantity;
	   return price;
  }else if(dessertsName == "orange biskut sundae"){
	  price = 50.42 * quantity;
	   return price;
  }else if(dessertsName == "kesar badam milkshake"){
	  price = 219.0 * quantity;
	   return price;
  }else if(dessertsName == "Caramel bliss milkshake"){
	  price = 249.00 * quantity;
	   return price;
  }else{
   System.out.println("not found");
 }
 return price;
	   
   }
}
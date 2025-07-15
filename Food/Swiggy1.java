class Swiggy1{
 public static double getTakeOrder(String foodName){
  double price= 0.0;
	  if(foodName == "Burger"){
	  price = 78.00;
	  return price;
	 }else if(foodName == "Pizza"){
	   price = 99.99;
	   return price;
	 }else if(foodName == "Biryani"){
		price = 150.0;
		return price;
	 }else if(foodName == "meghana foods"){
		price = 225.67;
		return price;
	 }else if(foodName == "chicken 65"){
		 price = 370.0;
		 return price;
	 }else if(foodName == "Andhra chicken kabab"){
		 price = 335.0;
		 return price;
	 }else if(foodName == "Egg biryani"){
		 price = 270.0;
		 return price;
	 }else if(foodName == "Andhra chilli chicken"){
		 price = 360.0;
		 return price;
	 }else if(foodName == "Tandoori Chicken Half"){
		  price = 365.0;
		  return price;
	 }else if(foodName == "Lemon Chicken"){
		 price = 370.0;
		 return price;
	 }else if(foodName == "egg fried Rice"){
		 price = 299.0;
		 return price;
	 }else if(foodName == "Curd Rice"){
		 price = 80.0;
		 return price;
	 }else if(foodName == "Ghee Avakaya Rice"){
		  price = 130.0;
		  return price;
		  
	 }else if(foodName == "Puliyogare Rice"){
		  price = 90.0;
		  return price;
	 }else if(foodName == "Neer dosa"){
		   price = 95.0;
		   return price;
	 }else if(foodName == "Lemon Rice"){
		 price = 90.0;
		 return price;
	}else if(foodName == "Kesari bhath"){
		 price = 70.0;
		 return price;
	}else if(foodName == "Palkova Bun"){
		  price = 70.0;
		  return price;
	}else if(foodName == "Tomato Rice"){
		  price = 90.0;
		  return price;
	}else if(foodName == "Ghee Gongura rice"){
		  price = 130.0;
		  return price;
	}else if(foodName == "idly"){
		  price = 50.0;
		  return price;
	}else if(foodName == "Pongal"){
		  price = 105.0;
		  return price;
	}else if(foodName == "set dosa"){
		  price = 125;
		  return price;
	}else if(foodName == "papala pudi dosa"){
		  price = 130.0;
		  return price;
	}else if(foodName == "pooori saagu"){
		  price = 110.0;
		  return price;
	}else if(foodName == "curd vada"){
		price = 85.0;
		return price;
	}
 else{
 System.out.println("not found");
 }
 return price;
}
 public static double search(String foodName , int quantity){
	 double price= 0.0;
	  if(foodName == "Burger"){
	  price = 78.00 * quantity;
	  return price;
	 }else if(foodName == "Pizza"){
	   price = 99.99 * quantity;
	   return price;
	 }else if(foodName == "Biryani"){
		price = 150.0 * quantity;
		return price;
	 }else if(foodName == "meghana foods"){
		price = 225.67 * quantity;
		return price ;
	 }else if(foodName == "chicken 65"){
		 price = 370.0 * quantity;
		 return price;
	 }else if(foodName == "Andhra chicken kabab"){
		 price = 335.0 * quantity;
		 return price;
	 }else if(foodName == "Egg biryani"){
		 price = 270.0 * quantity;
		 return price;
	 }else if(foodName == "Andhra chilli chicken"){
		 price = 360.0 * quantity;
		 return price;
	 }else if(foodName == "Tandoori Chicken Half"){
		  price = 365.0 * quantity;
		  return price;
	 }else if(foodName == "Lemon Chicken"){
		 price = 370.0 * quantity;
		 return price;
	 }else if(foodName == "egg fried Rice"){
		 price = 299.0 * quantity;
		 return price;
	 }else if(foodName == "Curd Rice"){
		 price = 80.0 * quantity;
		 return price;
	 }else if(foodName == "Ghee Avakaya Rice"){
		  price = 130.0 * quantity;
		  return price;
		  
	 }else if(foodName == "Puliyogare Rice"){
		  price = 90.0 * quantity;
		  return price;
	 }else if(foodName == "Neer dosa"){
		   price = 95.0 * quantity;
		   return price;
	 }else if(foodName == "Lemon Rice"){
		 price = 90.0* quantity;
		 return price;
	}else if(foodName == "Kesari bhath"){
		 price = 70.0 * quantity;
		 return price;
	}else if(foodName == "Palkova Bun"){
		  price = 70.0 * quantity;
		  return price;
	}else if(foodName == "Tomato Rice"){
		  price = 90.0 * quantity;
		  return price;
	}else if(foodName == "Ghee Gongura rice"){
		  price = 130.0 * quantity;
		  return price;
	}else if(foodName == "idly"){
		  price = 50.0 * quantity;
		  return price;
	}else if(foodName == "Pongal"){
		  price = 105.0 * quantity;
		  return price;
	}else if(foodName == "set dosa"){
		  price = 125 * quantity;
		  return price;
	}else if(foodName == "papala pudi dosa"){
		  price = 130.0 * quantity;
		  return price;
	}else if(foodName == "pooori saagu"){
		  price = 110.0 * quantity;
		  return price;
	}else if(foodName == "curd vada"){
		price = 85.0 * quantity;
		return price;
	}
 else{
 System.out.println("not found");
 }
 return price;
	 
}

}
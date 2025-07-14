class GoldItem{

   static double weight;
   static double purity;
   static double pricePerGram;
   static String type;
   static boolean isHallmarked;
   
   public static double getweight(){
	   weight = 22.5;
	   return weight;
   }
   public static double getpurity(){
	   purity = 99.99;
	   return purity;
   }
   public static double getpricePerGram(){
	   pricePerGram = 6120.0;
	   return pricePerGram;
   }
   public static String gettype(){
	   type = "Necklace";
	   return type;
   }
   public static boolean getisHallmarked(){
	   isHallmarked= true;
	   return isHallmarked;
   }

}
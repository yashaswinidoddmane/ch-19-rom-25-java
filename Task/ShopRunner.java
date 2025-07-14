class ShopRunner{


 public static void main(String shop[]){
	 
	double weight = GoldItem.getweight();
	System.out.println("The gold weight is: "+ weight);
	
	double purity = GoldItem.getpurity();
	System.out.println("The gold purity is: "+ purity);
	
	double pricePerGram = GoldItem.getpricePerGram();
	System.out.println("The gold price per gram is: "+ pricePerGram);
	
	String type = GoldItem.gettype();
	System.out.println("The gold type is: "+ type);
	
	boolean isHallmarked = GoldItem.getisHallmarked();
	System.out.println("The gold is hall marked: "+ isHallmarked);
 }
}
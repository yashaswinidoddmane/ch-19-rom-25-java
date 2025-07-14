class KitRunner{
 public static void main(String Makeup[]){
	 
	 String brand = MakeUpKit.getbrand();
	 System.out.println("The make up brand is: "+ brand);
	 
	 int numberOfItems = MakeUpKit.getnumberOfItems();
	 System.out.println("The number of items in the kit: "+ numberOfItems);
	 
	 boolean hasMirror = MakeUpKit.gethasMirror();
	 System.out.println("it has mirror: "+ hasMirror);
	 
	 double price = MakeUpKit.getprice();
	 System.out.println("the price of the kit is: "+ price);
	 
	 String colorTheme = MakeUpKit.getcolorTheme();
	 System.out.println("The color theme is: "+ colorTheme);
	
 }

}
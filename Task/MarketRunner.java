class MarketRunner{
  public static void main(String market[]){
    
	
	String name = CityMarket.getname();
	System.out.println("The Market name is: "+ name);
	
	int numberOfShops = CityMarket.getnumberOfShops();
    System.out.println("The number of shops are: "+ numberOfShops);
	
	boolean isOpen = CityMarket.getisOpen();
	System.out.println("is market open: "+ isOpen);
	
	double area = CityMarket.getarea();
	System.out.println("the market width: "+ area);
	
	String location = CityMarket.getlocation();
	System.out.println("The market located in: "+ location);
	
	float averageFootfall = CityMarket.getaverageFootfall();
	System.out.println("The average foot fall is: "+ averageFootfall);
	
	
	
  }
  

}
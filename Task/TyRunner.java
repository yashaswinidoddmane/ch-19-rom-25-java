class TyRunner{
	public static void main(String details[]){
    
    String brand = TyreDetails.getbrand();
    System.out.println("The tyre brand is: "+ brand);

    int diameter = TyreDetails.getdiameter();
    System.out.println("the tyre diameter is: "+ diameter);

    boolean isTubeless = TyreDetails.getisTubeless();
    System.out.println("The tyre is tubeless: "+ isTubeless);

    float pressure = TyreDetails.getpressure();
    System.out.println("The tyre pressure is: "+ pressure);
  
    double price = TyreDetails.getprice();
    System.out.println("The tyre price is: "+ price);	
    
	}

}
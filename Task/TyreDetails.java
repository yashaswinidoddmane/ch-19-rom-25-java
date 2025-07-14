class TyreDetails{
	
	static String brand;
	static int diameter;
	static boolean isTubeless;
	static float pressure;
	static double price;
	
	public static String getbrand(){
		brand = "MRF";
		return brand;
	}
	public static int getdiameter(){
		diameter = 16;
		return diameter;
	}
	public static boolean getisTubeless(){
		isTubeless = true;
		return isTubeless;
	}
	public static float getpressure(){
		pressure = 32.0f;
		return pressure;
	}
	public static double getprice(){
		price = 4500.0;
		return price;
	}

}
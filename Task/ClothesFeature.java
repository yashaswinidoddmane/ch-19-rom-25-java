class ClothesFeature{
	static String Type;
	static String Size;
	static String color;
	static double price;
	static boolean isWashed;
	static char gender;
	
	
	public static String getType() {
		Type = "T-shirt";
		return Type;
	}
	public static String getSize() {
		Size = "M";
		return Size;
	}
	public static String getcolor() {
		color = "Blue";
		return color;
	}
	
	public static double getprice() {
		price = 499.99;
		return price;
	}
	public static boolean getisWashed() {
		isWashed = true;
		return isWashed;
	}
	public static char getgender() {
		gender = 'F';
		return gender;
	}	

}
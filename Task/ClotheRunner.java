class ClotheRunner{
	
	
	public static void main(String Clothes[]){
		
		String Type = ClothesFeature.getType();
		System.out.println("The type of cloth is: "+ Type);
		
		String Size = ClothesFeature.getSize();
		System.out.println("The size of the tshirt is: "+ Size);
		
		String color = ClothesFeature.getcolor();
		System.out.println("the color of the cloth is: "+ color);
		
		double price = ClothesFeature.getprice();
		System.out.println("the cloth price is: "+ price);
		
		boolean isWashed = ClothesFeature.getisWashed();
		System.out.println("the cloth is washed: "+ isWashed);
		
		char gender = ClothesFeature.getgender();
		System.out.println("The gender is: "+ gender);
	}
}
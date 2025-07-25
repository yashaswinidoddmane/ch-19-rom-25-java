class Jewellery {
    String type;
    String material;
    double weightInGrams;
    double price;
    boolean isHandcrafted;
    boolean hasGemstone;
    String origin;
	
	public void getJewelleryDetails(){
		System.out.println("The jewellery Type is: " + type);
        System.out.println("Jewellery Material is: " + material);
        System.out.println("jewellery Weight is: " + weightInGrams);
        System.out.println("Price os jewellery is: " + price);
        System.out.println("is itHandcrafted?: " + isHandcrafted);
        System.out.println("Has Gemstone: " + hasGemstone);
        System.out.println("Origin: " + origin);
	}
}

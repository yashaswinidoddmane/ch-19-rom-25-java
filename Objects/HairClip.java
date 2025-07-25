class HairClip {
    String type;
    String color;
    String material;
    double price;
    boolean isDecorative;
    String brand;
    boolean isAvailable;
	
	public void getHairClipDetails(){
		
		   System.out.println("The hairclip Type is: " + type);
            System.out.println("The Hair clip Color is: " + color);
            System.out.println("The Hair clip Material : " + material);
            System.out.println("The Hair clip Price is: " + price);
            System.out.println("Is Decorative: " + isDecorative);
            System.out.println("Brand: " + brand);
            System.out.println("Available: " + isAvailable);
	}
}

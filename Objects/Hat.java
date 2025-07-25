class Hat {
    String type;
    String color;
    String material;
    double size;
    boolean isForMen;
    boolean isWaterResistant;
    boolean hasAdjustableStrap;
	
	public void getHatDetails(){
		System.out.println("The Hat Type is: "+ type);
        System.out.println("The Hat Color is: "+ color);
        System.out.println("The hat Material is: "+ material);
        System.out.println("Size: "+ size );
        System.out.println("For Men: "+ isForMen);
        System.out.println("Water Resistant: "+ isWaterResistant);
        System.out.println("Adjustable Strap: "+ hasAdjustableStrap);
	}
}

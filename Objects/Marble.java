class Marble {
    String color;
    String type;
    double diameter;
    String material;
    double price;
    boolean isPolished;
    boolean isImported;
	
	public void getMarbleDetails(){
		System.out.println("Marble color is: "+ color);
		System.out.println("Marble type is: "+ type);
		System.out.println("The marble diameter is: "+ diameter);
		System.out.println("material is: "+ material);
		System.out.println("Marble price is: "+ price);
		System.out.println("is polished : "+ isPolished);
		System.out.println("is imported: "+ isImported);
	}
}

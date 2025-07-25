class Pipe {
    String material;
    double length;
    double diameter;
    String color;
    String type;
    boolean isFlexible;
    boolean isInsulated;
	
	public void getPipeDetails(){
		System.out.println("Pipe Material is: "+ material);
        System.out.println("pipe Length is: "+ length);
        System.out.println("pipe Diameter is: "+ diameter );
        System.out.println(" pipe Color is: "+ color);
        System.out.println("Type: "+ type);
        System.out.println("is Flexible?: "+ isFlexible);
        System.out.println("is Insulated?: "+ isInsulated);
	}
}

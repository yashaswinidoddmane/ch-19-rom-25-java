class Roti {
    String type;
    String flourUsed;
    boolean isStuffed;
    double diameter;
    boolean isHot;
    String shape;
    double price;
	
	public void getRotiDetails(){
		System.out.println("Roti type is: "+ type);
		System.out.println("flour used: "+ flourUsed);
		System.out.println("is stuffed : "+ isStuffed);
		System.out.println("roti diameter is: "+ diameter);
		System.out.println("is hot : "+ isHot);
		System.out.println("roti shape is: "+ shape);
		System.out.println("roti price is: "+ price);
	}
}
class Blazzer {
     //instance - multiple copies
	 int size;
    String color;
    String fabricType;
    double price;
    String brand;
    boolean isSleeveless;
    boolean isAvailable;
	
	public void getBlazzerDetails(){
		System.out.println("The Blazzer size is: "+ size);
        System.out.println("The Color is: "+ color);
        System.out.println("The Fabric is: "+ fabricType);
        System.out.println("The Price is: "+ price);
        System.out.println("The Brand is: "+ brand);
        System.out.println("Sleeveless: "+ isSleeveless);
        System.out.println("is it Available: "+ isAvailable);
		
	}
}

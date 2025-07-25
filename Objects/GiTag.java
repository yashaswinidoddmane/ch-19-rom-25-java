class GiTag {
    String productName;
    String category;
    String state;
    int yearOfRegistration;
    String originPlace;
    boolean isHandmade;
    boolean isExported;
	
	public void getGiTagDetails(){
		System.out.println("Product Name: "+ productName);
		System.out.println("category :"+ category);
		System.out.println("state :"+ state);
		System.out.println("year of registration : "+ yearOfRegistration);
		System.out.println("origin place: "+ originPlace);
		System.out.println("is handmade: "+ isHandmade);
		System.out.println("is exported : "+ isExported);
	}
}
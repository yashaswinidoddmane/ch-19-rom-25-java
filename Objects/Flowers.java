class Flowers {
    String name;
    String color;
    String fragrance;
    String bloomingSeason;
    double pricePerStem;
    boolean isEdible;
    boolean isAvailable;
	
	public void getFlowersDetails(){
		System.out.println("Flower name is: "+ name);
		System.out.println("Flower color is: "+ color);
		System.out.println("Flower fragranceis: "+ fragrance);
		System.out.println("blooming season: "+ bloomingSeason);
		System.out.println("flower price per stem: "+ pricePerStem);
		System.out.println("is edible: "+ isEdible);
		System.out.println("is available: "+ isAvailable);
	}
}
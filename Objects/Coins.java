class Coins {
    String country;
    String metalType;
    int year;
    double weight;
    double diameter;
    boolean isInCirculation;
    boolean isCollectible;
	
	public void getCoinsDetails(){
		System.out.println("The Country  is: " + country);
        System.out.println("The Coin Metal Type is: " + metalType);
        System.out.println("Year: " + year);
        System.out.println("Coin Weight is: " + weight );
        System.out.println("Coin Diameter is: " + diameter );
        System.out.println("In Circulation: " + isInCirculation);
        System.out.println("Collectible: " + isCollectible);
	}
}

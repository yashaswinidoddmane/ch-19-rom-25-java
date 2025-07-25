class ForestSafari {
    String location;
    String safariType;
    int durationInHours;
    double pricePerPerson;
    boolean isGuided;
    boolean hasAnimalSightings;
    int maxCapacity;
	
	public void getForestSafariDetails(){
		System.out.println("safari location: "+ location);
		System.out.println("safari type: "+ safariType);
		System.out.println("duration in hours :"+ durationInHours);
		System.out.println("price per person :"+ pricePerPerson);
		System.out.println("is guided: "+ isGuided);
		System.out.println("has animal sightings : "+ hasAnimalSightings);
		System.out.println("max capacity :"+ maxCapacity);
	}
}
class AmusementPark {
    String name;
    String location;
    int numberOfRides;
    double entryFee;
    boolean hasWaterPark;
    boolean hasFoodCourt;
    boolean isOpenOnWeekends;
	
	public void getAmusementParkDetails(){
		System.out.println("Amusement Name: "+ name);
		System.out.println("location : "+ location);
		System.out.println("number of rides: "+ numberOfRides);
		System.out.println("entry fees: "+ entryFee);
		System.out.println("has water park: "+ hasWaterPark);
		System.out.println("has food court: "+ hasFoodCourt);
		System.out.println("is open on weekends: "+ isOpenOnWeekends);
	}
}
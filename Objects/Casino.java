class Casino {
    int noOfTables;
    String casinoName;
    String location;
    double entryFee;
    boolean hasLiveMusic;
    String openingTime;
    String closingTime;
	
	public void getCasinoDetails(){
		System.out.println("The number of tables: "+ noOfTables);
		System.out.println("The casino Name is:"+ casinoName);
		System.out.println("Casino location: "+ location);
		System.out.println("entry fees:"+ entryFee);
		System.out.println("it has live music: "+ hasLiveMusic);
		System.out.println("casino opening time: "+ openingTime);
		System.out.println("casino closing time: "+ closingTime);
	}
}

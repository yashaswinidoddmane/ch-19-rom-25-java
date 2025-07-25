class Festivals {
    String name;
    String country;
    String religion;
    String month;
    int durationInDays;
    boolean isPublicHoliday;
    boolean isCulturallySignificant;
	
	public void getFestivalsDetails(){
		System.out.println("festival name is: "+ name);
		System.out.println(" country is:"+ country);
		System.out.println("religion is: "+ religion);
		System.out.println("month: "+ month);
		System.out.println("duration in days: "+ durationInDays);
		System.out.println("is public holiday: "+ isPublicHoliday);
		System.out.println("is culturally significant: "+ isCulturallySignificant);
	}

}
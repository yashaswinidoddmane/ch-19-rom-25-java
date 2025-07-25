class Karate {
    String dojoName;
    String style;
    String location;
    int noOfStudents;
    String headInstructor;
    boolean isInternational;
    double monthlyFee;
	
	public void getKarateDetails(){
		System.out.println("Karate dojo name is: "+ dojoName);
		System.out.println("Karate style is: "+ style);
		System.out.println("location is: "+ location);
		System.out.println("number of students are: "+ noOfStudents);
		System.out.println("head instructor: "+ headInstructor);
		System.out.println("is internatuonal: "+ isInternational);
		System.out.println("monthly fees: "+ monthlyFee);
	}
}
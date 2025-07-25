class Politician {
    String name;
    String party;
    int age;
    String position;
    boolean isCorrupt;
    boolean isInOffice;
    int termYears;
	
	public void getPoliticianDetails(){
		System.out.println("Politician Name: " + name);
        System.out.println("Politician Party: " + party);
        System.out.println("Age: " + age);
        System.out.println("Position: " + position);
        System.out.println("Is Corrupt: " + isCorrupt);
        System.out.println("Is in Office: " + isInOffice);
        System.out.println("Term Years: " + termYears);
	}
}

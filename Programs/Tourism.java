class Tourism{

    static String touristPlaces[] = {"Taj Mahal", "Qutub Minar", "India Gate", "Red Fort", "Hampi","Mysore Palace", "Charminar", "Bekal Fort", "Meenakshi Temple", "Kudremukh","Golden Temple", "Backwaters of Kerala", "Dal Lake", "Linganamakki Dam", "VVS Dam"};

    public static void main(String tourism[]) {
        System.out.println("The number of tourist places available are:");
		for(String touristPlace:touristPlaces){
        System.out.println(touristPlace);
		}
	}
}

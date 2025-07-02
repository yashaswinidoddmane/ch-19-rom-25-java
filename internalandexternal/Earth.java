/*class Earth {
	static String  asia = "Asia";
	static String africa = "Africa";
	static String northamerica = "North America";
	static String southamerica = "South America";
	static String antarctica = "Antarctica";
	static String europe = "Europe";
	static String australia = "Australia";
    static String continents[] = {asia, africa, northamerica, southamerica, antarctica, europe, australia};

    public static void main(String args[]) {
        //System.out.println("The Number of continents are:");
		for(String continent:continents){
        System.out.println(continent);
		}
    }
}*/

class Earth {
	public static void main(String args[]) {
	 String  asia = "Asia";
	 String africa = "Africa";
	 String northamerica = "North America";
	 String southamerica = "South America";
	 String antarctica = "Antarctica";
	 String europe = "Europe";
	 String australia = "Australia";
     String continents[] = {asia, africa, northamerica, southamerica, antarctica, europe, australia};
      System.out.println("main started");
        System.out.println("The Number of continents are:");
		for(String continent:continents){
        System.out.println(continent);
		}
		System.out.println("main ended");
    }
}

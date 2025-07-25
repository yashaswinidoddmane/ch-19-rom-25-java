class Weapon {
    String name;
    String type;
    double weight;
    String material;
    int rangeInMeters;
    boolean isLethal;
	
	public void getWeaponDetails(){
		System.out.println("The weapon Name is: "+ name);
		System.out.println("The weapon type is:"+ type);
		System.out.println("weapon weight is: "+ weight);
		System.out.println("weapon material is: "+ material);
		System.out.println("The Weapon range in meters is: "+ rangeInMeters);
		System.out.println("is weapon is lethal: "+ isLethal);
	}
}

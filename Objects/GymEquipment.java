class GymEquipment {
    String name;
    String type;
    double weight;
    String brand;
    double price;
    boolean isAdjustable;
    boolean isAvailable;
	
	public void getGymEquipmentDetails(){
		
		System.out.println("equipment Name is: " + name);
        System.out.println("equipement Type is: " + type);
        System.out.println("equipment Weight is: " + weight);
        System.out.println("equipement Brand is: " +brand);
        System.out.println("equipement Price is: "+ price);
        System.out.println("is equipement Adjustable: " + isAdjustable);
        System.out.println("is it Available: " + isAvailable);
			
	}
}

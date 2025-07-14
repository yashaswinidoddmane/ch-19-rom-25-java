class CustomRunner{
	
	public static void main(String tailor[]){
		
		String name = Tailor.getname();
		System.out.println("The tailor name is: "+ name);
		
		int experience = Tailor.getexperience();
		System.out.println("tailor experience is: "+ experience);
		
		boolean ownsShop = Tailor.getownsShop();
		System.out.println("tailor own shop: "+ ownsShop);
		
		String specialty = Tailor.getspecialty();
		System.out.println("tailor specialty is: "+ specialty);
		
		double stitchingCost = Tailor.getstitchingCost();
		System.out.println("stitching Cost is: "+ stitchingCost);
	}
}
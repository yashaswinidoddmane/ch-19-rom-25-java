class ParkRunner{
	
	public static void main(String park[]){
		
		String name = Garden.getname();
		System.out.println("The Park name is: "+ name);
		
		double area = Garden.getarea();
		System.out.println("The area is: "+ area);
		
		int numberOfTress = Garden.getnumberOfTress();
		System.out.println("the number of tress: "+ numberOfTress);
		
		boolean isPublic = Garden.getisPublic();
		System.out.println("The Garden is public: "+ isPublic);
		
		int benches = Garden.getbenches();
        System.out.println("The benches are: "+ benches);		
		
	}
}
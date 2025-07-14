class LandRunner{
   
   public static void main(String Disney[]){
	 
    String location = DisneyLand.getlocation();
    System.out.println("The disney is located in: "+ location);

    int numberOfRides = DisneyLand.getnumberOfRides();
    System.out.println("The number of rides: "+ numberOfRides);

    float ticketPrice = DisneyLand.getticketPrice();
    System.out.println("disney ticket price is: "+ ticketPrice);

    boolean isOpenToday = DisneyLand.getisOpenToday();
    System.out.println("is open today: "+ isOpenToday);

     double area = DisneyLand.getarea();
     System.out.println("The disney area is: "+ area);	 
 
  
   }
}
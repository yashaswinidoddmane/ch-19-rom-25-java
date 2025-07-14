class BannerRunner{
   public static void main(String Display[]){
	   
	   
	   String Message = BannerDisplay.getMessage();
	   System.out.println("The banner message is: "+ Message);
	   
	   String color = BannerDisplay.getcolor();
	   System.out.println("The banner color is: "+ color);
	   
	   int width = BannerDisplay.getwidth();
	   System.out.println("The banner width is: "+ width);
	   
	   int height = BannerDisplay.getheight();
	   System.out.println("The banner height is: "+ height);
	   
	   boolean isPrinted = BannerDisplay.getisPrinted();
	   System.out.println("The Banner is printed: "+ isPrinted);
	   
	   double cost = BannerDisplay.getcost();
	   System.out.println("The cost of the Banner is: "+ cost);
   }

}
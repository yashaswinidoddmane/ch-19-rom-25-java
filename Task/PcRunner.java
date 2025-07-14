class PcRunner{
   
  public static void main(String game[]){
	  String cpu = GamingPc.getcpu();
	  System.out.println("The Pc cpu is: "+ cpu);
	  
	  int ram = GamingPc.getram();
	  System.out.println("The Pc ram is: "+ ram);
	  
	  String gpu = GamingPc.getgpu();
	  System.out.println("The gpu is: "+ gpu);
	  
	  boolean isRGBEnabled = GamingPc.getisRGBEnabled();
	  System.out.println("is RGB enabled "+ isRGBEnabled);
	  
	  double price = GamingPc.getprice();
	  System.out.println("The price of Pc is: "+ price);
	  
	  float screenSize = GamingPc.getscreenSize();
	  System.out.println("The screen sixe of the pc is: "+ screenSize);

  
  }
}
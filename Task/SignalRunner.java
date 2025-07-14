class SignalRunner{
 
  public static void main(String traffic[]){
	  
	  
	  String Type = SignalTraffic.getType();
	  System.out.println("The signal type is: "+ Type);
	  
	  String color = SignalTraffic.getcolor();
	  System.out.println("color of the signal is: "+ color);
	  
	  int duration = SignalTraffic.getduration();
	  System.out.println("The signal duration is: "+ duration);
	  
	  boolean isWorking = SignalTraffic.getisWorking();
	  System.out.println("signal is working: "+ isWorking);
	  
	  float height = SignalTraffic.getheight();
	  System.out.println("The height of the signal is: "+ height);
	  
  }

}
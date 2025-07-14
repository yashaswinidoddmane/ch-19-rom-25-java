class TwoWayRunner{
   public static void main(String Talkie[]){
	   
	   String model = WalkieTalkie.getmodel();
	   System.out.println("The model name is: "+ model);
	   
	   int range = WalkieTalkie.getrange();
	   System.out.println("The range of device is: "+ range);
	   
	   boolean isEncrypted = WalkieTalkie.getisEncrypted();
	   System.out.println("the model is encrypted: "+ isEncrypted);
	   
	   float batteryLife = WalkieTalkie.getbatteryLife();
	   System.out.println("The device battery life is: "+ batteryLife);
	   
	   boolean isOn = WalkieTalkie.getisOn();
	   System.out.println("the device is on: "+ isOn);
	   
	   String frequency = WalkieTalkie.getfrequency();
	   System.out.println("The device frequency is: "+ frequency);
	   
   }


}
class WalkieTalkie{
   
   static String model;
   static int range;
   static boolean isEncrypted;
   static float batteryLife;
   static boolean isOn;
   static String frequency;
   
   public static String getmodel(){
	   model = "WT-900";
	   return model;
   }
   public static int getrange(){
	   range = 5;
	   return range;
   }
   public static boolean getisEncrypted(){
	   isEncrypted = true;
	   return isEncrypted;
   } 
   public static float getbatteryLife(){
	   batteryLife =12.5f;
	   return batteryLife;
   }
   public static boolean getisOn(){
	   isOn = false;
	   return isOn;
   }
   public static String getfrequency(){
	   frequency = "462.5625 MHz";
	   return frequency;
   }
   
  

}
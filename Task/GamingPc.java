class GamingPc{
  static String cpu;
  static int ram;
  static String gpu;
  static boolean isRGBEnabled;
  static double price;
  static float screenSize;
  
  public static String getcpu(){
	  cpu = "Intel i9";
	  return cpu;
  }
  public static int getram(){
	  ram = 32;
	  return ram;
  }
  public static String getgpu(){
	  gpu = "NVIDIA RTX 4090";
	  return gpu;
  }
  public static boolean getisRGBEnabled(){
	  isRGBEnabled = true;
	  return isRGBEnabled;
  }
  public static double getprice(){
	  price = 250000.0;
	  return price;
  }
  public static float getscreenSize(){
	  screenSize = 27.0f;
	  return screenSize;
  }

}
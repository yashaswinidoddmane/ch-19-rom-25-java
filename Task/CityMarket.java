class CityMarket{
  
  static String name;
  static int numberOfShops;
  static boolean isOpen;
  static double area;
  static String location;
  static float averageFootFall;
  
  public static String getname(){
	  name = "City Market";
	  return name;
  }
  public static int getnumberOfShops(){
	  numberOfShops = 150;
	  return numberOfShops;
  }
  public static boolean getisOpen(){
	  isOpen = true;
	  return isOpen;
  }
  public static double getarea(){
	  area = 12000.5;
	  return area;
  }
  public static String getlocation(){
	  location = "Downtown";
	  return location;
  }
  public static float getaverageFootfall(){
	  averageFootFall = 4500.0f;
	  return averageFootFall;
  }

}
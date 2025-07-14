class BannerDisplay{

 static String Message;
 static String color;
 static int width;
 static int height;
 static boolean isPrinted;
 static double cost;
 

 public static String getMessage(){
	Message = "Grand opening";
	return Message;
 }
 public static String getcolor(){
	 color = "Red";
	 return color;
 }
 public static int getwidth(){
	 width = 200;
	 return width;
 }
 public static int getheight(){
	 height = 100;
	 return height;
 }
 public static boolean getisPrinted(){
	 isPrinted = true;
	 return isPrinted;
 }
 public static double getcost(){
	 cost = 350.50;
	 return cost;
 }

}
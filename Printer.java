class Printer {

        static String itemName = "Printer";
        static int itemPrice = 4299;
        static String itemType = "All-in-One Inkjet";

        static String itemFunctions = "Print, Scan, Copy";
        static String itemColor = "White";
        static String itemConnectivity = "USB";
        static String itemPagesPerMinute = "7.5 ppm";
		 
		public static void main(String[] args) {
        System.out.println("main started");

        System.out.println("The item name is "+ itemName);
        System.out.println("The item price is "+ itemPrice);
        System.out.println("The item type is "+ itemType);
        System.out.println("The item functions are "+ itemFunctions);
        System.out.println("The item color is "+ itemColor);
        System.out.println("The item connectivity is "+ itemConnectivity);
        System.out.println("The item speed is "+ itemPagesPerMinute +" pages per minute");
    }
}

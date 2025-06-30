class HeadPhones {
   
        static String itemName = "HeadPhones";
        static String itemBrand = "Sony WH-1000XM5";
        static int itemPrice = 29990;
        static String itemType = "Over-Ear";

        static String itemNoiseCancellation = "Active Noise Cancellation";
        static String itemConnectivity = "Bluetooth 5.2";
        static String itemBatteryLife = "30 Hours";
        static String itemCharging = "USB Type-C";
		
		public static void main(String[] args) {
        System.out.println("main started");

        System.out.println("The item name is " + itemName);
        System.out.println("The item brand is " + itemBrand);
        System.out.println("The item price is ₹" + itemPrice);
        System.out.println("The item type is " + itemType);
        System.out.println("The item noise cancellation is " + itemNoiseCancellation);
        System.out.println("The item connectivity is " + itemConnectivity);
        System.out.println("The item battery life is " + itemBatteryLife);
        System.out.println("The item charging type is " + itemCharging);
    }
}

class PlayStore {
	static String instagram = "Instagram";
	static String facebook ="Facebook";
	static String whatsapp = "WhatsApp";
	static String snapchat = "Snapchat";
	static String spotify ="Spotify";
	static String youtube = "YouTube";
	static String zoom = "Zoom";
	static String gmail = "Gmail";
	static String amazon = "Amazon";
	static String netflix = "Netflix";
	
    static String appNames[] = {instagram, facebook, whatsapp, snapchat, spotify, youtube, zoom, gmail, amazon, netflix};

    public static void main(String PlayStore[]){
        //System.out.println("The Number of apps are:");
		for(String appName:appNames){
        System.out.println(appName);
        }
    }
}

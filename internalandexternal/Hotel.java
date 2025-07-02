class Hotel {
    static String idli = "Idli";
	static String dosa = "Dosa";
	static String vada = "Vada";
	static String upma = "Upma";
	static String tomatobath = "Tomato Bath";
	static String purisaagu = "Puri Saagu";
	static String paratha = "Paratha";
	static String paneerbuttermasala = "Paneeer Butter Masala";
	static String vegbiryani = "Veg Biryani";
	static String chickenbiryani = "Chicken Biryani";
	static String muttoncurry = "Mutton Curry";
	static String fishfry = "Fish Fry";
	static String chapati = "Chapati";
	static String friedrice = "Fried Rice";
    static String Menus[] = {"Idli", "Dosa", "Vada", "Upma", "Tomato bath","Puri saagu", "Paratha", "Paneer Butter Masala", "Veg Biryani", "Chicken Biryani","Mutton Curry", "Fish Fry", "Chapati", "Fried Rice", "Gobi Manchuri",
                            "Egg Curry", "Dal Tadka", "Sambar", "Rasam", "Tomato Soup","Curd Rice", "Gulab Jamun", "Roti", "Icecream", "Ghee rice"};

    public static void main(String Hotel[]){
        System.out.println("The number of menu items available are:");
		for(String Menu  : Menus){
        System.out.println(Menu);
    }
  }
}
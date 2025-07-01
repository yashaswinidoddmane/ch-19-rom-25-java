class Hotel {

    static String Menus[] = {"Idli", "Dosa", "Vada", "Upma", "Tomato bath","Puri saagu", "Paratha", "Paneer Butter Masala", "Veg Biryani", "Chicken Biryani","Mutton Curry", "Fish Fry", "Chapati", "Fried Rice", "Gobi Manchuri",
                            "Egg Curry", "Dal Tadka", "Sambar", "Rasam", "Tomato Soup","Curd Rice", "Gulab Jamun", "Roti", "Icecream", "Ghee rice"};

    public static void main(String Hotel[]){
        System.out.println("The number of menu items available are:");
		for(String Menu  : Menus){
        System.out.println(Menu);
    }
  }
}
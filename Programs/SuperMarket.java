class SuperMarket{
    static String Perfumes[] = {"Calvin Klein","Dior","Chanel","Gucci","Giorgio Armani","Bvlgari","Jimmy Choo","Burberry","Guerlain","Carolina Herrera"};
	static String Groceries[] = {"Milk","Egg","Bread","Chicken","Rice","Pasta","Fruits","Vegetables","Cheese","Butter"};
	static String Cosmetics[] = {"Lipstick","Mascara","Foundation","Eye Shadow","Concealer","Blush","Eyeliner","Lip Gloss","Highlighter","Setting Spray"};
	static String iceCreams[] = {"Vanilla","Chocolate","Strawberry","Cookies Cream","Mint Chocolate Chip","Chocolate Chip Cookie Dough","Butter Pecan","Rocky Road","Coffee","Butterscotch"};

	
	public static void main(String SuperMarket[]){
	
	    System.out.println("The number of perfumes available are:");
		for(String Perfume : Perfumes){
        System.out.println(Perfume);
		}
        System.out.println("The number of grocery items available are:");
		for(String Grocerie: Groceries){
        System.out.println(Grocerie);
		}
        System.out.println("The number of cosmetics available are:");
		for(String Cosmetic : Cosmetics){
        System.out.println(Cosmetic);
		}
		System.out.println("The number of ice creams available are:");
		for(String iceCream : iceCreams){
        System.out.println(iceCream);
		}
    }
}
	 
   
	

	
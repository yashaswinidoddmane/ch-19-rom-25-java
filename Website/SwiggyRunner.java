class SwiggyRunner{
   public static void main(String swiggy[]){
	   boolean created = Swiggy.create("vaishnavi","8105504916","vaishu@gmail.com","Bangalore","Vaishu@12");
	   System.out.println("is account created "+ created);
	   
	   Swiggy.read();
   }

}
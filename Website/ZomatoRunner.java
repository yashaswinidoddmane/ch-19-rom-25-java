class ZomatoRunner{
	
	public static void main(String zomato[]){
		boolean accountCreated = Zomato.createAccount("abhi@gmail.com","Abhi","tumkur","Abhi@123","Abhi@123");
		System.out.println("is account created "+ accountCreated);
		
		Zomato.readAccount();
	}
}
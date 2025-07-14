class IRCTCRunner{
    public static void main(String IRc[]){
		boolean accountCreated = IRCTC.createAccount("yashaswini","yashu@gmail.com","8123819984","adhar","Yashu@14");
		System.out.println("is account created "+ accountCreated);
		
		IRCTC.readAccount();
	}
}
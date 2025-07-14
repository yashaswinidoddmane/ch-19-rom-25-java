class InstagramRunner{
    public static void main(String Insta[]){
		boolean accountCreated = Instagram. createAccount("thiziz_ydm","Yashaswini D M","Yashu@1234","Yashu@1234");
		System.out.println("is account created "+ accountCreated);
		
		if(accountCreated)
			Instagram.readAccount();
	}

}
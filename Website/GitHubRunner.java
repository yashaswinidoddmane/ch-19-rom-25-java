class GitHubRunner{
	public static void main(String Git[]){
		boolean accountCrated = GitHub.createAccount("YashaswiniDodmane","yy49111505@gmail.com","Yashu@123","Yashu@123","Websites");
		System.out.println("is account created "+ accountCrated);
		if(accountCrated)
			GitHub.readAccount();
	}
}
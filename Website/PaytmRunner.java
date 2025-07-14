class PaytmRunner{
  public static void main(String pay[]){
	  boolean accountCreated = Paytm.createAccount("8123819984","Teju","600741680610","Teju@123","Teju@123");
	  System.out.println("is account created "+ accountCreated);
	  
	  Paytm.readAccount();
  }
}
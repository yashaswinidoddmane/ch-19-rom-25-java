class LinkedInRunner{
     public static void main(String Linked[]){
		 boolean isRegistered = LinkedIn.registerUser("Yashaswini D M","Yashu@gmail.com","Yashu@123","Engineer");
		 System.out.println("is user registered "+ isRegistered);
		 
		 LinkedIn.userInfo();
	 }
}
class LinkedIn{
    static String fullName;
	static String emailId;
	static String password;
	static String currentPosition;
	static boolean profileCompleted;
	
	public static boolean registerUser(String fname, String email, String pwd, String position) {
    
	    boolean isRegistered = false;
        boolean fullNameValid = false;
        boolean emailIdValid = false;
        boolean passwordValid = false;
        boolean currentPositionValid = false;
		
		if(fname != null){
			fullName = fname;
			fullNameValid = true;
		}else{
			System.out.println("full name is not valid");
		}
		if(email != null){
			emailId = email;
			emailIdValid = true;
		}else{
			System.out.println("email is not valid");
		}
		if(pwd != null){
			password = pwd;
			passwordValid = true;
		}else{
			System.out.println("password is not valid");
		}
		if(position != null){
			currentPosition = position;
			currentPositionValid = true;
		}else{
			System.out.println("current positionis not valid");
		}
		if (fullNameValid && emailIdValid && passwordValid && currentPositionValid) {
			System.out.println("all the ref are valid");
            profileCompleted = true;
            isRegistered = true;
        }
		return isRegistered;
	}
		public static void userInfo(){	
		System.out.println("The full name is: "+ fullName);
		System.out.println("The email is: "+ emailId);
		System.out.println("The password is: "+ password);
		System.out.println("The current position is: "+ currentPosition);
		System.out.println("The LinkedIn profile is completed: "+ profileCompleted);
        
	}

}
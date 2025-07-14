class Zomato {

    static String email;
    static String userName;
    static String city;
    static String password;
    static String confirmPassword;

    public static boolean createAccount(String mail, String uname, String place, String pwd, String cpwd) {
		boolean userAccount = false;
		boolean emailValid = false;
		boolean userNameValid = false;
		boolean cityValid = false;
		boolean passwordValid = false;
		boolean confirmPasswordValid = false;
		
        if (mail != null ) {
            email = mail;
            emailValid = true;
        }else{
			System.out.println("Invalid email");
		}

        if (uname != null) {
            userName = uname;
            userNameValid = true;
        }else{
			System.out.println("Username required");
		}

        if (place != null ) {
            city = place;
            cityValid = true;
        }else{
			System.out.println("City required");
		}

        if (pwd != null ) {
            password = pwd;
            passwordValid = true;
        }else{
			System.out.println("Weak password");
		}

        if (cpwd != null && pwd == cpwd) {
            confirmPassword = cpwd;
            confirmPasswordValid = true;
        }else{
			System.out.println("Password mismatch");
		}
        if(emailValid && userNameValid && cityValid && passwordValid && confirmPasswordValid){
			System.out.println("all ref are valid");
			userAccount = true;
		}
        return userAccount;
    }
       public static void readAccount() {
        System.out.println("Zomato Email: " + email);
        System.out.println("Username: " + userName);
        System.out.println("City: " + city);
        System.out.println("Password: " + password);
        System.out.println("Confirm Password: " + confirmPassword);
	   
	  }
}
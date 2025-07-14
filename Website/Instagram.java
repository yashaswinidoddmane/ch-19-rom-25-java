class Instagram {

    static String userName;
    static String fullName;
    static String password;
    static String confirmPassword;

    public static boolean createAccount(String uname, String fname, String pwd, String cpwd) {
		boolean accountCreated = false;
		boolean  userNameValid = false;
		boolean fullNameValid = false;
		boolean passwordValid = false;
		boolean confirmPasswordValid = false;
		
        if (uname != null ) {
            userName = uname;
			userNameValid = true;
        } else {
            System.out.println("Invalid username");
        }

        if (fname != null ) {
            fullName = fname;
			fullNameValid = true;
        } else {
            System.out.println("Invalid full name");
        }

        if (pwd != null ) {
            password = pwd;
			passwordValid = true;
        } else {
            System.out.println("Password must be at least 6 characters");
        }

        if (cpwd != null && pwd == cpwd) {
            confirmPassword = cpwd;
			confirmPasswordValid = true;
        } else {
            System.out.println("Confirm password does not match");
        }
		if(userNameValid && fullNameValid && passwordValid && confirmPasswordValid ){
			System.out.println("All the ref are valid");
			accountCreated = true;
		}

        return accountCreated;
    }
	public static void readAccount(){
		System.out.println("The user name is: "+ userName);
		System.out.println("The full name is: "+ fullName);
		System.out.println("The password is: "+ password);
		System.out.println("The confirm password is "+ confirmPassword);
	}
}
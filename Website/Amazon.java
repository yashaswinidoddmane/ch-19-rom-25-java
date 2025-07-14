class Amazon {

    static String email;
    static String fullName;
    static String phone;
    static String password;
    static String confirmPassword;

    public static boolean createAccount(String mail, String name, String ph, String pwd, String cpwd) {
		boolean accountCreated = false;
		boolean emailValid = false;
		boolean fullNameValid = false;
		boolean phoneValid = false;
		boolean passwordValid = false;
		boolean confirmPasswordValid = false;
		
        if (mail != null) {
            email = mail;
            emailValid = true;
        }else{
			System.out.println("Invalid email");
		}
        if (name != null) {
            fullName = name;
            fullNameValid = true;
        }else{
			System.out.println("Name cannot be empty");
		}
        if (ph != null) {
            phone = ph;
            phoneValid = true;
        }else{
			System.out.println("Invalid phone number");
		}
        if (pwd != null) {
            password = pwd;
            passwordValid = true;
        }else{
			System.out.println("Weak password");
		}
        if (cpwd != null && pwd == cpwd ) {
            confirmPassword = cpwd;
            confirmPasswordValid = true;
        }else{
			System.out.println("Passwords mismatch");
		}
        if(emailValid && fullNameValid && phoneValid && passwordValid && confirmPasswordValid ){
			System.out.println("All ref are valid");
			accountCreated = true;
		}

        return accountCreated;
    }

    public static void readAccount() {
        System.out.println("Amazon Email: " + email);
        System.out.println("Full Name: " + fullName);
        System.out.println("Phone Number: " + phone);
        System.out.println("Password: " + password);
        System.out.println("Confirm Password: " + confirmPassword);
    }
}
    


class Paytm {

    static String phone;
    static String name;
    static String aadhaar;
    static String password;
    static String confirmPassword;

    public static boolean createAccount(String ph, String n, String aadhar, String pwd, String cpwd) {
		boolean accountCreated = false;
		boolean phoneValid = false;
		boolean nameValid = false;
		boolean aadhaarValid = false;
		boolean passwordValid = false;
		boolean confirmPasswordValid = false;
        if (ph!= null ) {
            phone = ph;
            phoneValid = true;
        }else{
			System.out.println("phone is not valid");
		}

        if (n != null) {
            name = n;
            nameValid = true;
        }else{
			System.out.println("Name missing");
		}

        if (aadhar != null ) {
            aadhaar = aadhar;
            aadhaarValid = true;
        }else{
			System.out.println("Invalid Aadhaar");
		}

        if (pwd != null ) {
            password = pwd;
            passwordValid = true;
        }else{
			System.out.println("password is not valid");
		}

        if (cpwd != null && pwd == cpwd) {
            confirmPassword = cpwd;
            confirmPasswordValid = true;
        }else{
			System.out.println("Confirm password mismatch");
		}

        if(nameValid && phoneValid && aadhaarValid && passwordValid && confirmPasswordValid ){
		System.out.println("All ref are valid");
        accountCreated = true;
    }
	 return accountCreated;
}
    public static void readAccount() {
        System.out.println("Paytm Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Aadhaar: " + aadhaar);
        System.out.println("Password: " + password);
        System.out.println("Confirm Password: " + confirmPassword);

 }
}
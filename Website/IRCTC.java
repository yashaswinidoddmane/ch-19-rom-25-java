class IRCTC {
    static String fullName;
    static String emailId;
    static String phone;
    static String idProof;
    static String password;

    public static boolean createAccount(String name, String email, String ph, String idp, String pwd) {
	    boolean accountCreated = false;
        boolean fullNameValid = false;
		boolean emailIdValid = false;
		boolean phoneValid = false;
		boolean idProofValid = false;
		boolean passwordValid = false;
		
		if(name != null){
			fullName = name;
			fullNameValid = true;
		}else{
			System.out.println("fulll name is not valid");
		}
		if(email != null){
			emailId = email;
			emailIdValid = true;
		}else{
			System.out.println("email Id is not valid");
		}
		if(ph != null){
			phone = ph;
			phoneValid = true;
		}else{
			System.out.println("phone is not valid");
		}
		if(idp != null){
			idProof = idp;
			idProofValid = true;
		}else{
			System.out.println("id Proof is not valid");
		}
		if(pwd != null){
			password = pwd;
			passwordValid = true;
		}else{
			System.out.println("password is not valid");
		}
		if(fullNameValid  && emailIdValid && phoneValid && idProofValid && passwordValid){
			System.out.println("All the ref are valid");
			accountCreated = true;
		}
		return accountCreated;
	}
	public static void readAccount(){
		System.out.println("The full name is: "+ fullName);
		System.out.println("The email Id is: "+ emailId);
		System.out.println("The phone is: "+ phone);
		System.out.println("The id proof is: "+ idProof);
		System.out.println("The password is: "+ password);
	}
    }
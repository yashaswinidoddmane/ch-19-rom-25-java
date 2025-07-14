class Swiggy {
    static String name;
	static String phoneNumber;
	static String email;
    static String location;
    static String password;

    public static boolean create(String n, String p, String e, String loc, String pwd) {
		boolean created = false;
		boolean nameValid = false;
		boolean phoneNumberValid = false;
		boolean emailValid = false;
		boolean locationValid = false;
		boolean passwordValid = false;
		
       if(n != null){
		   name = n;
		   nameValid = true;
	   }else{
		   System.out.println("name is not valid");
	   }
	   if(p != null){
		   phoneNumber = p;
		   phoneNumberValid = true;
	   }else{
		   System.out.println("phone number is not valid");
	   }
	   if(e != null){
		   email = e;
		   emailValid = true;
	   }else{
		   System.out.println("email is not valid");
	   }
	   if(loc != null){
		   location = loc;
		   locationValid = true;
	   }else{
		   System.out.println("location is not valid");
	   }
	   if(pwd != null){
		   password = pwd;
		   passwordValid = true;
	   }else{
		   System.out.println("password is not valid");
	   }
	   if(nameValid && phoneNumberValid && emailValid && locationValid && passwordValid){
		 System.out.println("All the ref are valid");
		 created = true;
	   }
        return created;
    }
	public static void read(){
		System.out.println("The Name is: "+ name);
		System.out.println("The email is: "+ phoneNumber);
		System.out.println("The phone number is: "+ email);
		System.out.println("The location is: "+ location);
		System.out.println("The password is: "+ password);
	}
}
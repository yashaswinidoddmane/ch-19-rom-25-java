class CustomerDetails{
    public static void main(String details[]){
        System.out.println("main started");	
        
		// full Name , first Name ,  middle Name , last Name
		// The person Name is Baba. 
		
	    String personName   = "Baba Das";
		int personAge    = 123;
		String email        = "baba@gmail.com";
		String  panNo     = "CGFPV9816C";
		long phoneNumber  = 8123819984L;
		long  aadharNumber  = 600741680610L;
		char gender = 'B' + '0';
		String currentAddress = " bangalore";
	    String permanentAddress ="Tumkur";
		int pinCode  = 560098;
		//panNo ,
		//aadharNo , phoneNumber(contactNumber)
		//gender , currentAddress , permanentAddress
		String msg = "The person name is ";
		
		System.out.println(msg + personName);
		System.out.println("The person age is "+ personAge);
		System.out.println("The person email is "+ email);
		System.out.println("The person panNo is "+ panNo);
		System.out.println("The person phoneNumber is "+phoneNumber);
		System.out.println("The person aadharNumber is "+ aadharNumber);
		System.out.println("The person gender is "+ gender);
		System.out.println("The person currentAddress is "+ currentAddress);
		System.out.println("The person permanentAddress " + permanentAddress);
		System.out.println("The person pinCode is "+ pinCode);
		System.out.println("main ended"); 
	}
}
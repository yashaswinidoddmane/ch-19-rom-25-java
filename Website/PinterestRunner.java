class PinterestRunner {
    public static void main(String[] args) {
        boolean accountCreated = Pinterest.createAccount("pinterestUser123", "Tae Hyung", "secret123", "secret123");
		System.out.println("is Account created "+ accountCreated);
        if (accountCreated)
            Pinterest.readAccount();
       
        }
    }
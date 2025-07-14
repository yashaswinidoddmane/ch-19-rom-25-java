class CyberRunner{
	
	public static void main(String hacking[]){
		
		String alias = Hacker.getalias();
		System.out.println("hacker alias: "+ alias);
		
		int age = Hacker.getage();
		System.out.println("Hacker age is: "+ age);
		
		boolean isEthical = Hacker.getisEthical();
		System.out.println("hacker is ethical: "+ isEthical);
		
		String specialty = Hacker.getspecialty();
		System.out.println("hacker specialty is: "+ specialty);
		
		int hacksAttempted = Hacker.gethacksAttempted();
		System.out.println("how many hacks attempted: "+ hacksAttempted);
	}
}
class Rod {
    String material;
    double length;
    double diameter;
    String color;
    String usage;
    boolean isHollow;
    boolean isRustProof;
	
	public void getRodDetails(){
            System.out.println("The Rod Material is: "+ material);
            System.out.println("The rod Length is: "+ length);
            System.out.println("The Rod Diameter is: "+ diameter);
            System.out.println("Rod Color is: "+ color);
            System.out.println("Usage: "+ usage);
            System.out.println("Is Hollow: "+ isHollow);
            System.out.println("Is Rust Proof: "+ isRustProof);
	}
}

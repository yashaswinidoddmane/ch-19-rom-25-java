class Blade {
    String brand;
    String bladeType;
    String color;
    double price;
    boolean isStainlessSteel;
    boolean isDisposable;
    int quantityInPack;
	
  public void getBladeDetails(){
	System.out.println("Blade Brand: " + brand);
        System.out.println("Blade Type: " + bladeType);
        System.out.println("Blade color: "+ color);
		System.out.println("Price: " + price);
        System.out.println("Is it stainless: " + isStainlessSteel);
        System.out.println("is Disposable: " + isDisposable);
        System.out.println("quantity : " + quantityInPack);
  }
}
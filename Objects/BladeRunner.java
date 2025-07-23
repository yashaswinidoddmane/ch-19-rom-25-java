public class BladeRunner {
    public static void main(String blade[]) {
        System.out.println("Main started");

        Blade ref1 = new Blade();
        ref1.brand = "Gillette";
        ref1.bladeType = "Twin Blade";
        ref1.color = "Blue";
        ref1.price = 149.50;
        ref1.isStainlessSteel = true;
        ref1.isDisposable = true;
        ref1.quantityInPack = 5;

        Blade ref2 = new Blade();
        ref2.brand = "Wilkinson";
        ref2.bladeType = "Triple Blade";
        ref2.color = "Black";
        ref2.price = 199.00;
        ref2.isStainlessSteel = true;
        ref2.isDisposable = false;
        ref2.quantityInPack = 4;

        Blade ref3 = new Blade();
        ref3.brand = "SuperMax";
        ref3.bladeType = "Single Edge";
        ref3.color = "Silver";
        ref3.price = 49.00;
        ref3.isStainlessSteel = false;
        ref3.isDisposable = true;
        ref3.quantityInPack = 10;

        Blade ref4 = new Blade();
        ref4.brand = "Laser";
        ref4.bladeType = "Double Edge";
        ref4.color = "Chrome";
        ref4.price = 89.00;
        ref4.isStainlessSteel = true;
        ref4.isDisposable = true;
        ref4.quantityInPack = 6;

        Blade ref5 = new Blade();
        ref5.brand = "Personna";
        ref5.bladeType = "Platinum Coated";
        ref5.color = "Gold";
        ref5.price = 249.99;
        ref5.isStainlessSteel = true;
        ref5.isDisposable = false;
        ref5.quantityInPack = 4;

        Blade ref6 = new Blade();
        ref6.brand = "Feather";
        ref6.bladeType = "Professional";
        ref6.color = "Gray";
        ref6.price = 399.00;
        ref6.isStainlessSteel = true;
        ref6.isDisposable = false;
        ref6.quantityInPack = 20;

        Blade ref7 = new Blade();
        ref7.brand = "Dorco";
        ref7.bladeType = "Titanium";
        ref7.color = "Black & Yellow";
        ref7.price = 129.00;
        ref7.isStainlessSteel = true;
        ref7.isDisposable = true;
        ref7.quantityInPack = 5;

        Blade ref8 = new Blade();
        ref8.brand = "Merkur";
        ref8.bladeType = "Safety Blade";
        ref8.color = "Silver";
        ref8.price = 329.00;
        ref8.isStainlessSteel = true;
        ref8.isDisposable = false;
        ref8.quantityInPack = 10;

        Blade ref9 = new Blade();
        ref9.brand = "Bic";
        ref9.bladeType = "Disposable";
        ref9.color = "Orange";
        ref9.price = 99.00;
        ref9.isStainlessSteel = false;
        ref9.isDisposable = true;
        ref9.quantityInPack = 6;

        Blade ref10 = new Blade();
        ref10.brand = "Kai";
        ref10.bladeType = "Barber Blade";
        ref10.color = "Steel";
        ref10.price = 299.00;
        ref10.isStainlessSteel = true;
        ref10.isDisposable = false;
        ref10.quantityInPack = 5;

        Blade ref11 = new Blade();
        ref11.brand = "Treet";
        ref11.bladeType = "Carbon Steel";
        ref11.color = "Black";
        ref11.price = 69.00;
        ref11.isStainlessSteel = false;
        ref11.isDisposable = true;
        ref11.quantityInPack = 10;

        Blade ref12 = new Blade();
        ref12.brand = "Rapira";
        ref12.bladeType = "Swedish Supersteel";
        ref12.color = "Gray";
        ref12.price = 159.99;
        ref12.isStainlessSteel = true;
        ref12.isDisposable = false;
        ref12.quantityInPack = 5;

        Blade ref13 = new Blade();
        ref13.brand = "Lord";
        ref13.bladeType = "Classic";
        ref13.color = "Blue & White";
        ref13.price = 109.00;
        ref13.isStainlessSteel = true;
        ref13.isDisposable = true;
        ref13.quantityInPack = 5;

        Blade ref14 = new Blade();
        ref14.brand = "Shark";
        ref14.bladeType = "Super Chrome";
        ref14.color = "Yellow";
        ref14.price = 89.00;
        ref14.isStainlessSteel = true;
        ref14.isDisposable = true;
        ref14.quantityInPack = 10;

        Blade ref15 = new Blade();
        ref15.brand = "Topaz";
        ref15.bladeType = "Platinum";
        ref15.color = "Green";
        ref15.price = 79.00;
        ref15.isStainlessSteel = true;
        ref15.isDisposable = true;
        ref15.quantityInPack = 5;

        Blade ref16 = new Blade();
        ref16.brand = "Croma";
        ref16.bladeType = "Standard";
        ref16.color = "White";
        ref16.price = 119.00;
        ref16.isStainlessSteel = false;
        ref16.isDisposable = true;
        ref16.quantityInPack = 8;

        Blade ref17 = new Blade();
        ref17.brand = "Astra";
        ref17.bladeType = "Superior Platinum";
        ref17.color = "Silver";
        ref17.price = 199.00;
        ref17.isStainlessSteel = true;
        ref17.isDisposable = false;
        ref17.quantityInPack = 10;

        Blade ref18 = new Blade();
        ref18.brand = "Derby";
        ref18.bladeType = "Extra";
        ref18.color = "Green";
        ref18.price = 89.00;
        ref18.isStainlessSteel = false;
        ref18.isDisposable = true;
        ref18.quantityInPack = 5;

        Blade ref19 = new Blade();
        ref19.brand = "Bluebird";
        ref19.bladeType = "Hi-Stainless";
        ref19.color = "Blue";
        ref19.price = 159.00;
        ref19.isStainlessSteel = true;
        ref19.isDisposable = false;
        ref19.quantityInPack = 4;

        Blade ref20 = new Blade();
        ref20.brand = "Tata Edge";
        ref20.bladeType = "Value Pack";
        ref20.color = "Multicolor";
        ref20.price = 49.00;
        ref20.isStainlessSteel = false;
        ref20.isDisposable = true;
        ref20.quantityInPack = 12;
		
        System.out.println("Blade Brand: " + ref1.brand);
        System.out.println("Blade Type: " + ref1.bladeType);
        System.out.println("Blade color: "+ ref1.color);
		System.out.println("Price: " + ref1.price);
        System.out.println("Is it stainless: " + ref1.isStainlessSteel);
        System.out.println("is Disposable: " + ref1.isDisposable);
        System.out.println("quantity : " + ref1.quantityInPack);
		
		System.out.println("Blade Brand: " + ref2.brand);
        System.out.println("Blade Type: " + ref2.bladeType);
        System.out.println("Blade color: "+ ref2.color);
		System.out.println("Price: " + ref2.price);
        System.out.println("Is it stainless: " + ref2.isStainlessSteel);
        System.out.println("is Disposable: " + ref2.isDisposable);
        System.out.println("quantity : " + ref2.quantityInPack);
		
		System.out.println("Blade Brand: " + ref3.brand);
        System.out.println("Blade Type: " + ref3.bladeType);
        System.out.println("Blade color: "+ ref3.color);
		System.out.println("Price: " + ref3.price);
        System.out.println("Is it stainless: " + ref3.isStainlessSteel);
        System.out.println("is Disposable: " + ref3.isDisposable);
        System.out.println("quantity : " + ref3.quantityInPack);
		
		System.out.println("Blade Brand: " + ref4.brand);
        System.out.println("Blade Type: " + ref4.bladeType);
        System.out.println("Blade color: "+ ref4.color);
		System.out.println("Price: " + ref4.price);
        System.out.println("Is it stainless: " + ref4.isStainlessSteel);
        System.out.println("is Disposable: " + ref4.isDisposable);
        System.out.println("quantity : " + ref4.quantityInPack);
		
		System.out.println("Blade Brand: " + ref5.brand);
        System.out.println("Blade Type: " + ref5.bladeType);
        System.out.println("Blade color: "+ ref5.color);
		System.out.println("Price: " + ref5.price);
        System.out.println("Is it stainless: " + ref5.isStainlessSteel);
        System.out.println("is Disposable: " + ref5.isDisposable);
        System.out.println("quantity : " + ref5.quantityInPack);
		
		System.out.println("Blade Brand: " + ref6.brand);
        System.out.println("Blade Type: " + ref6.bladeType);
        System.out.println("Blade color: "+ ref6.color);
		System.out.println("Price: " + ref6.price);
        System.out.println("Is it stainless: " + ref6.isStainlessSteel);
        System.out.println("is Disposable: " + ref6.isDisposable);
        System.out.println("quantity : " + ref6.quantityInPack);
		
		System.out.println("Blade Brand: " + ref7.brand);
        System.out.println("Blade Type: " + ref7.bladeType);
        System.out.println("Blade color: "+ ref7.color);
		System.out.println("Price: " + ref7.price);
        System.out.println("Is it stainless: " + ref7.isStainlessSteel);
        System.out.println("is Disposable: " + ref7.isDisposable);
        System.out.println("quantity : " + ref7.quantityInPack);
		
		System.out.println("Blade Brand: " + ref8.brand);
        System.out.println("Blade Type: " + ref8.bladeType);
        System.out.println("Blade color: "+ ref8.color);
		System.out.println("Price: " + ref8.price);
        System.out.println("Is it stainless: " + ref8.isStainlessSteel);
        System.out.println("is Disposable: " + ref8.isDisposable);
        System.out.println("quantity : " + ref8.quantityInPack);
		
		System.out.println("Blade Brand: " + ref9.brand);
        System.out.println("Blade Type: " + ref9.bladeType);
        System.out.println("Blade color: "+ ref9.color);
		System.out.println("Price: " + ref9.price);
        System.out.println("Is it stainless: " + ref9.isStainlessSteel);
        System.out.println("is Disposable: " + ref9.isDisposable);
        System.out.println("quantity : " + ref9.quantityInPack);
		
		System.out.println("Blade Brand: " + ref10.brand);
        System.out.println("Blade Type: " + ref10.bladeType);
        System.out.println("Blade color: "+ ref10.color);
		System.out.println("Price: " + ref10.price);
        System.out.println("Is it stainless: " + ref10.isStainlessSteel);
        System.out.println("is Disposable: " + ref10.isDisposable);
        System.out.println("quantity : " + ref10.quantityInPack);
		
		System.out.println("Blade Brand: " + ref11.brand);
        System.out.println("Blade Type: " + ref11.bladeType);
        System.out.println("Blade color: "+ ref11.color);
		System.out.println("Price: " + ref11.price);
        System.out.println("Is it stainless: " + ref11.isStainlessSteel);
        System.out.println("is Disposable: " + ref11.isDisposable);
        System.out.println("quantity : " + ref11.quantityInPack);
		
		System.out.println("Blade Brand: " + ref12.brand);
        System.out.println("Blade Type: " + ref12.bladeType);
        System.out.println("Blade color: "+ ref12.color);
		System.out.println("Price: " + ref12.price);
        System.out.println("Is it stainless: " + ref12.isStainlessSteel);
        System.out.println("is Disposable: " + ref12.isDisposable);
        System.out.println("quantity : " + ref12.quantityInPack);
		
		System.out.println("Blade Brand: "+ ref13.brand);
        System.out.println("Blade Type: "+ ref13.bladeType);
        System.out.println("Blade color: "+ ref13.color);
		System.out.println("Price: "+ ref13.price);
        System.out.println("Is it stainless: "+ ref13.isStainlessSteel);
        System.out.println("is Disposable: "+ ref13.isDisposable);
        System.out.println("quantity : "+ ref13.quantityInPack);
		
		System.out.println("Blade Brand: " + ref14.brand);
        System.out.println("Blade Type: " + ref14.bladeType);
        System.out.println("Blade color: "+ ref14.color);
		System.out.println("Price: " + ref14.price);
        System.out.println("Is it stainless: " + ref14.isStainlessSteel);
        System.out.println("is Disposable: " + ref14.isDisposable);
        System.out.println("quantity : " + ref14.quantityInPack);
		
		System.out.println("Blade Brand: " + ref15.brand);
        System.out.println("Blade Type: " + ref15.bladeType);
        System.out.println("Blade color: "+ ref15.color);
		System.out.println("Price: " + ref15.price);
        System.out.println("Is it stainless: " + ref15.isStainlessSteel);
        System.out.println("is Disposable: " + ref15.isDisposable);
        System.out.println("quantity : " + ref15.quantityInPack);
		
		System.out.println("Blade Brand: " + ref16.brand);
        System.out.println("Blade Type: " + ref16.bladeType);
        System.out.println("Blade color: "+ ref16.color);
		System.out.println("Price: " + ref16.price);
        System.out.println("Is it stainless: " + ref16.isStainlessSteel);
        System.out.println("is Disposable: " + ref16.isDisposable);
        System.out.println("quantity : " + ref16.quantityInPack);
		
		System.out.println("Blade Brand: " + ref17.brand);
        System.out.println("Blade Type: " + ref17.bladeType);
        System.out.println("Blade color: "+ ref17.color);
		System.out.println("Price: " + ref17.price);
        System.out.println("Is it stainless: " + ref17.isStainlessSteel);
        System.out.println("is Disposable: " + ref17.isDisposable);
        System.out.println("quantity : " + ref17.quantityInPack);
		
		System.out.println("Blade Brand: " + ref18.brand);
        System.out.println("Blade Type: " + ref18.bladeType);
        System.out.println("Blade color: "+ ref18.color);
		System.out.println("Price: " + ref18.price);
        System.out.println("Is it stainless: " + ref18.isStainlessSteel);
        System.out.println("is Disposable: " + ref18.isDisposable);
        System.out.println("quantity : " + ref18.quantityInPack);
		
		System.out.println("Blade Brand: " + ref19.brand);
        System.out.println("Blade Type: " + ref19.bladeType);
        System.out.println("Blade color: "+ ref19.color);
		System.out.println("Price: " + ref19.price);
        System.out.println("Is it stainless: " + ref19.isStainlessSteel);
        System.out.println("is Disposable: " + ref19.isDisposable);
        System.out.println("quantity : " + ref19.quantityInPack);
		
		System.out.println("Blade Brand: " + ref20.brand);
        System.out.println("Blade Type: " + ref20.bladeType);
        System.out.println("Blade color: "+ ref20.color);
		System.out.println("Price: " + ref20.price);
        System.out.println("Is it stainless: " + ref20.isStainlessSteel);
        System.out.println("is Disposable: " + ref20.isDisposable);
        System.out.println("quantity : " + ref20.quantityInPack);
		
		System.out.println("main ended");
    }
}

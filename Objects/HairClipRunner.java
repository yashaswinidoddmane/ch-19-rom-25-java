class HairClipRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        HairClip ref1 = new HairClip();
        ref1.type = "Alligator";
        ref1.color = "Black";
        ref1.material = "Plastic";
        ref1.price = 20.0;
        ref1.isDecorative = false;
        ref1.brand = "Clippy";
        ref1.isAvailable = true;

        HairClip ref2 = new HairClip();
        ref2.type = "Snap";
        ref2.color = "Pink";
        ref2.material = "Metal";
        ref2.price = 15.0;
        ref2.isDecorative = true;
        ref2.brand = "HairBling";
        ref2.isAvailable = true;

        HairClip ref3 = new HairClip();
        ref3.type = "Banana";
        ref3.color = "Brown";
        ref3.material = "Plastic";
        ref3.price = 25.0;
        ref3.isDecorative = false;
        ref3.brand = "Goody";
        ref3.isAvailable = true;

        HairClip ref4 = new HairClip();
        ref4.type = "Duckbill";
        ref4.color = "Silver";
        ref4.material = "Metal";
        ref4.price = 18.0;
        ref4.isDecorative = false;
        ref4.brand = "SalonPro";
        ref4.isAvailable = false;

        HairClip ref5 = new HairClip();
        ref5.type = "Jaw Clip";
        ref5.color = "Red";
        ref5.material = "Plastic";
        ref5.price = 30.0;
        ref5.isDecorative = true;
        ref5.brand = "Clippy";
        ref5.isAvailable = true;

        HairClip ref6 = new HairClip();
        ref6.type = "Butterfly";
        ref6.color = "Blue";
        ref6.material = "Plastic";
        ref6.price = 22.0;
        ref6.isDecorative = true;
        ref6.brand = "HairCharm";
        ref6.isAvailable = false;

        HairClip ref7 = new HairClip();
        ref7.type = "French Barrette";
        ref7.color = "Gold";
        ref7.material = "Metal";
        ref7.price = 35.0;
        ref7.isDecorative = true;
        ref7.brand = "StyleEase";
        ref7.isAvailable = true;

        HairClip ref8 = new HairClip();
        ref8.type = "Mini Clip";
        ref8.color = "Purple";
        ref8.material = "Plastic";
        ref8.price = 12.0;
        ref8.isDecorative = false;
        ref8.brand = "LilClips";
        ref8.isAvailable = true;

        HairClip ref9 = new HairClip();
        ref9.type = "Claw Clip";
        ref9.color = "Transparent";
        ref9.material = "Acrylic";
        ref9.price = 40.0;
        ref9.isDecorative = false;
        ref9.brand = "TrendyClips";
        ref9.isAvailable = true;

        HairClip ref10 = new HairClip();
        ref10.type = "Octopus Clip";
        ref10.color = "Green";
        ref10.material = "Plastic";
        ref10.price = 26.0;
        ref10.isDecorative = false;
        ref10.brand = "Snappy";
        ref10.isAvailable = false;

        HairClip ref11 = new HairClip();
        ref11.type = "Stick Clip";
        ref11.color = "Wood Brown";
        ref11.material = "Wood";
        ref11.price = 60.0;
        ref11.isDecorative = true;
        ref11.brand = "WoodVibe";
        ref11.isAvailable = true;

        HairClip ref12 = new HairClip();
        ref12.type = "Spiral Clip";
        ref12.color = "Rose Gold";
        ref12.material = "Metal";
        ref12.price = 50.0;
        ref12.isDecorative = true;
        ref12.brand = "ChicHair";
        ref12.isAvailable = true;

        HairClip ref13 = new HairClip();
        ref13.type = "Comb Clip";
        ref13.color = "Beige";
        ref13.material = "Plastic";
        ref13.price = 28.0;
        ref13.isDecorative = false;
        ref13.brand = "ComfyClips";
        ref13.isAvailable = true;

        HairClip ref14 = new HairClip();
        ref14.type = "Tic Tac";
        ref14.color = "Rainbow";
        ref14.material = "Plastic";
        ref14.price = 15.0;
        ref14.isDecorative = true;
        ref14.brand = "ColorSnap";
        ref14.isAvailable = true;

        HairClip ref15 = new HairClip();
        ref15.type = "Bow Clip";
        ref15.color = "Yellow";
        ref15.material = "Cloth";
        ref15.price = 45.0;
        ref15.isDecorative = true;
        ref15.brand = "Bowsy";
        ref15.isAvailable = false;

        HairClip ref16 = new HairClip();
        ref16.type = "Gem Clip";
        ref16.color = "White";
        ref16.material = "Metal & Beads";
        ref16.price = 70.0;
        ref16.isDecorative = true;
        ref16.brand = "ShineOn";
        ref16.isAvailable = true;

        HairClip ref17 = new HairClip();
        ref17.type = "Velvet Clip";
        ref17.color = "Maroon";
        ref17.material = "Velvet";
        ref17.price = 55.0;
        ref17.isDecorative = true;
        ref17.brand = "LuxHair";
        ref17.isAvailable = true;

        HairClip ref18 = new HairClip();
        ref18.type = "Shell Clip";
        ref18.color = "Pearl";
        ref18.material = "Shell";
        ref18.price = 65.0;
        ref18.isDecorative = true;
        ref18.brand = "SeaStyle";
        ref18.isAvailable = true;

        HairClip ref19 = new HairClip();
        ref19.type = "Resin Clip";
        ref19.color = "Multicolor";
        ref19.material = "Resin";
        ref19.price = 80.0;
        ref19.isDecorative = true;
        ref19.brand = "ArtClip";
        ref19.isAvailable = true;

        HairClip ref20 = new HairClip();
        ref20.type = "Leaf Clip";
        ref20.color = "Olive Green";
        ref20.material = "Plastic";
        ref20.price = 33.0;
        ref20.isDecorative = true;
        ref20.brand = "NatureWear";
        ref20.isAvailable = true;
		
		
            System.out.println("The hairclip Type is: " + ref1.type);
            System.out.println("The Hair clip Color is: " + ref1.color);
            System.out.println("The Hair clip Material : " + ref1.material);
            System.out.println("The Hair clip Price is: " + ref1.price);
            System.out.println("Is Decorative: " + ref1.isDecorative);
            System.out.println("Brand: " + ref1.brand);
            System.out.println("Available: " + ref1.isAvailable);
			
			System.out.println("The hairclip Type is: " + ref2.type);
            System.out.println("The Hair clip Color is: " + ref2.color);
            System.out.println("The Hair clip Material : " + ref2.material);
            System.out.println("The Hair clip Price is: " + ref2.price);
            System.out.println("Is Decorative: " + ref2.isDecorative);
            System.out.println("Brand: " + ref2.brand);
            System.out.println("Available: " + ref2.isAvailable);
			
			System.out.println("The hairclip Type is: " + ref3.type);
            System.out.println("The Hair clip Color is: " + ref3.color);
            System.out.println("The Hair clip Material : " + ref3.material);
            System.out.println("The Hair clip Price is: " + ref3.price);
            System.out.println("Is Decorative: " + ref3.isDecorative);
            System.out.println("Brand: " + ref3.brand);
            System.out.println("Available: " + ref3.isAvailable);
			
			System.out.println("The hairclip Type is: " + ref4.type);
            System.out.println("The Hair clip Color is: " + ref4.color);
            System.out.println("The Hair clip Material : " + ref4.material);
            System.out.println("The Hair clip Price is: " + ref4.price);
            System.out.println("Is Decorative: " + ref4.isDecorative);
            System.out.println("Brand: " + ref4.brand);
            System.out.println("Available: " + ref4.isAvailable);
			
			System.out.println("The hairclip Type is: " + ref5.type);
            System.out.println("The Hair clip Color is: " + ref5.color);
            System.out.println("The Hair clip Material : " + ref5.material);
            System.out.println("The Hair clip Price is: " + ref5.price);
            System.out.println("Is Decorative: " + ref5.isDecorative);
            System.out.println("Brand: " + ref5.brand);
            System.out.println("Available: " + ref5.isAvailable);
			
			System.out.println("The hairclip Type is: " + ref6.type);
            System.out.println("The Hair clip Color is: " + ref6.color);
            System.out.println("The Hair clip Material : " + ref6.material);
            System.out.println("The Hair clip Price is: " + ref6.price);
            System.out.println("Is Decorative: " + ref6.isDecorative);
            System.out.println("Brand: " + ref6.brand);
            System.out.println("Available: " + ref6.isAvailable);
			
			System.out.println("The hairclip Type is: " + ref7.type);
            System.out.println("The Hair clip Color is: " + ref7.color);
            System.out.println("The Hair clip Material : " + ref7.material);
            System.out.println("The Hair clip Price is: " + ref7.price);
            System.out.println("Is Decorative: " + ref7.isDecorative);
            System.out.println("Brand: " + ref7.brand);
            System.out.println("Available: " + ref7.isAvailable);
			
			System.out.println("The hairclip Type is: " + ref8.type);
            System.out.println("The Hair clip Color is: " + ref8.color);
            System.out.println("The Hair clip Material : " + ref8.material);
            System.out.println("The Hair clip Price is: " + ref8.price);
            System.out.println("Is Decorative: " + ref8.isDecorative);
            System.out.println("Brand: " + ref8.brand);
            System.out.println("Available: " + ref8.isAvailable);
			
			System.out.println("The hairclip Type is: " + ref9.type);
            System.out.println("The Hair clip Color is: " + ref9.color);
            System.out.println("The Hair clip Material : " + ref9.material);
            System.out.println("The Hair clip Price is: " + ref9.price);
            System.out.println("Is Decorative: " + ref9.isDecorative);
            System.out.println("Brand: " + ref9.brand);
            System.out.println("Available: " + ref9.isAvailable);
			
			System.out.println("The hairclip Type is: " + ref10.type);
            System.out.println("The Hair clip Color is: " + ref10.color);
            System.out.println("The Hair clip Material : " + ref10.material);
            System.out.println("The Hair clip Price is: " + ref10.price);
            System.out.println("Is Decorative: " + ref10.isDecorative);
            System.out.println("Brand: " + ref10.brand);
            System.out.println("Available: " + ref10.isAvailable);
			
			System.out.println("The hairclip Type is: " + ref11.type);
            System.out.println("The Hair clip Color is: " + ref11.color);
            System.out.println("The Hair clip Material : " + ref11.material);
            System.out.println("The Hair clip Price is: " + ref11.price);
            System.out.println("Is Decorative: " + ref11.isDecorative);
            System.out.println("Brand: " + ref11.brand);
            System.out.println("Available: " + ref11.isAvailable);
			
			System.out.println("The hairclip Type is: " + ref12.type);
            System.out.println("The Hair clip Color is: " + ref12.color);
            System.out.println("The Hair clip Material : " + ref12.material);
            System.out.println("The Hair clip Price is: " + ref12.price);
            System.out.println("Is Decorative: " + ref12.isDecorative);
            System.out.println("Brand: " + ref12.brand);
            System.out.println("Available: " + ref12.isAvailable);
			
			System.out.println("The hairclip Type is: " + ref13.type);
            System.out.println("The Hair clip Color is: " + ref13.color);
            System.out.println("The Hair clip Material : " + ref13.material);
            System.out.println("The Hair clip Price is: " + ref13.price);
            System.out.println("Is Decorative: " + ref13.isDecorative);
            System.out.println("Brand: " + ref13.brand);
            System.out.println("Available: " + ref13.isAvailable);
			
			System.out.println("The hairclip Type is: " + ref14.type);
            System.out.println("The Hair clip Color is: " + ref14.color);
            System.out.println("The Hair clip Material : " + ref14.material);
            System.out.println("The Hair clip Price is: " + ref14.price);
            System.out.println("Is Decorative: " + ref14.isDecorative);
            System.out.println("Brand: " + ref14.brand);
            System.out.println("Available: " + ref14.isAvailable);
			
			System.out.println("The hairclip Type is: " + ref15.type);
            System.out.println("The Hair clip Color is: " + ref15.color);
            System.out.println("The Hair clip Material : " + ref15.material);
            System.out.println("The Hair clip Price is: " + ref15.price);
            System.out.println("Is Decorative: " + ref15.isDecorative);
            System.out.println("Brand: " + ref15.brand);
            System.out.println("Available: " + ref15.isAvailable);
			
			System.out.println("The hairclip Type is: " + ref16.type);
            System.out.println("The Hair clip Color is: " + ref16.color);
            System.out.println("The Hair clip Material : " + ref16.material);
            System.out.println("The Hair clip Price is: " + ref16.price);
            System.out.println("Is Decorative: " + ref16.isDecorative);
            System.out.println("Brand: " + ref16.brand);
            System.out.println("Available: " + ref16.isAvailable);
			
			System.out.println("The hairclip Type is: " + ref17.type);
            System.out.println("The Hair clip Color is: " + ref17.color);
            System.out.println("The Hair clip Material : " + ref17.material);
            System.out.println("The Hair clip Price is: " + ref17.price);
            System.out.println("Is Decorative: " + ref17.isDecorative);
            System.out.println("Brand: " + ref17.brand);
            System.out.println("Available: " + ref17.isAvailable);
			
			System.out.println("The hairclip Type is: " + ref18.type);
            System.out.println("The Hair clip Color is: " + ref18.color);
            System.out.println("The Hair clip Material : " + ref18.material);
            System.out.println("The Hair clip Price is: " + ref18.price);
            System.out.println("Is Decorative: " + ref18.isDecorative);
            System.out.println("Brand: " + ref18.brand);
            System.out.println("Available: " + ref18.isAvailable);
			
			System.out.println("The hairclip Type is: " + ref19.type);
            System.out.println("The Hair clip Color is: " + ref19.color);
            System.out.println("The Hair clip Material : " + ref19.material);
            System.out.println("The Hair clip Price is: " + ref19.price);
            System.out.println("Is Decorative: " + ref19.isDecorative);
            System.out.println("Brand: " + ref19.brand);
            System.out.println("Available: " + ref19.isAvailable);
			
			System.out.println("The hairclip Type is: " + ref20.type);
            System.out.println("The Hair clip Color is: " + ref20.color);
            System.out.println("The Hair clip Material : " + ref20.material);
            System.out.println("The Hair clip Price is: " + ref20.price);
            System.out.println("Is Decorative: " + ref20.isDecorative);
            System.out.println("Brand: " + ref20.brand);
            System.out.println("Available: " + ref20.isAvailable);
			
			
	}
}

class HatRunner {
    public static void main(String hats[]) {
        System.out.println("Main started");

        Hat ref1 = new Hat();
        ref1.type = "Baseball Cap";
        ref1.color = "Black";
        ref1.material = "Cotton";
        ref1.size = 58.0;
        ref1.isForMen = true;
        ref1.isWaterResistant = false;
        ref1.hasAdjustableStrap = true;

        Hat ref2 = new Hat();
        ref2.type = "Fedora";
        ref2.color = "Brown";
        ref2.material = "Wool";
        ref2.size = 57.5;
        ref2.isForMen = true;
        ref2.isWaterResistant = true;
        ref2.hasAdjustableStrap = false;

        Hat ref3 = new Hat();
        ref3.type = "Beanie";
        ref3.color = "Gray";
        ref3.material = "Wool";
        ref3.size = 56.0;
        ref3.isForMen = false;
        ref3.isWaterResistant = false;
        ref3.hasAdjustableStrap = false;

        Hat ref4 = new Hat();
        ref4.type = "Cowboy Hat";
        ref4.color = "Tan";
        ref4.material = "Leather";
        ref4.size = 59.0;
        ref4.isForMen = true;
        ref4.isWaterResistant = true;
        ref4.hasAdjustableStrap = false;

        Hat ref5 = new Hat();
        ref5.type = "Bucket Hat";
        ref5.color = "Blue";
        ref5.material = "Canvas";
        ref5.size = 57.0;
        ref5.isForMen = false;
        ref5.isWaterResistant = true;
        ref5.hasAdjustableStrap = false;

        Hat ref6 = new Hat();
        ref6.type = "Sun Hat";
        ref6.color = "White";
        ref6.material = "Straw";
        ref6.size = 55.5;
        ref6.isForMen = false;
        ref6.isWaterResistant = false;
        ref6.hasAdjustableStrap = false;

        Hat ref7 = new Hat();
        ref7.type = "Beret";
        ref7.color = "Red";
        ref7.material = "Wool";
        ref7.size = 56.5;
        ref7.isForMen = false;
        ref7.isWaterResistant = false;
        ref7.hasAdjustableStrap = false;

        Hat ref8 = new Hat();
        ref8.type = "Top Hat";
        ref8.color = "Black";
        ref8.material = "Silk";
        ref8.size = 60.0;
        ref8.isForMen = true;
        ref8.isWaterResistant = false;
        ref8.hasAdjustableStrap = false;

        Hat ref9 = new Hat();
        ref9.type = "Panama Hat";
        ref9.color = "Ivory";
        ref9.material = "Straw";
        ref9.size = 57.2;
        ref9.isForMen = true;
        ref9.isWaterResistant = false;
        ref9.hasAdjustableStrap = false;

        Hat ref10 = new Hat();
        ref10.type = "Snapback";
        ref10.color = "Green";
        ref10.material = "Polyester";
        ref10.size = 58.3;
        ref10.isForMen = true;
        ref10.isWaterResistant = true;
        ref10.hasAdjustableStrap = true;

        Hat ref11 = new Hat();
        ref11.type = "Trucker Hat";
        ref11.color = "Navy Blue";
        ref11.material = "Mesh";
        ref11.size = 58.5;
        ref11.isForMen = true;
        ref11.isWaterResistant = true;
        ref11.hasAdjustableStrap = true;

        Hat ref12 = new Hat();
        ref12.type = "Boater";
        ref12.color = "Cream";
        ref12.material = "Straw";
        ref12.size = 55.0;
        ref12.isForMen = false;
        ref12.isWaterResistant = false;
        ref12.hasAdjustableStrap = false;

        Hat ref13 = new Hat();
        ref13.type = "Cloche";
        ref13.color = "Pink";
        ref13.material = "Felt";
        ref13.size = 54.0;
        ref13.isForMen = false;
        ref13.isWaterResistant = false;
        ref13.hasAdjustableStrap = false;

        Hat ref14 = new Hat();
        ref14.type = "Pillbox";
        ref14.color = "Maroon";
        ref14.material = "Velvet";
        ref14.size = 54.5;
        ref14.isForMen = false;
        ref14.isWaterResistant = false;
        ref14.hasAdjustableStrap = false;

        Hat ref15 = new Hat();
        ref15.type = "Newsboy Cap";
        ref15.color = "Olive";
        ref15.material = "Tweed";
        ref15.size = 58.0;
        ref15.isForMen = true;
        ref15.isWaterResistant = true;
        ref15.hasAdjustableStrap = false;

        Hat ref16 = new Hat();
        ref16.type = "Balaclava";
        ref16.color = "Black";
        ref16.material = "Wool";
        ref16.size = 57.5;
        ref16.isForMen = true;
        ref16.isWaterResistant = true;
        ref16.hasAdjustableStrap = false;

        Hat ref17 = new Hat();
        ref17.type = "Sailor Cap";
        ref17.color = "White";
        ref17.material = "Cotton";
        ref17.size = 56.0;
        ref17.isForMen = true;
        ref17.isWaterResistant = false;
        ref17.hasAdjustableStrap = false;

        Hat ref18 = new Hat();
        ref18.type = "Turban";
        ref18.color = "Orange";
        ref18.material = "Cotton";
        ref18.size = 60.0;
        ref18.isForMen = true;
        ref18.isWaterResistant = false;
        ref18.hasAdjustableStrap = false;

        Hat ref19 = new Hat();
        ref19.type = "Visor";
        ref19.color = "Yellow";
        ref19.material = "Plastic";
        ref19.size = 55.0;
        ref19.isForMen = false;
        ref19.isWaterResistant = true;
        ref19.hasAdjustableStrap = true;

        Hat ref20 = new Hat();
        ref20.type = "Party Hat";
        ref20.color = "Multi-color";
        ref20.material = "Paper";
        ref20.size = 53.5;
        ref20.isForMen = false;
        ref20.isWaterResistant = false;
        ref20.hasAdjustableStrap = false;
		
		    System.out.println("The Hat Type is: "+ ref1.type);
            System.out.println("The Hat Color is: "+ ref1.color);
            System.out.println("The hat Material is: "+ ref1.material);
            System.out.println("Size: "+ ref1.size );
            System.out.println("For Men: "+ ref1.isForMen);
            System.out.println("Water Resistant: "+ ref1.isWaterResistant);
            System.out.println("Adjustable Strap: "+ ref1.hasAdjustableStrap);
			
			System.out.println("The Hat Type is: "+ ref2.type);
            System.out.println("The Hat Color is: "+ ref2.color);
            System.out.println("The hat Material is: "+ ref2.material);
            System.out.println("Size: "+ ref2.size );
            System.out.println("For Men: "+ ref2.isForMen);
            System.out.println("Water Resistant: "+ ref2.isWaterResistant);
            System.out.println("Adjustable Strap: "+ ref2.hasAdjustableStrap);
			
			System.out.println("The Hat Type is: "+ ref3.type);
            System.out.println("The Hat Color is: "+ ref3.color);
            System.out.println("The hat Material is: "+ ref3.material);
            System.out.println("Size: "+ ref3.size );
            System.out.println("For Men: "+ ref3.isForMen);
            System.out.println("Water Resistant: "+ ref3.isWaterResistant);
            System.out.println("Adjustable Strap: "+ ref3.hasAdjustableStrap);
			
			System.out.println("The Hat Type is: "+ ref4.type);
            System.out.println("The Hat Color is: "+ ref4.color);
            System.out.println("The hat Material is: "+ ref4.material);
            System.out.println("Size: "+ ref4.size );
            System.out.println("For Men: "+ ref4.isForMen);
            System.out.println("Water Resistant: "+ ref4.isWaterResistant);
            System.out.println("Adjustable Strap: "+ ref4.hasAdjustableStrap);
			
			System.out.println("The Hat Type is: "+ ref5.type);
            System.out.println("The Hat Color is: "+ ref5.color);
            System.out.println("The hat Material is: "+ ref5.material);
            System.out.println("Size: "+ ref5.size );
            System.out.println("For Men: "+ ref5.isForMen);
            System.out.println("Water Resistant: "+ ref5.isWaterResistant);
            System.out.println("Adjustable Strap: "+ ref5.hasAdjustableStrap);
			
			System.out.println("The Hat Type is: "+ ref6.type);
            System.out.println("The Hat Color is: "+ ref6.color);
            System.out.println("The hat Material is: "+ ref6.material);
            System.out.println("Size: "+ ref6.size );
            System.out.println("For Men: "+ ref6.isForMen);
            System.out.println("Water Resistant: "+ ref6.isWaterResistant);
            System.out.println("Adjustable Strap: "+ ref6.hasAdjustableStrap);
			
			System.out.println("The Hat Type is: "+ ref7.type);
            System.out.println("The Hat Color is: "+ ref7.color);
            System.out.println("The hat Material is: "+ ref7.material);
            System.out.println("Size: "+ ref7.size );
            System.out.println("For Men: "+ ref7.isForMen);
            System.out.println("Water Resistant: "+ ref7.isWaterResistant);
            System.out.println("Adjustable Strap: "+ ref7.hasAdjustableStrap);
			
			System.out.println("The Hat Type is: "+ ref8.type);
            System.out.println("The Hat Color is: "+ ref8.color);
            System.out.println("The hat Material is: "+ ref8.material);
            System.out.println("Size: "+ ref8.size );
            System.out.println("For Men: "+ ref8.isForMen);
            System.out.println("Water Resistant: "+ ref8.isWaterResistant);
            System.out.println("Adjustable Strap: "+ ref8.hasAdjustableStrap);
			
			System.out.println("The Hat Type is: "+ ref9.type);
            System.out.println("The Hat Color is: "+ ref9.color);
            System.out.println("The hat Material is: "+ ref9.material);
            System.out.println("Size: "+ ref9.size );
            System.out.println("For Men: "+ ref9.isForMen);
            System.out.println("Water Resistant: "+ ref9.isWaterResistant);
            System.out.println("Adjustable Strap: "+ ref9.hasAdjustableStrap);
			
			System.out.println("The Hat Type is: "+ ref10.type);
            System.out.println("The Hat Color is: "+ ref10.color);
            System.out.println("The hat Material is: "+ ref10.material);
            System.out.println("Size: "+ ref10.size );
            System.out.println("For Men: "+ ref10.isForMen);
            System.out.println("Water Resistant: "+ ref10.isWaterResistant);
            System.out.println("Adjustable Strap: "+ ref10.hasAdjustableStrap);
			
			System.out.println("The Hat Type is: "+ ref11.type);
            System.out.println("The Hat Color is: "+ ref11.color);
            System.out.println("The hat Material is: "+ ref11.material);
            System.out.println("Size: "+ ref11.size );
            System.out.println("For Men: "+ ref11.isForMen);
            System.out.println("Water Resistant: "+ ref11.isWaterResistant);
            System.out.println("Adjustable Strap: "+ ref11.hasAdjustableStrap);
			
			System.out.println("The Hat Type is: "+ ref12.type);
            System.out.println("The Hat Color is: "+ ref12.color);
            System.out.println("The hat Material is: "+ ref12.material);
            System.out.println("Size: "+ ref12.size );
            System.out.println("For Men: "+ ref12.isForMen);
            System.out.println("Water Resistant: "+ ref12.isWaterResistant);
            System.out.println("Adjustable Strap: "+ ref12.hasAdjustableStrap);
			
			System.out.println("The Hat Type is: "+ ref13.type);
            System.out.println("The Hat Color is: "+ ref13.color);
            System.out.println("The hat Material is: "+ ref13.material);
            System.out.println("Size: "+ ref13.size );
            System.out.println("For Men: "+ ref13.isForMen);
            System.out.println("Water Resistant: "+ ref13.isWaterResistant);
            System.out.println("Adjustable Strap: "+ ref13.hasAdjustableStrap);
			
			System.out.println("The Hat Type is: "+ ref14.type);
            System.out.println("The Hat Color is: "+ ref14.color);
            System.out.println("The hat Material is: "+ ref14.material);
            System.out.println("Size: "+ ref14.size );
            System.out.println("For Men: "+ ref14.isForMen);
            System.out.println("Water Resistant: "+ ref14.isWaterResistant);
            System.out.println("Adjustable Strap: "+ ref14.hasAdjustableStrap);
			
			System.out.println("The Hat Type is: "+ ref15.type);
            System.out.println("The Hat Color is: "+ ref15.color);
            System.out.println("The hat Material is: "+ ref15.material);
            System.out.println("Size: "+ ref15.size );
            System.out.println("For Men: "+ ref15.isForMen);
            System.out.println("Water Resistant: "+ ref15.isWaterResistant);
            System.out.println("Adjustable Strap: "+ ref15.hasAdjustableStrap);
			
			System.out.println("The Hat Type is: "+ ref16.type);
            System.out.println("The Hat Color is: "+ ref16.color);
            System.out.println("The hat Material is: "+ ref16.material);
            System.out.println("Size: "+ ref16.size );
            System.out.println("For Men: "+ ref16.isForMen);
            System.out.println("Water Resistant: "+ ref16.isWaterResistant);
            System.out.println("Adjustable Strap: "+ ref16.hasAdjustableStrap);
			
			System.out.println("The Hat Type is: "+ ref17.type);
            System.out.println("The Hat Color is: "+ ref17.color);
            System.out.println("The hat Material is: "+ ref17.material);
            System.out.println("Size: "+ ref17.size );
            System.out.println("For Men: "+ ref17.isForMen);
            System.out.println("Water Resistant: "+ ref17.isWaterResistant);
            System.out.println("Adjustable Strap: "+ ref17.hasAdjustableStrap);
			
			System.out.println("The Hat Type is: "+ ref18.type);
            System.out.println("The Hat Color is: "+ ref18.color);
            System.out.println("The hat Material is: "+ ref18.material);
            System.out.println("Size: "+ ref18.size );
            System.out.println("For Men: "+ ref18.isForMen);
            System.out.println("Water Resistant: "+ ref18.isWaterResistant);
            System.out.println("Adjustable Strap: "+ ref18.hasAdjustableStrap);
			
			System.out.println("The Hat Type is: "+ ref19.type);
            System.out.println("The Hat Color is: "+ ref19.color);
            System.out.println("The hat Material is: "+ ref19.material);
            System.out.println("Size: "+ ref19.size );
            System.out.println("For Men: "+ ref19.isForMen);
            System.out.println("Water Resistant: "+ ref19.isWaterResistant);
            System.out.println("Adjustable Strap: "+ ref19.hasAdjustableStrap);
			
			System.out.println("The Hat Type is: "+ ref20.type);
            System.out.println("The Hat Color is: "+ ref20.color);
            System.out.println("The hat Material is: "+ ref20.material);
            System.out.println("Size: "+ ref20.size );
            System.out.println("For Men: "+ ref20.isForMen);
            System.out.println("Water Resistant: "+ ref20.isWaterResistant);
            System.out.println("Adjustable Strap: "+ ref20.hasAdjustableStrap);
			
			
		
	}
}